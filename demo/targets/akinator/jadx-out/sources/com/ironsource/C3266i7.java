package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.i7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3266i7 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36923a = 15000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f36924b = "GET";

    /* renamed from: c, reason: collision with root package name */
    private static final String f36925c = "POST";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36926d = "UTF-8";

    /* renamed from: e, reason: collision with root package name */
    public static final String f36927e = "ERROR:";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36928f = "Bad Request - 400";

    /* renamed from: g, reason: collision with root package name */
    private static final ExecutorService f36929g = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.i7$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3283j7 f36932c;

        public a(String str, String str2, InterfaceC3283j7 interfaceC3283j7) {
            this.f36930a = str;
            this.f36931b = str2;
            this.f36932c = interfaceC3283j7;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionB;
            OutputStream outputStream = null;
            try {
                httpURLConnectionB = C3266i7.b(this.f36930a);
                try {
                    try {
                        outputStream = httpURLConnectionB.getOutputStream();
                        C3266i7.a(this.f36931b, outputStream);
                        int responseCode = httpURLConnectionB.getResponseCode();
                        boolean z10 = responseCode == 200;
                        if (!z10) {
                            IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                        }
                        this.f36932c.a(z10);
                    } catch (Exception e10) {
                        e = e10;
                        C3422r4.d().a(e);
                        IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                        this.f36932c.a(false);
                        C3266i7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C3266i7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                httpURLConnectionB = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionB = null;
                C3266i7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                throw th;
            }
            C3266i7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
        }
    }

    public static String a(String str) throws Exception {
        return a(str, (r.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String a(String str, r.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e10;
        BufferedReader bufferedReader2;
        Throwable th2;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (bVar != null) {
                        bVar.a(f36928f);
                    }
                    a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String strA = a(bufferedReader2);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return strA;
                } catch (Exception e11) {
                    e10 = e11;
                    try {
                        C3422r4.d().a(e10);
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th3) {
                        bufferedReader = bufferedReader2;
                        th = th3;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th2 = th;
                        bufferedReader2 = bufferedReader3;
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th2;
                }
            } catch (Exception e12) {
                e = e12;
                e10 = e;
                bufferedReader2 = null;
                C3422r4.d().a(e10);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                BufferedReader bufferedReader32 = bufferedReader;
                th2 = th;
                bufferedReader2 = bufferedReader32;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th2;
            }
        } catch (Exception e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void a(String str, String str2, InterfaceC3283j7 interfaceC3283j7) {
        f36929g.submit(new a(str, str2, interfaceC3283j7));
    }

    public static String a(String str, String str2, r.b bVar) {
        Throwable th2;
        BufferedReader bufferedReader;
        OutputStream outputStream;
        Exception e10;
        HttpURLConnection httpURLConnectionB;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionB = b(str);
            try {
                httpURLConnectionB.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                outputStream = httpURLConnectionB.getOutputStream();
                try {
                    a(str2, outputStream);
                    int responseCode = httpURLConnectionB.getResponseCode();
                    if (responseCode == 200) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionB.getInputStream()));
                        try {
                            String strA = a(bufferedReader);
                            a(outputStream, httpURLConnectionB, bufferedReader);
                            return strA;
                        } catch (Exception e11) {
                            e10 = e11;
                            try {
                                C3422r4.d().a(e10);
                                IronLog.INTERNAL.error("exception while sending request " + e10.getMessage());
                                a(outputStream, httpURLConnectionB, bufferedReader);
                                return null;
                            } catch (Throwable th3) {
                                th2 = th3;
                                httpURLConnection = httpURLConnectionB;
                                httpURLConnectionB = httpURLConnection;
                                a(outputStream, httpURLConnectionB, bufferedReader);
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            a(outputStream, httpURLConnectionB, bufferedReader);
                            throw th2;
                        }
                    }
                    if (responseCode == 400 && bVar != null) {
                        bVar.a(f36928f);
                    }
                    a(outputStream, httpURLConnectionB, (BufferedReader) null);
                    return null;
                } catch (Exception e12) {
                    e10 = e12;
                    bufferedReader = null;
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error("exception while sending request " + e10.getMessage());
                    a(outputStream, httpURLConnectionB, bufferedReader);
                    return null;
                } catch (Throwable th5) {
                    th2 = th5;
                    bufferedReader = null;
                    httpURLConnection = httpURLConnectionB;
                    httpURLConnectionB = httpURLConnection;
                    a(outputStream, httpURLConnectionB, bufferedReader);
                    throw th2;
                }
            } catch (Exception e13) {
                e10 = e13;
                outputStream = null;
            } catch (Throwable th6) {
                th2 = th6;
                bufferedReader = null;
                outputStream = null;
            }
        } catch (Exception e14) {
            e10 = e14;
            httpURLConnectionB = null;
            outputStream = null;
        } catch (Throwable th7) {
            th2 = th7;
            bufferedReader = null;
            outputStream = null;
            httpURLConnectionB = httpURLConnection;
            a(outputStream, httpURLConnectionB, bufferedReader);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error("exception while closing output stream " + e10.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e11) {
                C3422r4.d().a(e11);
                IronLog.INTERNAL.error("exception while closing reader " + e11.getMessage());
            }
        }
    }
}
