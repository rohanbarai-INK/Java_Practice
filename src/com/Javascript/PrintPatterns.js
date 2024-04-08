function printPattern(num) {
    for (let i = 1; i <= num; i++) {
        let line = '';
        for (let j = 1; j <= i; j++) {
            line += '*';
        }
        console.log(line);
    }
}

// Test the function with the given number of lines (3 in this case)
printPattern(3);

//Output will be like this 

//*
//**
//***
