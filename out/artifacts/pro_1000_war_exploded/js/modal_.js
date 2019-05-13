// Get DOM Elements
const modal_ = document.querySelector('#my-modal_');
// const modalBtn = document.querySelector('#modal_-btn');
const closeBtn = document.querySelector('.close');

// Events
// modalBtn.addEventListener('click', openModal);
closeBtn.addEventListener('click', closeModal);
window.addEventListener('click', outsideClick);

// Open
// function openModal() {
//   modal_.style.display = 'block';
// }

// Close
function closeModal() {
  modal_.style.display = 'none';
}

// Close If Outside Click
function outsideClick(e) {
  if (e.target == modal_) {
    modal_.style.display = 'none';
  }
}
