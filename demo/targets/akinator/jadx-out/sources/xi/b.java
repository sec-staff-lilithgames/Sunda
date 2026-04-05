package xi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f92000a;

    /* renamed from: b, reason: collision with root package name */
    public e f92001b = e.f92003b;

    public static b builder() {
        return new b();
    }

    public f build() {
        return new a(this.f92000a, this.f92001b);
    }

    public b intEncoding(e eVar) {
        this.f92001b = eVar;
        return this;
    }

    public b tag(int i10) {
        this.f92000a = i10;
        return this;
    }
}
