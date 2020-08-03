
DROP TABLE employee_skill;
DROP TABLE employee;
DROP TABLE address;
DROP TABLE skill;
DROP TABLE field;






CREATE TABLE employee
(
    employee_id serial,
    firstName varchar(30) NOT NULL,
    lastName varchar(30) NOT NULL,
    contactEmail varchar(70),
    companyEmail varchar(70) NOT NULL,
    birthDate varchar (15) NOT NULL,
    hiredDate varchar(15) NOT NULL,
    role varchar (30) NOT NULL,
    businessUnit varchar(255),
    address_id integer,
    assignedTo varchar (30),
    CONSTRAINT pk_employee_id PRIMARY KEY (employee_id)
    
);




CREATE TABLE address
(
address_id SERIAL,
street varchar (60) NOT NULL,
suite varchar (30),
city varchar (30) NOT NULL,
region varchar (3) NOT NULL,
postal varchar (10) NOT NULL,
country varchar (2) NOT NULL,
CONSTRAINT pk_address_id PRIMARY KEY (address_id)
);


CREATE TABLE skill
(
skill_id serial,
field_id integer,
experience integer NOT NULL DEFAULT 0,
summary varchar (255),
CONSTRAINT pk_skill_id PRIMARY KEY (skill_id)
);

CREATE TABLE field
(
field_id SERIAL,
name varchar (30) NOT NULL,
type varchar(30) NOT NULL,
CONSTRAINT pk_field_id PRIMARY KEY (field_id)
);

CREATE TABLE employee_skill
(
employee_id INT,
skill_id INT,

CONSTRAINT pk_employee_skill PRIMARY KEY (employee_id,skill_id)
);



ALTER TABLE employee ADD FOREIGN KEY(address_id) REFERENCES address(address_id);


ALTER TABLE employee_skill ADD FOREIGN KEY (employee_id) REFERENCES employee(employee_id);
ALTER TABLE employee_skill ADD FOREIGN KEY (skill_id) REFERENCES skill(skill_id);

ALTER TABLE skill ADD FOREIGN KEY (field_id) REFERENCES field(field_id);

INSERT INTO address (street, suite, city, region, postal, country) VALUES ('beford', 'st 300', 'gpp', 'mi', '48230', 'us');

INSERT INTO employee  (firstName, lastName, contactEmail, companyEmail, birthDate, hiredDate, role, businessUnit,address_id,assignedTo) VALUES 
('Peter', 'Miller', 'test@test.gmail', 'peter.miller@perficient.com', '1/1/1980', '1/1/2010', 'Jr Dev', 'Sales', 1 , 'Dave');

INSERT INTO field (name, type) VALUES ('Underwater Basket Weaving', 'Essential');

INSERT INTO skill (field_id, experience, summary) VALUES (1, 1, 'Wove baskets underwater');

INSERT INTO employee_skill (employee_id, skill_id) VALUES (1,1);






