function User(username, password, firstName, lastName) {
    this.username = username;
    this.password = password;
    // ...same for rest of properties…

    this.setUsername = setUsername;
    this.getUsername = getUsername;
    // ...same for rest of properties…

    this.setPassowrd = setPassword;
    this.getPassowrd = getPassword;

    function setUsername(username) {
        super.username = username;
    }
    function getUsername() {
        return super.username;
    }
    // ...same for rest of properties…

    function setPassword(password) {
        super.password = password;
    }
    function getUsername() {
        return super.password;
    }
}
