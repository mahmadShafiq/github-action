pipeline{
    agent any
    tools 
      {
        gradle 'Gradle'    
      }
        
    stages{
         stage("run Frontend")
        {
            steps
            {
                echo "Hi This is Build Environment.."

             }
        }
         stage("run Backend")
        {
             steps
            {
                echo "Executing Gradle"
                sh './gradlew -v'          
            }
        }
    }
}
