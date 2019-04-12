insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10001,'TestMovie_1',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10002,'TestMovie_2',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10003,'TestMovie_3',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10004,'TestMovie_4',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10005,'TestMovie_5',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10006,'TestMovie_6',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10007,'TestMovie_7',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10008,'TestMovie_8',sysdate(),sysdate());
insert into T_MOVIE(id,MOVIE_NAME,created_date, last_updated_date) values(10009,'TestMovie_9',sysdate(),sysdate());

insert into T_PROFILE(id, NUMBER)
values(40001,'E123456');
insert into T_PROFILE(id, NUMBER)
values(40002,'N123457');
insert into T_PROFILE(id, NUMBER)
values(40003,'L123890');


insert into T_USER(id, USER_NAME,PROFILE_ID)
values(20001,'Erman',40001);
insert into T_USER(id, USER_NAME,PROFILE_ID)
values(20002,'Esra',40002);
insert into T_USER(id, USER_NAME,PROFILE_ID)
values(20003,'Selman',40003);


insert into T_REVIEW(id, RATING, DESCRIPTION,movie_id)
values(50001,5,'Cool',10001);
insert into T_REVIEW(id, RATING, DESCRIPTION,movie_id)
values(50002,4,'Cool',10001);
insert into T_REVIEW(id, RATING, DESCRIPTION,movie_id)
values(50003,3,'Cool',10005);
insert into T_REVIEW(id, RATING, DESCRIPTION,movie_id)
values(50004,2,'Cool',10005);