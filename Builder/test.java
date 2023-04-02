package Builder;

public class test {

    public static void main(String[] args) {
        HttpClient uglyClient = new HttpClient("method",  "url", null, null, null, "body"); //Ugly
        System.out.println(uglyClient.toString());

        HttpClient httpClient = new HttpClient.HttpClientBuilder().method("POST").url("google.com").body("body").headers("headers").secure("admin","admin").build();
        System.out.println(httpClient.toString());
    }

}
