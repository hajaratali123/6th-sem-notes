# Find-S Algorithm
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
 
# Example usage
training_data = [
    (True, "Sunny", "Warm", "Normal", "Strong", "Warm", "Same"), 
    (True, "Sunny", "Warm", "High", "Strong", "Warm", "Same"), 
    (False, "Rainy", "Cold", "High", "Strong", "Warm", "Change"),  
    (True, "Sunny", "Warm", "High", "Strong", "Cool", "Change")
]
 
hypothesis = find_s(training_data)
print("Final Hypothesis:", hypothesis)
 
 
