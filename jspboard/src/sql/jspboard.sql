create table jspboard (
	board_no number not null,
	title varchar(200) not null,
	content varchar2(4000) null,
	writer varchar(50) not null,
	reg_date timestamp default sysdate,
	primary key (board_no)
);