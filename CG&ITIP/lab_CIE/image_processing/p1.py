import cv2
from matplotlib import pyplot as plt

# Load image
image_path = "th (1).jpg"

# Reading an image
image = cv2.imread(image_path)

# create figure 
plt.figure(figsize=(10, 12))  # Adjust figure size as needed

# Get the height and width of the image
(h, w) = image.shape[:2]

# Convert BGR to RGB
image = image[:,:,::-1]

# Get center of image
(cX, cY) = (w // 2, h // 2)

# Crop the image into four parts
topLeft = image[0:cY, 0:cX]         # top left 
topRight = image[0:cY, cX:w]        # top right
bottomLeft = image[cY:h, 0:cX]      # bottom left
bottomRight = image[cY:h, cX:w]     # bottom right

# Adds a subplot at the 1st position and Display original image
plt.subplot(3, 2, 1)
plt.imshow(image)
plt.axis('off')
plt.title("Original")

# Adds a subplot at the 2nd position and Display top left image
plt.subplot(3, 2, 3)
plt.imshow(topLeft)
plt.axis('off')
plt.title("Top Left")

# Adds a subplot at the 3rd position and Display top right image
plt.subplot(3, 2, 4)
plt.imshow(topRight)
plt.axis('off')
plt.title("Top Right")

# Adds a subplot at the 4th position and Display bottom left image
plt.subplot(3, 2, 5)
plt.imshow(bottomLeft)
plt.axis('off')
plt.title("Bottom Left")

# Adds a subplot at the 5th position and Display bottom Right image
plt.subplot(3, 2, 6)
plt.imshow(bottomRight)
plt.axis('off')
plt.title("Bottom Right")

plt.show()
