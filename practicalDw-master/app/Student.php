<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Student extends Model
{
    protected $table = "studentsurvey";
    public $fillable = [
        "student_name",
        "student_email",
        "student_telephone",
        "student_feedback",
    ];
}
