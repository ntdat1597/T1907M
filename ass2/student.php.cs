<?php require_once "Students.php";?>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Lồng ghép HTML và PHP</title>
</head>
<body>
<div class="container">
    <h1 style="text-align: center; margin-top: 100px; margin-bottom: 50px">Thông tin học sinh</h1>
<a style="font-size: 25px; padding: 10px; background-color: #343a40; color: white; margin-bottom: 50px;" href="add_students.php">Thêm sinh viên</a>
<table class="table">
    <thead class="thead-dark">
    <tr>
<th scope="col">Id</th>
<th scope="col">Edit</th>
<th scope="col">Name</th>
<th scope="col">Email</th>
<th scope="col">Password</th>
<th scope="col">Delete</th>
</tr>
</thead>
<tbody>
<?php $students = new \ass2\Students();
?>
<?php foreach ($students->getStudents() as $s): //thay {} bằng { = : , } = endforeach; ?>
<tr>
<th scope="row"><?php echo $s["id"] ?></th>
<th><a href="EditStudents.php?id=<?php echo $s["id"]?>">Edit</a></th>
<td><?php echo $s["name"] ?></td>
<td><?php echo $s["age"] ?></td>
<td><?php echo $s["mark"] ?></td>
<td><a href="delete_students.php?id=<?php echo $s["id"]?>">Delete</a></td>
</tr>
<?php endforeach;//lam the nay de khỏi lẫn với bọn khác như if else.......  ?>
</tbody>
</table>
</div>
</body>
</html>