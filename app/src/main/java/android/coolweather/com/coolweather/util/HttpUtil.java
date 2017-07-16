package android.coolweather.com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 使用OkHttp发送请求
 * Created by Administrator on 2017/7/13.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        //发送请求
        client.newCall(request).enqueue(callback);

    }
}
