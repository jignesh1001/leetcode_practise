/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
    if (strs.length === 0) return ''
    let reference = strs[0]

    for(let i = 0; i < reference.length;i++){
        let char = reference[i]

        for(let j = 1; j < strs.length ; j++){
            if(char > strs[j].length || char !== strs[j][i]){
                return reference.slice(0,i)
            }
        }
    }
    return reference
};