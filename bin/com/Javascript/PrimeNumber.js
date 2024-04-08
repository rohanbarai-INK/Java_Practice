function printPrimes(arr) {
    function isPrime(num) {
        if (num <= 1) {
            return false;
        }

        for (let i = 2; i < num; i++) {
            if (num % i === 0) {
                return false;
            }
        }

        return true;
    }

    arr.forEach(num => {
        if (isPrime(num)) {
            console.log(num);
        }
    });
}

// Test the function with an array of numbers
const numbers = [5, 10, 13, 15];
printPrimes(numbers); // Output: 5, 13
