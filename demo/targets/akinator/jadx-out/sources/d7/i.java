package d7;

import java.io.EOFException;
import java.io.IOException;
import kv.l;
import pw.t;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends t {

    /* renamed from: c, reason: collision with root package name */
    public final l f51914c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51915e;

    public i(z0 z0Var, l lVar) {
        super(z0Var);
        this.f51914c = lVar;
    }

    @Override // pw.t, pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f51915e = true;
            this.f51914c.invoke(e10);
        }
    }

    @Override // pw.t, pw.z0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f51915e = true;
            this.f51914c.invoke(e10);
        }
    }

    @Override // pw.t, pw.z0
    public void write(pw.g gVar, long j10) throws EOFException {
        if (this.f51915e) {
            gVar.skip(j10);
            return;
        }
        try {
            super.write(gVar, j10);
        } catch (IOException e10) {
            this.f51915e = true;
            this.f51914c.invoke(e10);
        }
    }
}
