#!/bin/python

import math
import os
import random
import re
import sys


# Complete the countingValleys function below.
def countingValleys(n, s):
    sealevel = valley = 0
    above = False
    for c in s:
        if c == "U":
            if sealevel == 0:
                above = True
            sealevel += 1
        elif c == "D":
            if sealevel == 0 and above:
                above = False
            sealevel -= 1
        if sealevel == 0 and not above:
            valley += 1
    return valley


if __name__ == '__main__':
    n = 8
    s = "UDDDUDUU"
    result = countingValleys(n, s)
