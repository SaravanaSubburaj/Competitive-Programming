t = int(input())

for i in range(0, t):
	n = int(input())
	a = list(map(int, input().split(" ")))
	min = a[0] + a[1]
	if len(a) == 2:
		print(min)
		continue
	for k in range(1, len(a)):
		if k == len(a)-1:
			break
		cur = a[k] + a[k+1]
		if cur < min:
			min = cur
		else:
			continue
	print(min)
