package athleticraceinterface;


import java.util.concurrent.atomic.AtomicInteger;


public class Buffer {
    private final AtomicInteger contador;
    
    Buffer() {
        contador = new AtomicInteger(0);
    }
    
    public int getContador() {
        return contador.incrementAndGet();
    }
}
