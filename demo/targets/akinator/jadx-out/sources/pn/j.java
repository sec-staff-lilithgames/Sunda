package pn;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f81538a;

    public j(p pVar) {
        this.f81538a = pVar;
    }

    @Override // pn.w
    public void onDashManifestPublishTimeExpired(long j10) {
        p pVar = this.f81538a;
        long j11 = pVar.N;
        if (j11 == C.TIME_UNSET || j11 < j10) {
            pVar.N = j10;
        }
    }

    @Override // pn.w
    public void onDashManifestRefreshRequested() {
        p pVar = this.f81538a;
        pVar.D.removeCallbacks(pVar.f81558w);
        pVar.k();
    }
}
