// 1:
// const segundoMaior = (arr) => {
//   let indiceMaior = 0;

//   for (let index = 0; index < arr.length; index++) {
//     if (arr[index] > arr[indiceMaior]) {
//       indiceMaior = index;
//     }
//   }

//   let indiceSegundoMaior = (indiceMaior === 0) ? 1 : 0;
//   for (let index = 0; index < arr.length; index++) {
//     if (index === indiceMaior) {
//       continue;
//     }

//     if (arr[index] > arr[indiceSegundoMaior]) {
//       indiceSegundoMaior = index;
//     }
//   }

//   return arr[indiceSegundoMaior];
// }

// 2:
// const segundoMaior = (arr) => {
//   let indiceMaior = 0;

//   for (let index = 0; index < arr.length; index++) {
//     if (arr[index] > arr[indiceMaior]) {
//       indiceMaior = index;
//     }
//   }
//   arr.splice(indiceMaior, 1);

//   let segundoMaior = arr[0];
//   arr.forEach(element => {
//     if (element > segundoMaior) {
//       segundoMaior = element;
//     }
//   });

//   return segundoMaior;
// }

// 3:
const segundoMaior = (arr) => {
  const maior = Math.max(...arr);
  arr = arr.filter(item => item != maior);
  return Math.max(...arr);
}
