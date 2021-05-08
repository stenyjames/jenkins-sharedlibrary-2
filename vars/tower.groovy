def launchJob(body) {
   def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
  
  echo "The job name : ${config.name}"
  echo "The job param: ${config.param}"
   
   sh "ansible --version"
}
