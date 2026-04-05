package lr;

import com.unity3d.services.core.network.model.HttpRequest;
import gv.c;
import gv.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {
    public static final void disconnectSafely(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable unused) {
        }
    }

    public static final boolean isHttp(URL url) {
        e0.checkNotNullParameter(url, "<this>");
        return e0.areEqual("http", url.getProtocol()) || e0.areEqual(HttpRequest.DEFAULT_SCHEME, url.getProtocol());
    }

    public static final byte[] readBytes(URLConnection uRLConnection) throws IOException {
        e0.checkNotNullParameter(uRLConnection, "<this>");
        InputStream it = uRLConnection.getInputStream();
        try {
            e0.checkNotNullExpressionValue(it, "it");
            byte[] bytes = c.readBytes(it);
            d.closeFinally(it, null);
            return bytes;
        } finally {
        }
    }

    public static final byte[] readBytesSafely(URLConnection uRLConnection) {
        e0.checkNotNullParameter(uRLConnection, "<this>");
        try {
            return readBytes(uRLConnection);
        } catch (Throwable unused) {
            return null;
        }
    }
}
