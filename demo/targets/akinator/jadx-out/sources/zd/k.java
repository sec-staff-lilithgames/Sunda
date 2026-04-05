package zd;

import com.google.android.exoplayer2.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class k implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97837c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w1 f97838e;

    public /* synthetic */ k(b bVar, w1 w1Var, int i10) {
        this.f97836b = i10;
        this.f97837c = bVar;
        this.f97838e = w1Var;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97836b) {
            case 0:
                ((z) dVar).onMediaMetadataChanged(this.f97837c, this.f97838e);
                break;
            default:
                ((z) dVar).onPlaylistMetadataChanged(this.f97837c, this.f97838e);
                break;
        }
    }
}
