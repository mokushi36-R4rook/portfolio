def main():
    """
    標準入力で n を受け取り、n×n の九九表を出力します。
    ・各値は半角スペース区切り
    ・各行末は改行
    例: n=3 ->
    1 2 3
    2 4 6
    3 6 9
    """
    n = int(input())
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            end = "
" if j == n else " "
            print(i * j, end=end)

if __name__ == "__main__":
    main()
