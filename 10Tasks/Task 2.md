# Task2: 

------

## Find the resources consumption of your REST service

1. 实验环境：

    1. CPU：Inter(R) Core(TM) i7-4710MQ CPU @ 2.50GHz
    2. Memory： 8.0 GB DDR3
    3. Postman PC

2. 实验操作：

    1. Get the CPU, Memory consumption when there is no requests
    2. With the increasing requests, find out the trend of each resource utilization
    3. Requests contain:
        1. Static page "Hello world! "
        2. Actuator endpoint: Health & an DIY endpoint
        3. Security: LogIn
        4. Main function: Ladder(w1="happy",w2="apple") 

3. 实验数据:

    1. No request:

        ![1](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/1.png)

        ![1.1](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/1.1.png)

    2. With 10 requests:

        ![2.0](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/2.0.png)

        ![2.1](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/2.1.png)

    3. With 100 requests:

        ![3.1](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/3.1.png)

        ![3.2](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/3.2.png)

    4. With 1000 requests

        ![4.1](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/4.1.png)

        ![4.2](https://github.com/Icyfrog/SE420_Homework/blob/master/10Tasks/pictures/4.2.png)

4. Summary:

    1.  随着Request数目的增长，CPU占用率明显增加
    2.  内存使用情况与Request数目关系不大
  
5. Discussion
    1.  To be continuted.
