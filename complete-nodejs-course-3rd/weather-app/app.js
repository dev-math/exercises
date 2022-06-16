const request = require('postman-request');

require('dotenv').config();
const location = "Sao Paulo";
const IP_API = process.env.IP_STACK;
const WEATHER_API = process.env.WEATHER_STACK;

const weatherURL = `http://api.weatherstack.com/current?access_key=${WEATHER_API}&query=${location}`;
request(weatherURL, {json: true}, (err, res) => {
  if (err) {
    console.log(`Unable to connect to weatherstack!`);
    return;
  } else if (res.body.error) {
    console.log(`Location not found`);
  } else {
    const data = res.body.current;
    console.log(`${data.weather_descriptions[0]}. It is current ${data.temperature} degrees out. It feels like ${data.feelslike} degrees out.`);
  }
});

const ipURL = `http://api.ipstack.com/check?access_key=${IP_API}`;
request(ipURL, {json: true}, (err, res) => {
  if (err) {
    console.log(`Unable to connect to ipstack!`);
  } else if (res.body.error) {
    console.log(res.body.error.info);
  } else {
    const data = res.body;
    console.log(`${data.latitude} ${data.longitude}`);
  }
});
