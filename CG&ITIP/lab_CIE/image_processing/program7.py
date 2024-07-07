import cv2
from matplotlib import pyplot as plt
img = cv2.imread("th (1).jpg")
print(img)
img=img[:,:,::-1]

print("2"+img)
# (h,w,c)=img.shape

# # topleft=img[0:h//2,0:w//2]
# # topRIGHT=img[0:h//2,w//2:w]
# # bottomleft=img[h//2:h,0:w//2]
# # bottomRight=img[h//2:h,w//2:w]

# plt.figure(figSize=(7,8))

# plt.subplot(3,3,1)
# plt.imshow(img)
# plt.title("original")
# plt.axis("off")

