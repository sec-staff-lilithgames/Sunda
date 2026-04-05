package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import u8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p implements e {

    /* renamed from: h, reason: collision with root package name */
    public static final n f16599h = new n();

    /* renamed from: b, reason: collision with root package name */
    public final z f16600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16601c;

    /* renamed from: e, reason: collision with root package name */
    public HttpURLConnection f16602e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f16603f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f16604g;

    public p(z zVar, int i10) {
        this.f16600b = zVar;
        this.f16601c = i10;
    }

    public static int a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    public final InputStream b(URL url, int i10, URL url2, Map map) throws IOException {
        if (i10 >= 5) {
            throw new n8.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new n8.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i11 = this.f16601c;
        try {
            HttpURLConnection httpURLConnectionBuild = f16599h.build(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionBuild.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionBuild.setConnectTimeout(i11);
            httpURLConnectionBuild.setReadTimeout(i11);
            httpURLConnectionBuild.setUseCaches(false);
            httpURLConnectionBuild.setDoInput(true);
            httpURLConnectionBuild.setInstanceFollowRedirects(false);
            this.f16602e = httpURLConnectionBuild;
            try {
                httpURLConnectionBuild.connect();
                this.f16603f = this.f16602e.getInputStream();
                if (this.f16604g) {
                    return null;
                }
                int iA = a(this.f16602e);
                int i12 = iA / 100;
                if (i12 == 2) {
                    HttpURLConnection httpURLConnection = this.f16602e;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                            this.f16603f = j9.d.obtain(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                            }
                            this.f16603f = httpURLConnection.getInputStream();
                        }
                        return this.f16603f;
                    } catch (IOException e10) {
                        throw new n8.e("Failed to obtain InputStream", a(httpURLConnection), e10);
                    }
                }
                if (i12 != 3) {
                    if (iA == -1) {
                        throw new n8.e(iA);
                    }
                    try {
                        throw new n8.e(this.f16602e.getResponseMessage(), iA);
                    } catch (IOException e11) {
                        throw new n8.e("Failed to get a response message", iA, e11);
                    }
                }
                String headerField = this.f16602e.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new n8.e("Received empty or null redirect url", iA);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return b(url3, i10 + 1, url, map);
                } catch (MalformedURLException e12) {
                    throw new n8.e(a.b.k("Bad redirect url: ", headerField), iA, e12);
                }
            } catch (IOException e13) {
                throw new n8.e("Failed to connect or obtain data", a(this.f16602e), e13);
            }
        } catch (IOException e14) {
            throw new n8.e("URL.openConnection threw", 0, e14);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
        this.f16604g = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() throws IOException {
        InputStream inputStream = this.f16603f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f16602e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f16602e = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75824c;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, d dVar) {
        z zVar = this.f16600b;
        long logTime = j9.l.getLogTime();
        try {
            try {
                dVar.onDataReady(b(zVar.toURL(), 0, null, zVar.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + j9.l.getElapsedMillis(logTime));
                }
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                dVar.onLoadFailed(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + j9.l.getElapsedMillis(logTime));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + j9.l.getElapsedMillis(logTime));
            }
            throw th2;
        }
    }
}
