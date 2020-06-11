<template>
  <div>
    <div class="page-header clear-filter" filter-color="orange">
      <!-- 배경 이미지 설정 -->
      <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>
      <div class="container">
        <div class="content-center brand">
          <collapse :multiple-active="false">
              <collapse-item v-for="(item, index) in classList" :key="index" v-bind:title="item.name" v-bind:name="index" style="color: white;">
                <h5>개요</h5>
                <div>{{item.objectivity}}</div>
                <br>
                <hr width =100% color="gray" align="left" size=30/>
                <h5>목표</h5>
                <div>{{item.summary}}</div>
              </collapse-item>
          </collapse>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { Parallax } from "@/components"
import { Collapse, CollapseItem } from "@/components"
import axios from 'axios'

export default {
  name: "myclass",
  bodyClass: "index-page",
  components: {
    Parallax,
    Collapse,
    CollapseItem
  },
  created() {
    this.getClassList()
  },
  methods: {
    getClassList() {
      var self = this

      axios.post('/myClassInfo'
      ).then((result) => {
        var data = result.data.classData
        
        if(result.data != null) {
            self.class_name_list = []
            self.class_summary_list = []
            self.class_obj_list = []

          for (var i = 0; i < data.length; i++) {
            self.class_name_list.push(data[i].CLASS_NAME)
            self.class_summary_list.push(data[i].CLASS_OUTLINE)
            self.class_obj_list.push(data[i].CLASS_CONTENTS)
          }
        }
      })

      for(var i=0; i<self.class_name_list.length; i++) {
        var mClass = { //객체 생성
          name: '',
          summary: '',
          objectivity: '',
        }
        mClass.name = self.class_name_list[i]
        mClass.summary = self.class_summary_list[i]
        mClass.objectivity = self.class_obj_list[i]

        self.classList.push(mClass) //리스트에 추가
      }
    }
  },
  data: _ => ({
    classList: [],
    // 아래 내용은 가라데이터, 이 후에 디비에서 받아오게 되면 삭제할 것임
    // class_name_list: [
    //   "머신러닝 실무",
    //   "빅데이터 실무",
    //   "시스템 공학 캡스톤 디자인",
    //   "지능형 프로그래밍"
    // ], //과목 이름
    // class_summary_list: [
    //   "주어진 주제(업무)를 해결하는 프로젝트 개발 과정을 단계적으로 학습하고 산출 된 결과물을 분석하고 활용한다. 학생 직무에 맞는 현업에 투입되었을 때 도움이 되기 위한 직무 능력 향상과 기업의 당면 과제나 애로 기술등과 같은 프로젝트에 학생과 함꼐 참여하여 개발을 진행하며 프로그램, 특허, 창업, 사업계획서등의 결과물 도출을 목적으로 한다.",
    //   "인공지능 기초지식과 응용지식을 강의하고 AI 기술을 이용한 관련 프로그램을 분석 및 구현해 본다.",
    //   "인공지능(AI) 머신러닝 분야에서 대표적인 알고리즘에 대한 이해와 학습을 하며, 파이썬과 데이터 관련 라이브러리, 크롤링, 머신러닝 라이브러리 등을 통해 AI서비스를 학습한다."
    // ], //교과목 개요
    // class_obj_list: [
    //   "산업체 연계형 현장 실무 중심의 프로젝트 진행지도를 통해 양질의 결과물 도출을 통한 취업 능력 및 자신감을 배양한다.",
    //   "1. 인공지능 시스템 구현 기술들을 알 수 있다.\n2. 지능형 시스템 구현 원리를 알 수 있다.\n3. 간단한 지능형 프로그램을 구현 할 수 있다.",
    //   "머신러닝 분야에서 대표적인 알고리즘에 대한 이해와 학습을 하며, 파이썬과 데이터 관련 라이브러리, 크롤링, 머신러닝 라이브러리 등을 통해 AI서비스를 학습한다."
    // ] // 교육 목표
  })
};
</script>
<style></style>
