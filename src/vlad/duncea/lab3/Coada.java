package vlad.duncea.lab3;

public class Coada {

    private int size;
    private int []queue;
    private int first=0, last=0;

    Coada()
    {
        this(100);
    }

    Coada(int size)
    {
        this.size= size;
        this.queue = new int[size];
    }

    public void push(int val)
    {
         if(first == (last+1) % size)
             throw new OutOfMemoryError("Queue is full!");

         queue[last]=val;
         last = (last+1)%size;
    }

    public int pop()
    {
        if(first == last)
            throw new ArithmeticException("Empty queue");

        int val = queue[first];
        first = (first+1) % size;
        return val;
    }

    public boolean isEmpty()
    {
        return (first == last);
    }

    public String toString()
    {
        int count = this.last - this.first;
        if (this.first > this.last)
            count += this.size;

        String output = "Nr elemente:" + count + " Continut:";
        int iter = this.first;
        while (iter != this.last) {
            output += this.queue[iter++] + " ";
            iter %= this.size;
        }

        return output;
    }

    public static void main(String[] args)
    {
	    Coada queue = new Coada(20);
	    queue.push(10);
	    queue.push(11);
	    queue.push(11);
	    queue.push(12);
	    queue.push(13);
	    queue.push(15);
	    queue.push(16);
	    queue.push(17);
	    queue.push(18);
	    queue.push(19);
	    queue.push(20);

	    System.out.println(queue.toString());

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(10);
        queue.push(11);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(15);
        queue.push(16);
        queue.push(17);
        queue.push(18);
        queue.push(19);
        queue.push(20);
        queue.push(21);
        queue.push(22);

        System.out.println(queue.toString());
    }
}
