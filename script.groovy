def buildApp()
{
        echo "Hi This is Build Environment.."
}
def deployApp()
{
        echo "From Deployment."
        sh './gradle -v'
        echo "Deploying Version ${params.VERSION}"
}
return this
