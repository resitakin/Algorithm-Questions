public class Main {

    public static void main(String[] args) {
//     BaseLogger[] baseLoggers=new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};
//     for (BaseLogger logger:baseLoggers){
//         logger.log("log!!!!");
//
//     }
        ConsoleLogger consoleLogger=new ConsoleLogger(new FileLogger());
        consoleLogger.add();

    }
}
