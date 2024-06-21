import cv2
from matplotlib import pyplot as plt

# Read and convert the image
img = cv2.imread("image.png")
img = img[:, :, ::-1]  # Convert BGR to RGB

# Get image dimensions
(h, w, c) = img.shape

# Define quadrants
tl = img[0:h//2, 0:w//2]
tr = img[0:h//2, w//2:w]
bl = img[h//2:h, 0:w//2]
br = img[h//2:h, w//2:w]

# Set up the plot
plt.figure(figsize=(7, 8))

# Original Image
plt.subplot(3, 2, 1)
plt.imshow(img)
plt.title("Original Image")
plt.axis("off")

# Left Top
plt.subplot(3, 2, 3)
plt.imshow(tl)
plt.title("Left Top")
plt.axis("off")

# Right Top
plt.subplot(3, 2, 4)
plt.imshow(tr)
plt.title("Right Top")
plt.axis("off")

# Right Bottom
plt.subplot(3, 2, 5)
plt.imshow(br)
plt.title("Right Bottom")
plt.axis("off")

# Bottom Left
plt.subplot(3, 2, 6)
plt.imshow(bl)
plt.title("Bottom Left")
plt.axis("off")

# Show the plot
plt.show()
