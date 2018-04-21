package codewar;

public class God {

    public static Human[] create(){
        Human[] array = new Human[2];
        array[0] =new Man();
        array[1] =new Woman() ;
        return array;

    }

}

 abstract  class Human{

}


class Man extends  Human{
}

class  Woman extends  Human{
}

