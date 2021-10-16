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
     Node *node=first;
     unordered_set<Node*> hash;
     while(node)
     {
         if(hash.find(node->next)!=hash.end())
         {
             cout<<"Loop present";
             return;
         }
         hash.insert(node);
         node=node->next;
     }
         cout<<"Loop Not present";
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
    //list.createLoop();
    list.detectLoop();

}
