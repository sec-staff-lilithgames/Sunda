package o9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 implements androidx.viewpager.widget.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f78656b;

    public x0(a1 a1Var) {
        this.f78656b = a1Var;
    }

    @Override // androidx.viewpager.widget.i
    public void onPageSelected(int i10) {
        int i11 = 0;
        while (true) {
            a1 a1Var = this.f78656b;
            if (i11 >= a1Var.f78018c.getCount()) {
                return;
            }
            a1Var.a(i11, i11 == i10);
            i11++;
        }
    }

    @Override // androidx.viewpager.widget.i
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.i
    public void onPageScrolled(int i10, float f10, int i11) {
    }
}
