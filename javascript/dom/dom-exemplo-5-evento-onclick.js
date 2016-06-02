var qtdItens = 0;

function adicionarLi() {
  var novoLi = document.createElement('li');
  novoLi.textContent = qtdItens++;
  document.getElementById('minha-lista').appendChild(novoLi);
  atualizarQtdeItens();
}

function removerLi() {
  if (qtdItens <= 0) {
    alert('Nenhum item para ser removido.');
    return;
  }

  var ul = document.getElementById('minha-lista');
  ul.removeChild(ul.lastElementChild);
  --qtdItens;
  atualizarQtdeItens();
}

function atualizarQtdeItens() {
  document.getElementById('quantidade-itens').textContent = qtdItens;
}
