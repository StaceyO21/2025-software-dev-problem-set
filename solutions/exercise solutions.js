/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
       
        for (i = 0; i < nums.length; i++) {
            let value = nums[i];

            for (j = i + 1; j < nums.length; j++){
                let dupliValue = nums[j];

                if(value === dupliValue){
                    return true;
                } 
                    
            
            }
        }
        return false;
    }
    
