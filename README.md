"# vttp5_ssf_day12l" 

docker build -t dharmeshb98/myappwk12l:v1 .

docker container run -d -p 8080:3000 --name dharmeshb98 dharmeshb98/myappwk12l:v1 