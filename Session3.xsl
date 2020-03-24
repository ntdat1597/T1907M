<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <!--        Cau truc HTML muon hien thi-->
        <html>
            <head>
                <link rel="stylesheet" href="ss3.css"/>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
            </head>
            <body>
                <div class="img">
                    <img src="https://picsum.photos/500/70"/>
                </div>
                <div class="product">
                    <div class="content">
                        <b>FROM</b>
                        <div>
                            <xsl:for-each select="ORDER/FROM">
                                <xsl:value-of select="COMPANY"/>
                            </xsl:for-each>
                        </div>
                        <div>
                            <xsl:for-each select="ORDER/FROM">
                                <xsl:value-of select="SENDING"/>
                            </xsl:for-each>
                        </div>
                    </div>
                    <div class="shipping">
                        <b>TO:</b>
                        <div>
                            <xsl:for-each select="ORDER/SHIPPING_ADDRESS">
                                <xsl:value-of select="CLIENTNAME"/>
                            </xsl:for-each>
                        </div>
                        <div>
                            <xsl:for-each select="ORDER/SHIPPING_ADDRESS">
                                <xsl:value-of select="ADDRESS"/>
                            </xsl:for-each>
                        </div>
                    </div>
                </div>

                <table class="table">
                    <tr id="th">
                        <th>Item</th>
                        <th>Price</th>
                        <th>Qty</th>
                        <th>Subtotal</th>
                    </tr>
                    <tbody>
                        <xsl:for-each select="ORDER/ITEMS/PRODUCT">
                            <xsl:sort select="NAME" order="ascending"/>
                            <tr id="tr">
                                <td id="name">
                                    <xsl:value-of select="NAME"/>
                                </td>
                                <td>
                                    <xsl:value-of select="PRICE"/>
                                </td>
                                <td>
                                    <xsl:value-of select="QTY"/>
                                </td>
                                <td>
                                    <xsl:value-of select="SUBTOTAL"/>
                                </td>
                                <!--                                <xsl:if test="QTY > 1">-->
                                <!--                                    <td>Mua nhieu</td>-->
                                <!--                                </xsl:if>-->
                                <!--                                <xsl:if test="QTY = 1">-->
                                <!--                                    <td>Mua it</td>-->
                                <!--                                </xsl:if>-->
                            </tr>
                        </xsl:for-each>
                    </tbody>
                </table>
                <h3 id="total">Total:
                    <xsl:for-each select="ORDER">
                        <xsl:value-of select="sum(ITEMS/PRODUCT/PRICE)"/>
                    </xsl:for-each>
                </h3>

            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>