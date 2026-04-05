package w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f90283a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f90284b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f90285c;

    public a(Object obj, Object obj2, Object obj3) {
        this.f90283a = obj;
        this.f90284b = obj2;
        this.f90285c = obj3;
    }

    public final boolean getHasNext() {
        return this.f90285c != y0.c.f93944a;
    }

    public final boolean getHasPrevious() {
        return this.f90284b != y0.c.f93944a;
    }

    public final Object getNext() {
        return this.f90285c;
    }

    public final Object getPrevious() {
        return this.f90284b;
    }

    public final Object getValue() {
        return this.f90283a;
    }

    public final a withNext(Object obj) {
        return new a(this.f90283a, this.f90284b, obj);
    }

    public final a withPrevious(Object obj) {
        return new a(this.f90283a, obj, this.f90285c);
    }

    public final a withValue(Object obj) {
        return new a(obj, this.f90284b, this.f90285c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Object obj) {
        y0.c cVar = y0.c.f93944a;
        this(obj, cVar, cVar);
    }

    public a(Object obj, Object obj2) {
        this(obj, obj2, y0.c.f93944a);
    }
}
