/**
 * @param {string[]} products
 * @param {string} searchWord
 * @return {string[][]}
 */
var suggestedProducts = function(products, searchWord) {
    products.sort();
    
    let l = 0;
    let r = products.length - 1;
    let result = [];

    for (let i = 0; i < searchWord.length; i++) {
        let search = searchWord[i];

        
        while (l <= r && (products[l].length <= i || products[l][i] !== search)) {
            l++;
        }

        
        while (l <= r && (products[r].length <= i || products[r][i] !== search)) {
            r--;
        }

        
        let temp = [];
        for (let j = 0; j < 3 && l + j <= r; j++) {
            temp.push(products[l + j]);
        }
        result.push(temp);
    }

    return result;
};
