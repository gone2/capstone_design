<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>머신러닝 실무</h2>
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
                <p class="text-justify">인공지능(AI) 머신러닝 분야에서 대표적인 알고리즘에 대한 이해와 학습을 하며, 파이썬과
                    데이터 관련 라이브러리, 크롤링, 머신러닝 라이브러리 등을 통해 AI서비스를 학습한다.
                </p>
            </div>
            <hr width =100% color="blue" align="left" size=30/>
            <p class="panel-subtitle" style="font-weight: bold;">교육 목표</p>
            <div class="panel-body">
                <p class="text-justify">머신러닝 분야에서 대표적인 알고리즘에 대한 이해와 학습을 하며, 파이썬과
                    데이터 관련 라이브러리, 크롤링, 머신러닝 라이브러리 등을 통해 AI서비스를 학습한다.
                </p>
            </div>
        </section>
    </div>
</template>

<script>

import headercom from '../components/header'

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