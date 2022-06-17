const forecast = require(__dirname + "/utils/forecast");
const ipstack = require(__dirname + "/utils/ipstack");

ipstack((err, res) => {
  console.log(res);
});

forecast("-23.5558", "-46.6396", (err, res) => {
  console.log(res);
});
