CREATE KEYSPACE IF NOT EXISTS module_login WITH REPLICATION = {'class': 'SimpleStrategy', 'replication_factor': 1};


create table if not exists module_login.test_table (
    id bigint,
    name text,
    primary key ( id )
);


insert into module_login.test_table(id, name) values (1, 'narjiss');
insert into module_login.test_table(id, name) values (2, 'rihab');
insert into module_login.test_table(id, name) values (3, 'saad');
