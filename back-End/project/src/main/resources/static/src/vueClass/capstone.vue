<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>시스템 공학 캡스톤 디자인</h2>
        </div>

        <section class="panel">
            <header class="panel-heading">
                <div class="panel-actions">
                    <a href="#" class="fa fa-caret-down"></a>
                    <a href="#" class="fa fa-times"></a>
                </div>

                <h3 class="panel-title">강의 소개</h3>
            </header>
            <p class="panel-subtitle" style="font-weight: bold;">교과목 개요</p>
            <div class="panel-body">
                <p class="text-justify">주어진 주제(업무)를 해결하는 프로젝트 개발 과정을 단계적으로 학습하고 산출 된 결과물을 분석하고 활용한다.
                    학생 직무에 맞는 현업에 투입되었을 때 도움이 되기 위한 직무 능력 향상과 기업의 당면 과제나 애로 기술등과 같은 프로젝트에
                    학생과 함꼐 참여하여 개발을 진행하며 프로그램, 특허, 창업, 사업계획서등의 결과물 도출을 목적으로 한다.
                </p>
            </div>
            <hr width =100% color="blue" align="left" size=30/>
            <p class="panel-subtitle" style="font-weight: bold;">교육 목표</p>
            <div class="panel-body">
                <p class="text-justify">산업체 연계형 현장 실무 중심의 프로젝트 진행지도를 통해 양질의 결과물 도출을 통한 취업 능력 및 자신감을 배양한다.
                </p>
            </div>
        </section>
    </div>
</template>

<script>

import headercom from '@/components/header'

export default {
    name: 'myclass',

    components: {
        headercom
    }
}

</script>

<style>
.recordList {
    margin: 2% 0 0 5%;
    width: 50%;
}

.list-group-item {
    font-size: 20px;
}

h2 {
    width: 400px;
    margin: 0 0 2% 0;
}

.panel {
    margin-left: 7%;
    width: 80%;
}

p {
    margin-top: 15px;
}
</style>