<template>
  <div>
      <h1> This is the employee component </h1>
      <div v-for="employee in allEmployees" v-bind:key="employee.id" >
          <h3>{{employee.firstName}} {{employee.lastName}}</h3>
          <p>{{employee.hiredDate}}</p>
          <h4>Summary of Skills</h4>
          <div v-for="skill in employee.skills" v-bind:key="skill.id">
            <p>{{skill.summary}}</p>
            </div>

      </div>
    

   </div>   
</template>

<script>

import employeeService from "../services/EmployeeService.js"

export default {
    name: "employee-list",
    data(){
        return {

        };
    },
    methods:{
        populateEmployees(){
            employeeService.getEmployees().then(response => {

                this.$store.commit("SET_EMPLOYEES", response.data)

            });
        }
    },
    created(){
        this.populateEmployees();
    },

    computed: {
        allEmployees(){
            return this.$store.state.employees;
        }
    }



}
</script>

<style>

</style>