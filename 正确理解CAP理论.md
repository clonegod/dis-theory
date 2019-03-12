
# Distributed data store

A distributed data store is a computer network where information is stored on more than one node, often in a replicated fashion.
分布式数据存储是一种计算机网络，其中信息通常以`复制（副本）`的方式存储在多个节点上。

Distributed databases are usually non-relational databases that enable a quick access to data over a large number of nodes. 
分布式数据库通常都是非关系型数据库，提供在大量数据节点上进行快速数据访问的能力。

Some distributed databases expose rich query abilities while others are limited to a key-value store semantics.
一些分布式数据库提供丰富的查询操作，而另一些则限制于仅支持key-value的查询（不同的分布式数据库其侧重点不同）。

As the ability of arbitrary querying is not as important as the availability, designers of distributed data stores have increased the latter at an expense of consistency.
由于任意查询的能力不如可用性那么重要，分布式数据存储的设计者以牺牲一致性为代价增加了可用性。


# CAP
In theoretical computer science, the CAP theorem, states that it is impossible for a `distributed data store` to simultaneously provide more than two out of the following three guarantees:

### Consistency:
Every read receives the most recent write or an error。
一致性，指的是对任意客户端，都能随时查询到最新写入的数据。

### Availability: 
Every request receives a (non-error) response – without the guarantee that it contains the most recent write
可用性，指的是客户端想分布式存储系统发送的每个请求，都能收到正常的响应结果 - 不保证服务端返回的是最新的数据。

### Partition tolerance: 
The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes
分区容忍性，指的是即使发生网络分区时，分布式存储系统也能继续对外提供可用的服务，保持正常运行状态。
网络分区是不可避免的，现象是子网节点间通信不可达，相互发送的数据包丢失或者网络延迟导致的通信异常。
