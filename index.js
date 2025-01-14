function kiratsAsyncFunction() {
    let p = new Promise(function(resolve) {
      // do some async logic here
      resolve("hi there!")
    });
    return p;
  }
  
  async function main() {
      let value=await kiratsAsyncFunction();
        console.log(value);
        console.log("hi there")
    
  }
  
  main();