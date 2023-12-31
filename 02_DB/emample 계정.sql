ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
CREATE USER example_jdb IDENTIFIED BY "test1234";

GRANT CONNECT, RESOURCE, DROP USER TO example_jdb;

ALTER USER example_jdb DEFAULT TABLESPACE "A230724"
QUOTA 10M ON "A230724";


ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
CREATE USER example2_jdb IDENTIFIED BY "test1234";

GRANT CONNECT, RESOURCE, CREATE VIEW TO example2_jdb;

ALTER USER example2_jdb DEFAULT TABLESPACE "A230724"
QUOTA 10M ON "A230724";

REVOKE CONNECT FROM example2_jdb;
DROP USER example2_jdb;
