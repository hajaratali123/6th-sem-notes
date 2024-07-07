import pandas as pd
from sklearn.preprocessing import LabelEncoder, OneHotEncoder
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score

# Load Data from CSV
file_path = 'C:/Users/Admin/Desktop/6th-sem-notes/AI&ML LAB/CIE_1/tennisdata.csv'

try:
    data = pd.read_csv(file_path)
    print("The first 5 values of data are:\n", data.head())
    
    # Continue with your data processing and modeling steps...
    
except FileNotFoundError:
    print(f"Error: File '{file_path}' not found. Please check the file path.")
print("The first 5 Values of data is :\n", data.head())

# Separate features and target
X = data.drop('PlayTennis', axis=1)
y = data['PlayTennis']

# Encoding categorical variables
label_encoders = {}
for column in ['Outlook', 'Temperature', 'Humidity', 'Windy']:
    le = LabelEncoder()
    X[column] = le.fit_transform(X[column])
    label_encoders[column] = le

# One-hot encode categorical columns if needed (not necessary for Naive Bayes)
# Use if there's no inherent ordinal relationship, e.g., Outlook and Windy

# Train-test split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.20, random_state=42)

# Initialize Gaussian Naive Bayes classifier
classifier = GaussianNB()

# Train the classifier
classifier.fit(X_train, y_train)

# Predict on the test set
y_pred = classifier.predict(X_test)

# Evaluate accuracy
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy is:", accuracy)
