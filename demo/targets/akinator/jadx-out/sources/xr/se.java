package xr;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class se extends n4 {

    /* renamed from: a, reason: collision with root package name */
    public final m9 f92998a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92999b;

    public se(m9 m9Var) {
        this.f92998a = m9Var;
    }

    @Override // xr.n4, xr.m9
    public void deframeFailed(Throwable th2) {
        this.f92999b = true;
        super.deframeFailed(th2);
    }

    @Override // xr.n4, xr.m9
    public void deframerClosed(boolean z10) {
        this.f92999b = true;
        super.deframerClosed(z10);
    }

    @Override // xr.n4, xr.m9
    public void messagesAvailable(ve veVar) throws IOException {
        if (!this.f92999b) {
            super.messagesAvailable(veVar);
        } else if (veVar instanceof Closeable) {
            c5.closeQuietly((Closeable) veVar);
        }
    }
}
