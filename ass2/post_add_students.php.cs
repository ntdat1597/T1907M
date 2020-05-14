<?php
if(count($_POST) > 0):
require_once "Students.php";
//nhan thong tin tu form
$name = $_POST['name'];
$age = $_POST['age'];
$mark = $_POST['mark'];

//insert to table
$user = new \ass2\Students(null, $name, $age, $mark);
$user->save();
header("Location: student.php");

endif;