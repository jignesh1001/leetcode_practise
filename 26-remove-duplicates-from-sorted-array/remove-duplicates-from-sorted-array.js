/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let set = new Set(nums);
    let uniques = Array.from(set);
    for(let i = 0;i < uniques.length;i++){
        nums[i] = uniques[i]
    } 
    return uniques.length
};