# springboot-kafka-real-world-project
Using wikimedia to get the real time data

1. Design of this project is multi module Spring Boot Application.
2. Project set up steps:
3. start.spring.io on your web browser and setup SpringBoot project and click generate project
4. Import your project as a Maven Project and change packaging as pom in your pom.xml (making pom tells spring boot we are doing multi module project)


6. Creating module, on the project right click, new "Maven Module" and skip archetype selection and give the name for your module.
7. This module we created will be the producer module.
8. Steps for creating Kafka Producer:
9. When ever you want to produce anything to a Topic, it should be registered, so create a KafkaConfiguration class and build your Topic.
10. In new module application.properties, add Kafka server location and basic kafka producer properties.
11. As we are getting real time data from a Wikimedia end point, we need to trigger it using Event Source (dependency added to module's pom.xml)


12. Create another module, name it as a consumer module
13. In consumer module application.properties set up consumer related properties and kafka server location.


15. Kafka installation:
16. Download Kafka from Apache Kafka 
17. Unzip the file and a folder will be created.
18. You can rename to your convinient name if needed
19. No software running is needed, but requires below steps to start your kafka server.
20. From this link, https://kafka.apache.org/quickstart you have all the steps required to do for sterting Kafka server.
21. NOTE: Your local environment must have Java 8+ installed.
Firstly, open terminal or cmd and navigate to your kakfka folder location.
Apache Kafka can be started using ZooKeeper or KRaft. To get started with either configuration follow one the sections below but not both.

Kafka with ZooKeeper
Run the following commands in order to start all services in the correct order:

# Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties
Open another terminal session and run:

# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties
Once all services have successfully launched, you will have a basic Kafka environment running and ready to use.

