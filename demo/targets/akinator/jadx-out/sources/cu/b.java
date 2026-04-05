package cu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f50944a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f50945b;

    /* renamed from: c, reason: collision with root package name */
    public final st.b f50946c;

    public b(lu.b bVar, Callable<Object> callable, st.b bVar2) {
        this.f50944a = bVar;
        this.f50945b = callable;
        this.f50946c = bVar2;
    }

    @Override // lu.b
    public int parallelism() {
        return this.f50944a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    cVarArr2[i10] = new a(cVarArr[i10], ut.o0.requireNonNull(this.f50945b.call(), "The initialSupplier returned a null value"), this.f50946c);
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    for (tw.c cVar : cVarArr) {
                        hu.d.error(th2, cVar);
                    }
                    return;
                }
            }
            this.f50944a.subscribe(cVarArr2);
        }
    }
}
