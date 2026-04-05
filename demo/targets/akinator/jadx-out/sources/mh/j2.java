package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j2 extends p2 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f74642j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(r2 r2Var, CharSequence charSequence, g0 g0Var) {
        super(r2Var, charSequence);
        this.f74642j = g0Var;
    }

    @Override // mh.p2
    public final int separatorEnd(int i10) {
        return i10 + 1;
    }

    @Override // mh.p2
    public final int separatorStart(int i10) {
        return this.f74642j.indexIn(this.f74669e, i10);
    }
}
