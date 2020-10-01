package homeWork_4_Jeneric;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> extends toString{
    private T[] data;
    public DataContainer(Class<T> clazz, int capacity) {
        data = (T[])Array.newInstance(clazz, capacity);
    }
    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item){
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i] == null){
                this.data[i] = item;
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data);
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }





    public void sort(Comparator<T> comparator){
        T arg;
        for (int i = 0; i < this.data.length - 1; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (comparator.compare(this.data[j], this.data[j + 1]) > 0) {
                    arg = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = arg;
                }
            }
        }
    }
}
