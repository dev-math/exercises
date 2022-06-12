const fs = require('fs');

// fs.writeFileSync('notes.txt', 'Hello world!');

// Challenge 1:
let str = 'Challenge: append a message to notes.txt'
fs.appendFileSync('notes.txt', `${str}\n`);
