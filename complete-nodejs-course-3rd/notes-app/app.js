const yargs = require('yargs');
const notes = require('./notes');

yargs.version('6.6.6');

// Add a new note
yargs.command({
  command: 'add',
  describe: 'Add a new note',
  builder: {
    title: {
      describe: 'Note title',
      demandOption: true,
      type: 'string',
    },
    body: {
      describe: 'Note body',
      demandOption: true,
      type: 'string',
    }
  },
  handler(argv) {
    notes.addNote(argv.title, argv.body);
  }
});

// Remove a note
yargs.command({
  command: 'remove',
  describe: 'Remove a note',
  builder: {
    title: {
      describe: 'Note title',
      demandOption: true,
      type: 'string',
    },
  },
  handler(argv) {
    notes.removeNote(argv.title);
  }
});

// list notes
yargs.command({
  command: 'list',
  describe: 'List notes',
  handler() {
    console.log("Listing out all notes!")
  }
});

// Remove a note
yargs.command({
  command: 'read',
  describe: 'Read a note',
  handler() {
    console.log("Reading a note!")
  }
});

yargs.parse();
