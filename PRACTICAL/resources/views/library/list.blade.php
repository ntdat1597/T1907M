@extends('components.layout')
@section('title','List')
@section('content')

    <div class="body table-responsive">
        <form action="{{route("search")}}" method="POST">
            <div class="form-group">
                @csrf
                @method("POST")

                <label for="inputUserName">Title</label>
                <input name="name_title" class="form-control "  id="inputUserName" required="" type="text" placeholder="Enter title by search" autocomplete="off" data-parsley-trigger="change">

            </div>
            <button class="btn btn-space btn-primary" type="submit">Sear Title</button>
        </form>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>STT</th>
                <th>BookId</th>
                <th>authorid</th>
                <th>title</th>
                <th>ISBN</th>
                <th>pub_year</th>
                <th>available</th>
            </tr>
            </thead>
            <tbody>
            @foreach($books as $value)
                <tr>
                    <td>{{$loop->index+1}}</td>
                    <td>{{$value->__get('bookid')}}</td>
                    <td>{{$value->__get('authorid')}}</td>
                    <td>{{$value->__get('title')}}</td>
                    <td>{{$value->__get('ISBN')}}</td>
                    <td>{{$value->__get('pub_year')}}</td>
                    <td>{{$value->__get('available')}}</td>

                </tr>
            @endforeach
            </tbody>
        </table>
    </div>
    {!! $books ->links() !!}

@endsection
