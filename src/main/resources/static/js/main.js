document.querySelector('.search-btn').addEventListener('click', () => {
  const query = document.querySelector('input').value;
  if (query.trim()) {
    alert(`Searching for: ${query}`);
    // You can replace this with fetch to your REST API
  } else {
    alert("Please enter a search term.");
  }
});

document.querySelector('.alert-btn').addEventListener('click', () => {
  alert("Manage your job alerts here!");
});

document.querySelector('.view-jobs-btn').addEventListener('click', () => {
  window.location.href = "/jobs";
});