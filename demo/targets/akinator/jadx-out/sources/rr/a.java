package rr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final b f84967b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f84968c;

    public a(b bVar) {
        this.f84967b = bVar;
    }

    @Override // rr.b
    public Object get() {
        Object obj = this.f84968c;
        if (obj != null) {
            return obj;
        }
        Object obj2 = this.f84967b.get();
        this.f84968c = obj2;
        return obj2;
    }
}
