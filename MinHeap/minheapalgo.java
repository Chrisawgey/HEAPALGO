proceduredesign_min_heap  
Array arr: of size n => array of elements  
// call min_heapify procedure for each element of the array to form min heap  
repeat for (k = n/2 ; k >= 1 ; k--)  
    call procedure min_heapify (arr, k);  
proceduremin_heapify (vararr[ ] , var k, varn)  
{  
varleft_child  = 2*k;  
varright_child = 2*k+1;  
var smallest;  
if(left_child<= n and arr[left_child ] <arr[ k ] )  
smallest = left_child;  
else  
smallest = k;  
if(right_child<= n and arr[right_child ] <arr[smallest] )  
smallest = right_child;  
if(smallest != k)  
    {  
swaparr[ k ] and  arr[ smallest ]);  
callmin_heapify (arr, smallest, n);  
    }   
}  