# Tasks schema
 
# --- !Ups


CREATE TABLE task (
    id INT NOT NULL AUTO_INCREMENT,
    label VARCHAR(255),
    PRIMARY KEY(id)
);


# --- !Downs
 
DROP TABLE task;
