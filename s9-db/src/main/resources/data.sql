delete from books;
delete from authors;
delete from countries;

INSERT INTO countries (id, country_name) VALUES (1, 'USA');
INSERT INTO countries (id, country_name) VALUES (2, 'France');
INSERT INTO countries (id, country_name) VALUES (3, 'India');
INSERT INTO countries (id, country_name) VALUES (4, 'Italy');
INSERT INTO countries (id, country_name) VALUES (5, 'Canada');



INSERT INTO authors (author_id, author_name, author_bio, country_id) VALUES (1, 'Thomas Piketty', 'Thomas Piketty is a French economist', 2);
INSERT INTO authors (author_id, author_name, author_bio, country_id) VALUES (2, 'Siddhartha Mukherjee', 'Siddhartha Mukherjee is an Indian-American physician, biologist, and author', 3);


INSERT INTO books (book_id, isbn, title, book_description, author_id) VALUES (1, '978-2021082289',
                'Le Capital au XXIe siecle', 'La repartition des richesses est l''une des questions les plus vives et les plus debattues aujourd''hui. Mais que sait-on vraiment de son evolution sur le long terme ?',
                1);

INSERT INTO books (book_id, isbn, title, book_description, author_id) VALUES (2, '978-1476733500', 
                'The Gene: An Intimate History', 'Spanning the globe and several centuries, The Gene is the story of the quest to decipher the master-code that makes and defines humans, that governs our form and function.',
                2);