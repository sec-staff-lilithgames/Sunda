package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f89812a = true;

    public boolean compare(Object obj, Object obj2) {
        if (obj2 != null) {
            this.f89812a = obj2.equals(obj);
        } else if (obj != null) {
            this.f89812a = obj.equals(Double.valueOf(1.0d));
        }
        return this.f89812a;
    }

    public double getDefault() {
        return 1.0d;
    }

    public boolean isEqual() {
        return this.f89812a;
    }
}
