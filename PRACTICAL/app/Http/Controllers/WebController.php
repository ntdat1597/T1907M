<?php

namespace App\Http\Controllers;
use App\Book;
use Illuminate\Http\Request;

class Webcontroller extends Controller
{
    public function listBook(){
        $books = Book::paginate(10);
        return view('library.list',compact('books'));

    }
    public function search(Request $request)
    {
        $books = Book::where("title",$request->name_title)->paginate(10);
        return view("library.list",compact("books"));
    }
}
