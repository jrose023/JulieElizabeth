## To Run (in a world where this actually works)

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
exit
```

*somehow connect to database ha ha*


After exiting sudo run:
```
docker pull docker.conygre.com:5000/appconfig
docker run -p8080:8080 docker.conygre.com:5000/appconfig
```

navigate to [your ip]:8080/api/compactdiscs

## This does not work ha ha
