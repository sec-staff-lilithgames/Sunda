package de;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements t {
    @Override // de.t
    public n acquireSession(p pVar, z0 z0Var) {
        if (z0Var.f28805q == null) {
            return null;
        }
        return new z(new m(new r0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // de.t
    public int getCryptoType(z0 z0Var) {
        return z0Var.f28805q != null ? 1 : 0;
    }

    @Override // de.t
    public /* bridge */ /* synthetic */ s preacquireSession(p pVar, z0 z0Var) {
        return super.preacquireSession(pVar, z0Var);
    }

    @Override // de.t
    public /* bridge */ /* synthetic */ void prepare() {
        super.prepare();
    }

    @Override // de.t
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // de.t
    public void setPlayer(Looper looper, zd.c0 c0Var) {
    }
}
