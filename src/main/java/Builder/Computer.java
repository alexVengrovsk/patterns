package builder;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class Computer {

    private int cores;
    private int DDR;
    private int HDD;

    //optional parameters
    private String processor;
    private String type;

    private Computer(ComputerBuilder computerBuilder) {
        this.cores = computerBuilder.cores;
        this.DDR = computerBuilder.DDR;
        this.HDD = computerBuilder.HDD;
        this.processor = computerBuilder.processor;
        this.type = computerBuilder.type;
    }

    public int getCores() {
        return cores;
    }

    public int getDDR() {
        return DDR;
    }

    public int getHDD() {
        return HDD;
    }

    public String getProcessor() {
        return processor;
    }

    public String getType() {
        return type;
    }

    public static class ComputerBuilder {

        private int cores;
        private int DDR;
        private int HDD;

        //optional parameters
        private String processor;
        private String type;

        public ComputerBuilder(int cores, int DDR, int HDD) {
            this.cores = cores;
            this.DDR = DDR;
            this.HDD = HDD;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
