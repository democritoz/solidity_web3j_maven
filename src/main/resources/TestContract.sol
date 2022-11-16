pragma solidity ^0.8.0;

contract TestContract {

    string public name;
    uint256 public age;

    function setName(string memory _name) public {
        name = _name;
    }

    function setAge(uint _age) public {
        age = _age;
    }

    function getName() public view returns(string memory) {
        return name;
    }

    function getAge() public view returns(uint256) {
        return age;
    }


}
