## Object-Relational Mapping

**Objectives:**
communnicate bi-directional from programming language runtime - sql

**Key Results**
- Implement object design pattern practices to the mapping
- Non complicated , easy to use for dev from any other object-oriented languages



**The Blue Print**

- Scopes: no schema defined in the class. It is created in SQL.
- Supporting run time operation: create, update, delete (crud)


Let's look into the Component: Table
```
+----------------------------------------+
| Table                                  |
+----------------------------------------+
| column1 type constraints               |
| column2 type constraints               |
| ...                                    |
| columnN type constraints               |
+----------------------------------------+
```

```
< Abstract Class >
+--------------------------+
| Table                    |
---------------------------+
| columns: Column[]        |
+--------------------------+
| get(query): Entity/ies   |
+--------------------------+

+--------------+
| Column       |
+--------------+
| name         |
| type         |
| constraints? |
+--------------+

+-----------------+
| Entity          |
+-----------------+
| column1: Column |
| column2: Column |
| ...             |
| columnN: Column |
+-----------------+
| insert()        |
| update()        |
| delete()        |
+-----------------+
```