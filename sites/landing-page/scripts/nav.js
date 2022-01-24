const primaryNav = document.querySelector(".primary-navigation");
const navToggle = document.querySelector(".mobile-nav-toggle");

navToggle.addEventListener("click", () => {
  const visibility = primaryNav.getAttribute("data-visible");

  if (visibility === "false") {
    primaryNav.setAttribute('data-visible', true);
    navToggle.setAttribute('aria-expanded', true);
    navToggle.classList.remove('bi-list');
    navToggle.classList.add('bi-x-lg');
  } else if (visibility === "true") {
    primaryNav.setAttribute('data-visible', false);
    navToggle.setAttribute('aria-expanded', false);
    navToggle.classList.add('bi-list');
    navToggle.classList.remove('bi-x-lg');
  }
});
