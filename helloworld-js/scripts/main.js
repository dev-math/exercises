let myImage = document.querySelector('img');
let myButton = document.querySelector('button');
let myHeading = document.querySelector('h1');

myImage.onclick = function () {
  let mySrc = myImage.getAttribute('src');
  mySrc = (mySrc === 'images/cat.gif') ? 'images/kaneki.gif' : 'images/cat.gif';
  myImage.setAttribute('src', mySrc);
};

function setUserName() {
  let myName = prompt('Please enter your name.');
  if (!myName || myName === null) {
    setUserName();
  } else {
    localStorage.setItem('name', myName);
    myHeading.textContent = 'Hello World! And hello, ' + myName + '!';
  }
}

if (!localStorage.getItem('name')) {
  setUserName();
} else {
  let storedName = localStorage.getItem('name');
  myHeading.textContent = 'Hello World! And hello, ' + storedName + '!';
}

myButton.onclick = function () {
  setUserName();
}
