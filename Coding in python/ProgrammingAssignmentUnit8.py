def invert_dict(input_file, output_file):
    # Initialize an empty dictionary
    # Hard-coded dictionary will make it difficult to work with
    original_dict = {}
    
    # Open and read the input file
    with open(input_file, 'r') as file:
        for line in file:
            # Remove the new line character and split by ": "
            line = line.strip()
            if ": " in line:  # Check if the line has a valid key-value pair
                key, value = line.split(": ")
                if value in original_dict:
                    original_dict[value].append(key)
                else:
                    original_dict[value] = [key]

    # Write the inverted dictionary to the output file
    with open(output_file, 'w') as file:
        for value, keys in original_dict.items():
            file.write(f"{value}: {', '.join(keys)}\n")

# Specify input and output files
input_filename = 'original_dict.txt'
output_filename = 'inverted_dict.txt'

# Call the function to invert the dictionary and write it to the output file
invert_dict(input_filename, output_filename)

