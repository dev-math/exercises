const estaEntre = (num, min, max, incluso = false) => {
  if (min > max) {
    [min, max] = [max, min];
  }

  return (incluso) ? num >= min && num <= max : num > min && num < max;
}
