if __name__ == "__main__":
  T = int(input())
  for i in range(0, T):
    N, M = map(int, input().split())
    rem = N % M
    if rem % 2 == 0:
      print("EVEN")
    else:
      print("ODD") 
