// conss http=require('http');
// const port=8080;
// const server=http.createServer((req,res) =>{
//     res.statusCode=404;
//     res.setHeader('Content-type','text/plain');
//     res.end("hello wold\n");

// });
// server.listen(port,()=>{
//     console.log(`Server running at http://localhost:${port}/`);

// });
const express = require('express');
const app = express();
app.get('/home', (req, res) => {
    console.log("Received GET request for /home");
    res.send('<h1 style="color: red; text-align: center;">Home Page Content</h1>');
});

app.post('/home', (req, res) => {
    console.log("Received POST request for /home");
    res.send('<h1 style="color: red; text-align: center;">Home Page - POST method</h1>');
});

app.get('/about', (req, res) => {
    console.log("Received GET request for /about");
    res.send('<h1 style="color: green; text-align: center;">About Page Content</h1>');
});

app.post('/about', (req, res) => {
    console.log("Received POST request for /about");
    res.send('<h1 style="color: green; text-align: center;">About Page - POST method</h1>');
});
