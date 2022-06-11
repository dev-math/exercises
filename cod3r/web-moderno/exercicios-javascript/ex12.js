// 1:
// const removerPropriedade = (obj, prop) => {
//   const copy = Object.assign({}, obj);
//   delete copy[prop];
//   return copy;
// }

// 2:
const removerPropriedade = (obj, prop) => {
  const copy = {...obj};
  delete copy[prop];
  return copy;
}
