# CursoJava
 
### JDBC : Java Database Connectivity
  Create Project --> Java with Maven, contiene las libreria requeridas para conectarnos a una BD
  
Java with Maven --> Java Application
Especificamos nombre del proyecto, version y dominio, el paquete queda en blanco
Una vez creado el proyecto --> Click derecho sobre el nombre del proyecto --> Clean and Build

//Agregar librerias de MySQL

Vamos a project Files --> pom.xml
--> Al terminar la etiqueta de properties y antes del cierre de la etiqueta project

<dependencies>
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>8.0.21</version>
	</dependency>
</dependencies>

Una vez hecho esto click derecho nombre del proyecto --> Clean and Build

Para verificar que se ejecuto correctamente en la carpeta de dependencias de nuestro
proyecto deberiamos ver 

mysql-connector-java-8.8.21.jar

  
