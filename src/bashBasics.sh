#!/bin/bash

# If user inputs arguments while running the script, the arguments are returned
echo "$1 $2 $3 $4 $5"



echo "What is your name?"
read name					# Reads an input from the user and store it in variable "name"
read -p "What's your full name, $name? " fullName 		# Reads input after showing message
echo "Welcome, $fullName"



read -p "Enter first number: " num1
read -p "Enter second number: " num2
sum=$(($num1+$num2))					# Arithmetic operation syntax is $(($variable1+$variable2))
sub=$(($num1-$num2))					#cannot use space before and after symbols
echo "The sum of $num1 and $num2 is $sum"
echo "The subraction of $num1 and $num2 is $sub"

# Doing the type of division where  there are fractions in the quotient
quotient=$(echo "$num1/$num2" | bc -l)
echo "The result of $num1/$num2 is : $quotient"



array=(C Java "C++" JavaScript Ruby Python)	#creates an array and stores the elements enclosed by the ()

echo "${array[@]}"			#prints all the elements of the array. ${array_name[element_index]}  
echo "Total = ${#array[@]}" #prints the length of the array



##Working with strings
read -p "Enter a string: " str
echo "Length of the string is ${#str}"
read -p "Enter another string: " new_str
joined_str=$str$new_str
echo "Joined string: $joined_str"
substring=${str:$1:$4}
echo "A substring extracted from earlier string: $substring"















