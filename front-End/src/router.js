import Vue from 'vue';
import Router from 'vue-router';
import MyClass from '@/pages/MyClass.vue';
import MyRecord from '@/pages/MyRecord.vue';
import Landing from '@/pages/Landing.vue';
import Login from '@/pages/Login.vue'; //로그인 페이지
import Profile from '@/pages/Profile.vue'; //마이페이지 -> myclass 로 이름 바꾸기
import MainNavbar from '@/layout/MainNavbar.vue'; //네비바
import MainFooter from '@/layout/MainFooter.vue'; //푸터

import LoginCon from '@/pages/LoginCon.vue';
Vue.use(Router);

export default new Router({
  linkExactActiveClass: 'active',
  routes: [
    {
      path: '/',
      name: 'login',
      components: { default: Login},
      props: {
        header: { colorOnScroll: 400 }
      }
    },
    {
      path: '/loginCon',
      name: 'loginCon',
      components: { default: LoginCon},
    },
    {
      path: '/myclass',
      name: 'myclass',
      components: { default: MyClass, header: MainNavbar, footer: MainFooter },
      props: {
        header: { colorOnScroll: 400 },
        footer: { backgroundColor: 'black' }
      }
    },
    {
      path: '/myrecord',
      name: 'myrecord',
      components: { default: MyRecord, header: MainNavbar, footer: MainFooter },
      props: {
        header: { colorOnScroll: 400 },
        footer: { backgroundColor: 'black' }
      }
    },
    {
      path: '/landing',
      name: 'landing',
      components: { default: Landing, header: MainNavbar, footer: MainFooter },
      props: {
        header: { colorOnScroll: 400 },
        footer: { backgroundColor: 'black' }
      }
    },
    {
      path: '/profile',
      name: 'profile',
      components: { default: Profile, header: MainNavbar, footer: MainFooter },
      props: {
        header: { colorOnScroll: 400 },
        footer: { backgroundColor: 'black' }
      }
    }
  ],
  scrollBehavior: to => {
    if (to.hash) {
      return { selector: to.hash };
    } else {
      return { x: 0, y: 0 };
    }
  }
});
