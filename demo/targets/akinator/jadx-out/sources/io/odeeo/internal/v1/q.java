package io.odeeo.internal.v1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f67287a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public final void addHeaders(HttpsURLConnection conn, Map<String, String> headers) {
            e0.checkNotNullParameter(conn, "conn");
            e0.checkNotNullParameter(headers, "headers");
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                conn.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }

        public final Bitmap loadImage$odeeoSdk_release(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection;
            if (url == null) {
                uRLConnectionOpenConnection = null;
            } else {
                try {
                    uRLConnectionOpenConnection = url.openConnection();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return null;
                }
            }
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }
}
