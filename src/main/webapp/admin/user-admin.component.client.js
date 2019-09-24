
(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var $role;
    var userService = new AdminUserServiceClient();
    $(main);

    function main() {
        $usernameFld = $("#usernameFld");
        $passwordFld = $("#passwordFld");
        $firstNameFld = $("#firstNameFld");
        $lastNameFld = $("#lastNameFld");
        $createBtn = $(".wbdv-create");
        $createBtn.click(createUser);
        $userRowTemplate = $("#template");
        $tbody = $(".wbdv-tbody");
        $role = $("#roleFld");

        findAllUsers();


        $editBtn = $(".wbdv-edit");
        $removeBtn= $(".wbdv-remove");


        $editBtn.click(updateUser);
    }

    function createUser() {
        var username = $usernameFld.val();
        var password = $passwordFld.val();
        var firstName = $firstNameFld.val();
        var lastName = $lastNameFld.val();
        var role = $role.val();
        var user = {username, password, firstName, lastName, role};
        console.log(username);
        userService
            .createUser(user)
            .then(renderUser);
    }
    function findAllUsers() {
        userService.findAllUsers()
            .then(renderUsers);
    }
    function findUserById() {  }
    function deleteUser() {
        console.log("delete");
        alert("delete");
    }
    function selectUser() {  }
    function updateUser() {  }
    function renderUser(user) {  }
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
            $tbody.append(rowClone);
            console.log($tbody);
        }
        $removeBtn = $(".wbdv-remove");
        $removeBtn.click(function() {
            deleteUser();
        });
    }
})();
