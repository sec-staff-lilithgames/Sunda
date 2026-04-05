package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AtomicInteger f40807b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f40808a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("SocketThreadPool");
            return threadNewThread;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f40810a;

        public b(c cVar) {
            this.f40810a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            this.f40810a.a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static f f40821a = new f(null);
    }

    public /* synthetic */ f(a aVar) {
        this();
    }

    public static f b() {
        return d.f40821a;
    }

    private f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f40808a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    public void a(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
        this.f40808a.execute(new b(new c(str, i10, str2, z10, bVar)));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        private ByteBuffer f40812a;

        /* renamed from: b, reason: collision with root package name */
        private String f40813b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f40814c;

        /* renamed from: d, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.b f40815d;

        /* renamed from: e, reason: collision with root package name */
        private OutputStream f40816e;

        /* renamed from: f, reason: collision with root package name */
        private int f40817f;

        /* renamed from: g, reason: collision with root package name */
        private Socket f40818g;

        /* renamed from: h, reason: collision with root package name */
        private String f40819h;

        public c(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.f40813b = str;
            this.f40817f = i10;
            this.f40819h = str2;
            this.f40814c = z10;
            this.f40815d = bVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        public void a() throws IOException {
            int i10;
            int length;
            try {
                Socket socket = new Socket(this.f40813b, this.f40817f);
                this.f40818g = socket;
                socket.setSoTimeout(15000);
                boolean z10 = this.f40813b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f40852j) || this.f40813b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f40854l);
                p0.b("SocketManager", "Socket connect : " + this.f40813b + " : " + this.f40817f + " isAnalytics : " + z10);
                this.f40816e = this.f40818g.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                this.f40812a = byteBufferWrap;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                this.f40812a.put((byte) 2);
                if (TextUtils.isEmpty(this.f40819h)) {
                    this.f40812a.put((byte) 1);
                    i10 = 1;
                } else {
                    i10 = 1;
                    this.f40812a.put(this.f40814c ? (byte) 3 : (byte) 2);
                }
                this.f40812a.putShort((short) f.f40807b.getAndIncrement());
                if (TextUtils.isEmpty(this.f40819h)) {
                    this.f40812a.putInt(0);
                    this.f40816e.write(this.f40812a.array());
                    length = 0;
                } else {
                    byte[] bArrA = this.f40814c ? f.this.a(this.f40819h) : this.f40819h.getBytes();
                    length = bArrA.length;
                    this.f40812a.putInt(length);
                    this.f40816e.write(this.f40812a.array());
                    this.f40816e.write(bArrA);
                }
                this.f40816e.flush();
                p0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f40812a.array()) + " length : " + length);
                InputStream inputStream = this.f40818g.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                this.f40812a = byteBufferWrap2;
                byteBufferWrap2.order(byteOrder);
                int i11 = this.f40812a.getInt(4);
                byte b10 = bArr[i10];
                boolean z11 = b10 == 3 ? i10 : 0;
                int i12 = b10 == 2 ? i10 : 0;
                p0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i11 + " isGzip : " + z11);
                byte[] bArr2 = new byte[i11];
                new DataInputStream(this.f40818g.getInputStream()).readFully(bArr2);
                int i13 = z11;
                if (z11 == 0) {
                    i13 = z11;
                    if (i11 > 2) {
                        i13 = z11;
                        if (((bArr2[0] << 8) | (bArr2[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 8075) {
                            i13 = i10;
                        }
                    }
                }
                com.mbridge.msdk.foundation.same.net.b bVar = this.f40815d;
                if (bVar == null) {
                    Socket socket2 = this.f40818g;
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            this.f40812a = null;
                            this.f40816e.close();
                            return;
                        } catch (IOException e10) {
                            p0.b("SocketManager", e10.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i12 != 0 && i11 == 0) {
                    bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(204, null, null)));
                    Socket socket3 = this.f40818g;
                    if (socket3 != null) {
                        try {
                            socket3.close();
                            this.f40812a = null;
                            this.f40816e.close();
                            return;
                        } catch (IOException e11) {
                            p0.b("SocketManager", e11.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i11 < i10) {
                    a("The response data less than 1");
                    Socket socket4 = this.f40818g;
                    if (socket4 != null) {
                        try {
                            socket4.close();
                            this.f40812a = null;
                            this.f40816e.close();
                            return;
                        } catch (IOException e12) {
                            p0.b("SocketManager", e12.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z10) {
                    if (bArr2[0] == 1) {
                        bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                    } else {
                        a("The server returns fail");
                    }
                    Socket socket5 = this.f40818g;
                    if (socket5 != null) {
                        try {
                            socket5.close();
                            this.f40812a = null;
                            this.f40816e.close();
                            return;
                        } catch (IOException e13) {
                            p0.b("SocketManager", e13.getMessage());
                            return;
                        }
                    }
                    return;
                }
                try {
                    String strA = i13 != 0 ? f.this.a(bArr2) : new String(bArr2);
                    JSONObject jSONObject = !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null;
                    p0.b("SocketManager", "Socket Response length : " + i11 + " " + strA.length());
                    this.f40815d.onSuccess(e.a(jSONObject, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                } catch (Throwable th2) {
                    String message = th2.getMessage();
                    p0.b("SocketManager", th2.getMessage());
                    if (TextUtils.isEmpty(message)) {
                        message = "The JSON data is illegal";
                    }
                    a(message);
                }
                inputStream.close();
                Socket socket6 = this.f40818g;
                if (socket6 != null) {
                    try {
                        socket6.close();
                        this.f40812a = null;
                        this.f40816e.close();
                    } catch (IOException e14) {
                        p0.b("SocketManager", e14.getMessage());
                    }
                }
            } catch (Throwable th3) {
                try {
                    String message2 = th3.getMessage();
                    p0.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                    Socket socket7 = this.f40818g;
                    if (socket7 != null) {
                        try {
                            socket7.close();
                            this.f40812a = null;
                            this.f40816e.close();
                        } catch (IOException e15) {
                            p0.b("SocketManager", e15.getMessage());
                        }
                    }
                } catch (Throwable th4) {
                    Socket socket8 = this.f40818g;
                    if (socket8 == null) {
                        throw th4;
                    }
                    try {
                        socket8.close();
                        this.f40812a = null;
                        this.f40816e.close();
                        throw th4;
                    } catch (IOException e16) {
                        p0.b("SocketManager", e16.getMessage());
                        throw th4;
                    }
                }
            }
        }

        private void a(String str) {
            if (this.f40815d != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f40815d.onError(new com.mbridge.msdk.foundation.same.net.exception.a(13, new com.mbridge.msdk.foundation.same.net.toolbox.a(404, str.getBytes(), null)));
            }
        }
    }
}
