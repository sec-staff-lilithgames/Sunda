package pw;

import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class p implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f81944c;

    /* renamed from: e, reason: collision with root package name */
    public int f81945e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f81946f = h1.newLock();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements z0 {

        /* renamed from: b, reason: collision with root package name */
        public final p f81947b;

        /* renamed from: c, reason: collision with root package name */
        public long f81948c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f81949e;

        @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f81949e) {
                return;
            }
            this.f81949e = true;
            p pVar = this.f81947b;
            ReentrantLock lock = pVar.getLock();
            lock.lock();
            try {
                pVar.f81945e--;
                if (pVar.f81945e == 0) {
                    if (pVar.f81944c) {
                        lock.unlock();
                        pVar.d();
                    }
                }
            } finally {
                lock.unlock();
            }
        }

        @Override // pw.z0, java.io.Flushable
        public void flush() {
            if (this.f81949e) {
                throw new IllegalStateException("closed");
            }
            this.f81947b.h();
        }

        public final boolean getClosed() {
            return this.f81949e;
        }

        public final p getFileHandle() {
            return this.f81947b;
        }

        public final long getPosition() {
            return this.f81948c;
        }

        public final void setClosed(boolean z10) {
            this.f81949e = z10;
        }

        public final void setPosition(long j10) {
            this.f81948c = j10;
        }

        @Override // pw.z0
        public d1 timeout() {
            return d1.f81884f;
        }

        @Override // pw.z0
        public void write(g source, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            if (this.f81949e) {
                throw new IllegalStateException("closed");
            }
            this.f81947b.n(this.f81948c, source, j10);
            this.f81948c += j10;
        }

        public a(p pVar, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pVar, KGUkpTlXZlJLy.YJiOfgcdlMfc);
            this.f81947b = pVar;
            this.f81948c = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements b1 {

        /* renamed from: b, reason: collision with root package name */
        public final p f81950b;

        /* renamed from: c, reason: collision with root package name */
        public long f81951c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f81952e;

        public b(p fileHandle, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(fileHandle, "fileHandle");
            this.f81950b = fileHandle;
            this.f81951c = j10;
        }

        @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f81952e) {
                return;
            }
            this.f81952e = true;
            p pVar = this.f81950b;
            ReentrantLock lock = pVar.getLock();
            lock.lock();
            try {
                pVar.f81945e--;
                if (pVar.f81945e == 0) {
                    if (pVar.f81944c) {
                        lock.unlock();
                        pVar.d();
                    }
                }
            } finally {
                lock.unlock();
            }
        }

        public final boolean getClosed() {
            return this.f81952e;
        }

        public final p getFileHandle() {
            return this.f81950b;
        }

        public final long getPosition() {
            return this.f81951c;
        }

        @Override // pw.b1
        public long read(g sink, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            if (this.f81952e) {
                throw new IllegalStateException("closed");
            }
            long jM = this.f81950b.m(this.f81951c, sink, j10);
            if (jM != -1) {
                this.f81951c += jM;
            }
            return jM;
        }

        public final void setClosed(boolean z10) {
            this.f81952e = z10;
        }

        public final void setPosition(long j10) {
            this.f81951c = j10;
        }

        @Override // pw.b1
        public d1 timeout() {
            return d1.f81884f;
        }
    }

    public p(boolean z10) {
        this.f81943b = z10;
    }

    public static /* synthetic */ z0 sink$default(p pVar, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return pVar.sink(j10);
    }

    public static /* synthetic */ b1 source$default(p pVar, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return pVar.source(j10);
    }

    public final z0 appendingSink() throws IOException {
        return sink(size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                return;
            }
            this.f81944c = true;
            if (this.f81945e != 0) {
                return;
            }
            reentrantLock.unlock();
            d();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void d();

    public final void flush() throws IOException {
        if (!this.f81943b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            h();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final ReentrantLock getLock() {
        return this.f81946f;
    }

    public final boolean getReadWrite() {
        return this.f81943b;
    }

    public abstract void h();

    public abstract int i(long j10, byte[] bArr, int i10, int i11);

    public abstract void j(long j10);

    public abstract long k();

    public abstract void l(long j10, byte[] bArr, int i10, int i11);

    public final long m(long j10, g gVar, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(o2.m(j11, "byteCount < 0: ").toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(1);
            int i10 = i(j13, w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, (int) Math.min(j12 - j13, 8192 - r7));
            if (i10 == -1) {
                if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
                    gVar.f81896b = w0VarWritableSegment$okio.pop();
                    x0.recycle(w0VarWritableSegment$okio);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                w0VarWritableSegment$okio.f81996c += i10;
                long j14 = i10;
                j13 += j14;
                gVar.setSize$okio(gVar.size() + j14);
            }
        }
        return j13 - j10;
    }

    public final void n(long j10, g gVar, long j11) {
        pw.b.checkOffsetAndCount(gVar.size(), 0L, j11);
        long j12 = j10 + j11;
        long j13 = j10;
        while (j13 < j12) {
            w0 w0Var = gVar.f81896b;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            int iMin = (int) Math.min(j12 - j13, w0Var.f81996c - w0Var.f81995b);
            l(j13, w0Var.f81994a, w0Var.f81995b, iMin);
            w0Var.f81995b += iMin;
            long j14 = iMin;
            j13 += j14;
            gVar.setSize$okio(gVar.size() - j14);
            if (w0Var.f81995b == w0Var.f81996c) {
                gVar.f81896b = w0Var.pop();
                x0.recycle(w0Var);
            }
        }
    }

    public final long position(b1 source) throws IOException {
        long size;
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (source instanceof v0) {
            v0 v0Var = (v0) source;
            size = v0Var.f81987c.size();
            source = v0Var.f81986b;
        } else {
            size = 0;
        }
        if (!(source instanceof b) || ((b) source).getFileHandle() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar = (b) source;
        if (bVar.getClosed()) {
            throw new IllegalStateException("closed");
        }
        return bVar.getPosition() - size;
    }

    public final int read(long j10, byte[] array, int i10, int i11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return i(j10, array, i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void reposition(b1 source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (!(source instanceof v0)) {
            if (!(source instanceof b) || ((b) source).getFileHandle() != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle");
            }
            b bVar = (b) source;
            if (bVar.getClosed()) {
                throw new IllegalStateException("closed");
            }
            bVar.setPosition(j10);
            return;
        }
        v0 v0Var = (v0) source;
        g gVar = v0Var.f81987c;
        b1 b1Var = v0Var.f81986b;
        if (!(b1Var instanceof b) || ((b) b1Var).getFileHandle() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar2 = (b) b1Var;
        if (bVar2.getClosed()) {
            throw new IllegalStateException("closed");
        }
        long size = gVar.size();
        long position = j10 - (bVar2.getPosition() - size);
        if (0 <= position && position < size) {
            v0Var.skip(position);
        } else {
            gVar.clear();
            bVar2.setPosition(j10);
        }
    }

    public final void resize(long j10) throws IOException {
        if (!this.f81943b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            j(j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final z0 sink(long j10) throws IOException {
        if (!this.f81943b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            this.f81945e++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return k();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final b1 source(long j10) throws IOException {
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            this.f81945e++;
            reentrantLock.unlock();
            return new b(this, j10);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void write(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        if (!this.f81943b) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (this.f81944c) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            l(j10, array, i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long read(long j10, g sink, long j11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        ReentrantLock reentrantLock = this.f81946f;
        reentrantLock.lock();
        try {
            if (!this.f81944c) {
                reentrantLock.unlock();
                return m(j10, sink, j11);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void write(long j10, g source, long j11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (this.f81943b) {
            ReentrantLock reentrantLock = this.f81946f;
            reentrantLock.lock();
            try {
                if (!this.f81944c) {
                    reentrantLock.unlock();
                    n(j10, source, j11);
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final long position(z0 sink) throws IOException {
        long size;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (sink instanceof t0) {
            t0 t0Var = (t0) sink;
            size = t0Var.f81982c.size();
            sink = t0Var.f81981b;
        } else {
            size = 0;
        }
        if ((sink instanceof a) && ((a) sink).getFileHandle() == this) {
            a aVar = (a) sink;
            if (!aVar.getClosed()) {
                return aVar.getPosition() + size;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle");
    }

    public final void reposition(z0 sink, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (sink instanceof t0) {
            t0 t0Var = (t0) sink;
            z0 z0Var = t0Var.f81981b;
            if ((z0Var instanceof a) && ((a) z0Var).getFileHandle() == this) {
                a aVar = (a) z0Var;
                if (!aVar.getClosed()) {
                    t0Var.emit();
                    aVar.setPosition(j10);
                    return;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        if ((sink instanceof a) && ((a) sink).getFileHandle() == this) {
            a aVar2 = (a) sink;
            if (!aVar2.getClosed()) {
                aVar2.setPosition(j10);
                return;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle");
    }
}
