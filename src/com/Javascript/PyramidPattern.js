function printPyramidPattern(height) {
    for (let i = 1; i <= height; i++) {
        let spaces = ' '.repeat(height - i);
        let stars = '*'.repeat(2 * i - 1);
        console.log(spaces + stars);
    }
}

// Test the function with the given height of the pyramid (5 in this case)
printPyramidPattern(5);

// Output will be
//    *
//   ***
//  *****
// *******
//*********
