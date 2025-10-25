def main():
  #九九表を出力する
  for i in range(9):
      for j in range(9):
          if j != 8:
              print(((i + 1)*(j + 1)), end=" ")
          else:
              print((i + 1)*(j + 1))
              
if __name__ == "__main__":
    main()
