function removeDuplicateChars(str) {
    let uniqueStr = '';

    for (let i = 0; i < str.length; i++) {
        if (uniqueStr.indexOf(str[i]) === -1) {
            uniqueStr += str[i];
        }
    }

    return uniqueStr;
}

// Test the function with the given string "Naveen"
const str = "Naveen";
const uniqueStr = removeDuplicateChars(str);
console.log(uniqueStr); // Output: "Naven"
