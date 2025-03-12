# Example of Spring JPA Application working with two databases

The example uses different databases for the two classes:
- customer
- product

Each of these is allocated their own sub-tree of the source code.  There is one sub-director for controllers.

For each sub-tree we have:
- the main entity (Customer or Product)
- data initalizer - adds some records to the tables on startup
- data source configuration - these provide the mapping between entities and the associated database
- repository
- service module (autowires the repository).  Of particular note is the use of the `@Transactional("customerTransactionManager")`
annotation on the repository reference.  This ties to a field in the data source configuration and thence to the appropriate
database