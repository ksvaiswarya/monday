'''while True:
    year=int(input("enter year:"))
    if year%4==0 and year%100!=0 or year%400==0:
        print("Leap year")
    else:
        print("Not a leap year")'''

#fahreheit to celsius
'''F=float(input("enter temp:"))
Celsius = (F-32) / 1.8
print(Celsius)'''

#factoral
'''def factorial(n):
    
    if n < 0:
        return 0
    elif n == 0 or n == 1:
        return 1
    else:
        fact = 1
        while(n > 1):
            fact *= n
            n -= 1
        return fact
num=int(input("enter  num:"))
print(factorial(num))'''

#sum &avg
'''n=int(input("enter num:"))
sum=0
for i in range(1,n+1):
    sum=sum+i
average=sum/n
print("sum:",sum)
print("Average:",average)'''


#5
'''x=[i for i in list(range(201)) if i%7==0  and i%5!=0]
print(x)
print(len(x))'''
#6
'''sum_of_squares = sum([i*i for i in range(1, 41, 2)])
print("Sum of squares of first 20 odd numbers:", sum_of_squares)'''


#calculating total digits and letters
'''s=input("enter:")
d=0
l=0
for i in s:
    if i.isalpha():
        l=l+1
    if i.isdigit():
        d=d+1
print("no of letters:",d)
print("no of digits:",l)'''
#leap year
'''n=int(input("enter no:"))
for i in range(1,11):
    print(n ,'x' ,i,'=',n*i)'''
#area of triangle
'''a=int(input("enter base:"))
b=int(input("enter height:"))
c=1/2*a*b
print("area is:",c)'''

#largest num
'''num1=int(input("num1:"))
num2=int(input("num2:"))
num3=int(input("num3:"))
if num1>=num2 and num1>=num3:
    largest=num1
elif (num2 >= num1) and (num2 >= num3):
   largest = num2
else:
   largest = num3
print("largest number:",largest)'''


#days
'''day= int(input("Enter a number 1-7 : "))
if (day==1):
    print(day," is Sunday")
elif (day==2):
    print(day," is Monday")
elif (day==3):
    print(day," is Tuesday")
elif (day==4):
    print(day," is Wednesday")
elif (day==5):
    print(day," is Thursday")
elif (day==6):
    print(day," is Friday")
elif (day==7):
    print(day," is Saturday")
else:
    print("Wrong Input!!!!!")'''
#vowels
# Python3 program to check if a given
# character is vowel or consonant.

# Function to check whether a character
# is vowel or not
'''x=input("enter letter:")
if (x == 'a' or x=='e' or x=='i' or x=='o' or x=='u'):
    print('vowel')
else:
    print("Consonant")'''
#checking upper and lower
'''s=input("enter string:")
upper=0
lower=0
for i in s:
    if i.isupper():
        upper=upper+1
    if i.islower():
        lower=lower+1
print("UPPER CASE ",upper)
print("LOWER CASE ",lower)'''

#even or odd
'''a=int(input("enter a value:"))
if a%2==0:
    print("Even Number")
else:
    print("Odd Number")'''
#dictionary check
'''a = ['Codegnan','Saketh','Python']
d=dict.fromkeys(a,'Vjwda')
print("d =",d)'''
#checking dictonary
'''a ={'sno':1,'name':'Codegnan','place':'Vijayawada'}
value="Codegnan"
if value in a.values():
    print("Value in dictionary")
else:
    print("Value is not in dictionary")'''
#17
'''a = {'sno':[1,2,3,4],'names':['Codegnan','Saketh','Python']}
b={'Gender':{'Male','Female'},'place':['Vijayawada','Mnglgiri']}
print({**a,**b})'''
#20
'''a=["iris","air","saketh","bat","cat","mat"]
a.sort()
print(a)'''
#12
'''unit= float(input("Enter a value for conversion: "))
unit_type = input("Enter the unit type (inches or cms): ")
if unit_type == "inches":
    converted_unit = unit * 2.54
    print(f"{unit} inches = {converted_unit:.2f} cms")
elif unit_type == "cms":
    converted_unit = unit / 2.54
    print(f"{unit} cms = {converted_unit:.2f} inches")
    
else:
    print("Invalid unit type entered. Please enter 'inches' or 'cms'.")'''
#19
'''n = int(input("Enter a number: "))
squares = {i: i*i for i in range(1, n+1)}
print(squares)'''



#20
'''a = input("Enter a comma-separated sequence of words: ")
words = a.split(",")
words.sort()
sorted_words = ",".join(words)
print(sorted_words)'''

