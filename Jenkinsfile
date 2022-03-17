pipeline{
    agent any
    stages{
         stage("run Frontend")
        {
            steps
            {
                echo "Hi This is Build Environment.."
                nodejs('NodeJS 10.4.0') 
                {
                    sh 'yarn install' 
                }

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
