def buildApp()
{
        echo "Hi This is Build Environment.."
}
def deployApp()
{
        echo "Hi This is Test Environment.."
        sh './gradle -v'
        echo "Deploying Version ${params.VERSION}"
}
return this
