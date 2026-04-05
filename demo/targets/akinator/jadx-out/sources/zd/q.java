package zd;

import com.google.android.exoplayer2.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class q implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97856c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j2 f97857e;

    public /* synthetic */ q(b bVar, j2 j2Var, int i10) {
        this.f97855b = i10;
        this.f97856c = bVar;
        this.f97857e = j2Var;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97855b) {
            case 0:
                ((z) dVar).onPlayerError(this.f97856c, this.f97857e);
                break;
            default:
                ((z) dVar).onPlayerErrorChanged(this.f97856c, this.f97857e);
                break;
        }
    }
}
