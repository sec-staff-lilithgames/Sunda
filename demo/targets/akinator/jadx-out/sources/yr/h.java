package yr;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements as.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f94908f = Logger.getLogger(d0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final g f94909b;

    /* renamed from: c, reason: collision with root package name */
    public final as.d f94910c;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f94911e;

    public h(g gVar, i iVar) {
        Level level = Level.FINE;
        this.f94911e = new g0(d0.class);
        this.f94909b = (g) p1.checkNotNull(gVar, "transportExceptionHandler");
        this.f94910c = (as.d) p1.checkNotNull(iVar, "frameWriter");
    }

    @Override // as.d
    public void ackSettings(as.p pVar) {
        g0 g0Var = this.f94911e;
        if (g0Var.a()) {
            g0Var.f94902a.log(g0Var.f94903b, e0.f94877c + " SETTINGS: ack=true");
        }
        try {
            this.f94910c.ackSettings(pVar);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f94910c.close();
        } catch (IOException e10) {
            f94908f.log(e10.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // as.d
    public void connectionPreface() {
        try {
            this.f94910c.connectionPreface();
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void data(boolean z10, int i10, pw.g gVar, int i11) {
        this.f94911e.b(e0.f94877c, i10, gVar.buffer(), i11, z10);
        try {
            this.f94910c.data(z10, i10, gVar, i11);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void flush() {
        try {
            this.f94910c.flush();
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void goAway(int i10, as.a aVar, byte[] bArr) {
        as.d dVar = this.f94910c;
        this.f94911e.c(e0.f94877c, i10, aVar, pw.l.of(bArr));
        try {
            dVar.goAway(i10, aVar, bArr);
            dVar.flush();
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void headers(int i10, List<as.e> list) {
        this.f94911e.d(e0.f94877c, i10, list, false);
        try {
            this.f94910c.headers(i10, list);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public int maxDataLength() {
        return this.f94910c.maxDataLength();
    }

    @Override // as.d
    public void ping(boolean z10, int i10, int i11) {
        e0 e0Var = e0.f94877c;
        g0 g0Var = this.f94911e;
        if (z10) {
            g0Var.f(e0Var, (4294967295L & i11) | (i10 << 32));
        } else {
            g0Var.e(e0Var, (4294967295L & i11) | (i10 << 32));
        }
        try {
            this.f94910c.ping(z10, i10, i11);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void pushPromise(int i10, int i11, List<as.e> list) {
        this.f94911e.g(e0.f94877c, i10, i11, list);
        try {
            this.f94910c.pushPromise(i10, i11, list);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void rstStream(int i10, as.a aVar) {
        this.f94911e.h(e0.f94877c, i10, aVar);
        try {
            this.f94910c.rstStream(i10, aVar);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void settings(as.p pVar) {
        this.f94911e.i(e0.f94877c, pVar);
        try {
            this.f94910c.settings(pVar);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void synReply(boolean z10, int i10, List<as.e> list) {
        try {
            this.f94910c.synReply(z10, i10, list);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void synStream(boolean z10, boolean z11, int i10, int i11, List<as.e> list) {
        try {
            this.f94910c.synStream(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }

    @Override // as.d
    public void windowUpdate(int i10, long j10) {
        this.f94911e.j(e0.f94877c, i10, j10);
        try {
            this.f94910c.windowUpdate(i10, j10);
        } catch (IOException e10) {
            this.f94909b.onException(e10);
        }
    }
}
