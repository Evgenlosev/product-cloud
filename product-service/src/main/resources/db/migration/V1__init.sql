create table if not exists products (
    id          bigserial primary key,
    title       varchar(255),
    price       int not null,
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);

insert into products (title, price) values
('Bread', 35),
('Milk', 60),
('Apples', 135),
('Chocolate', 50),
('Cheese', 150),
('Orange', 170),
('Butter', 140),
('Baguette', 40),
('Cookie', 70),
('Ice cream', 60),
('Bun', 40),
('Bacon', 200),
('Beef', 420),
('Sausages', 380),
('Potato', 37),
('Cabbage', 70),
('Carrot', 19),
('Strawberry', 320),
('Juice', 130),
('Water', 25),
('Coca-Cola', 80);