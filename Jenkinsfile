pipeline{
    agent any
    tools 
      {
        gradle 'Gradle'    
      }
    parameters {
        booleanParam(name:'test',defaultValue:true, description:'Bool Kafara')
        choice(name:'Version',choices:['1.1','1.2'],description:'Hello There')
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
             when{
                expression
                {
                    params.test
                }
            }

             steps
            {
                echo "Executing Gradle"
                sh './gradlew -v'     
                echo "Deployning the Version ${params.Version}"
           
            }
        }
    }
}
