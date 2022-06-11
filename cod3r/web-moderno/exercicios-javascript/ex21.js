const menorNumero = (arr) => arr.reduce((previous, current) => (previous < current) ? previous : current, arr[0]);
