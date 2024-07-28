import csv

# Load the training data from a CSV file
def load_data(filename):
    with open(filename, 'r') as csvfile:
        data = list(csv.reader(csvfile))
    return data

# Find-S algorithm implementation
def find_s_algorithm(data):
    # Initialize the most specific hypothesis
    hypothesis = ['0'] * (len(data[0]) - 1)
    
    # Iterate through each training instance
    for instance in data:
        if instance[-1] == 'yes':  # Only consider positive instances
            for i in range(len(hypothesis)):
                if hypothesis[i] == '0':
                    hypothesis[i] = instance[i]
                elif hypothesis[i] != instance[i]:
                    hypothesis[i] = '?'
    
    return hypothesis

# Example usage
data = load_data('data.csv')
hypothesis = find_s_algorithm(data)
print("The maximally specific hypothesis is:", hypothesis)
