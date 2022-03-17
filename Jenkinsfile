pipeline{
    agent any
    tools 
      {
        gradle 'Gradle'    
      }
    parameters {
        booleanParam(name:'test',defaultValue:true, description:'Bool Kafara')
        choice(name:'Version',defaultValue:'',choices:['1.1','1.2'],description:'Hello There')
    }
        
    stages{
         stage("run Frontend")
        {
            when{
                expression
                {
                    params.test
                }
            }
            steps
            {
                echo "Hi This is Build Environment.."
                echo "Deployning the Version ${Version}"
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
