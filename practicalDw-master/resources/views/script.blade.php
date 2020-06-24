<script type="text/javascript">
    $('.form').on('click',function(){
        $value = $(this).val();
        $.ajax({
            type: 'get',
            url: '{{ \Illuminate\Support\Facades\URL::to('form') }}',
            data: {
                'form': $value
            },
            success:function(data){
                if($value===""){
                    return $('tbody').html("");
                }else{
                    return $('tbody').html(data);
                }
            }
        });
    });
    /////
    function sendForm() {
        $.ajax({
            url:"{{url("/form")}}",
            method: "POST",
            data: {
                _token:"{{@csrf_token()}}"
            },
            success: function () {
                alert("send form success");
            }
        });
    }
</script>
