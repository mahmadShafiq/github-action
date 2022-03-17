pipeline{
    agent any
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
                withGradle()
                 {
                    sh './gradlew -v'
                 }
                 
            }
        }
    }
}
