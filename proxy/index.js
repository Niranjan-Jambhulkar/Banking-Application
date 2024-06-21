const express = require("express");
const app = express();
const cors = require("cors")
const {createProxyMiddleware} = require("cre")
app.use(cors())

app.get("/",createProxyMiddleware({target:'http://localhost:8080/acco', changeOrigin: true}))

app.listen(3000,()=>{
console. log("proxy started")
})