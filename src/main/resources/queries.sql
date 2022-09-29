select g.name, u.name from my_user_my_group j
join my_user u on (j.my_user_id = u.id)
join my_group g on (j.my_group_id = g.id);

select title, price, count (score), avg(score) from tour left join tour_rating on (id = tour_id)
group by title, price;

select tab_row.id, option from tab_row left join choice on (choice_id = choice.id) order by tab_row.id desc;