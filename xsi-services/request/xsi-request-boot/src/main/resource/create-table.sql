CREATE SCHEMA domain;

CREATE TABLE 'domain'.'td_request' (
  id VARCHAR(36) NOT NULL PRIMARY KEY,
  name VARCHAR(355),
  project_uuid VARCHAR(36)
);
