const ratingStars1 = [...document.querySelectorAll(".fa-regular.fa-star.fa-2xl.star1")];
const ratingStars2 = [...document.querySelectorAll(".fa-regular.fa-star.fa-2xl.star2")];
const ratingStars3 = [...document.querySelectorAll(".fa-regular.fa-star.fa-2xl.star3")];


// 별점 
function executeRating(stars) {
  const starClassActive = "fa-sharp fa-solid fa-star fa-2xl star1";
  const starClassInactive = "fa-regular fa-star fa-2xl star1";

  stars.forEach((star) => {
    star.onclick = () => {
      const starIndex = stars.indexOf(star);

      for (let i = 0; i <= starIndex; i++) {
        stars[i].className = starClassActive;
      }

      for (let i = starIndex + 1; i < stars.length; i++) {
        stars[i].className = starClassInactive;
      }
    };
  });
}

executeRating(ratingStars1);
executeRating(ratingStars2);
executeRating(ratingStars3);
