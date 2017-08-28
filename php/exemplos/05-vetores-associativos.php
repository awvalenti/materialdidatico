<?php

// Vetor associativo permite associar strings a outros valores.
// A chave tem que ser do tipo string; o valor pode ser de qualquer tipo.

// Cria vetor
$vetor = array('dez' => 10, 'vinte' => 20, 'trinta' => 30);
echo $vetor['dez'] . "\n";

// Outra forma de percorrer vetor
foreach ($vetor as $chave => $valor) {
	echo "[$chave]: $valor\n";
}

?>
