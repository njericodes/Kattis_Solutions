#coding sort of sorting

while(1):
    words = []
    
    input = int(raw_input())
    
    #break when input is 0
    if(input==0):
        break
    
    #append values into the list upto n
    for i in range(input):
        words.append(raw_input())
    
    #use lamda expression and 1st letters and 2nd letters of each word to sort
    sortedWords = []
    sortedWords = sorted(words, key=lambda word:(word[0], word[1]))
    
    #print 
    for word in sortedWords:
        print(word)
    
    #add space after each 
    print " "
