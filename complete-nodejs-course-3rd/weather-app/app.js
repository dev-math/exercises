const forecast = require(__dirname + "/utils/forecast");
const ipstack = require(__dirname + "/utils/ipstack");

ipstack((err, res) => {
  if (err) {
    return console.log(err);
  }

  forecast(res.latitude, res.longitude, (err, res) => {
    if (err) {
      return console.log(err);
    }

    console.log(`${res.location.name} - ${res.location.region}`);
    console.log(`${res.description}. It's ${res.temperature} degrees.`);
  });
});

