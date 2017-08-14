<?php

// Cria vetor
$vetor = array('dez' => 10, 'vinte' => 20, 'trinta' => 30);
echo $vetor['dez'] . "\n";

// Outra forma de percorrer vetor
foreach ($vetor as $chave => $valor) {
	echo "[$chave]: $valor\n";
}

?>
