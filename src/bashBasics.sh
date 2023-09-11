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
substring=${joined_str:3:10}
echo "A substring extracted from earlier string: $substring"


## Using if-else condition
read -p "Enter a number to check if it is even or odd: " num
mod=$(($num%2))
if [ $mod -eq 0 ]; then
	echo "The number is even"
elif [ $mod -gt 1 ]; then
	echo "The remainder after dividing by 2 is greater than 1"
else
	echo "The number is odd"
fi

## using strings as the arguments in the if-else conditions
read -p "Now we gonna check if the previous two strings are the same or not [Hit 'ENTER']"
if [ "$str" = "$new_str" ]; then
	echo "The Strings are the same"
elif [ "$str" == "" ]; then
	echo "The first string is empty"
elif [ -z "$new_str" ]; then
	echo "The second string is empty"
else
	echo "The Strings are different"
fi

#using for loops
echo "This is the output of a for loop"
for num in {1..9};do
	echo $num
done	


## using c-styled for-loop
echo "This loop counts backwards:"
for((i = 4; i > 0; i--));do
	echo  $i 
done

#using while loops
echo "This is the output of a while loop"
num=1
while [ $num -le 5 ];do
	echo $num
	num=$(($num+1))
done

#using until loops
echo "This is the output of an until loop"
num=1
until [ $num -gt 5 ];do
	double=$(($num*2))
	echo $double
	num=$(($num+1))
done

#using functions

