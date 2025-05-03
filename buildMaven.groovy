def call() {
	stage('Build with maven') {
		sh 'mvn clean install'
	}
}
