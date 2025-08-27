/**
 * @param {string[]} logs
 * @return {string[]}
 */
var reorderLogFiles = function(logs) {
    let digitLogs = [];
    let letterLogs = [];

  
    for (let log of logs) {
        let parts = log.split(" ");
        let lastWord = parts[parts.length - 1];

        if (!isNaN(lastWord)) {  
   
            digitLogs.push(log);
        } else {
       
            letterLogs.push(log);
        }
    }

    
    letterLogs.sort((a, b) => {
        let aParts = a.split(" ");
        let bParts = b.split(" ");
        
        let aId = aParts[0];
        let bId = bParts[0];
        
        let aContent = aParts.slice(1).join(" ")
        let bContent = bParts.slice(1).join(" ")
        
        
        if (aContent < bContent) return -1;
        if (aContent > bContent) return 1;
        
        
        if (aId < bId) return -1;
        if (aId > bId) return 1;
        return 0;
    });


    return [...letterLogs, ...digitLogs];
};
