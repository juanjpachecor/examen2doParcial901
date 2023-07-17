public void login(Request request) {
   String username = request.getParameter("username");
   String password = request.getParameter("password");
   
   // Aquí puedes realizar las operaciones necesarias con las credenciales,
   // como autenticación, verificación en una base de datos, etc.
   
   // Ejemplo de validación básica de las credenciales
   if (username != null && password != null) {
       // Las credenciales se han recogido correctamente, realizar acciones adicionales
   } else {
       // Las credenciales no se han proporcionado, mostrar mensaje de error
   }
}
