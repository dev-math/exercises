const sumAll = function(num1, num2) {
  if (typeof num1 !== 'number' || typeof num2 !== 'number' || num1 < 0 || num2 < 0) {
    return "ERROR";
  }

  if (num1 > num2) {
    [num1, num2] = [num2, num1];
  }

  let sumResult = 0;
  for (let index = num1; index <= num2; index++) {
    sumResult += index;
  }
  return sumResult;
};

// Do not edit below this line
module.exports = sumAll;
