#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node*next;
};
struct Node* insertatbegining(struct Node*head,int value){
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=value;
    newnode->next=head;
    return newnode;
}
void printlist(struct Node*head){
    struct Node*current=head;
    while(current!=NULL){
        printf("%d->",current->data);
        current=current->next;
    }
    printf("NULL");
}
int main(){
    struct Node* head=NULL;
    head=insertatbegining(head,15);
    head=insertatbegining(head,30);
    head=insertatbegining(head,45);
    printf("Linked List\n");
    printlist(head);
    return 0;

}