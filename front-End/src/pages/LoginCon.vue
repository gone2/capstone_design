<template>
    <div>
        <p>{{db_test}}</p>
    </div>
</template>

<script>
import { global } from '@/global'
import axios from 'axios';

var config = require("@/config.js");

export default {
  name: 'login-connect',
  data: _=> ({
        // 전역변수로 저장된 아이디, 비밀번호를 가지고 디비에 접근할 것임
        // 다 사용하고 난 후에는 저장된 데이터 없애주기(해킹위험)
        tem_id: '',
        tem_pw: '',
        db_test: '',
    }),

  // 해당 vue 파일 만들어지자 마자 수행
  created() {

    //test
    this.tem_id = global.tem_id
    this.tem_pw = global.tem_pw
    
    // this.loginConnect();
    this.getLoginInfo();
  },

    
  methods: {
    // myClass 페이지로 이동하는 함수
    // back 완성되면 디비에 접근해서 올바른 유저정보인지 확인하는 함수 추가 필요
    loginConnect() {
        //axios 이용할 것
      var self = this
      self.$router.push({
        name: "myclass"
      })
    },
    getLoginInfo() {
      var self = this 
      axios({
        url: config.url + '/getMapping',
        crossDomain: true,
        method: 'GET',
        params: {
            userId: self.tem_id,
            userPw: self.tem_pw
        }
      }).then((result) => {
        var data = result.data
        self.db_test = data
        // if (result.data.result == 200) {
        //     self.companyList = data.res;
        //     self.companyTotal = data.totalRecordSize;
        //     self.selectedCompanyList = [];
        //     if(self.inserted == true)
        //     {
        //         self.selectedCompany = self.companyList[0];
        //         self.selectedCompanyIdx = 0;
        //         self.inserted = false;
        //     }
        // }
        // else {
        //     self.snackbarMessage = '업체 목록을 가져오지 못했습니다.';
        //     self.snackbarRed = true;
        // }
      }).catch((ex) => {
        console.log("ERROR! : ", ex);
      });
    },

  }
};
</script>