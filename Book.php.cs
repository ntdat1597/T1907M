<?php
namespace Model;//phan vung cua no
use library\connector;
use library\Model;

class Book extends Model
{
public  $id;
public $bookname;
public $category;

protected $table = "books";

public function __construct($id=null, $bookname=null, $category=null)
{
    $this->id = $id;
        $this->bookname = $bookname;
        $this->category = $category;
}


public function getBooks(){
    $sql = "SELECT * FROM ".$this->getTable();
        $rs = $this->getConn()->query($sql);
    return $this->toArray($rs);
}

public function all(){
    $sql = "SELECT * FROM ".$this->getTable();
        $rs = $this->getConn()->query($sql);
    return $this->toArray($rs);
}

public function save(){//la su ket hop cua insert va update
    $sql_text = "INSERT INTO ".$this->getTable()." (id, bookname, category) VALUES(".(is_null($this->id)?'null':$this->id).",'".$this->bookname.
    "','".$this->category."') ON DUPLICATE KEY UPDATE bookname = '".$this->bookname."',category = '".$this->category.
    "'";
    try{
        $this->getConn()->query($sql_text);
    }catch (\Exception $e){
        die($e->getMessage());
    }
}
public function find($id){
    $sql_text = "SELECT * FROM ".$this->getTable()." WHERE id = ".$id;
        $ary = toArray($this->getConn()->query($sql_text));
    if(count($ary) > 0){//neu co du lieu
        $data = $ary[0];
        return new Book($data["id"], $data["bookname"], $data["category"]);
    }
    return null;
}
public function delete(){
    $sql_text = "DELETE FROM ".$this->getTable()." WHERE id = ".$this->id;
        $this->getConn()->query($sql_text);
}
}