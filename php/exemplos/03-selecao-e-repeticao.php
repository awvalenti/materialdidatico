<?php

$a = 10;

// Pode mencionar variaveis dentro de strings com aspas duplas;
// o valor da variavel sera colocado na string.
// Isso se chama interpolacao.
echo "String com aspas duplas faz interpolacao: $a\n";

if ($a == 10) {
	echo "\$a == 10\n";
} else {
	echo "\$a != 10\n";
}

for ($i = 0; $i < 10; ++$i) {
	echo $i;
}
echo "\n";

while ($i < 15) {
	echo $i++ . ' ';
}

?>
