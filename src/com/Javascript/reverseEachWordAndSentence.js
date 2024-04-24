function reverseEachWordAndSentence() {
    let sentence = "My Name is Rohan Barai";
    let words = sentence.split(" ");
    let revWords = "";
    
    for (let j = words.length - 1; j >= 0; j--) {
        let word = words[j];
        let revWord = "";
        for (let i = word.length - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        revWords += revWord + " ";
    }
    console.log(revWords);
}

reverseEachWordAndSentence();
