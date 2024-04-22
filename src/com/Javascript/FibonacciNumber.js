let n = 10; // Change n to calculate Fibonacci series up to a different number
let a = 0, b = 1;

console.log("Fibonacci series up to " + n + " terms:");

// Print the first two Fibonacci numbers
process.stdout.write(a + ", " + b);

// Calculate and print the rest of the Fibonacci series
for (let i = 2; i < n; i++) {
    let c = a + b;
    process.stdout.write(", " + c);
    a = b;
    b = c;
}
