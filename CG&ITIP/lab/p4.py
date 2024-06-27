import cv2
from matplotlib import pyplot as plt
import numpy as np

plt.figure(figsize=(7, 8))

# Reading an image and converting to RGB
src = cv2.imread("th (1).jpg")
src = src[:,:,::-1]  # Convert BGR to RGB

# Display Original Image
plt.subplot(2, 2, 1)
plt.imshow(src)
plt.axis('off')
plt.title("Original")

i = 2
kernelSizes = [(3, 3), (9, 9), (15, 15)]

# Loop over the kernel sizes
for (kX, kY) in kernelSizes:
    # Apply an "average" blur to the image using the current kernel size and display
    blurred = cv2.blur(src, (kX, kY))
    plt.subplot(2, 2, i)
    plt.imshow(blurred)
    plt.axis('off')
    plt.title(f"Blurred ({kX}, {kY})")
    i += 1


