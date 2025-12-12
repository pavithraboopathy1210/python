class stack:
    def __init(self,max_size):
        self.stack=[]
        self.max_size=max_size 
    def push(self,data):
        if len(self.stack)==self.max_size:
            print("Stack Overflow")
        else:
            self.stack.append(data)
            print(f"pushed {data} into the stack")
    def pop(self):
        if(self.stack)==0:
            print("stack Underflow")
        else:
            popped=self.stack.pop()
            print(f"popped{popped} from the stack")
    def peek(self):
        if len(self.stack)==0:
            print("stack is empty")
        else:
            print(f"top element is:{self.stack[-1]}")
    def display(self):
        if len(self.stack)==0:
            print("stack is empty")
        else:
            print(f"")                 
if __name__=="__main__":
    max_size=int(input("enter a max size of the stack"))
    stack=stack(max_size)
