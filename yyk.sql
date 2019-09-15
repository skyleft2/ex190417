create table guestbook(
idx number not null primary key,
name varchar2(50) not null,
email varchar2(50) not null,
passwd varchar2(50) not null,
content varchar2(4000) not null,
post_date date default sysdate
);


create sequence guestbook_seq
start with 1
increment by 1
nomaxvalue
nocache
;


insert into guestbook (idx, name, email, passwd, content) values
(guestbook_seq.nextval, 'kim3', 'kim3@com', '1234', '¹æ¸í·Ï')
;

select * from guestbook
;

commit;
