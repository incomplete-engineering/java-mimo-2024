create table if not exists countries(
  id int not null GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
  country_name varchar(100) not null
);

create table if not exists authors(
  author_id int not null GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
  author_name varchar(100) not null,
  author_bio varchar(500),

  country_id int not null,
  foreign key (country_id) references countries(id)
);



create table if not exists books(
  book_id int not null GENERATED ALWAYS AS IDENTITY  PRIMARY KEY,
  isbn varchar(50) not null,
  title varchar(200) not null,
  book_description varchar(500),
  author_id int not null,

  foreign key (author_id) references authors(author_id)
);