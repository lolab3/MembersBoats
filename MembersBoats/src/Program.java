public class Program {
    public static void main(String[] args) {
        model.Organization game = new model.Organization();
        view.Console v = new view.Console();
        controller.Admin c = new controller.Admin();

        while(c.Options(v, game));
    }
}
