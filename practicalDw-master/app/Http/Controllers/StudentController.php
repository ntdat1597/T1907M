<?php

namespace App\Http\Controllers;

use App\Student;
use http\Env\Response;
use Illuminate\Http\Request;

class StudentController extends Controller
{
    public function showForm(){
        return view("student-form");
    }
    public function submitForm(Request $request){
        $student = new Student();
        $student->student_name = $request->student_name;
        $student->student_email = $request->student_email;
        $student->student_telephone = $request->student_telephone;
        $student->student_feedback = $request->student_feedback;
        $student->save();
        return response()->json(['success' => 'form is successfully submitted!']);
    }
}
