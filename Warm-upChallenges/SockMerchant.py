#!/bin/python

import math
import os
import random
import re
import sys


# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    socks = {}
    pairs = 0
    for i in ar:
        socks[i] = 0

    for i in ar:
        socks[i] += 1
        if socks[i] % 2 == 0:
            pairs += 1
    return pairs


if __name__ == '__main__':
    n = 9
    ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

    result = sockMerchant(n, ar)
