# FireDeptTest
Fire Department Test Backend

Spring Boot project using PostgreSQL DB.

TO RUN PROJECT:
NOTE: The Java project will not run correctly without a connection to the underlying DB, Hibernate is particular

-Install PostgreSQL, then run these commands (Linux and Mac - Win commands are slightly different)

    sudo -u postgres psql
    postgres=# create database FireDeptTest;
    postgres=# create user pguser with encrypted password pguser;
    postgres=# grant all privileges on database FireDeptTest to pguser;

-issue the schemaCreate.sql commands in postgres command line (or optionally install PGAdmin4 and run here).

-clone this git project and run via maven command.  Or, load into IDE as existing maven project, run project and service will be ready for requests

ENPOINTS:

POST - http://localhost:8080/incidentEnhanced
    
    Header  Content-Type: application/json
    Body  (incident record json)

GET - http://localhost:8080/incidents/{incident_number}

See screenshots for example of expected output.


INTEGRATION TESTS:
Very rudimentary unit tests are available in com.prominentedge.FireDeptTest.FireDeptTestApplicationTests.java.  Run as JUnit test in IDE.


Comments:
This is closer to the intended task as discussed with Syrus.  I had all of the PostgreSQL / Hibernate persistance already hooked up, otherwise I would have just done this as a Spring Boot project with plain object modeling, or no modeling at all and just maniuplated the JSON inputs.  This was a fun exercise, I hadn't put together a Java project from scratch in a while, so it was good practice / refresher as well.
