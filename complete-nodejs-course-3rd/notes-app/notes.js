const fs = require('fs');
const chalk = require('chalk');

const notesFile = 'notes.json';

const getNotes = () => "Your notes...";

const removeNote = (title) => {
  const notes = loadNotes();
  const newNotes = notes.filter((note) => note.title !== title);
  if (notes.length > newNotes.length) {
    saveNotes(newNotes);
    return console.log(chalk.green.bold.inverse("Note removed!"));
  } 

  return console.log(chalk.red.inverse.bold("No note found"));
};

const addNote = (title, body) => {
  const notes = loadNotes();
  const duplicateNotes = notes.filter((note) => note.title === title);
  if (duplicateNotes.length != 0) {
    return console.log(`Duplicate note: ${title}\nUse other title`);
  }

  notes.push({ title, body });
  saveNotes(notes);
};

const saveNotes = (notes) => {
  fs.writeFileSync(notesFile, JSON.stringify(notes));
};

const loadNotes = () => {
  try {
    const notesJSON = fs.readFileSync(notesFile, 'utf8');
    return JSON.parse(notesJSON); // return notes in a Object
  } catch (error) {
    return [];
  }
};

module.exports = { getNotes, addNote, removeNote };
