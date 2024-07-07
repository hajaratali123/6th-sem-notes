1# Program-8 program to show rotation, scaling, and translation on an image
#Python program to explain cv2.rotate() method, cv2.resize(),translate

import cv2
from matplotlib import pyplot as plt
import numpy as np

plt.figure(figsize=(20, 10))
rows = 2
columns = 2

src = cv2.imread('th (1).jpg')
src = src[:,:,::-1]

plt.subplot(rows, columns, 1)
plt.imshow(src)
plt.axis('off')
plt.title("Original")

rot = cv2.rotate(src, cv2.ROTATE_90_CLOCKWISE)

plt.subplot(rows, columns, 2)
plt.imshow(rot)
plt.axis('off')
plt.title("Rotated")

(h, w) = src.shape[:2]
newdim = (100, h)
img_resized = cv2.resize(src, newdim, interpolation=cv2.INTER_AREA)

plt.subplot(rows, columns, 3)
plt.imshow(img_resized)
plt.axis('off')
plt.title("scaled")

M = np.float32([[1, 0, 25], [0, 1, 50]])
shifted = cv2.warpAffine(src, M, (w, h))

plt.subplot(rows, columns, 4)
plt.imshow(shifted)
plt.axis('off')
plt.title("Translated")

plt.tight_layout()
plt.show()

