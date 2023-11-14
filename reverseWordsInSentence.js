// . A. Take a sentence as an input and reverse every word in that sentence.
//a.Example - This is a sunny day > shiT si a ynnus yad.

function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Convert the word into an array of characters, reverse it, and join it back into a word
    return word.split('').reverse().join('');
}

// Example usage
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"
