const multiplicar = (num1, num2) => {
  if (num1 === 0 || num2 === 0) {
    return 0;
  }

  return (num2 === 1) ? num1 : num1 + multiplicar(num1, num2 - 1);
};
