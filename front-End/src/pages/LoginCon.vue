<template>
    <div>
        <p>{{id}}</p>
    </div>
</template>

<script>
import { global } from '@/global'

export default {
  name: 'login-connect',
  data: _=> ({
        id: '',
        pw: '',
    }),

  created(){
      this.loginConnect();
  },

    
  methods: {
    loginConnect(){
        //axios 이용할 것
      var self = this
      self.$router.push({
        name: "myclass"
      })
    }
  }
};
</script>