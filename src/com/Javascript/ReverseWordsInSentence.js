function reverseWordsInSentence(sentence) {
    let reversedSentence = '';
    let word = '';
    
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ') {
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            reversedSentence += reversedWord + ' ';
            word = '';
        } else {
            word += sentence[i];
        }
    }
    
    let reversedWord = '';
    for (let j = word.length - 1; j >= 0; j--) {
        reversedWord += word[j];
    }
    reversedSentence += reversedWord;
    
    return reversedSentence;
}

// Test the function with the given sentence "Rohan Barai is awesome"
const sentence = "Rohan Barai is awesome";
const reversedSentence = reverseWordsInSentence(sentence);
console.log(reversedSentence); // Output: "nahoR iaraB si emosewa"
