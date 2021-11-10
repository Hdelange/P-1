import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);

        app.post("/add", context -> {
            double num1 = Double.parseDouble(context.formParam("num1"));
            double num2 = Double.parseDouble(context.formParam("num2"));

            context.result("RESULT: " + (num1 + num2));
        });

        app.post("/subtract", context -> {
            double num3 = Double.parseDouble(context.formParam("num3"));
            double num4 = Double.parseDouble(context.formParam("num4"));

            context.result("RESULT: " + (num3 - num4));
        });

        app.post("/multiply", context -> {
            double num5 = Double.parseDouble(context.formParam("num5"));
            double num6 = Double.parseDouble(context.formParam("num6"));

            context.result("RESULT: " + (num5 * num6));
        });

        app.post("/divide", context -> {
            double num7 = Double.parseDouble(context.formParam("num7"));
            double num8 = Double.parseDouble(context.formParam("num8"));

            context.result("RESULT: " + (num7 / num8));
        });



    }
}


