/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
    if (strs.length === 0) return ''

    let ref = strs[0]

    for (let i = 0; i < ref.length; i++) {
        let char = ref[i]

        for (let j = 1; j < strs.length; j++) {
            if (i >= strs[j].length || strs[j][i] !== char) {
                return ref.slice(0, i)
            }
        }

    }
    return ref
};