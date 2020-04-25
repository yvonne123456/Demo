package Testinterface;

public interface InterfaceA {

    void aaa();

}

interface InterfaceB {

    void bbb();

}

interface InterfaceC extends InterfaceA, InterfaceB {

    void ccc();

}

class TestClass implements InterfaceC {

    @Override
    public void aaa() {

    }

    @Override
    public void bbb() {

    }

    @Override
    public void ccc() {

    }

}
class A{

}
class B{

}


class C implements InterfaceB,InterfaceC{

    @Override
    public void aaa() {

    }

    @Override
    public void bbb() {

    }

    @Override
    public void ccc() {

    }
}









