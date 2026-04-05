package com.google.android.exoplayer2;

import com.google.android.exoplayer2.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class i0 implements com.google.android.exoplayer2.util.a0, com.google.android.exoplayer2.util.b0, v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f27520c;

    public /* synthetic */ i0(r0 r0Var, int i10) {
        this.f27519b = i10;
        this.f27520c = r0Var;
    }

    @Override // com.google.android.exoplayer2.util.b0
    public void invoke(Object obj, com.google.android.exoplayer2.util.p pVar) {
        ((p2) obj).onEvents(this.f27520c.f27971f, new o2(pVar));
    }

    @Override // com.google.android.exoplayer2.v0
    public void onPlaybackInfoUpdate(u0.c cVar) {
        r0 r0Var = this.f27520c;
        r0Var.f27977i.post(new af.n(24, r0Var, cVar));
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        p2 p2Var = (p2) obj;
        switch (this.f27519b) {
            case 0:
                p2Var.onPlaylistMetadataChanged(this.f27520c.R);
                break;
            default:
                p2Var.onAvailableCommandsChanged(this.f27520c.P);
                break;
        }
    }
}
