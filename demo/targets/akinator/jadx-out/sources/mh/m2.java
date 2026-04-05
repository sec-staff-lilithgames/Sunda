package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m2 extends p2 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f74655j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(r2 r2Var, CharSequence charSequence, int i10) {
        super(r2Var, charSequence);
        this.f74655j = i10;
    }

    @Override // mh.p2
    public int separatorStart(int i10) {
        int i11 = i10 + this.f74655j;
        if (i11 < this.f74669e.length()) {
            return i11;
        }
        return -1;
    }

    @Override // mh.p2
    public int separatorEnd(int i10) {
        return i10;
    }
}
