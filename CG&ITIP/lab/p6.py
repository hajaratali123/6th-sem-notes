import cv2
from matplotlib import pyplot as plt

# Reading an image
src = cv2.imread('image.png')
gray_image = cv2.cvtColor(src, cv2.COLOR_BGR2GRAY)

# Load the Haar Cascade classifier for detecting faces
face_classifier = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_default.xml")

# Detect faces in the grayscale image
faces = face_classifier.detectMultiScale(gray_image, scaleFactor=1.1, minNeighbors=5, minSize=(40, 40))

# Draw rectangles around the detected faces
for (x, y, w, h) in faces:
    cv2.rectangle(src, (x, y), (x + w, y + h), (0, 255, 0), 4)

# Convert BGR image to RGB for displaying with matplotlib
img_rgb = cv2.cvtColor(src, cv2.COLOR_BGR2RGB)

# Display the image with rectangles around faces
plt.figure(figsize=(7, 8))
plt.imshow(img_rgb)
plt.axis('off')
plt.title("Image with Detected Faces")
plt.show()
