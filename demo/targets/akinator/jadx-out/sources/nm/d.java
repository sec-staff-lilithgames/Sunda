package nm;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d {
    private static final mr.c TASK_MANAGER = new nr.c();
    private nm.b callback;
    private nm.c cancelCallback;
    private ArrayList<c> contentEncoders;
    private URLConnection currentConnection;
    private g currentState = g.f77041b;
    private b dataBinder;
    private ArrayList<c> dataEncoders;
    private Object errorResult;
    private final e method;
    private final String path;
    private final Object requestData;
    private Object requestResult;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends c {
        @Override // nm.d.c
        public final byte[] a(URLConnection uRLConnection, byte[] bArr) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream byteArrayInputStream;
            Throwable th2;
            InputStream gZIPInputStream;
            if (!"gzip".equals(uRLConnection.getContentEncoding())) {
                return bArr;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i10 = gZIPInputStream.read(bArr2);
                                if (i10 == -1) {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    j.flush(byteArrayOutputStream);
                                    j.close(byteArrayOutputStream);
                                    j.close(byteArrayInputStream);
                                    j.close(gZIPInputStream);
                                    return byteArray;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            j.flush(byteArrayOutputStream);
                            j.close(byteArrayOutputStream);
                            j.close(byteArrayInputStream);
                            j.close(gZIPInputStream);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        gZIPInputStream = null;
                        th2 = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayInputStream = null;
                    th2 = th;
                    gZIPInputStream = byteArrayInputStream;
                    j.flush(byteArrayOutputStream);
                    j.close(byteArrayOutputStream);
                    j.close(byteArrayInputStream);
                    j.close(gZIPInputStream);
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                byteArrayInputStream = null;
            }
        }

        @Override // nm.d.c
        public final byte[] b(byte[] bArr) throws Throwable {
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                }
                try {
                    gZIPOutputStream.write(bArr);
                    j.close(gZIPOutputStream);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    j.flush(byteArrayOutputStream2);
                    j.close(byteArrayOutputStream2);
                    j.flush(null);
                    j.close(null);
                    return byteArray;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    j.flush(byteArrayOutputStream);
                    j.close(byteArrayOutputStream);
                    j.flush(gZIPOutputStream);
                    j.close(gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
            }
        }

        @Override // nm.d.c
        public final void c(URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
    }

    public d(e eVar, String str, Object obj) {
        this.method = eVar;
        this.path = str;
        this.requestData = obj;
    }

    public static void access$100(d dVar) {
        URLConnection uRLConnection;
        URL url;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2;
        b bVar;
        BufferedOutputStream bufferedOutputStream;
        g gVar = g.f77044f;
        g gVar2 = g.f77043e;
        dVar.currentState = g.f77042c;
        try {
            if (dVar.path != null) {
                url = new URL(dVar.getBaseUrl() + "/" + dVar.path);
            } else {
                url = new URL(dVar.getBaseUrl());
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            try {
                dVar.currentConnection = uRLConnectionOpenConnection;
                dVar.method.apply(uRLConnectionOpenConnection);
                dVar.prepareRequestParams(uRLConnectionOpenConnection);
                byte[] bArrObtainRequestData = dVar.obtainRequestData(uRLConnectionOpenConnection);
                if (bArrObtainRequestData != null) {
                    byte[] bArrEncodeRequestData = dVar.encodeRequestData(uRLConnectionOpenConnection, bArrObtainRequestData);
                    uRLConnectionOpenConnection.setDoOutput(true);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(uRLConnectionOpenConnection.getOutputStream());
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = null;
                    }
                    try {
                        bufferedOutputStream.write(bArrEncodeRequestData);
                        j.flush(bufferedOutputStream);
                        j.close(bufferedOutputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        j.flush(bufferedOutputStream);
                        j.close(bufferedOutputStream);
                        throw th;
                    }
                }
                try {
                    int responseCode = uRLConnectionOpenConnection instanceof HttpURLConnection ? ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode() : -1;
                    if (dVar.isCanceled()) {
                        j.flush(null);
                        j.close(null);
                        j.close(null);
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                        }
                        dVar.currentConnection = null;
                        if (dVar.isCanceled()) {
                            return;
                        }
                        if (dVar.errorResult == null) {
                            gVar = gVar2;
                        }
                        dVar.currentState = gVar;
                        return;
                    }
                    if (responseCode != 200) {
                        dVar.errorResult = dVar.obtainError(uRLConnectionOpenConnection, responseCode);
                        inputStream2 = null;
                        byteArrayOutputStream = null;
                    } else {
                        inputStream2 = uRLConnectionOpenConnection.getInputStream();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } catch (Throwable th4) {
                            inputStream = inputStream2;
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i10 = inputStream2.read(bArr);
                                if (i10 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray != null) {
                                byteArray = dVar.decodeResponseData(uRLConnectionOpenConnection, byteArray);
                            }
                            if (byteArray != null && byteArray.length > 0 && (bVar = dVar.dataBinder) != null) {
                                Object objCreateSuccessResult = bVar.createSuccessResult(dVar, uRLConnectionOpenConnection, byteArray);
                                dVar.requestResult = objCreateSuccessResult;
                                if (objCreateSuccessResult == null) {
                                    dVar.errorResult = dVar.dataBinder.createFailResult(dVar, uRLConnectionOpenConnection, byteArray);
                                }
                            }
                        } catch (Throwable th5) {
                            inputStream = inputStream2;
                            th = th5;
                            j.flush(byteArrayOutputStream);
                            j.close(byteArrayOutputStream);
                            j.close(inputStream);
                            throw th;
                        }
                    }
                    j.flush(byteArrayOutputStream);
                    j.close(byteArrayOutputStream);
                    j.close(inputStream2);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    }
                    dVar.currentConnection = null;
                    if (dVar.isCanceled()) {
                        return;
                    }
                    if (dVar.errorResult == null) {
                        gVar = gVar2;
                    }
                    dVar.currentState = gVar;
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th7) {
                uRLConnection = uRLConnectionOpenConnection;
                th = th7;
                try {
                    nm.a.w(th);
                    dVar.errorResult = dVar.obtainError(uRLConnection, th);
                } finally {
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    dVar.currentConnection = null;
                    if (!dVar.isCanceled()) {
                        if (dVar.errorResult == null) {
                            gVar = gVar2;
                        }
                        dVar.currentState = gVar;
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
            uRLConnection = null;
        }
    }

    public void addContentEncoder(c cVar) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(cVar);
    }

    public void addDataEncoder(c cVar) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(cVar);
    }

    public void cancel() {
        this.currentState = g.f77045g;
        nm.c cVar = this.cancelCallback;
        if (cVar != null) {
            cVar.onCanceled();
        }
    }

    public byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<c> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<c> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().a(uRLConnection, bArr);
            }
        }
        ArrayList<c> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<c> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().a(uRLConnection, bArr);
            }
        }
        return bArr;
    }

    public byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<c> arrayList = this.dataEncoders;
        if (arrayList != null) {
            Iterator<c> it = arrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                next.c(uRLConnection);
                bArr = next.b(bArr);
            }
        }
        ArrayList<c> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            Iterator<c> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c next2 = it2.next();
                next2.c(uRLConnection);
                bArr = next2.b(bArr);
            }
        }
        return bArr;
    }

    public String getBaseUrl() {
        return "TODO: implement url";
    }

    public e getMethod() {
        return this.method;
    }

    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        return this.currentState == g.f77045g;
    }

    public abstract Object obtainError(URLConnection uRLConnection, int i10);

    public abstract Object obtainError(URLConnection uRLConnection, Throwable th2);

    public byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        b bVar = this.dataBinder;
        if (bVar == null) {
            return null;
        }
        bVar.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    public void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }

    public void request() {
        request(TASK_MANAGER);
    }

    public void setCallback(nm.b bVar) {
        this.callback = bVar;
    }

    public void setCancelCallback(nm.c cVar) {
        this.cancelCallback = cVar;
    }

    public void setDataBinder(b bVar) {
        this.dataBinder = bVar;
    }

    public void request(mr.c cVar) {
        try {
            cVar.execute(new f(this));
        } catch (Throwable th2) {
            nm.a.w(th2);
            nm.b bVar = this.callback;
            if (bVar != null) {
                bVar.onFail(obtainError((URLConnection) null, th2));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {
        public abstract byte[] a(URLConnection uRLConnection, byte[] bArr);

        public abstract byte[] b(byte[] bArr);

        public void c(URLConnection uRLConnection) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public Object createFailResult(d dVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        public abstract Object createSuccessResult(d dVar, URLConnection uRLConnection, byte[] bArr) throws Exception;

        public abstract byte[] obtainData(d dVar, URLConnection uRLConnection, Object obj) throws Exception;

        public abstract void prepareHeaders(d dVar, URLConnection uRLConnection);

        public void prepareRequest(d dVar, URLConnection uRLConnection) {
        }
    }
}
