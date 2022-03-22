def gv
pipeline{
    agent any
    parameters {
        choice(name:'VERSION',choices:['1.1','1.2','1.3'],description:'')
        booleanParam(name:'Test',defaultValue:true,description:'')
    }
    tools { 
        gradle 'Gradle'
    }
    stages{
        stage("Intilizae")
        { 

           steps{
               script{
                   gv=load "script.groovy"
                   echo "Here the Script has been loaded From Initial Stage"
                }
            }
        }
        stage("Build")
        { 

            steps{
                script{
                    gv.buildApp()
                }
            }
        }
         stage("Deployment")
        {
            when{
                expression{
                   params.Test 
                }
            }
            steps{
                 script{
                     gv.deployApp()
                 }
      
            }
        }

    }
}
