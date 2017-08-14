<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Formulario PHP</title>
  </head>
  <body>
    <form method="post">
      <legend>Digite os nomes dos produtos desejados</legend>
      <input name="produtos[0]">
      <input name="produtos[1]">
      <input name="produtos[2]">
      <input name="produtos[3]">
      <input name="produtos[4]">
      <input type="submit" value="Enviar">
    </form>
    <?php if (isset($_REQUEST['produtos'])) { ?>
      <ul>
        <?php
        foreach ($_REQUEST['produtos'] as $produto) {
          echo "<li>$produto</li>";
        }
        ?>
      </ul>
    <?php } ?>
  </body>
</html>
