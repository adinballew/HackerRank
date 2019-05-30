#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the minimumBribes function below.
def minimumBribes(q):
    bribes = 0
    for i, j in enumerate(q):
        if (i + 1) - j < -2:
            print("Too chaotic")
            return
        for k in range(max(0, q[i] - 2), i):
            if q[k] > q[i]:
                bribes += 1
    print(bribes)


if __name__ == '__main__':
    t = 2  # tests
    arr = [[5, 1, 2, 3, 7, 8, 6, 4], [1, 2, 5, 3, 4, 7, 8, 6]]

    for t_itr in range(t):
        q = arr[t_itr]
        minimumBribes(q)
