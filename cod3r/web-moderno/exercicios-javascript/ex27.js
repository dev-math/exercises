const inverter = (obj) => {
  const newObj = {};
  for (const key in obj) {
    newObj[obj[key]] = key;
  }
  return newObj;
}
