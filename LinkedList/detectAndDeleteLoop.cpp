/**Detect and delete the loop from the linked list */

#include<iostream>
using namespace std;

class Node
{
    public:
    int value;
    Node *next;
    Node(int value)
    {
        next=NULL;
        this->value=value;
    }
};

class LinkedList
{
    public:
    Node *first;
    LinkedList()
    {
        first=NULL;
    }
    void insert(int value);
    void detectAndRemoveLoop();
    void printList();
    void createLoop();
};
void LinkedList::detectAndRemoveLoop()
{
    if(first==NULL||first->next==NULL)
    return;

    Node *fast_p=NULL,*slow_p=NULL;
    fast_p=first->next->next;
    slow_p=first->next;

    while(fast_p&&fast_p->next)
    {
        if(fast_p==slow_p)
            break;
        fast_p=fast_p->next->next;
        slow_p=slow_p->next;
    }
      if (slow_p == fast_p) { 
        slow_p = first; 
        while (slow_p->next != fast_p->next) { 
            slow_p = slow_p->next; 
            fast_p = fast_p->next; 
        } 
  
        /* since fast->next is the looping point */
        fast_p->next = NULL; /* remove loop */
    }
}
void LinkedList::insert(int value)
{
    Node *newNode=new Node(value);
    if(newNode==NULL)
    {
         cout<<"program error"<<endl;
         return;
    }
    if(first==NULL)
    {
        first=newNode;
    }
    else
    {
        newNode->next=first;
        first=newNode;
    }
}
void LinkedList::printList()
{
    Node *node=first;
    while(node)
    {
        cout<<node->value<<"->";
        node=node->next;
    }
    cout<<"NULL";
}

void LinkedList::createLoop()
{
    Node *head=first;
    head->next->next->next->next->next = head->next->next; 
}


int main()
{
    LinkedList list;
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    //create a Loop
       list.createLoop();
    list.detectAndRemoveLoop();
    list.printList();

}


