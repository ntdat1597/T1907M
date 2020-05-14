<?php
require_once "student.php";
if(!empty($_GET["id"])):
$user = new \ass2\Students();
$user = $user->find($_GET["id"]);
$user->delete();
header("Location: student.php");
endif;