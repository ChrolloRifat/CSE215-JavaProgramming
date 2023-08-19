#!/bin/bash


echo "$1 $2 $3 $4 $5"



echo "What is your name?"
read name
read -p "What's your full name, $name? " fullName
echo "Welcome, $fullName"



read -p "Enter first number: " num1
read -p "Enter second number: " num2
sum=$(($num1+$num2))
sub=$(($num1-$num2))
echo "The sum of $num1 and $num2 is $sum"
echo "The subraction of $num1 and $num2 is $sub"



array=(C Java "C++" JavaScript Ruby Python)

echo "${array[@]}"
echo "Total = ${#array[@]}"