javac ./etu2070/framework/servlet/FrontServlet.java
javac ./etu2070/framework/Mapping.java
javac ./etu2070/annotation/url.java
javac -d . ./etu2070/model/java/Employe.java

/home/tendry/Documents/apache-tomcat-10.1.7/bin/shutdown.sh
/home/tendry/Documents/apache-tomcat-10.1.7/bin/startup.sh