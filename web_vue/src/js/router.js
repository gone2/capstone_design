// vue router 설정

import Vue from 'vue'
import VueRouter from 'vue-router'

import login from '@/vuePage/login'
import myclass from '@/vuePage/myclass'
import myrecord from '@/vuePage/myrecord'
import mypage from '@/vuePage/mypage'

import capstoneClass from '@/vueClass/capstone'
import bigdataClass from '@/vueClass/bigdata'
import machineClass from '@/vueClass/machine'
import programingClass from '@/vueClass/programing'

import capstoneRecord from '@/vueRecord/recordCapstone'
import bigdataRecord from '@/vueRecord/recordBigdata'
import machineRecord from '@/vueRecord/recordMachine'
import programingRecord from '@/vueRecord/recordProgram'

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
        path: '/mypage',
        name: 'mypage',
        component: mypage
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
      },

      {
        path: '/capstoneRecord',
        name: 'capstoneRecord',
        component: capstoneRecord
      },

      {
        path: '/bigdataRecord',
        name: 'bigdataRecord',
        component: bigdataRecord
      },

      {
        path:'/machineRecord',
        name:'machineRecord',
        component: machineRecord
      },

      {
        path:'/programingRecord',
        name:'programingRecord',
        component: programingRecord
      }
    ]
  })