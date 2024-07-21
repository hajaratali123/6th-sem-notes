import cv2
from matplotlib import pyplot as plt

plt.figure(figsize=(14, 7))

# Reading an image
src = cv2.imread('image.png')

# Convert image to grayscale
gray = cv2.cvtColor(src, cv2.COLOR_BGR2GRAY)

# Find Canny edges
edged = cv2.Canny(gray, 30, 200)

# Find contours
contours, _ = cv2.findContours(edged, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_NONE)

# Display Canny edges
plt.subplot(1, 2, 1)
plt.imshow(edged, cmap='gray')
plt.axis('off')
plt.title("Canny Edges After Contouring")

# Draw all contours on the original image
cv2.drawContours(src, contours, -1, (0, 255, 0), 1)

# Convert BGR image to RGB for displaying with matplotlib
src_rgb = cv2.cvtColor(src, cv2.COLOR_BGR2RGB)

# Display image with contours
plt.subplot(1, 2, 2)
plt.imshow(src_rgb)
plt.axis('off')
plt.title("Contours")

plt.tight_layout()
plt.show()

# Print number of contours found
print("Number of Contours found = " + str(len(contours)))
