package s4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85371a;

    /* renamed from: b, reason: collision with root package name */
    public int f85372b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f85373c = -1;

    public b0(int i10) {
        this.f85371a = i10;
    }

    @Override // s4.a0
    public boolean handleEmoji(CharSequence charSequence, int i10, int i11, r0 r0Var) {
        int i12 = this.f85371a;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.f85372b = i10;
        this.f85373c = i11;
        return false;
    }

    @Override // s4.a0
    public b0 getResult() {
        return this;
    }
}
