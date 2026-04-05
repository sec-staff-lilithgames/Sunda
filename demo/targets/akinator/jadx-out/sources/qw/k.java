package qw;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e0;
import p0.o2;
import pw.a1;
import pw.b1;
import pw.w0;
import pw.x0;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f83581a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f83582b;

    /* renamed from: c, reason: collision with root package name */
    public final b f83583c;

    /* renamed from: d, reason: collision with root package name */
    public final a f83584d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements z0 {

        /* renamed from: b, reason: collision with root package name */
        public final p f83585b;

        public a() {
            this.f83585b = new p(k.this.getSocket());
        }

        @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            k kVar = k.this;
            p pVar = this.f83585b;
            pVar.enter();
            try {
                int bitsOrZero = v.setBitsOrZero(kVar.f83582b, 1);
                if (bitsOrZero != 0) {
                    if (bitsOrZero != 3) {
                        if (!kVar.getSocket().isClosed() && !kVar.getSocket().isOutputShutdown()) {
                            kVar.getSocket().getOutputStream().flush();
                            kVar.getSocket().shutdownOutput();
                        }
                        return;
                    }
                    kVar.getSocket().close();
                    if (pVar.exit()) {
                        throw pVar.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!pVar.exit()) {
                    throw e10;
                }
                throw pVar.access$newTimeoutException(e10);
            } finally {
                pVar.exit();
            }
        }

        @Override // pw.z0, java.io.Flushable
        public void flush() throws IOException {
            k kVar = k.this;
            p pVar = this.f83585b;
            pVar.enter();
            try {
                kVar.getSocket().getOutputStream().flush();
                if (pVar.exit()) {
                    throw pVar.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!pVar.exit()) {
                    throw e10;
                }
                throw pVar.access$newTimeoutException(e10);
            } finally {
                pVar.exit();
            }
        }

        public String toString() {
            return "sink(" + k.this.getSocket() + ')';
        }

        @Override // pw.z0
        public void write(pw.g source, long j10) throws IOException {
            e0.checkNotNullParameter(source, "source");
            pw.b.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                p pVar = this.f83585b;
                pVar.throwIfReached();
                w0 w0Var = source.f81896b;
                e0.checkNotNull(w0Var);
                int iMin = (int) Math.min(j10, w0Var.f81996c - w0Var.f81995b);
                k kVar = k.this;
                pVar.enter();
                try {
                    try {
                        kVar.getSocket().getOutputStream().write(w0Var.f81994a, w0Var.f81995b, iMin);
                        if (pVar.exit()) {
                            throw pVar.access$newTimeoutException(null);
                        }
                        w0Var.f81995b += iMin;
                        long j11 = iMin;
                        j10 -= j11;
                        source.setSize$okio(source.size() - j11);
                        if (w0Var.f81995b == w0Var.f81996c) {
                            source.f81896b = w0Var.pop();
                            x0.recycle(w0Var);
                        }
                    } catch (IOException e10) {
                        if (!pVar.exit()) {
                            throw e10;
                        }
                        throw pVar.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    pVar.exit();
                    throw th2;
                }
            }
        }

        @Override // pw.z0
        public p timeout() {
            return this.f83585b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements b1 {

        /* renamed from: b, reason: collision with root package name */
        public final p f83587b;

        public b() {
            this.f83587b = new p(k.this.getSocket());
        }

        @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            k kVar = k.this;
            p pVar = this.f83587b;
            pVar.enter();
            try {
                int bitsOrZero = v.setBitsOrZero(kVar.f83582b, 2);
                if (bitsOrZero != 0) {
                    if (bitsOrZero != 3) {
                        if (!kVar.getSocket().isClosed() && !kVar.getSocket().isInputShutdown()) {
                            kVar.getSocket().shutdownInput();
                        }
                        return;
                    }
                    kVar.getSocket().close();
                    if (pVar.exit()) {
                        throw pVar.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!pVar.exit()) {
                    throw e10;
                }
                throw pVar.access$newTimeoutException(e10);
            } finally {
                pVar.exit();
            }
        }

        @Override // pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            e0.checkNotNullParameter(sink, "sink");
            if (j10 == 0) {
                return 0L;
            }
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
            }
            p pVar = this.f83587b;
            pVar.throwIfReached();
            w0 w0VarWritableSegment$okio = sink.writableSegment$okio(1);
            int iMin = (int) Math.min(j10, 8192 - w0VarWritableSegment$okio.f81996c);
            try {
                k kVar = k.this;
                pVar.enter();
                try {
                    int i10 = kVar.getSocket().getInputStream().read(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, iMin);
                    if (pVar.exit()) {
                        throw pVar.access$newTimeoutException(null);
                    }
                    if (i10 != -1) {
                        w0VarWritableSegment$okio.f81996c += i10;
                        long j11 = i10;
                        sink.setSize$okio(sink.size() + j11);
                        return j11;
                    }
                    if (w0VarWritableSegment$okio.f81995b != w0VarWritableSegment$okio.f81996c) {
                        return -1L;
                    }
                    sink.f81896b = w0VarWritableSegment$okio.pop();
                    x0.recycle(w0VarWritableSegment$okio);
                    return -1L;
                } catch (IOException e10) {
                    if (pVar.exit()) {
                        throw pVar.access$newTimeoutException(e10);
                    }
                    throw e10;
                } finally {
                    pVar.exit();
                }
            } catch (AssertionError e11) {
                if (w.isAndroidGetsocknameError(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        public String toString() {
            return "source(" + k.this.getSocket() + ')';
        }

        @Override // pw.b1
        public p timeout() {
            return this.f83587b;
        }
    }

    public k(Socket socket) {
        e0.checkNotNullParameter(socket, "socket");
        this.f83581a = socket;
        this.f83582b = new AtomicInteger();
        this.f83583c = new b();
        this.f83584d = new a();
    }

    @Override // pw.a1
    public void cancel() throws IOException {
        this.f83581a.close();
    }

    @Override // pw.a1
    public z0 getSink() {
        return this.f83584d;
    }

    public final Socket getSocket() {
        return this.f83581a;
    }

    @Override // pw.a1
    public b1 getSource() {
        return this.f83583c;
    }

    public String toString() {
        String string = this.f83581a.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
