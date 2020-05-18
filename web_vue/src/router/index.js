import Vue from 'vue'
import VueRouter from 'vue-router'

import login from '../vuePage/login'
import myclass from '../vuePage/myclass'
import myrecord from '../vuePage/myrecord'
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
        component: login,
      },

      {
        path: '/myclass',
        name: 'myclass',
        component: myclass,
      },

      {
        path: '/myrecord',
        name: 'myrecord',
        component: myrecord,
      }
    ]
  })