pipeline{
    agent any
    tools 
    {
        gradle 'Gradle 7.4.1'    
        
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
