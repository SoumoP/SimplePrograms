//Program to check the palindrome of word using array.


#include<stdio.h>
#include<string.h>

void main()
{
    char word[100];
    int length, counter;


    printf("Enter a word : ");
    scanf("%s", word);
    length = strlen(word);
    

    for (counter = 0; counter < length / 2 ; counter++)
    {
        if (word[counter] != word[length - counter - 1])
        {
           printf("\n%s is NOT a palindrome.", word);
            break;
        }
        else{ printf("\n%s is a palindrome.", word);
        break;
        
        }
  
       
    }
    
}
