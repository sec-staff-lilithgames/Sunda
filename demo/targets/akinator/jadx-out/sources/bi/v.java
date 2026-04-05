package bi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class v implements sj.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9595c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f9596a = f9595c;

    /* renamed from: b, reason: collision with root package name */
    public volatile sj.c f9597b;

    public v(sj.c cVar) {
        this.f9597b = cVar;
    }

    @Override // sj.c
    public Object get() {
        Object obj;
        Object obj2 = this.f9596a;
        Object obj3 = f9595c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9596a;
                if (obj == obj3) {
                    obj = this.f9597b.get();
                    this.f9596a = obj;
                    this.f9597b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
