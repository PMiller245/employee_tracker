import Vue from 'vue'
import VueRouter from 'vue-router'
import Employees from '../views/Employees.vue'

Vue.use(VueRouter)

  const routes = [

  {
    path: '/',
    name: 'Employees',
    component: Employees
  }
   
]

const router = new VueRouter({
  routes
})

export default router
