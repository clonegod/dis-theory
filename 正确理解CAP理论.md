
# Distributed data store

A distributed data store is a computer network where information is stored on more than one node, often in a replicated fashion.

分布式数据存储是一种计算机网络，其中信息通常以`复制（副本）`的方式存储在多个节点上。

Distributed databases are usually non-relational databases that enable a quick access to data over a large number of nodes. 

分布式数据库通常都是非关系型数据库，提供在大量数据节点上进行快速数据访问的能力。

Some distributed databases expose rich query abilities while others are limited to a key-value store semantics.

一些分布式数据库提供丰富的查询操作，而另一些则限制于仅支持key-value的查询（不同的分布式数据库其侧重点不同）。

As the ability of arbitrary querying is not as important as the availability, designers of distributed data stores have increased the latter at an expense of consistency.

由于任意查询的能力不如可用性那么重要，分布式数据存储的设计者以牺牲一致性为代价增加了可用性。


# [CAP 的三个特征] (https://en.wikipedia.org/wiki/CAP_theorem)
In theoretical computer science, the CAP theorem, states that it is impossible for a `distributed data store` to simultaneously provide more than two out of the following three guarantees:

### Consistency 一致性
Every read receives the most recent write or an error。

指的是任意连接到分布式存储的客户端，都能随时查询到最新写入的数据。

### Availability 可用性
Every request receives a (non-error) response – without the guarantee that it contains the most recent write

指的是客户端向分布式存储系统发送的每个请求，都能（在一定时间范围内）收到正常的响应结果 - 但是不保证服务端返回的是最新的数据。

### Partition tolerance 分区容忍性
The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes

指的是即使发生网络分区时，分布式存储系统也能继续对外提供可用的服务，保持正常运行状态。

网络分区是不可避免的，现象是子网节点间通信不可达，相互发送的数据包丢失或者网络延迟导致的通信异常。

# Explanation 解释
No distributed system is safe from network failures, thus network partitioning generally has to be tolerated. 

没有分布式系统可以避免网络故障，因此分布式系统必须要能容忍网络分区的情况发生。

In the presence of a partition, one is then left with two options: consistency or availability. 

##### 当发生网络分区，只能在一致性和可用性中选择一种。

When choosing consistency over availability, the system will return an error or a time-out if particular information cannot be guaranteed to be up to date due to network partitioning. 

当选择一致性而非可用性时，如果由于网络分区而无法保证向客户端返回的信息是最新的，则系统将返回错误或超时。

When choosing availability over consistency, the system will always process the query and try to return the most recent available version of the information, even if it cannot guarantee it is up to date due to network partitioning.

当选择可用性而非一致性时，系统将始终处理查询并尝试返回最新的可用信息版本，即使由于网络分区而无法保证其是最新的。


CAP is frequently misunderstood as if one has to choose to abandon one of the three guarantees at all times. 

CAP 经常被误解为必须始终选择放弃三种保证中的一种。

In fact, the choice is really between consistency and availability only when a network partition or failure happens; at all other times, no trade-off has to be made.

实际上，只有在发生网络分区或故障时，才需要在一致性和可用性之间进行选择; 在所有其他时间（没有网络分区），不需要进行任何权衡。

Database systems designed with traditional ACID guarantees in mind such as RDBMS choose consistency over availability, whereas systems designed around the BASE philosophy, common in the NoSQL movement for example, choose availability over consistency.

传统ACID设计的数据库系统，例如RDBMS选择一致性而非可用性，而围绕BASE理念设计的系统通常选择可用性而不是一致性（例如常见的NoSQL数据库）。
