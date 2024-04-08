function countVowels(str) {
    let count = 0;
    let vowelCounts = [0, 0, 0, 0, 0]; // Index 0: 'a', Index 1: 'e', Index 2: 'i', Index 3: 'o', Index 4: 'u'
    let vowels = ['a', 'e', 'i', 'o', 'u'];
    
    // Convert the string to lowercase to make it case-insensitive
    str = str.toLowerCase();
    
    for (let i = 0; i < str.length; i++) {
        let ch = str.charAt(i);
        for (let j = 0; j < vowels.length; j++) {
            if (ch === vowels[j]) {
                vowelCounts[j]++;
                count++;
                break; // Break the inner loop once a vowel is found
            }
        }
    }
    
    for (let k = 0; k < vowels.length; k++) {
        console.log(`Number of '${vowels[k]}' in the string: ${vowelCounts[k]}`);
    }
    
    console.log(`Total number of vowels in the string: ${count}`);
}

// Test the function with the provided string
countVowels("Rohan Barai");