##To Run 

As a super user, 
```
sudo su
cd /etc/docker
touch daemon.json 
```
edit json to contain:
```
{
  "insecure-registries": ["docker.conygre.com:5000"]
}
```
ensure that there are no other containers running on port 8080 using:
```
service docker restart
```

```
docker pull docker.conygre.com:5000/appconfig
docker run -p8080:8080 docker.conygre.com/appconfig
```
