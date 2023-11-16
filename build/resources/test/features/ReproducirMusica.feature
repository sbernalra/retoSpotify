#language: es
Característica: login en Spotify de manera exitoza.
  Yo como usuario quiero ingresar a Spotify para reproducir una cancion.

  Escenario: Login exitoso.
    Dado que el usuario abre el navegador en Spotify
    Cuando el usuario ingresa las credenciales correctas
    Entonces el usuario podra ver la lista de canciones
