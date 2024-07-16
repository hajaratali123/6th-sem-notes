<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">  
  <modelVersion>4.0.0</modelVersion>  
  <groupId>com.javatpoint</groupId>  
  <artifactId>SpringMVC</artifactId>  
  <packaging>war</packaging>  
  <version>0.0.1-SNAPSHOT</version>  
  <name>SpringMVC Maven Webapp</name>  
  <url>http://maven.apache.org</url>  
  <dependencies>  
    <dependency>  
      <groupId>junit</groupId>  
      <artifactId>junit</artifactId>  
      <version>3.8.1</version>  
      <scope>test</scope>  
    </dependency>  
      
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->  
<dependency>  
    <groupId>org.springframework</groupId>  
    <artifactId>spring-webmvc</artifactId>  
    <version>5.1.1.RELEASE</version>  
</dependency>  
  
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->  
<dependency>    
    <groupId>javax.servlet</groupId>    
    <artifactId>servlet-api</artifactId>    
    <version>3.0-alpha-1</version>    
</dependency>  
  
  </dependencies>  
  <build>  
    <finalName>SpringMVC</finalName>  
  </build>  
</project>  