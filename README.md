# Taxi Booking App

In this Application,
There will be an user app and one passenger will want to book a taxi. At the same time when one a passenger try to book a taxi,
request will go to the server and based on passenger location and based on the driver location when driver assigned it. Also, at the same time driver'll be assingned. Once driver assigned , passenger will get a notification.
Passenger will get a constnt update about the driver location via apache kafka server.The driver's app, at the time of 
driver goin towards the passenger, at every interval, all the data is getting stored to one of the topics in one of the instances of Kafka. 
Passenger app will subscribe to apache kafka server's particular topic. Whatever the updated location has been set by the driver to apache kafka,
those will be listen by the user applications. And Passenger will get the updated location of driver. 

Apache Kafka able to manage all that high throughput, because kafka is distributed system. Also it will be able to serve the billions of traffic easily. 


## System Architechure
![](./img/app-arch.png)


