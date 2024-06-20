def call(Map config) {
    node {
        echo "Your message is: ${config.message}"
    }
}

def call(){
    node {
        echo "Your message is: EMPTY"
    }
}