<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>시스탬 공학 캡스톤 디자인</h2>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><router-link to="/capstone" v-on:click="test()">시스템 공학 캡스톤디자인</router-link></li>
                <li class="list-group-item"><router-link to="/">지능형 프로그래밍</router-link></li>
                <li class="list-group-item"><router-link to="/">머신러닝실무</router-link></li>
                <li class="list-group-item"><router-link to="/">빅데이터실무</router-link></li>
            </ul>
        </div>
    </div>
</template>