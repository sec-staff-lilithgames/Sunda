package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f43837a = Logger.getLogger(l.class.getName());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f43838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f43839b;

        public a(t tVar, OutputStream outputStream) {
            this.f43838a = tVar;
            this.f43839b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f43818b, 0L, j10);
            while (j10 > 0) {
                this.f43838a.e();
                o oVar = cVar.f43817a;
                int iMin = (int) Math.min(j10, oVar.f43852c - oVar.f43851b);
                this.f43839b.write(oVar.f43850a, oVar.f43851b, iMin);
                int i10 = oVar.f43851b + iMin;
                oVar.f43851b = i10;
                long j11 = iMin;
                j10 -= j11;
                cVar.f43818b -= j11;
                if (i10 == oVar.f43852c) {
                    cVar.f43817a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f43838a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f43839b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.f43839b.flush();
        }

        public String toString() {
            return "sink(" + this.f43839b + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends com.mbridge.msdk.thrid.okio.a {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Socket f43842k;

        public c(Socket socket) {
            this.f43842k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() throws IOException {
            try {
                this.f43842k.close();
            } catch (AssertionError e10) {
                if (!l.a(e10)) {
                    throw e10;
                }
                l.f43837a.log(Level.WARNING, "Failed to close timed out socket " + this.f43842k, (Throwable) e10);
            } catch (Exception e11) {
                l.f43837a.log(Level.WARNING, "Failed to close timed out socket " + this.f43842k, (Throwable) e11);
            }
        }
    }

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f43840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f43841b;

        public b(t tVar, InputStream inputStream) {
            this.f43840a = tVar;
            this.f43841b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f43840a.e();
                o oVarB = cVar.b(1);
                int i10 = this.f43841b.read(oVarB.f43850a, oVarB.f43852c, (int) Math.min(j10, 8192 - oVarB.f43852c));
                if (i10 == -1) {
                    return -1L;
                }
                oVarB.f43852c += i10;
                long j11 = i10;
                cVar.f43818b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (l.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f43841b.close();
        }

        public String toString() {
            return "source(" + this.f43841b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f43840a;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
