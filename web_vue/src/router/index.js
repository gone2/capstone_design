import Vue from 'vue'
import VueRouter from 'vue-router'

import login from '../vuePage/login'
import myclass from '../vuePage/myclass'
import myrecord from '../vuePage/myrecord'
import capstone from '../vuePage/capstone'
import capstoneClass from '../vueClass/capstone'
import bigdataClass from '../vueClass/bigdata'
import machineClass from '../vueClass/machine'
import programingClass from '../vueClass/programing'
Vue.use(VueRouter)

export default new VueRouter({
    mode: 'history',
  
    data: () => ({
    //   index: '0',
    //   title: 'noTitle'
    }),
  
    routes: [
      {
        path: '/',
        name: 'login',
        component: login
      },

      {
        path: '/myclass',
        name: 'myclass',
        component: myclass
      },

      {
        path: '/myrecord',
        name: 'myrecord',
        component: myrecord
      },

      {
        path: '/capstone',
        name: 'capstone',
        component: capstone
      },

      {
        path: '/capstoneClass',
        name: 'capstoneClass',
        component: capstoneClass
      },

      {
        path: '/bigdataClass',
        name: 'bigdataClass',
        component: bigdataClass
      },

      {
        path:'/machineClass',
        name:'machineClass',
        component: machineClass
      },

      {
        path:'/programingClass',
        name:'programingClass',
        component: programingClass
      }
    ]
  })