<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="box box-bg mt-1">
  <div class="flex-content-between">
    <div class="content-header">
      <p class="sub-title">거래처 담당자</p>
    </div>
    <div>
      <button type="button" class="btn btn-primary popup">추가</button>
      <button type="button" id="btnDeleteAccountManager" class="btn btn-danger">삭제</button>
    </div>
  </div>

  <table class="table-list full">
    <colgroup>
      <col width="50px">
      <col width="15%">
      <col width="15%">
      <col width="15%">
      <col width="15%">
      <col width="*">
    </colgroup>
    <thead>
    <tr>
      <th><input type="checkbox" name="checked_all" /></th>
      <th>담당자명</th>
      <th>직급</th>
      <th>번호</th>
      <th>이메일</th>
      <th>비고</th>
    </tr>
    </thead>
    <tbody>
    </tbody>
  </table>
</div>

<script type="text/javascript">
    $(document).ready(function () {
        $('#btnDeleteAccountManager').on('click', function (e) {
            console.log("btnDeleteAccountManager");
        });
    });
</script>