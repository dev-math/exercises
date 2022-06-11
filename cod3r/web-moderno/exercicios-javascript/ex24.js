// 1:
// const contarCaractere = (c, str) => {
//   const letras = str.split('');
//   let count = 0;
//   for (const letra of letras) {
//     if (letra == c) {
//       count++;
//     }
//   }
//   return count;
// }

// 2:
const contarCaractere = (c, str) => [...str].filter(item => item == c).length;
