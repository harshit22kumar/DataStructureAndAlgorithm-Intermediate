/**One More method is by using auxillary space in node as visited flag */

/** Floyd’s Cycle-Finding Algorithm-fast and slow pointer */
/**Detect the loop in the linked list */

#include<iostream>
#include<unordered_set>

using namespace std;

class Node
{
    public:
    Node *next;
    int value;
    Node(int value)
    {
        this->value=value;
        next=NULL;
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
    void detectLoop();
    void createLoop();
};
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

 void LinkedList::detectLoop()
 {
    Node *fast_p=first;
    Node *slow_p=first;
    while(fast_p&&slow_p&&fast_p->next)
    {
        fast_p=fast_p->next->next;
        slow_p=slow_p->next;
        if(fast_p==slow_p)
        {
            cout<<"Loop detected"<<endl;
            return;
        }
    }   
    cout<<"Loop Not detected"<<endl;
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
    list.detectLoop();

}

