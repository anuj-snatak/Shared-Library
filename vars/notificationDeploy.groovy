def call(Map config = [:]) {
    stage('Deploy') {
        steps {
            echo "Deploying Notification API to ${config.env ?: 'dev'} environment..."
            // Example: use kubectl, ansible, helm etc.
        }
    }
}
