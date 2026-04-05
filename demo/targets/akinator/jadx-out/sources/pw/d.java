package pw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f81881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f81882c;

    public d(c cVar, z0 z0Var) {
        this.f81881b = cVar;
        this.f81882c = z0Var;
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        z0 z0Var = this.f81882c;
        c cVar = this.f81881b;
        cVar.enter();
        try {
            z0Var.close();
            if (cVar.exit()) {
                throw cVar.access$newTimeoutException(null);
            }
        } catch (IOException e10) {
            if (!cVar.exit()) {
                throw e10;
            }
            throw cVar.access$newTimeoutException(e10);
        } finally {
            cVar.exit();
        }
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        z0 z0Var = this.f81882c;
        c cVar = this.f81881b;
        cVar.enter();
        try {
            z0Var.flush();
            if (cVar.exit()) {
                throw cVar.access$newTimeoutException(null);
            }
        } catch (IOException e10) {
            if (!cVar.exit()) {
                throw e10;
            }
            throw cVar.access$newTimeoutException(e10);
        } finally {
            cVar.exit();
        }
    }

    public String toString() {
        return "AsyncTimeout.sink(" + this.f81882c + ')';
    }

    @Override // pw.z0
    public void write(g source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        b.checkOffsetAndCount(source.size(), 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 <= 0) {
                return;
            }
            w0 w0Var = source.f81896b;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            while (true) {
                if (j11 >= 65536) {
                    break;
                }
                j11 += w0Var.f81996c - w0Var.f81995b;
                if (j11 >= j10) {
                    j11 = j10;
                    break;
                } else {
                    w0Var = w0Var.f81999f;
                    kotlin.jvm.internal.e0.checkNotNull(w0Var);
                }
            }
            z0 z0Var = this.f81882c;
            c cVar = this.f81881b;
            cVar.enter();
            try {
                try {
                    z0Var.write(source, j11);
                    if (cVar.exit()) {
                        throw cVar.access$newTimeoutException(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!cVar.exit()) {
                        throw e10;
                    }
                    throw cVar.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                cVar.exit();
                throw th2;
            }
        }
    }

    @Override // pw.z0
    public c timeout() {
        return this.f81881b;
    }
}
