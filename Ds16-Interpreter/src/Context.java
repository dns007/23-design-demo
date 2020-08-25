/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/30
 */
/*
上下文环境 用来保存文法
 */
public class Context {
    private String input;
    private int output;

    public Context(String input){
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
