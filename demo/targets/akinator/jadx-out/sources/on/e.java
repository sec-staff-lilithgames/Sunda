package on;

import gn.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79618c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f79619e;

    public /* synthetic */ e(b bVar, s0 s0Var, int i10) {
        this.f79617b = i10;
        this.f79618c = bVar;
        this.f79619e = s0Var;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79617b) {
            case 0:
                ((c0) dVar).onMediaMetadataChanged(this.f79618c, this.f79619e);
                break;
            default:
                ((c0) dVar).onPlaylistMetadataChanged(this.f79618c, this.f79619e);
                break;
        }
    }
}
