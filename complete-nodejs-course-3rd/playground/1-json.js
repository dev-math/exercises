const fs = require('fs');

const dataJSON = fs.readFileSync('./1-json.json', 'utf8')
const dataObj = JSON.parse(dataJSON);

dataObj.name = "Matheus";
dataObj.age = 20;
dataObj.planet = "Mars";
fs.writeFileSync('./1-json.json', JSON.stringify(dataObj));
