def main():
  #標準入力から受け取った整数nについて、n*nの九九表を出力する
  n = int(input())

  for i in range(1,n + 1):
      for j in range(1,n + 1):
          if j == n:
              print(i * j)
          else:
              print(i * j, end=" ")
          
if __name__ == "__main__":
    main()
