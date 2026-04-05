package mi;

import com.applovin.shadow.okio.Segment;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ei.f;
import ii.g;
import j1.o2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74731a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f74732b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f74733c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f74731a = str;
        this.f74732b = map;
    }

    public static String a(String str, Map map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append(C3191e4.i.f36525b);
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append(C3191e4.i.f36527c);
            sb2.append((String) entry2.getKey());
            sb2.append(C3191e4.i.f36525b);
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), C.UTF8_NAME) : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return i.d(str, "?", string);
        }
        if (!str.endsWith(C3191e4.i.f36527c)) {
            string = C3191e4.i.f36527c.concat(string);
        }
        return o2.l(str, string);
    }

    public c execute() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        g.checkBlockingThread();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f74731a, this.f74732b);
            f.getLogger().v("GET Request URL: " + strA);
            httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(C3271ic.f36943a);
                for (Map.Entry entry : this.f74733c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, C.UTF8_NAME));
                        char[] cArr = new char[Segment.SIZE];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i10);
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public a header(String str, String str2) {
        this.f74733c.put(str, str2);
        return this;
    }

    public a header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }
}
