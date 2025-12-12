const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question("Enter a number: ", x => {
  console.log("Result:", parseInt(x) * 10);
  readline.close();
});
