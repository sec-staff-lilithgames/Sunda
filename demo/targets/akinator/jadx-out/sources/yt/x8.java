package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x8 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final int f96562c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96563e;

    public x8(int i10, int i11) {
        this.f96562c = i10;
        this.f96563e = i10 + i11;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        int i10 = this.f96563e;
        int i11 = this.f96562c;
        if (z10) {
            cVar.onSubscribe(new w8((vt.a) cVar, i11, i10, 0));
        } else {
            cVar.onSubscribe(new w8(cVar, i11, i10, 1));
        }
    }
}
