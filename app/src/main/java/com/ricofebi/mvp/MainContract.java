package com.ricofebi.mvp;

/**
 * Created by wijaya on 7/6/2018.
 */

public interface MainContract {

    interface View {
        void loginSuccess(String title);
        void logout(String title);
        void showMessage(String message);
    }

    interface Presenter {

        void doLogin(String username, String password);

    }
}
