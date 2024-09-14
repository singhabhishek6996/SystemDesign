public class Macbook {
    //giving concrete class instead of interface.
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Macbook(){
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}
