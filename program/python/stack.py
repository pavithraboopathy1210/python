class Stack:
    def __init__(self, max_size):  # Corrected from _init_
        self.stack = []
        self.max_size = max_size

    def push(self, data):
        if len(self.stack) == self.max_size:
            print("Stack Overflow")
        else:
            self.stack.append(data)
            print(f"Pushed {data} into the stack")

    def pop(self):
        if len(self.stack) == 0:
            print("Stack Underflow")
        else:
            popped = self.stack.pop()
            print(f"Popped {popped} from the stack")

    def peek(self):
        if len(self.stack) == 0:
            print("Stack is empty")
        else:
            print(f"Top element is: {self.stack[-1]}")

    def display(self):
        if len(self.stack) == 0:
            print("Stack is empty")
        else:
            print("Stack elements are:", self.stack)


if __name__ == "__main__":  # Corrected from _name_ and _main_
    max_size = int(input("Enter max size of the stack: "))
    stack = Stack(max_size)

    while True:
        print("\nStack Operations:")
        print("1. Push")
        print("2. Pop")
        print("3. Peek")
        print("4. Display")
        print("5. Exit")

        choice = input("Enter your choice: ")

        if choice == '1':
            data = int(input("Enter data to push: "))
            stack.push(data)
        
