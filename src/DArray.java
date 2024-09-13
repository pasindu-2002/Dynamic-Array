public class DArray
{
    int arr[];
    int capacity;
    int size;
    public DArray()
    {
        arr=new int[1];
        capacity=1;
        size=0;
    }

    private void grow()
    {
        int temp[]=new int[capacity*2];
        for(int i=0;i<capacity;i++)
        {
            temp[i]=arr[i];
        }
        capacity=capacity*2;
        arr=temp;
    }


    public void insert(int data)
    {
        if(capacity==size)
        {
            grow();
        }
        arr[size]=data;
        size++;
    }


    private void shrink()
    {
        int temp[]=new int[capacity/2];
        for(int i=0;i<size;i++)
        {
            temp[i]=arr[i];
        }
        capacity=capacity/2;
        arr=temp;
    }


    public void remove()
    {
        size--;
        if(size==capacity/2)
        {
            shrink();
        }
    }



    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"->");
        }
    }
}