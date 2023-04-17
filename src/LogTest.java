public class LogTest {
    class LoginValidationException extends Exception {
        LoginValidationException() {}
    }
    void validateLogin(String login) throws LoginValidationException {
        //Проверка на длину
        if (login.length() > 20) throw new LoginValidationException();
        //Проверка на латиницу, цифры и _
        int i;
        for(i = 0; i < login.length(); i++) {
            char sim = login.charAt(i);
            boolean a;
            //ABC...
            if (sim > 64 && sim < 91) a = true;
                //abc...
            else if (sim > 96 && sim < 123) a = true;
                //123...
            else if (sim > 47 && sim < 58) a = true;
                //_
            else if (sim == 95) a = true;
            else a = false;
            if(a == false) throw new LoginValidationException();
        }
        //Проверка на минимум 1 _
        boolean c = false;
        for(i = 0; i < login.length(); i++){
            if (login.charAt(i) == 95) c = true;
        }
        if (c == false) throw new LoginValidationException();
        //Проверка на минимум одну маленькую букву
        boolean d = false;
        for(i = 0; i < login.length(); i++){
            if (login.charAt(i) > 96 && login.charAt(i) < 123) d = true;
        }
        if (d == false) throw new LoginValidationException();
        //Проверка на минимум одну большую букву
        boolean e = false;
        for(i = 0; i < login.length(); i++){
            if (login.charAt(i) > 64 && login.charAt(i) < 91) e = true;
        }
        if (e == false) throw new LoginValidationException();
    }
    boolean isLoginValid(String l) {
        try {
            validateLogin(l);
        }
        catch (LoginValidationException e){
            return false;
        }
        return true;
    }
}
