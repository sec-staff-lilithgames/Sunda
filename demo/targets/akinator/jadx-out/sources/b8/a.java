package b8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f8915b;

    public a(HttpURLConnection httpURLConnection) {
        this.f8915b = httpURLConnection;
    }

    public static String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // b8.d
    public InputStream bodyByteStream() throws IOException {
        return this.f8915b.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8915b.disconnect();
    }

    @Override // b8.d
    public String contentType() {
        return this.f8915b.getContentType();
    }

    @Override // b8.d
    public String error() {
        HttpURLConnection httpURLConnection = this.f8915b;
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + a(httpURLConnection);
        } catch (IOException | NullPointerException e10) {
            e8.e.warning("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // b8.d
    public boolean isSuccessful() {
        try {
            return this.f8915b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
