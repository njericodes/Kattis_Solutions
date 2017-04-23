#coding happy telephones

while(True):
    try:
        
        start_time = []
        end_time = []
        start = []
        end = []
        
        input_ = raw_input().strip("\n").split(" ")
        num_calls = int(input_[0])
        num_intervals = int(input_[1])
    
        #the last test case
        if num_calls == 0 and num_intervals == 0:
            break
    
        #input the times
        for i in range(0,num_calls):
            times = raw_input().strip("\n").split(" ")
            start_time.append(int(times[2]))
            end_time.append(int(times[3])+start_time[i])
    
        
        #take in the intervals police are interested in
        for _ in range(0,num_intervals):
            input_ = raw_input().strip("\n").split(" ")
            start = int(input_[0])
            end = int(input_[1])+start
            
            #count calls that fall within the interval
            cnt = 0
            for i in range(0,num_calls):
                if start >= end_time[i]:
                    pass
                elif end <= start_time[i]:
                    pass
                else:
                    cnt = cnt + 1
            print cnt
        
    except:
        break
