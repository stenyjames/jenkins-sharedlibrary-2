def launchJob(body) {
   def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
  
  echo "Launching job nme : ${config.name}"
  echo "Launching job nme : ${config.param}"
}
