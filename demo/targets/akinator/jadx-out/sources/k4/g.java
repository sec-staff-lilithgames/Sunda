package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f70334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70335c;

    public g(Object obj, int i10, int i11) {
        super(i11, null);
        this.f70334b = obj;
        this.f70335c = i10;
    }

    public final void checkHashCode() {
        Object obj = this.f70334b;
        if ((obj != null ? obj.hashCode() : 0) != this.f70335c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int getHashCode() {
        return this.f70335c;
    }

    public final Object getValue() {
        return this.f70334b;
    }
}
