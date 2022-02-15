const removeFromArray = function(arr, ...toRemove) {
  for (let index = 0; index < toRemove.length; index++) {
    if (arr.indexOf(toRemove[index]) == -1) {
      continue;
    }
    arr.splice(arr.indexOf(toRemove[index]), 1);
  }
  return arr;
};

console.log(removeFromArray([1,2,3,4], 2, 3));

// Do not edit below this line
module.exports = removeFromArray;
