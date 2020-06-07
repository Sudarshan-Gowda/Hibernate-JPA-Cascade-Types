
# Basic Example For CascadeType as well as orphanRemoval usage
This Project covers the simple basic example for understading CascadeTypes avaliable, orphanremoval & its usage and also the working copy for the same.

## Explanation:
Basically while updating(doing anyoperation) master entity, to make associated entity also to get reflected, We will use CascadeType.

<b>Detail Explanation:</b> Lets consider we have two entity, One is Employee(Parent) and other one is Account (Associated), If we do any operation to 
Parent entity, that should also to be reflected in associated entity means we should configure cascade type.

For Ex: While deleting Employee details and we not configured Cascade type with ALL or REMOVE, Container will not allow to remove the object since
it hold relation with associated entity. By Configuring cascade type we can remove both the entity.

### List of Cascade-Types avaliable are:

`CascadeType.PERSIST` : cascade type presist means that save() or persist() operations cascade to related entities.
`CascadeType.MERGE` : cascade type merge means that related entities are merged when the owning entity is merged.
`CascadeType.REFRESH` : cascade type refresh does the same thing for the refresh() operation.
`CascadeType.REMOVE` : cascade type remove removes all related entities association with this setting when the owning entity is deleted.
`CascadeType.DETACH` : cascade type detach detaches all related entities if a “manual detach” occurs.
`CascadeType.ALL` : cascade type all is shorthand for all of the above cascade operations.

The orphan removal will do the same job as like CascadeType in JPA. We just need to configure enable or disable.


## Running Application locally

This application not requires any server setup, You can just run it as main class.


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/issues


## Working with Rest in Eclipse

### prerequisites
The following items should be installed in your system:
* STS - Spring Tool Suite

### Steps:

1) Download or Clone this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types
```
2) To Import the Praject Using STS
```
File -> Import -> Maven -> Existing Maven project
```


## Looking for something in particular?

|Spring MVC Configuration | Class or Java property files  |
|--------------------------|---|
|The CascadeType Main Classe| [MainClassCascadeType](https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/blob/master/src/main/java/com/star/sud/app/MainClassCascadeType.java) |
|The OrphanRemoval Main Classe | [MainClassOrphanRemoval Removal](https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/blob/master/src/main/java/com/star/sud/app/MainClassOrphanRemoval.java) |
|Properties Files | [hibernate.cfg.xml](https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/blob/master/src/main/resources/hibernate.cfg.xml) |


## Steps to test the application:

1) Once the application is installed properly, Go to the class file MainClassCascadeType & Run as Java Application
2) Verify the result with the User reference or guide of step1 & step3
3) Repeat the above steps for class MainClassOrphanRemoval also. 
   
## User reference or guide.

1. Result For First class Configuration 
<img src="https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/blob/master/docs/Picture1.png" width="100%"/>

2. Result for Second class Configuration
<img src="https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/blob/master/docs/Picture2.png" width="100%"/>

3. Result for both the above steps (1 & 2).
<img src="https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/blob/master/docs/Picture3.png" width="100%"/>
 
### For More Details Use the Reference Links
1. https://howtodoinjava.com/hibernate/hibernate-jpa-cascade-types/


# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Hibernate-JPA-Cascade-Types/issues) is the preferred channel for bug reports, features requests and submitting pull requests.
