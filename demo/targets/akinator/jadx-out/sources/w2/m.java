package w2;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f90357j;

    public m(n nVar) {
        this.f90357j = nVar;
    }

    @Override // w2.i
    public final String h() {
        j jVar = (j) this.f90357j.f90358b.get();
        return jVar == null ? "Completer object has been garbage collected, future will fail soon" : w0.i.e(new StringBuilder("tag=["), jVar.f90353a, C3191e4.i.f36531e);
    }
}
