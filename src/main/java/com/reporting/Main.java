package com.reporting;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Optional;
import java.util.Random;

public class Main {

    public static @Nullable String getPotentiallyNullableString() {
        if (new Random().nextBoolean()) {
            return null;
        }
        return "real string";
    }

    public static void main(String[] args) {
        String potentiallyNullableString = getPotentiallyNullableString();
        if (potentiallyNullableString != null) {
            System.out.println("length of our string is: " + potentiallyNullableString.length());
        }
        Optional.ofNullable(potentiallyNullableString).ifPresent(nowItsNotNullString -> {
            System.out.println("length of our string is: " + nowItsNotNullString.length());
        });
    }
// to see error uncomment lines below
//    static class User {
//        @NonNull
//        private String id;
//        private int age;
//
//        public User( String id, int age) {
//            this.id = id;
//            this.age = age;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//    }

//    public static class UserBuilder {
//        @NonNull
//        private String id;
//        private int age;
//
//        public UserBuilder id( String id) {
//            this.id = id;
//            return this;
//        }
//
//        public UserBuilder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Main.User build() {
//            return new Main.User(id, age);
//        }
//    }
}
