import re
import argparse

s = input("Enter the file name: ")
a = open(s + ".json", "x")
p = open("gyros.json")
q = p.read()
h = q.replace("gy", s)
a.write(h)
