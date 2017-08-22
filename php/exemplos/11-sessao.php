<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Sessao</title>
  </head>
  <body>
    <?php
      // Necessario chamar esta funcao quando a pagina usa sessao
      session_start();

      if (isset($_POST['numero'])) {
        // Enviou formulario de armazenar numero

        // Armazena valor na sessao
        $_SESSION['numero'] = $_POST['numero'];

      } else if (isset($_POST['tirar-da-sessao'])) {
        // Enviou o outro formulario, de apagar numero

        // Apaga valor da sessao
        unset($_SESSION['numero']);
      }
    ?>
    <p>Memorizei algum numero?
      <?= isset($_SESSION['numero']) ? 'sim: ' . $_SESSION['numero'] : 'nao' ?>
    </p>
    <form method="post">
      <label for="campo-numero">Memorizarei este numero:</label>
      <input id="campo-numero" name="numero" value="5">
      <input type="submit" value="Por na sessao">
    </form>

    <form method="post">
      <button type="submit" name="tirar-da-sessao">Tirar da sessao</button>
    </form>
  </body>
</html>
