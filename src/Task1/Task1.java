package Task1;

public class Task1 {

    public static boolean method(String login, String password, String confirmPassword)
    throws WrongPasswordException,  WrongLoginException
    {
        if (login.length() > 20 || login.contains(" ")) {
        throw new WrongLoginException("Некорректный логин");
        }
        if (password.length() > 20 || login.contains(" ") && password.matches("\\d+") ) {
    throw new WrongPasswordException("Недопустимый пароль");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}