#!/bin/python

import math
import os
import random
import re
import sys


# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    jumps = i = 0
    size = len(c)
    while i <= size:
        try:
            twoStep = c[i + 2]
            if twoStep == 0:
                jumps += 1
                i += 2
                continue
        except IndexError:
            pass
        try:
            oneStep = c[i + 1]
            if oneStep == 0:
                jumps += 1
                i += 1
        except IndexError:
            i += 1
            pass

    return jumps


if __name__ == '__main__':
    c = [0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0,
         0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0]

    result = jumpingOnClouds(c)
    print(result)
