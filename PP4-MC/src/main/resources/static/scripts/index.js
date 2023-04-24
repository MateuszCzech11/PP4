const a =5;
const foo=() =>{console.log("HELLO WORDL")};

(()=>{
    foo();
})();

document.addEventListener('DOMContentLoaded',()=> {
    });


const resp = await fetch("/api/products");
productsjson=await resp.json();
console log(productsjson);