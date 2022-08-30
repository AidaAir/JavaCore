package lesson6JavaCore;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class WeatherSpb {

    private static final String HOST = "dataservice.accuweather.com";

    private static final String FORECAST = "forecasts";

    private static final String API_VERSION = "v1";

    private static final String FORECAST_TYPE = "daily";

    private static final String FORECAST_PERIOD = "5day";

    private static final String SPB_KEY = "295212";

    private static final String API_KEY = "4N3XFRZBrOkdHrF1kyAzUT2BbEKeawJQ";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(SPB_KEY)
                .addQueryParameter("apikey",API_KEY)
                .addQueryParameter("language","ru-ru")
                .addQueryParameter("metric","true")
                .build();

        System.out.println(url.toString());

        Request request = new Request.Builder()
                .addHeader("accept","application/json")
                .url(url)
                .build();

        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }
}
