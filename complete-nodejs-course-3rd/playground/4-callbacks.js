const add = (num1, num2, cb) => {
  setTimeout(() => {
    return cb(num1 + num2);
  }, 0);
};

add(1, 4, (sum) => {
  console.log(sum);
});
