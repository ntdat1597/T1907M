<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <!-- JavaScript -->
    <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

    <!-- CSS -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
    <!-- Default theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
    <!-- Semantic UI theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
    <!-- Bootstrap theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/>

    <!--
        RTL version
    -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.rtl.min.css"/>
    <!-- Default theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.rtl.min.css"/>
    <!-- Semantic UI theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.rtl.min.css"/>
    <!-- Bootstrap theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.rtl.min.css"/>
</head>
<body>
<form id="surveyform" action="{{url("/form")}}" method="post">
    @method("POST")
    @csrf
    <h1 style="text-align: center">Student Survey</h1>
    <div class="form-group">
        <label for="exampleInputEmail1">Student Name: </label>
        <input type="text" id="student_name" name="student_name" class="form-control">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Student Email : </label>
        <input type="email" id="student_email" name="student_email" class="form-control">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Student Telephone</label>
        <input type="telephone" id="student_telephone" name="student_telephone" class="form-control">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">FeedBack</label>
        <textarea class="form-control" id="student_message" rows="3" name="student_message"></textarea>
    </div>
    <button type="submit" class="result btn btn-primary">Send FeedBack</button>
</form>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
<script type="text/javascript">
    $('#surveyform').on('submit',function(event){
        event.preventDefault();

        student_name = $('#student_name').val();
        student_email = $('#student_email').val();
        student_telephone = $('#student_telephone').val();
        student_feedback = $('#student_message').val();

        $.ajax({
            url: "/form",
            type:"POST",
            data:{
                "_token": "{{ csrf_token() }}",
                student_name:student_name,
                student_email:student_email,
                student_telephone:student_telephone,
                student_feedback:student_feedback,
            },
            success:function(response){
                alertify.alert('Send form successfully!');
                $("#surveyform")[0].reset();
            },
        });
    });
</script>
</html>
