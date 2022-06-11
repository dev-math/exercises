//1:
// const buscarPalavrasSemelhantes = (word, words) => {
//   const regex = new RegExp(`${word}`);
//   return words.filter(item => regex.test(item));
// }

// 2:
const buscarPalavrasSemelhantes = (word, words) => words.filter(item => item.includes(word));
