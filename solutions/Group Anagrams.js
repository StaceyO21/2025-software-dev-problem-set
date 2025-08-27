class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        res = {};

        for(let s in strs){
           let count = Array(26).fill(0);

           for(let letter in s){
            count[letter.charCodeAt(0) - 'a'.charCodeAt(0)] += 1;
           }
           const key = count.join(',');

           if(!res[key]){
            res[key] = [];
           }
           res[key].push(s);
        }
        return Object.values(res);
}
}