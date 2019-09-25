function AdminUserServiceClient() {
    this.createUser = createUser;
    this.findAllUsers = findAllUsers;
    this.findUserById = findUserById;
    this.deleteUser = deleteUser;
    this.updateUser = updateUser;
    this.url = 'https://wbdv-generic-server.herokuapp.com/api/001248102/users';
    var self = this;
    function createUser(user) {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248102/users', {
                method: 'POST',
                body: JSON.stringify(user),
                headers: {
                    'content-type': 'application/json'
                }
            }
        )
    }

    function findAllUsers() {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248102/users')
            .then(function(response) {
                    return response.json();
                }
            )
    }
    function findUserById(userId) {
        fetch('https://wbdv-generic-server.herokuapp.com/api/001248102/users/' + userId, {
            method:'GET',
        })
    }
    function updateUser(userId, user) {
        fetch('https://wbdv-generic-server.herokuapp.com/api/001248102/users/' + userId, {
            method:"put",
            body: JSON.stringify(user),
            headers: {
                'Content-type': 'application/json'
            }
        })
    }
    function deleteUser(userId) {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248102/users/' + userId, {
            method: 'DELETE'
        })
    }
}
