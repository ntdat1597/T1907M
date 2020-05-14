<?php
if(count($_POST) > 0):
//nhan thong tin tu form
$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];

//insert to table
$user = new \ass1\User(null, $name, $email, $password);
$user->save();
header("Location: ?route=users");

endif;