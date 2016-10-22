CREATE SCHEMA domain;

CREATE TABLE domain.td_request (
  uuid       VARCHAR(36)  NOT NULL,
  name       VARCHAR(255) NULL,
  project_id VARCHAR(36)
);


CREATE TABLE domain.td_project (
  uuid VARCHAR(36) NOT NULL,
  name VARCHAR(255)
);

CREATE SCHEMA query;

CREATE OR REPLACE VIEW query.vw_requests
AS
  SELECT
    request.uuid req_id,
    request.name req_name,
    project.name proj_name
  FROM
    domain.td_request request
    INNER JOIN domain.td_project project ON project.uuid = request.project_id;