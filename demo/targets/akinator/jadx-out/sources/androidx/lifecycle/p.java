package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements u1, kotlin.jvm.internal.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6693b;

    public p(n function) {
        kotlin.jvm.internal.e0.checkNotNullParameter(function, "function");
        this.f6693b = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u1) && (obj instanceof kotlin.jvm.internal.x)) {
            return kotlin.jvm.internal.e0.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.x) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.x
    public final tu.i getFunctionDelegate() {
        return this.f6693b;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.u1
    public final /* synthetic */ void onChanged(Object obj) {
        this.f6693b.invoke(obj);
    }
}
