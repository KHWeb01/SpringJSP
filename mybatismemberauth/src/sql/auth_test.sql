select auth from member_auth 
where member_no = 
(select member_no from jspmember where member_no = 41);