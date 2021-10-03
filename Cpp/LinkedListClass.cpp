#include <iostream>  
using namespace std;

//creating node class:
class node{
        public:
            int data;
            node* next;

        node(int data){
            this->data = data;
            next= NULL;
        }
};   

//creating print function:
void printll(node *head){
            while(head){
                cout<<head->data<<"->";
                head=head->next;
            }
            cout<<"\n";
}

//creating input fn creating new linked list:
node *inputll(){
    int data;
    cin>>data;
    node *head=NULL;
    node *tail=NULL;
    while(data!=-1){
        node *n= new node(data);
        if(head==NULL){
            head=n;
            tail=n;
        }else{
            tail->next=n;
            tail=n;

        }
        cin>>data;
        }
    return head;
}

//creating length fn:
int lengthll(node*head){
    int count=0;
    while(head){
        count++;
        head=head->next;
    }
    return count;
}

//print ith index node fn:
void printlli(node*head, int n){
    node* reqnode=head;
    for(int i=1;i<=n;i++){
        reqnode=reqnode->next;
    }
    cout<<"The data at "<<n<<"th index is: "<<reqnode->data<<endl;
}

//insert at ith index node position:
node *insertlli(node*head, int data, int n){
    //for invalid case of i<0:
    if(n<0){
        cout<<"invalid index"<<endl;
    }
    //valid case of i=0:
    if(n==0){
        node *newnode= new node(data);
        newnode->next=head;
        head=newnode;
        return head;
    }

    //valid case of i=1 to i=(lastindex+1):
    if(head){
        node *newnode=new node(data);
        node *prev= head;
        node *current=head;
        for(int i=1;i<n;i++){
            prev=prev->next;
            current=prev->next;
        }
        prev->next=newnode;
        newnode->next=current;

        return head;

    }
    return head;
}
//delete ith node function:
void deletelli(node*&head, int n){
    if(n<0){
        cout<<"invalid index";
    }
    if(head && n==0){
        
        head=head->next;
        cout<<"the new head is: "<<head->data<<endl;
        printll(head);
        
    }
    if (head && n>0){
        node*prev=head;
        node*current=head;
        node*after=head;
        for(int i=1;i<n;i++){
            prev=prev->next;
        }
        current=prev->next;
        after=current->next;
        prev->next=after;
    }
    
    
    
}



int main(){
    node *list1=inputll();
    printll(list1);
    int deleteindex;
    cout<<"which index do you want to delete?: ";
    cin>>deleteindex;
    deletelli(list1, deleteindex);
    printll(list1);

    ///many features commented out:
    
    /*int length=lengthll(list1);
    cout<<length<<endl;
    printlli(list1,4);
    cout<<"before: ";
    printll(list1);
    insertlli(list1, 50, 3);
    cout<<"after:"<<endl;
    printll(list1);
    cout<<"after after:"<<endl;
    insertlli(list1, 100, 7);
    printll(list1);*/



}
