package e8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public float f53939a;

    /* renamed from: b, reason: collision with root package name */
    public int f53940b;

    public void add(float f10) {
        float f11 = this.f53939a + f10;
        this.f53939a = f11;
        int i10 = this.f53940b + 1;
        this.f53940b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f53939a = f11 / 2.0f;
            this.f53940b = i10 / 2;
        }
    }

    public float getMean() {
        int i10 = this.f53940b;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f53939a / i10;
    }
}
