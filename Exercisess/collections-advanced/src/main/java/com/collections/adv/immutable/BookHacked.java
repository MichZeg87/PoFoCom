//package com.collections.adv.immutable;
//
//public class BookHacked extends Book{
//    private String realTitle;
//
//    public BookHacked(String author, String title) {
//    super(author, title);
//    realTitle = title; // obejscie final
//}
//
//    public void modifyTitle(String newTitle) { // obejście protected
//        title = newTitle;}
//
//    public void modifyTitle(String newTitle) {
//        realTitle = newTitle;
//    }
//
//    @Override                     // obejście final bez final gettera
//    public String getTitle() {
//        return realTitle;
//    }
//}
