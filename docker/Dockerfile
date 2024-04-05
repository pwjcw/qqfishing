FROM ubuntu:latest

ADD ./QQfishing.jar app.jar
COPY ./qqfish.sql db.sql
COPY supervisord.conf /etc/supervisord.conf

RUN export DEBIAN_FRONTEND=noninteractive \
    && apt-get update \
    && apt-get install -y tzdata \
    && ln -fs /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && dpkg-reconfigure --frontend noninteractive tzdata \
    && sed -i 's/http:\/\/archive.ubuntu.com\/ubuntu\//http:\/\/mirrors.tuna.tsinghua.edu.cn\/ubuntu\//g' /etc/apt/sources.list \
    && sed -i '/security/d' /etc/apt/sources.list \
    && apt-get update -y \
    && apt-get -yqq install supervisor mariadb-server openjdk-8-jdk \
    && rm -rf /var/lib/mysql \
    && mysql_install_db --user=mysql --datadir=/var/lib/mysql \
    && sh -c 'mysqld_safe &' \
    && sleep 10s \
    && mysqladmin -uroot password '123456' \
    && mysql -e "source /db.sql;" -uroot -p123456

RUN mkdir -p /var/log/supervisor


EXPOSE 8888

CMD ["supervisord", "-n"]