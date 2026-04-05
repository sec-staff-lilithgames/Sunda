package com.bytedance.adsdk.jd.cm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements cm {
    private final HttpURLConnection jpo;

    public jpo(HttpURLConnection httpURLConnection) {
        this.jpo = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.jpo.disconnect();
    }

    @Override // com.bytedance.adsdk.jd.cm.cm
    public String cm() {
        try {
            if (jpo()) {
                return null;
            }
            return "Unable to fetch " + this.jpo.getURL() + ". Failed with " + this.jpo.getResponseCode() + "\n" + jpo(this.jpo);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.jd.cm.cm
    public InputStream jd() throws IOException {
        return this.jpo.getInputStream();
    }

    @Override // com.bytedance.adsdk.jd.cm.cm
    public boolean jpo() {
        try {
            return this.jpo.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.jd.cm.cm
    public String wqx() {
        return this.jpo.getContentType();
    }

    private String jpo(HttpURLConnection httpURLConnection) throws IOException {
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
}
