valid = True
chessboard = [[0 for x in range(0,8)] for y in range(0,8)]
numQueens =0

for i in range(0,8):
    row = raw_input().strip("\n")
    for j in range(0,8):
        if row[j] == "*":
            chessboard[i][j] = 1
            numQueens = numQueens + 1
        else:
            chessboard[i][j] = 0
if not numQueens == 8:
    valid = False


for i in range(0,8):
    for j in range(0,8):
        if chessboard[i][j] == 1:

            x = i - 1
            y = j - 1
            while(True):
                if x < 0  or y < 0:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                x = x - 1
                y = y - 1

            x = i + 1
            y = j + 1
            while(True):
                if x > 7  or y > 7:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                x = x + 1
                y = y + 1

            x = i + 1
            y = j - 1
            while(True):
                if x > 7  or y < 0:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                x = x + 1
                y = y - 1

            x = i - 1
            y = j + 1
            while(True):
                if x < 0  or y > 7:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                x = x - 1
                y = y + 1

            x = i - 1
            y =j
            while(True):
                if x < 0:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                x = x - 1

            x = i + 1
            y =j
            while(True):
                if x > 7:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                x = x + 1

            x = i
            y = j - 1
            while (True):
                if y < 0:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                y = y - 1

            x = i
            y = j + 1
            while (True):
                if y > 7:
                    break
                if chessboard[x][y] == 1:
                    valid = False
                    break
                y = y + 1


if (valid):
    print "valid"
else:
    print "invalid"

