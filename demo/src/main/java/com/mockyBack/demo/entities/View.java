package com.mockyBack.demo.entities;

public class View {
    static class Public { }
    static class ExtendedPublic extends Public { }
    static class Internal extends ExtendedPublic { }

}
