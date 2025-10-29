    def main():
        #入力として受け取った複数の実数を、小数点以下の出力するけた数を指定して出力
        t = int(input())
        num = [input().split() for _ in range(t)]
        
        for i in range(t):
            a = float(num[i][0])
            b = int(num[i][1])
            print("{:.{}f}".format(a, b))
