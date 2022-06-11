// 1:
// const receberPrimeiroEUltimoElemento = (arr) => [].concat(arr[0]).concat(arr[arr.length - 1]);

// 2:
// const receberPrimeiroEUltimoElemento = (arr) => [arr[0], arr[arr.length - 1]];

// 3:
const receberPrimeiroEUltimoElemento = ([first, ...elements]) => [first, elements.pop()];
