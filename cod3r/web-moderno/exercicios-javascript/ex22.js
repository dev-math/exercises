const funcaoDaSorte = (num) => {
  const randomNum = Math.floor(Math.random() * 10) + 1;
  return (num === randomNum) ? `Parabéns! O número sorteado foi o ${num}` : `Que pena! O número sorteado foi o ${randomNum}`;
}
