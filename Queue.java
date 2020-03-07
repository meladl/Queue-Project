//Mohamed Eladl
//ID:1203261
//CSCI 260
class Queue{
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;

   public Queue(int s){
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
      }

   public void insert(long j){
      if(rear == maxSize-1)      
         rear = -1;
      queArray[++rear] = j;         
      nItems++;                     
      }

   public long remove(){
      long temp = queArray[front++]; 
      if(front == maxSize)          
         front = 0;
      nItems--;                     
      return temp;
      }

   public long peekFront(){
      return queArray[front];
      }

   public boolean isEmpty(){
      return (nItems==0);
      }

   public boolean isFull(){
      return (nItems==maxSize);
      }

   public int size(){
      return nItems;
      }

   public static Object removeSecond(Queue queue){
  long temp;
       if(queue.nItems < 2){
       System.out.println("The Queue has to be at least two elements");
   }
      else{
          int second = ++queue.front;  
        temp = queue.queArray[second++];
        queue.nItems--;
        System.out.println("The removed value is: " + temp);
     return temp;
         }
       return null;
   
   }
   public void display(){
       for(int i = this.rear; i >= 0; i--){
           System.out.print(" " + this.queArray[i]);
       }
   }
       
   
   
   
////////////////////////////////////////////////////////////////

   public static void main(String[] args){
      Queue theQueue = new Queue(7);  

      theQueue.insert(10);           
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);

      theQueue.remove();            
      theQueue.remove();             
      theQueue.remove();

      theQueue.insert(50);           
      theQueue.insert(60);           
      theQueue.insert(70);
      theQueue.insert(80);
      theQueue.insert(90);
      theQueue.insert(100);
      removeSecond(theQueue);
      removeSecond(theQueue);
      }  
   
   }  

