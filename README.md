"# vttp5_ssf_day12l" 

docker build -t dharmeshb98/myappwk12l:v1 .

docker container run -d -p 8080:3000 --name dharmeshb98 dharmeshb98/myappwk12l:v1 




## to run a other persons' dockerfile
# search for the file on docker

# docker will give you the code to use to pull

# use the code on the terminal
pull darryl1975/vttp5a-ssf-day13l:0.0.1

# press the image to see the port no that they have set
it was 8888 in this example

# run the docker run command (no need to set the name)
docker run -d -p 8080:8888 darryl1975/vttp5a-ssf-day13l:0.0.1

# now go to your localhost
localhost:8080

the api should be running
