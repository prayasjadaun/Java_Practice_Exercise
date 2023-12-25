# class Employee:
#     def __init__(self,name,age,designation,id,salary):
#         self.name=name
#         self.age=age
#         self.designation=designation
#         self.id=id
#         self.salary=salary
    
#     def set_incentive(self,incentive):
#         self.incentive=incentive

#     def total_salary(self):
#         return self.salary + self.incentive
    
#     def display_all(self):
#         print(f"employee name - {self.name}")
#         print(f"age - {self.age}")
#         print(f"designation - {self.designation}")
#         print(f"employee id - {self.id}")
#         print(f"employee salary - {self.salary}")
#         print(f"employee incentive - {self.incentive}")
#         print(f"employee total salary - {self.total_salary()}")


# prayas=Employee("Prayas Jadaun",23,"Software Developer",2301560025,600000)
# prayas.set_incentive(5100)
# prayas.display_all()
# Given list
my_list = [4, 3, 2, 4, 9, 2, 7, 8, 9, 3]

# Function to find duplicate elements using linear search
def find_duplicates(lst):
    duplicates = []
    for i in range(len(lst)):
        for j in range(i + 1, len(lst)):
            if lst[i] == lst[j] and lst[i] not in duplicates:
                duplicates.append(lst[i])
    return duplicates

# Find and print duplicates
duplicate_elements = find_duplicates(my_list)
print("Duplicate elements in the list:", duplicate_elements)




