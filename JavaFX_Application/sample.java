package JavaFX_Application;

import javafx.scene.layout.GridPane;

import javax.swing.text.TableView;

public class sample<children, mnemonicParsing, text, fx> {
    <?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.*?>
<?import javafx.scene.text.*?>
<?import javafx.scene.control.*?>
<?import java.lang.*?>
<?import javafx.scene.layout.*?>
<?import javafx.geometry.Insets?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>

<GridPane alignment="center" hgap="10" prefHeight="800.0" prefWidth="641.0" vgap="10" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="sample.Controller">
   <columnConstraints>
      <ColumnConstraints />
      <ColumnConstraints />
   </columnConstraints>
   <rowConstraints>
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
      <RowConstraints />
   </rowConstraints>
   <children>
      <TableView fx:id="table" prefHeight="500.0" prefWidth="450.0" GridPane.columnIndex="1" GridPane.hgrow="NEVER">
        <columns>
          <TableColumn fx:id="idColumn" prefWidth="42.0" text="ID" />
          <TableColumn fx:id="nameColumn" minWidth="0.0" prefWidth="280.0" text="Name" />
            <TableColumn fx:id="ageColumn" minWidth="0.0" prefWidth="67.0" text="Age" />
            <TableColumn fx:id="markColumn" prefWidth="60.0" text="Mark" />
        </columns>
         <GridPane.margin>
            <Insets />
         </GridPane.margin>
      </TableView>
      <TextField fx:id="nameText" GridPane.columnIndex="1" GridPane.rowIndex="4" />
      <TextField fx:id="ageText" GridPane.columnIndex="1" GridPane.rowIndex="7" />
      <TextField fx:id="markText" GridPane.columnIndex="1" GridPane.rowIndex="10" />
      <Button fx:id="txtArea" mnemonicParsing="false" text="Add" GridPane.columnIndex="1" GridPane.rowIndex="11" />
      <Label text="Name" GridPane.rowIndex="4" />
      <Label text="Age" GridPane.rowIndex="7" />
      <Label text="Mark" GridPane.rowIndex="10" />
      <Button mnemonicParsing="false" text="Delete" GridPane.columnIndex="1" GridPane.rowIndex="12" />
   </children>
</GridPane>
}
