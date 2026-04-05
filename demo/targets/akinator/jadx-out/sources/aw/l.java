package aw;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import pw.t;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l extends t {

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f8311c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z0 delegate, kv.l onException) {
        super(delegate);
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(onException, "onException");
        this.f8311c = onException;
    }

    @Override // pw.t, pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f8312e = true;
            this.f8311c.invoke(e10);
        }
    }

    @Override // pw.t, pw.z0, java.io.Flushable
    public void flush() {
        if (this.f8312e) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f8312e = true;
            this.f8311c.invoke(e10);
        }
    }

    public final kv.l getOnException() {
        return this.f8311c;
    }

    @Override // pw.t, pw.z0
    public void write(pw.g source, long j10) throws EOFException {
        e0.checkNotNullParameter(source, "source");
        if (this.f8312e) {
            source.skip(j10);
            return;
        }
        try {
            super.write(source, j10);
        } catch (IOException e10) {
            this.f8312e = true;
            this.f8311c.invoke(e10);
        }
    }
}
