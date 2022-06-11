const despesasTotais = (arr) => arr.map(item => item.preco).reduce((previous, current) => previous += current, 0)
