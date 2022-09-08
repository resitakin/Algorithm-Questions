public class ConsoleLogger extends BaseLogger {
    private BaseLogger logger;
    public ConsoleLogger(BaseLogger logger){
        this.logger=logger;

    }
    public void add(){
        System.out.println("müşteri eklendi");
        this.logger.log("loggg");

    }

}
