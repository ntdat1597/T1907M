<?php
if(!empty($_GET["id"])):
$user = new \ass1\User();
$user = $user->find($_GET["id"]);
$user->delete();
header("Location: ?route=users");
endif;