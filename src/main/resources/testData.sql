insert into users (email, password, nickname, gender, birth_date) values ('qwerty', '1234', '지나가는여행자', 1, '2024-05-29');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty2', '1234', '누워있는개백수', 0, '1990-01-11');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty3', '1234', '코딩하는개발자', 1, '2022-02-22');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty4', '1234', '야근하는직장인', 0, '2033-03-01');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty5', '1234', '노래하는아이돌', 1, '2044-04-01');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty6', '1234', '지나가는여행자', 1, '2024-05-29');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty7', '1234', '누워있는개백수', 0, '1990-01-11');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty8', '1234', '코딩하는개발자', 1, '2022-02-22');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty9', '1234', '야근하는직장인', 0, '2033-03-01');
insert into users (email, password, nickname, gender, birth_date) values ('qwerty10', '1234', '노래하는아이돌', 1, '2044-04-01');

INSERT INTO Plan (DAY, COUNT, STARTTIME, ENDTIME, RESTAURANT_ID, TOURISTDESTINATION_ID) VALUES
                                                                                            ('2024-06-01', 1, '09:00:00', '10:00:00', 2, NULL),
                                                                                            ('2024-06-02', 2, '10:00:00', '11:00:00', 3, NULL),
                                                                                            ('2024-06-03', 3, '11:00:00', '12:00:00', NULL, 65),
                                                                                            ('2024-06-04', 4, '12:00:00', '13:00:00', NULL, 234),
                                                                                            ('2024-06-05', 5, '13:00:00', '14:00:00', 35, NULL),
                                                                                            ('2024-06-06', 6, '14:00:00', '15:00:00', 21, NULL),
                                                                                            ('2024-06-07', 7, '15:00:00', '16:00:00', NULL, 23),
                                                                                            ('2024-06-08', 8, '16:00:00', '17:00:00', 98, NULL),
                                                                                            ('2024-06-09', 9, '17:00:00', '18:00:00', 5, NULL),
                                                                                            ('2024-06-10', 10, '18:00:00', '19:00:00', 23, NULL);
INSERT INTO User_Project ( user_id, project_id) VALUES
                                                      (1, 1),
                                                      (2, 2),
                                                      (3, 3),
                                                      (4, 4),
                                                      (5, 5),
                                                      (6, 6),
                                                      (7, 7),
                                                      (8, 8),
                                                      (9, 9),
                                                      (10, 10);

INSERT INTO Project (projectname, createdate, lasteditdate,host) VALUES
                                                                                           ('Project One', '2023-01-01', '2023-01-10',1),
                                                                                           ('Project Two', '2023-02-01', '2023-02-10',2),
                                                                                           ('Project Three', '2023-03-01', '2023-03-10',3),
                                                                                           ('Project Four', '2023-04-01', '2023-04-10',4),
                                                                                           ('Project Five', '2023-05-01', '2023-05-10',5),
                                                                                           ('Project Six', '2023-06-01', '2023-06-10',6),
                                                                                           ('Project Seven', '2023-07-01', '2023-07-10',7),
                                                                                           ('Project Eight', '2023-08-01', '2023-08-10',8),
                                                                                           ('Project Nine', '2023-09-01', '2023-09-10',9),
                                                                                           ('Project Ten', '2023-10-01', '2023-10-10',10);