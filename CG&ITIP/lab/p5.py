import cv2
from matplotlib import pyplot as plt

plt.figure(figsize=(12, 6))  # Adjusted figure size for better display

# Image path
image_path = "th (1).jpg"

# Reading an image
src = cv2.imread(image_path)
gray = cv2.cvtColor(src, cv2.COLOR_BGR2GRAY)

# Find Canny edges
edged = cv2.Canny(gray, 30, 200)

# Find contours
contours, hierarchy = cv2.findContours(edged, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_NONE)

# Print number of contours found
print("Number of Contours found = " + str(len(contours)))

# Draw all contours on a copy of the original image
contour_image = src.copy()
cv2.drawContours(contour_image, contours, -1, (0, 255, 0), 1)

# Display Canny edges
plt.subplot(1, 2, 1)
plt.imshow(edged, cmap='gray')
plt.axis('off')
plt.title("Canny Edges After Contouring")

# Display image with contours
plt.subplot(1, 2, 2)
plt.imshow(cv2.cvtColor(contour_image, cv2.COLOR_BGR2RGB))
plt.axis('off')
plt.title("Contours")

plt.tight_layout()
plt.show()
