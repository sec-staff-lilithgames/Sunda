package yg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f94419a;

    /* renamed from: b, reason: collision with root package name */
    public final float f94420b;

    public d0(int i10, float f10) {
        this.f94419a = i10;
        this.f94420b = f10;
    }

    public int getChange(int i10) {
        float f10 = this.f94420b;
        int i11 = this.f94419a;
        if (i11 == 1) {
            return (int) (f10 * i10);
        }
        if (i11 == 2) {
            return (int) f10;
        }
        return 0;
    }
}
