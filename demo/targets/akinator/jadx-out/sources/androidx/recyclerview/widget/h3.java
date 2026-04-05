package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7135a;

    /* renamed from: b, reason: collision with root package name */
    public int f7136b;

    /* renamed from: c, reason: collision with root package name */
    public int f7137c;

    /* renamed from: d, reason: collision with root package name */
    public int f7138d;

    /* renamed from: e, reason: collision with root package name */
    public int f7139e;

    public final boolean a() {
        int i10 = this.f7135a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f7138d;
            int i13 = this.f7136b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f7138d;
            int i15 = this.f7137c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f7139e;
            int i17 = this.f7136b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f7139e;
            int i19 = this.f7137c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
