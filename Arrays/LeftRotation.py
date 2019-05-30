#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the rotLeft function below.
def rotLeft(arr, numRot):
    for _ in range(numRot):
        num = arr.pop(0)
        arr.append(num)
    return arr


if __name__ == '__main__':
    d = 4
    a = [1, 2, 3, 4, 5]

    result = rotLeft(a, d)
