package com.mbridge.msdk.foundation.same.report;

import android.util.Log;
import com.mbridge.msdk.tracker.network.t;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class m extends com.mbridge.msdk.tracker.network.toolbox.a {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f40946b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final byte f40947a;

    public m(byte b10) {
        this.f40947a = b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public com.mbridge.msdk.tracker.network.toolbox.g a(t<?> tVar, Map<String, String> map) throws IOException {
        ?? r02;
        ByteBuffer byteBuffer;
        ByteBuffer byteBufferWrap;
        OutputStream outputStream;
        ByteOrder byteOrder;
        byte[] bArr;
        ByteBuffer byteBufferWrap2;
        if (com.mbridge.msdk.tracker.a.f43882a) {
            Log.d("TrackManager_Volley", "SocketStack executeRequest " + tVar.t() + ":" + tVar.k());
        }
        Socket socket = null;
        try {
            Socket socket2 = new Socket(tVar.t(), tVar.k());
            try {
                socket2.setSoTimeout(tVar.q());
                OutputStream outputStream2 = socket2.getOutputStream();
                try {
                    if (outputStream2 == null) {
                        throw new IOException("create outputStream exception");
                    }
                    byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                    try {
                        byteOrder = ByteOrder.BIG_ENDIAN;
                        byteBufferWrap.order(byteOrder);
                        byteBufferWrap.put(this.f40947a);
                        byte[] bArrB = tVar.b();
                        if (bArrB == null || bArrB.length == 0) {
                            byteBufferWrap.put((byte) 1);
                        } else {
                            byteBufferWrap.put((byte) 3);
                        }
                        byteBufferWrap.putShort((short) f40946b.getAndIncrement());
                        if (bArrB == null || bArrB.length == 0) {
                            byteBufferWrap.putInt(0);
                            outputStream2.write(byteBufferWrap.array());
                        } else {
                            byte[] bArrA = a(bArrB);
                            byteBufferWrap.putInt(bArrA == null ? 0 : bArrA.length);
                            outputStream2.write(byteBufferWrap.array());
                            outputStream2.write(bArrA);
                        }
                        outputStream2.flush();
                        bArr = new byte[8];
                        socket2.getInputStream().read(bArr, 0, 8);
                        byteBufferWrap2 = ByteBuffer.wrap(bArr);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        byteBuffer = null;
                    }
                    try {
                        byteBufferWrap2.order(byteOrder);
                        int i10 = byteBufferWrap2.getInt(4);
                        boolean z10 = bArr[1] == 2;
                        byte[] bArr2 = new byte[i10];
                        new DataInputStream(socket2.getInputStream()).readFully(bArr2);
                        if (z10 && i10 == 0) {
                            com.mbridge.msdk.tracker.network.toolbox.g gVar = new com.mbridge.msdk.tracker.network.toolbox.g(204, new ArrayList(), i10, null);
                            a(outputStream2);
                            a(socket2);
                            a(byteBufferWrap);
                            a(byteBufferWrap2);
                            return gVar;
                        }
                        if (i10 < 1) {
                            com.mbridge.msdk.tracker.network.toolbox.g gVar2 = new com.mbridge.msdk.tracker.network.toolbox.g(500, new ArrayList(), 0, null);
                            a(outputStream2);
                            a(socket2);
                            a(byteBufferWrap);
                            a(byteBufferWrap2);
                            return gVar2;
                        }
                        if (bArr2[0] == 1) {
                            com.mbridge.msdk.tracker.network.toolbox.g gVar3 = new com.mbridge.msdk.tracker.network.toolbox.g(200, new ArrayList(), i10, null);
                            a(outputStream2);
                            a(socket2);
                            a(byteBufferWrap);
                            a(byteBufferWrap2);
                            return gVar3;
                        }
                        com.mbridge.msdk.tracker.network.toolbox.g gVar4 = new com.mbridge.msdk.tracker.network.toolbox.g(500, new ArrayList(), 0, null);
                        a(outputStream2);
                        a(socket2);
                        a(byteBufferWrap);
                        a(byteBufferWrap2);
                        return gVar4;
                    } catch (Throwable th3) {
                        outputStream = outputStream2;
                        byteBuffer = byteBufferWrap2;
                        th = th3;
                        socket = outputStream;
                        r02 = socket;
                        socket = socket2;
                        try {
                            throw new IOException(th);
                        } catch (Throwable th4) {
                            a((OutputStream) r02);
                            a(socket);
                            a(byteBufferWrap);
                            a(byteBuffer);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    byteBufferWrap = null;
                    socket = outputStream2;
                    byteBuffer = null;
                }
            } catch (Throwable th6) {
                th = th6;
                byteBuffer = null;
                byteBufferWrap = null;
            }
        } catch (Throwable th7) {
            th = th7;
            r02 = 0;
            byteBuffer = null;
            byteBufferWrap = null;
        }
    }

    public byte[] a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    private void a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
