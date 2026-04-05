package x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f91309a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f91310b;

    public a(Object obj, Object obj2) {
        this.f91309a = obj;
        this.f91310b = obj2;
    }

    public final boolean getHasNext() {
        return this.f91310b != y0.c.f93944a;
    }

    public final boolean getHasPrevious() {
        return this.f91309a != y0.c.f93944a;
    }

    public final Object getNext() {
        return this.f91310b;
    }

    public final Object getPrevious() {
        return this.f91309a;
    }

    public final a withNext(Object obj) {
        return new a(this.f91309a, obj);
    }

    public final a withPrevious(Object obj) {
        return new a(obj, this.f91310b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        y0.c cVar = y0.c.f93944a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, y0.c.f93944a);
    }
}
