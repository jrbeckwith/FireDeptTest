# FireDeptTest
Fire Department Test Backend

Spring Boot project using PostgreSQL DB.

TO RUN PROJECT:

-run the schemaCreate.sql, populated with appropriate data.  You might run into issues with the DB / schema creation, I haven't included the SQL for those and ran out of time to make this easy to recreate.  JPA/Hibernate is particular about those details.

-clone project and run via maven command.  Or, load into IDE as existing maven project, run project and service will be ready for requests on http://localhost:8080

See screenshot for example of expected output.

Comments:
This was fun, but pretty involved for the amount of time I allocated (roughly 7 cumulative hours).  I spent too much time on setup and modeling, and found myself pinched for time on the data enrichment and fun useful behaviors like spatial queries, yikes.

In the Java modeling, I tried to include necessary examples of OneToOne and OneToMany relationships.

The weather enrichment just dumps into System.out, I ran out of time to merge it into the output, but wanted to at least demonstrate calling external API's in a data-driven way within Java.

To call this crude is an understatement - no error/exception handling, no tests, mininal DB constraints, etc...  Truly an exercise in slapping a schema and code together.

I put this together on Ubuntu, but being Java and PostgreSQL based it should setup on any platform with no differences in behavior.
