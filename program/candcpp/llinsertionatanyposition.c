#include <stdio.h>
#include <stdlib.h>

// Define structure for a node
struct Node {
    int data;
    struct Node* next;
};

// Create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Display the linked list
void displayList(struct Node* head) {
    struct Node* temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Insert a node at a given position (returns updated head)
struct Node* insertAtPosition(struct Node* head, int data, int position) {
    struct Node* newNode = createNode(data);

    if (position < 1) {
        printf("Invalid position!\n");
        free(newNode);
        return head;
    }

    if (position == 1) {
        newNode->next = head;
        return newNode;
    }

    struct Node* temp = head;
    for (int i = 1; i < position - 1 && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Position out of range!\n");
        free(newNode);
        return head;
    }

    newNode->next = temp->next;
    temp->next = newNode;
    return head;
}

int main() {
    struct Node* head = NULL;

    // Create initial list: 10 -> 20 -> 30
    head = insertAtPosition(head, 30, 1);
    head = insertAtPosition(head, 20, 1);
    head = insertAtPosition(head, 10, 1);

    displayList(head);

    int data, position;
    printf("\nEnter data to insert: ");
    scanf("%d", &data);
    printf("Enter position to insert at (1-based index): ");
    scanf("%d", &position);

    head = insertAtPosition(head, data, position);

    printf("\nAfter insertion:\n");
    displayList(head);

    return 0;
}
