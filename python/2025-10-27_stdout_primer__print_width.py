def main():
    #N 個の整数を M けたになるよう、半角スペース埋めで出力
    i = input().split()
    t = int(i[0])
    k = int(i[1])
    num = [input() for _ in range(t)]
    
    for j in num:
        print("{:{}d}".format(int(j), k))
