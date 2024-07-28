import pandas as pd

def find_s(training_data):
    hypothesis = ["0"] * len(training_data[0][1:])
 
    for example in training_data:
        if example[0]:  # If the example is positive
            for i in range(len(hypothesis)):
                if hypothesis[i] == "0":
                    hypothesis[i] = example[i + 1]
                elif hypothesis[i] != example[i + 1]:
                    hypothesis[i] = "?"
 
    return hypothesis

def read_csv(file_path):
    df = pd.read_csv(file_path)
    # Assuming the first column is the class label and the rest are attributes
    # Convert the class labels to boolean
    df.iloc[:, 0] = df.iloc[:, 0].apply(lambda x: True if x.lower() == 'yes' else False)
    training_data = df.values.tolist()
    return training_data

# Example usage
file_path = 'data.csv'  # Replace with your CSV file path
training_data = read_csv(file_path)
hypothesis = find_s(training_data)
print("Final Hypothesis:", hypothesis)
