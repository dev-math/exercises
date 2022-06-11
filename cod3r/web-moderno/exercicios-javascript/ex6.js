const inverso = (arg) => {
  if (typeof arg === "number") {
    return -arg;
  } else if (typeof arg === "boolean") {
    return !arg;
  } else {
    return `booleano ou números esperado, mas o parâmetro é do tipo ${typeof arg}`
  }
}
