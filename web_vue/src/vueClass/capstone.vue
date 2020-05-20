<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>시스템 공학 캡스톤 디자인</h2>
            
        </div>
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
</style>