#40
'''while True:
    user_name=input("Enter Username:")
    if user_name=="ksv":
        passwd=input("enter Password:")
    if passwd=="aiswarya":
        print("LOGIN SUCCESS")
    else:
        print("Invalid User name or password")'''
#39
'''a="silent"
a=a[2]+a[1]+a[0]+a[5]+a[3]+a[4]
print(a)'''

#38
'''def check(x):
    if x>1:
        return 3*x-1
    elif x>=-1 and x<=1:
        return x+2
    elif x<-1:
        return 5*x+3

print(check(3))
print(check(-2))
print(check(0.6))'''

#37
'''def adds(str1, str2):
    num1 = int(str1)
    num2 = int(str2)
    result = num1 + num2
    print(result)
adds(10,290)
adds(44,88)'''
#36
'''a = {'Monday':[10, 20, 30],'Tuesday':[20, 30, 40],'Wednesday':[12, 15, 16, 28],'Thursday':[52, 12, 36, 6],'Friday':[15, 16, 28, 9, 25],'Saturday':[15, 25, 35, 45]}

for key in a:
    a[key] = []

print(a)'''
#34
'''s = input("Enter a string: ")
if len(s) >= 3:
    if s[-3:] == 'ing':
        s = s+'ly'
    else:
        s = s+'ing'
print(s)'''

#32
'''side1 = float(input("Enter length of side 1: "))
side2 = float(input("Enter length of side 2: "))
side3 = float(input("Enter length of side 3: "))

if side1 == side2 == side3:
    print("The triangle is equilateral.")
elif side1 != side2 and side1 != side3 and side2 != side3:
    print("The triangle is scalene.")
else:
    print("The triangle is isosceles.")'''
#33
'''for i in range(1, 10):
    print(str(i) * i)'''
#31
'''a = {'Codegnan': 250, 'Saketh': 300, 'Python': 250, 'Monday': 200}

sum_values = sum(a.values())

print("Sum of values in the dictionary is:", sum_values)'''
#30
'''count = 0
print("Leap years between 1900 and 2101 are:")
for year in range(1900,2101):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        count=count+1
        print(year)
print("Total leap years between 1900 and 2101 are:", count)'''

#28
'''numbers = input("Enter a sequence of comma-separated numbers: ")
num_list = numbers.split(",")
num_tuple = tuple(num_list)
print(num_list)
print(num_tuple)'''

#22
'''start = int(input("Enter starting number: "))
end = int(input("Enter ending number: "))
print("Prime numbers between", start, "and", end, "are:")
for num in range(start, end + 1):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            print(num)'''

#24
'''num = int(input("Enter a number: "))
factors = []
for i in range(1, num+1):
    if num % i == 0:
        factors.append(i)
print("Factors of", num, "are:", factors)'''

#25
'''n = input("Enter a list of integers separated by space: ").split()
n = [int(num) for num in n]
count=0
for num in n:
    if num % 2 == 0:
        count += 1
print("Even numbers :",count)'''
#26
'''for num in range(1, 51):
    if num % 3 == 0 and num % 5 == 0:
        print("I love Codegnan")
    elif num % 3 == 0:
        print("Codegnan")
    elif num % 5 == 0:
        print("Python")
    else:
        print(num)'''
#27
'''month = input("Enter the month name: ")
num_days =None
if month == 'January':
    num_days = 31
elif month == 'February':
    num_days = 28
elif month == 'March':
    num_days = 31
elif month == 'April':
    num_days = 30
elif month == 'May':
    num_days = 31
elif month == 'June':
    num_days = 30
elif month == 'July':
    num_days = 31
elif month == 'August':
    num_days = 31
elif month == 'September':
    num_days = 30
elif month == 'October':
    num_days = 31
elif month == 'November':
    num_days = 30
elif month == 'December':
    num_days = 31
if num_days is not None:
    print("Number of days in", month + ":", num_days)
else:
    print("Invalid month name")'''
#28
'''numbers = input("Enter a sequence of comma-separated numbers: ")
numbers_list = numbers.split(',')
numbers_tuple = tuple(numbers_list)
print(numbers_list)
print(numbers_tuple)'''

#29
'''a = int(input("Enter first number: "))
b= int(input("Enter  second number: "))
print("Sum =", a + b, "Product =", a * b)'''

#31
'''a = {'Codegnan': 250, 'Saketh': 300, 'Python': 250, 'Monday': 200}
total = 0
for value in a.values():
    total += value
print("The sum of the values in the dictionary is:", total)'''















        








        
        
    



