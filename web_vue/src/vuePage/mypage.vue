<template>
    <div>
        <headercom></headercom>

        <section class="mypage panel">
            <header class="panel-heading">
                <div class="panel-actions">
                    <!-- <a href="#" class="fa fa-caret-down"></a>
                    <a href="#" class="fa fa-times"></a> -->
                </div>
                <h2 class="panel-title">마이페이지</h2>
            </header>

            <div class="panel-body" style="margin-left: 5%">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">학과</label>
                            <input type="text" name="department" class="form-control" value="컴퓨터시스템공학과" readonly>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">학번</label>
                            <input type="number" name="classNum" class="form-control" value="202046010" readonly>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">학년</label>
                            <input type="text" name="grade" class="form-control" value="1학년" readonly>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">성별</label>
                            <input type="text" name="gender" class="form-control" value="여자" readonly>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">이름</label>
                            <input type="text" name="name" class="form-control" value="전지원" readonly>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">생년월일</label>
                            <input type="text" name="birth" class="form-control" value="1995.08.20" readonly>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">비밀번호</label>
                            <input type="password" name="password" class="form-control">
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">비밀번호확인</label>
                            <input type="password" name="passwordCk" class="form-control">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-group">
                            <label class="myLabel control-label">핸드폰번호</label>
                            <input type="tel" name="tel" class="form-control" value="010-8208-5201">
                        </div>
                    </div>
                </div>
            </div>
            <footer class="panel-footer" style="float: right;">
                <button class="btn btn-primary">정보 수정</button>
            </footer>
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
.mypage {
    margin: 2% 0 0 5%;
    width: 85%;
}

.myLabel {
    font-size: 20px;
}
</style>