def gv
pipeline{
    agent any
    parameters {
        choice(name:'VERSION',choices:['1.1','1.2','1.3'],description:'')
        booleanParam:(name:'executeTEST',defaultValue:true,description:'')
    }
    tools { 
        gradle 'Gradle'
    }
    stages{
        stage("init")
        { 

            steps{
                script{
                    gv.buildApp()
                }
            }
        }
         stage("Backend")
        {
            when{
                expression{
                   params.executeTEST 
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
