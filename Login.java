public void login(Request request) {
   String username = request.getParameter("username");
   String password = request.getParameter("password");
   
   // Aquí puedes realizar las operaciones necesarias con las credenciales,
   // como autenticación, verificación en una base de datos, etc.
   
   // Ejemplo de validación básica de las credenciales
   if (username.equals("admin") && password.equals("admin")) {
       // Las credenciales son correctas, realizar acciones adicionales
   } else {
       // Las credenciales son incorrectas, mostrar mensaje de error
   }
}
