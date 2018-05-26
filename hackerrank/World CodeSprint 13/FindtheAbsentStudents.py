#!/bin/python3

import os
import sys

# Complete the findTheAbsentStudents function below.
def findTheAbsentStudents(n, a):
    c = set()
    b = set(a)
    for i in range(1, n+1):
        c.add(i)
    d = c.difference(b)
    return sorted(list(d))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    a = list(map(int, input().rstrip().split()))

    result = findTheAbsentStudents(n, a)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
