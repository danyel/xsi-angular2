CREATE SCHEMA DOMAIN;
CREATE TABLE DOMAIN.TD_REQUEST (
  ID         VARCHAR(36) NOT NULL PRIMARY KEY,
  NAME       VARCHAR(366),
  PROJECT_ID VARCHAR(36)
);


INSERT INTo "DOMAIN".TD_REQUEST VALUES('218492b4-a2c5-40c5-b301-5cb3f37930e7', 'Request 1', '3144e77b-4d99-4340-860b-c017ec3d237a');
INSERT INTo "DOMAIN".TD_REQUEST VALUES('7b036e78-8c4b-4b13-8f33-37b9852424a1', 'Request 1', '23994eaf-c48f-4f7f-8cc3-7495c9d560ce');