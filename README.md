# 仿QQ邮箱钓鱼网站

## 简介

使用的技术栈：spring boot +mybatis

无后台，填写信息之后存入数据库，然后直接跳转到指定网页，具体跳转到到可以在代码中更改

前端代码是直接搬来的：https://github.com/Cl0udG0d/QQFishing

## 部署

提供了Docker环境

```bash
cd docker
docker build -t qqfish .
docker run -itd -p 8080:8080 qqfish
```

## 说明

本项目仅用于网络安全演练与学习用途，禁止用于违法犯罪行为。
