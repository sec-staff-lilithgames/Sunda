package sn;

import android.os.Looper;
import com.facebook.ads.AdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements v {
    @Override // sn.v
    public o acquireSession(q qVar, io.bidmachine.media3.common.b bVar) {
        if (bVar.f60669s == null) {
            return null;
        }
        return new a0(new n(new r0(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // sn.v
    public int getCryptoType(io.bidmachine.media3.common.b bVar) {
        return bVar.f60669s != null ? 1 : 0;
    }

    @Override // sn.v
    public /* bridge */ /* synthetic */ u preacquireSession(q qVar, io.bidmachine.media3.common.b bVar) {
        return super.preacquireSession(qVar, bVar);
    }

    @Override // sn.v
    public /* bridge */ /* synthetic */ void prepare() {
        super.prepare();
    }

    @Override // sn.v
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // sn.v
    public void setPlayer(Looper looper, on.f0 f0Var) {
    }
}
