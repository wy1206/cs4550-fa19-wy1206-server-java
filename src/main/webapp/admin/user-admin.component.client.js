
(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var userService = new AdminUserServiceClient();
    $(main);

    function main() {
        $usernameFld = $("#usernameFld");
        $passwordFld = $("#passwordFld");
        $firstNameFld = $("#firstNameFld");
        $lastNameFld = $("#lastNameFld");
        $createBtn = $(".wbdv-create");
        $editBtn = $(".wbdv-edit");
        $removeBtn= $(".wbdv-remove");
        $userRowTemplate = $("#template");
        $tbody = $(".wbdv-tbody");

        $createBtn.onclick(createUser());
        $removeBtn.onclick(deleteUser());
        $editBtn.onclick(updateUser());

        userService
            .findAllUsers()
            .then(renderUsers)

    }

    function createUser() {
        var username = $usernameFld.value;
        var password = $passwordFld.value;
        var user = {$usernameFld}

        userService
            .createUser(user)
            .then(renderUser);
    }
    function findAllUsers() { }
    function findUserById() {  }
    function deleteUser() {  }
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
            $tbody.append(rowClone);
            console.log($tbody)
        }
    }
})();
