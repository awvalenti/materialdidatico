<?php

class Tuberculo {
  public $nome;
  public $cor;

  function __construct($nome, $cor) {
    $this->nome = $nome;
    $this->cor = $cor;
  }
}

$batata = new Tuberculo("Baroa", "Amarela");

echo "$batata->nome $batata->cor";

?>
