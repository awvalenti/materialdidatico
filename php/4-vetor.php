<?php

// Cria vetor
$vetor = array(10, 20, 30);

// Uma forma de imprimir os dados.
// Operador ponto concatena.
echo $vetor[0] . $vetor[1] . $vetor[2];

// Uma forma de percorrer vetor
for ($i = 0; $i < count($vetor); ++$i) {
	echo $vetor[$i];
}

// Outra forma de percorrer vetor
foreach ($vetor as $elemento) {
	echo "$elemento ";
}

// Outra forma de percorrer vetor
foreach ($vetor as $indice => $elemento) {
	echo "[$indice]: $elemento\n";
}

?>