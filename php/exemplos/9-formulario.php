<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Formulario PHP</title>
  </head>
  <body>
    <form method="post">
      <input name="teste">
      <input type="submit" value="Enviar">
    </form>
    <?php
    // isset: verifica se um valor existe
    // $_GET: obtem valor de um parametro quando enviado por HTTP GET
    // $_POST: obtem valor de um parametro quando enviado por HTTP POST
    // $_REQUEST: obtem valor de um parametro quando enviado por qualquer metodo
    if (isset($_REQUEST['teste'])) {
    ?>
      <p>Voce enviou o valor <?= $_REQUEST['teste'] ?>.</p>
    <?php } ?>
  </body>
</html>
