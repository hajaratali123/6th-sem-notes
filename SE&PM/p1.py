import cv2
from matplotlib import pyplot as plt

img = cv2.imread("th (1).jpg")
img = img[:,:,::-1]  # Convert BGR to RGB

(h, w, c) = img.shape

tl = img[0:h//2, 0:w//2]
tr = img[0:h//2, w//2:w]
bl = img[h//2:h, 0:w//2]
br = img[h//2:h, w//2:w]

plt.figure(figsize=(7, 8))

# Original Image
plt.subplot(3, 2, 1)
plt.imshow(img)
plt.title("Original Image")
plt.axis("off")

# left top
plt.subplot(3, 2, 3)
plt.imshow(tl)
plt.title("left-top")
plt.axis("off")

#riht top
plt.subplot(3, 2, 4)
plt.imshow(tr)
plt.title("right-top")
plt.axis("off")

#riht bottom
plt.subplot(3, 2, 5)
plt.imshow(tr)
plt.title("riht bottom")
plt.axis("off")

# bottom left 
plt.subplot(3, 2, 6)
plt.imshow(tr)
plt.title("bottom left ")
plt.axis("off")

plt.show()