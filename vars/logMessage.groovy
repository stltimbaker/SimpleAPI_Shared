def call(Map config) {
    node {
        echo "Your message is: ${config.message}"
    }
}

def call(String message) {
    node {
        echo "Another message: ${message}"
    }
}

def call(){
    node {
        echo "Your message is: EMPTY"
    }
}