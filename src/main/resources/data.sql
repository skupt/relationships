insert into packing_list (id, buyer, local_date) values
    (-1, 'Gena', '2022-01-01'),
    (-2, 'Vasya', '2022-09-23');
insert into packing_row (id, amount, description, packing_list) values
    (-1, 12, 'Wheel', -1),
    (-2, 9, 'Leverage', -1),
    (-3, 15, 'Pen', -1),
    (-4, 20, 'Pencil', -2),
    (-5, 10, 'eraser', -2);

insert into my_group (id, name) values
    (-1, 'admin'),
    (-2, 'user');
insert into my_user (id, name) values
    (-1, 'Vasya'),
    (-2, 'Petya'),
    (-3, 'Tanya'),
    (-4, 'Sveta');
insert into my_user_my_group (my_user_id, my_group_id) values
    (-1, -1),
    (-1, -2),
    (-2, -2),
    (-3, -2),
    (-4, -2);

INSERT INTO user_impl (id, name, email) VALUES (-1, 'Vasya', 'e@e');
INSERT INTO user_impl (id, name, email) VALUES (-2, 'Serg', 'e1@e');
INSERT INTO user_impl (id, name, email) VALUES (-3, 'Anna', 'e2@e');
INSERT INTO user_account (user_id, money_amount) VALUES (-1, 1000);
INSERT INTO user_account (user_id, money_amount) VALUES (-2, 2000);
INSERT INTO user_account (user_id, money_amount) VALUES (-3, 3000);

insert into tour (id, title, price) values
    (-1, 'California tour', 200),
    (-2, 'Dakota tour', 300),
    (-3, 'Utah tour', 400);
insert into tour_rating (tour_id, customer_id, score, comment) values
    (-1, -1, 5, 'so-so'),
    (-1, -2, 10, 'excellent'),
    (-2, -1, 1, 'bad'),
    (-3, -3, 7, 'good');

insert into choice (id, option) values
    (-1, 'left'),
    (-2, 'right'),
    (-3, 'up');
insert into tab_row (id, choice_id) values
    (-1, -1),
    (-2, -2),
    (-3, -3),
    (-4, null),
    (-5, -2);

insert into task (dtype, id, start_point, username, domain, keywords, priority) values
    ('SearchTask', -1, '2022-01-01', 'Vasya', 'Prom', 'Bicycle', 5),
    ('SearchTask', -2, '2022-02-02', 'Petya', 'OLX', 'Mono-cycle', 10);

