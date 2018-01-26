# vaadin-cdi-239

Tested with Wildfly 11

## With version 2:


```
  <dependency>
       <groupId>com.vaadin</groupId>
       <artifactId>vaadin-cdi</artifactId>
       <version>2.0.0</version>
  </dependency>
```
Log output:
```
 [at.ppichl.test.vaadincdi.views.MainView] (default task-5) postConstruct
 [at.ppichl.test.vaadincdi.views.OrderView] (default task-5) postConstruct
 [at.ppichl.test.vaadincdi.views.MainView] (default task-5) showView
 [at.ppichl.test.vaadincdi.views.OrderView] (default task-5) enter
 ```

## With version 3:

```
  <dependency>
       <groupId>com.vaadin</groupId>
       <artifactId>vaadin-cdi</artifactId>
       <version>3.0.0</version>
  </dependency>
```
Log output:
```
 [at.ppichl.test.vaadincdi.views.MainView] (default task-5) postConstruct
 [at.ppichl.test.vaadincdi.views.OrderView] (default task-5) postConstruct
 [at.ppichl.test.vaadincdi.views.MainView] (default task-5) showView
 [at.ppichl.test.vaadincdi.views.OrderView] (default task-5) enter
 [at.ppichl.test.vaadincdi.views.OrderView] (default task-5) postConstruct
 [at.ppichl.test.vaadincdi.views.MainView] (default task-5) showView
 [at.ppichl.test.vaadincdi.views.OrderView] (default task-5) enter
 ```

 
