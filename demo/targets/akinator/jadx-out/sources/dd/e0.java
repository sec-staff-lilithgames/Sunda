package dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f52003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52004b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f52005c;

    public e0(Object obj, int i10) {
        this.f52003a = obj;
        this.f52004b = i10;
    }

    public int copyData(Object obj, int i10) {
        Object obj2 = this.f52003a;
        int i11 = this.f52004b;
        System.arraycopy(obj2, 0, obj, i10, i11);
        return i10 + i11;
    }

    public Object getData() {
        return this.f52003a;
    }

    public void linkNext(e0 e0Var) {
        if (this.f52005c != null) {
            throw new IllegalStateException();
        }
        this.f52005c = e0Var;
    }

    public e0 next() {
        return this.f52005c;
    }
}
