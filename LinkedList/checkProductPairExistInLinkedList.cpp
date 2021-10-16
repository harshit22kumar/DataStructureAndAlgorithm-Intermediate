/**Check if a pair with given product exists in Linked list */

#include<iostream>
#include<unordered_set>

using namespace std;

class Node
{
    Node *next;
    int value;
    Node(int value)
    {
        this->value=value;
        next=NULL;
    }
}

class LinkedList
{
    Node *first;
    LinkedList()
    {
        first=NULL;
    }
    void insert(int value);
    void findProduct(int k);
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

 void LinkedList::findProduct(int multi)
 {
     Node *node=first;
     unordered_set<int> hash;
     while(node)
     {
         int current=node->value;
         if(multi%current==0&&hash.find(multi/current)!=hash.end())
         {
             cout<<current<<" "<<multi/current;
             return ;
         }
        hash.insert(node->value);
        node=node->next;
     }
 }
int main()
{
    LinkedList list;
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    int k=2;
    list.findProduct(k);

}