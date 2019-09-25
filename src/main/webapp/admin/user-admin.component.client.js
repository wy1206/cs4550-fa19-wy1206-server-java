
(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var $role;
    var $updateBtn;
    var userService = new AdminUserServiceClient();
    var selectedUserId;
    $(main);

    function main() {
        $usernameFld = $("#usernameFld");
        $passwordFld = $("#passwordFld");
        $firstNameFld = $("#firstNameFld");
        $lastNameFld = $("#lastNameFld");
        $userRowTemplate = $("#template");
        $tbody = $('.wbdv-tbody');
        $role = $("#roleFld");

        $createBtn = $('.wbdv-create');
        $createBtn.click(createUser);

        $editBtn = $('.wbdv-edit');

        $removeBtn= $('.wbdv-remove');

        $updateBtn = $('.wbdv-update');
        $updateBtn.click(updateUser);



        findAllUsers();

    }

    function createUser() {
        var username = $usernameFld.val();
        var password = $passwordFld.val();
        var firstName = $firstNameFld.val();
        var lastName = $lastNameFld.val();
        var role = $role.val();
        if(username === "" || password === "" ||
            firstName === "" || lastName === "" ||
            role === ""){
            alert("field cannot be empty!");
        } else {
            const user = {username, password, firstName, lastName, role};

            userService
                .createUser(user).then(findAllUsers);
        }
    }
    function findAllUsers() {
        userService.findAllUsers().then(renderUsers);
    }
    function findUserById(userId) {
        userService.findUserById(userId);
    }
    function deleteUser() {
        const selectedUser = event.target.id;
        console.log(selectedUser);
        userService.deleteUser(selectedUser).then(findAllUsers);
    }
    function selectUser() {
        selectedUserId = event.target.id;
        console.log(selectedUserId);
        findUserById(selectedUserId);
    }
    function updateUser() {
        const username = $usernameFld.val();
        const password = $passwordFld.val();
        const firstName = $firstNameFld.val();
        const lastName = $lastNameFld.val();
        const role = $role.val();
        if(username === "" || password === "" ||
            firstName === "" || lastName === "" ||
            role === ""){
            alert("field cannot be empty!");
        } else {
            const user = {username, password, firstName, lastName, role};
            console.log(selectedUserId);
            console.log(user);
            userService.updateUser(selectedUserId,user);
            console.log(user);
            findAllUsers();
            alert("user has been updated");
            location.reload();
        }

    }

    function renderUsers(users) {
        $tbody.empty();
        for(var u in users) {
            const user = users[u];
            const rowClone = $userRowTemplate.clone();
            rowClone.removeClass('wbdv-hidden');
            rowClone.find('.wbdv-username').html(user.username);
            rowClone.find('.wbdv-password').html(user.password);
            rowClone.find('.wbdv-first-name').html(user.firstName);
            rowClone.find('.wbdv-last-name').html(user.lastName);
            rowClone.find('.wbdv-role').html(user.role);
            rowClone.find('.wbdv-remove').attr('id', user.id);
            rowClone.find('.wbdv-edit').attr('id', user.id);
            $tbody.append(rowClone);
        }

        $removeBtn = $('.wbdv-remove');
        $removeBtn.click(function() {
            deleteUser();
        });
        $editBtn = $('.wbdv-edit');
        $editBtn.click(function() {
            selectUser();
        })
    }
})();
