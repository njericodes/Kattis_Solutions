#coding banks 
from collections import defaultdict
from heapq import heappush
from heapq import heappop

#the number of cutomers and total time
n,t = raw_input().split()

num = int(n)
total = int(t)

customers = defaultdict(list)

for i in range(num):
    a, ti = list(map(int, input().split()))
    customers[ti].append(a)
    
amounts_to_consider = []
sum_total = 0

for t in range(total)[::-1]:
    for price in customers[t]:
         heappush(amounts_to_consider, -price)
    if amounts_to_consider:
        sum_total += heappop(amounts_to_consider)
    print(-sum_total)
