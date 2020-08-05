<template>
  <form v-on:submit.prevent="submitForm" class="form">
<h3>Add Employee Form </h3>
  <label for="first-name">First Name</label>
  <input id="first-name" v-model="newEmployee.firstName" />

  <label for="last-name">Last Name</label>
  <input id="last-name" v-model="newEmployee.lastName" />

   <label for="contact-email">Contact Email</label>
  <input id="last-name" v-model="newEmployee.contactEmail" />

     <label for="company-email">Company Email</label>
  <input id="company-email" v-model="newEmployee.companyEmail" />

    <label for="birth-date">Birth Date</label>
    <input id="birth-date" v-model="newEmployee.birthDate" />

    <label for="hire-date">Hire Date</label>
    <input id="hire-date" v-model="newEmployee.hireDate" />

    <label for="role">Role</label>
    <input id="role" v-model="newEmployee.role" />

    <label for="business-unit">Business Unit</label>
    <input id="business-unit" v-model="newEmployee.businessUnit" />

    <label for="assigned-to">Assigned To</label>
    <input id="assigned-to" v-model="newEmployee.assignedTo" />

    <button type="submit"> Add New Employee </button>

   </form> 
</template>

<script>

import employeeService from "../services/EmployeeService";

export default {
  name: "add-employee",
  data(){
    return{
      newEmployee:{
        firstName:"",
        
        lastName: "",
        contactEmail: "",
        companyEmail: "",
        birthDate: "",
        hiredDate: "",
        role: "",
        businessUnit: "",
        address:"",
        skills:[],
        assignedTo:""
      }
    }
  },
  methods: {
    submitForm(){
      employeeService.addEmployee(this.newEmployee).then(response => {
        if(response.status == 201){
          window.alert("Employee created");
          this.$router.go();
        }
         
        
      })
    }
  }

}
</script>

<style>
.form {
  display:flex;
  flex-direction: column;
  /* align-items: flex-start; */
  width: 400px;
}

</style>