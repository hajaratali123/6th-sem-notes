import cv2
from matplotlib import pyplot as plt
import numpy as np

# Load the image
img = cv2.imread("th (1).jpg")

plt.figure(figsize=(7, 8))
plt.subplot(2, 2, 1)
plt.imshow(img[:,:,::-1])  # Display the original image
plt.axis('off')
plt.title("Original Image")

# Convert the image to grayscale
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# Edge detection
edges = cv2.Canny(gray, 100, 200)  # Use Canny edge detector

# Texture extraction
kernel = np.ones((5, 5), np.float32) / 25  # Define a 5x5 averaging kernel
texture = cv2.filter2D(gray, -1, kernel)  # Apply the averaging filter for texture extraction

# Display the edges
plt.subplot(2, 2, 2)
plt.imshow(edges, cmap='gray')
plt.axis('off')
plt.title("Edges")

# Display the texture
plt.subplot(2, 2, 3)
plt.imshow(texture, cmap='gray')
plt.axis('off')
plt.title("Texture")

plt.tight_layout()
plt.show()
