class Animal {
    constructor(name,age){
        this.name = name ;
        this.age = age ;
    }

    greet(){
        console.log("こんにちは");
    }

    instanceof(){
        this.greet();
        console.log(`名前は${this.name}です`);
        console.log(`${this.age}歳です`);
    }
}


class Dog extends Animal {

}

const dog = new Dog("レオ", 4) ;


dog.ingo();