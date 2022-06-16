const request = require('postman-request');
require('dotenv').config();

const location = "Sao Paulo"

// const WEATHER_API = process.env.WEATHER_STACK;
// const weatherURL = `http://api.weatherstack.com/current?access_key=${WEATHER_API}&query=${location}`
// request(weatherURL, {json: true}, (_err, res) => {
//   const data = res.body.current;
//   console.log(`${data.weather_descriptions[0]}. It is current ${data.temperature} degrees out. It feels like ${data.feelslike} degrees out.`);
// });

// const POSITION_API = process.env.POSITION_STACK;
// const positionURL = `http://api.positionstack.com/v1/forward?access_key=${POSITION_API}&query=${location}&limit=1`
// request(positionURL, {json: true}, (_err, res) => {
//   const data = res.body.data[0];
//   console.log(`${data.latitude} ${data.longitude}`);
// });


// const IP_API = process.env.IP_STACK;
// const ipURL = `http://api.ipstack.com/check?access_key=${IP_API}`
// request(ipURL, {json: true}, (_err, res) => {
//   const data = res.body;
//   console.log(`${data.latitude} ${data.longitude}`);
// });
