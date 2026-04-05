package ut;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x implements Callable, st.o {

    /* renamed from: b, reason: collision with root package name */
    public final Object f88695b;

    public x(Object obj) {
        this.f88695b = obj;
    }

    @Override // st.o
    public Object apply(Object obj) throws Exception {
        return this.f88695b;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f88695b;
    }
}
