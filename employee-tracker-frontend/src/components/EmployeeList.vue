<template>
  <div>
      <h1> Employees </h1>
      <div v-for="employee in allEmployees" v-bind:key="employee.id" >
          <h2>{{employee.firstName}} {{employee.lastName}}</h2>
          <p>Hire Date: {{employee.hiredDate}}</p>
          <h3>Summary of Skills</h3>
          <div class="skills" v-for="skill in employee.skills" v-bind:key="skill.id">
              <h4> {{skill.field.name}}: {{skill.experience}} months of experience</h4>
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

.skills{
    background-color: bisque;
}

</style>