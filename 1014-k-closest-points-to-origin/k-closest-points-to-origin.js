/**
 * @param {number[][]} points
 * @param {number} k
 * @return {number[][]}
 */
var kClosest = function(points, k) {
     let distances = []

    for(let i = 0; i < points.length ; i++){
          let point = points[i]
          let distance = (point[0]*point[0])+(point[1]*point[1])
          distances.push([distance,point])
    }
   
    distances.sort((a, b) => a[0] - b[0]);

    
    let result = [];
    for (let i = 0; i < k; i++) {
        result.push(distances[i][1]);
    }

    return result;
};