<template>
<div class = "main-container">
  <div class="employee-list-container">
  <employee-list />
  </div>
  <div class = "add-employee-container">
<add-employee />
    </div>
  
  </div>
</template>

<script>
import EmployeeList from "../components/EmployeeList";
import AddEmployee from "../components/AddEmployee";

export default {
    name: 'employees',
    components:{
        EmployeeList,
        AddEmployee
    }

}
</script>

<style>
.main-container{
  display:flex;
  justify-content: space-evenly;
}
.employee-list-container{
  display:flex;
}
.add-empooyee-container{
  display:flex;
}
</style>