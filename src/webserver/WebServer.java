package webserver;

public class WebServer {
    static WebServer this_server;
    ServerLanguage language;

    private WebServer(ServerLanguage language) {
        this.language = language;
    }

    private static WebServer build(ServerLanguage lang) throws Exception{
        if(this_server == null){
            this_server = new WebServer(lang);
            return this_server;
        }
        else throw new Exception("Server has been built already");
    }

    public static WebServer buildWithDjango() throws Exception {
        return build(ServerLanguage.DJANGO);
    }

    public static WebServer buildWithSpring() throws Exception {
        return build(ServerLanguage.SPRING);
    }

    public static WebServer buildWithLaravel() throws Exception {
        return build(ServerLanguage.LARAVEL);
    }

    @Override
    public String toString() {
        return "WebServer{" +
                "language=" + language +
                '}';
    }
}
