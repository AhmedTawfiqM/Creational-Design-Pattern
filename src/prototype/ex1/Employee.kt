package ex1

class Employee : EmployeeClone {

    private var id=""
    private var name=""

     constructor(id: String,name: String){
        this.id=id
        this.name=name
    }

    override fun clone(): Employee {
        return Employee("0","Not Known")
    }

    override fun toString(): String {
        return "id : $id , name : $name"
    }
}