<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <ul>
      <li>1</li>
      <li>2</li>
      <li>3</li>
      <?php
      for ($i = 4; $i <= 100; ++$i) {
        echo "<li>$i</li>";
      }
      ?>
    </ul>
  </body>
</html>
