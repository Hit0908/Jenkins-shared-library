def call(string imageName, string imageVersion){
  sh "docker build -t ${imageName}:${imageVersion}
}
