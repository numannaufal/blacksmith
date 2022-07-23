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
| create()        |
| update()        |
| delete()        |
+-----------------+

+-----------------+
| Consntraint     |
+-----------------+

+------------------------+
| ForeignKey Const       |
+------------------------+
| ref: (Table -> Column) |
+------------------------+
```

```
usage spec

// use case 1: create data
entity = new Entity()
          .column1(value)
          .column2(value)
          .create()

// use case 2: update data
entity
  .column1(updatedValue)
  .column2(updatedValue)
  .update()

// use case 3: get data
entity = Table(name).get(query)

// use case 4: delete
entity.delete()

// use case 5: create with FK. simple way
refEntity = new Entity().create()
entity = new Entity()
  .column1(value)
  .column2(refEntity.column())

// OR. abstract way
entity = new Entity(
    .column1(value)
    .column2(entityValue)

// inside .column2
// bcs it is constraint
column2(entity) {
  id = entity.create()
  this.column = id
}

// use case 6: get the ref 
entity = Table(name).get(query)
refEntity = entity.get(ref)
refEntity.update()

// OR

entity = Table(name).get(query, subEntity: true)
entity.refColumn : entity

things become complex. it is a feature

```