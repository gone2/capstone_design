<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>빅데이터 실무</h2>
            
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