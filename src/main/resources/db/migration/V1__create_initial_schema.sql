CREATE TABLE ACCOUNT (
    ID INT PRIMARY KEY ,
    NAME VARCHAR(50) NOT NULL ,
    BIRTHDAY DATE NOT NULL ,
    CREATED_AT TIMESTAMP NOT NULL
);

INSERT INTO ACCOUNT (ID, NAME, BIRTHDAY, CREATED_AT)
VALUES
    (1, 'Colin Firth', '1960-09-10', CURRENT_TIMESTAMP),
    (2, 'Samuel L. Jackson', '1948-12-21', CURRENT_TIMESTAMP),
    (3, 'Taron Egerton', '1989-11-10', CURRENT_TIMESTAMP),
    (4, 'Mark Strong', '1963-08-05', CURRENT_TIMESTAMP);
