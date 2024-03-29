package athleticraceinterface;


import javax.swing.JTextArea;


public class ThreadRunner implements Runnable {
    private final Runner corredor;
    private final JTextArea txtArea;
    private final Buffer buffer;
    
    ThreadRunner(Runner corredor, JTextArea txtArea, Buffer buffer) {
        this.corredor = corredor;
        this.txtArea =  txtArea;
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(this.corredor.getSpeed() * 1000);
            txtArea.setText(
                    txtArea.getText()
                    + buffer.getContador() + " - "
                    + corredor.getName()
                    + " - Tiempo: " + corredor.getSpeed() + " segundos\n");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
