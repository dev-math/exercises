const choices = ['rock', 'spock', 'paper', 'lizard', 'scissors'];
let result;

function randomPlay() {
  const randomChoice = Math.floor(Math.random() * choices.length);
  return choices[randomChoice];
}

function mod(a, b) {
  const c = a % b;
  return c < 0 ? c + b : c;
}

function selectWinner(player1, player2) {
  const choiceOne = choices.indexOf(player1);
  const choiceTwo = choices.indexOf(player2);

  if (choiceOne == choiceTwo) {
    return;
  } else if (mod(choiceOne - choiceTwo, choices.length) < choices.length / 2) {
    return player1;
  } else {
    return player2;
  }
}

function roundPlay(player1 = randomPlay(), player2 = randomPlay()) {
  switch (selectWinner(player1, player2)) {
    case player1:
      player1Score++;
      result = `You win! ${player1} beats ${player2}`;
      break;
    case player2:
      player2Score++;
      result = `You lose! ${player2} beats ${player1}`;
      break;
    default:
      result = 'It\'s a tie';
      break;
  }
  refreshData();
}

function refreshData() {
  playersScore.innerText = `You: ${player1Score} | Computer: ${player2Score}`;
  roundResult.innerText = result;

  // check if the game is over
  if (player1Score == 3 || player2Score == 3) {
    if (player1Score > player2Score) {
      result += "\nYou win the game!";
    } else {
      result += "\nYou lose the game!";
    }
      roundResult.innerText = result;
      player1Score = 0;
      player2Score = 0;
  }
}

const playersScore = document.getElementById('playersScore');
const roundResult = document.getElementById('roundResult');

const gameOptions = document.querySelectorAll('.game-option');
let player1Score = 0;
let player2Score = 0;

const rockOption = document.getElementById('rockOption');
const paperOption = document.getElementById('paperOption');
const scissorsOption = document.getElementById('scissorsOption');
const lizardOption = document.getElementById('lizardOption');
const spockOption = document.getElementById('spockOption');
rockOption.addEventListener('click', () => roundPlay('rock'));
paperOption.addEventListener('click', () => roundPlay('paper'));
scissorsOption.addEventListener('click', () => roundPlay('scissors'));
lizardOption.addEventListener('click', () => roundPlay('lizard'));
spockOption.addEventListener('click', () => roundPlay('spock'));
