const recerberMelhorEstudante = (obj) => {
  const media = (arr) => arr.reduce((previous, current) => previous += current) / arr.length;
  return Object.entries(obj).map(item => {
    return { nome: item[0], media: media(item[1]) }
  }).reduce((previous, current) => current.media > previous.media ? current : previous);
}

console.log(recerberMelhorEstudante({
  Joao: [8, 7.6, 8.9, 6], // média 7.625
  Mariana: [9, 6.6, 7.9, 8], // média 7.875
  Carla: [7, 7, 8, 9] // média 7.75
})) // retornará { nome: "Mariana", media: 7.875 }
