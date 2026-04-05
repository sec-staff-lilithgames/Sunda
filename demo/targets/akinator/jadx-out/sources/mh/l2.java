package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l2 extends p2 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f74651j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(r2 r2Var, CharSequence charSequence, i0 i0Var) {
        super(r2Var, charSequence);
        this.f74651j = i0Var;
    }

    @Override // mh.p2
    public int separatorEnd(int i10) {
        return this.f74651j.end();
    }

    @Override // mh.p2
    public int separatorStart(int i10) {
        i0 i0Var = this.f74651j;
        if (i0Var.find(i10)) {
            return i0Var.start();
        }
        return -1;
    }
}
