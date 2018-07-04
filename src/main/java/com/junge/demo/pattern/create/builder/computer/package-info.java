/**
 * 描述组装台式机电脑过程
 * 参考https://blog.csdn.net/carson_ho/article/details/54910597
 * 模式讲解： 
1. 指挥者（Director）直接和客户（Client）进行需求沟通； 
2. 沟通后指挥者将客户创建产品的需求划分为各个部件的建造请求（Builder）； 
3. 将各个部件的建造请求委派到具体的建造者（ConcreteBuilder）； 
4. 各个具体建造者负责进行产品部件的构建； 
5. 最终构建成具体产品（Product）。
 * @author liuxj
 *
 */
package com.junge.demo.pattern.create.builder.computer;