package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 implements o, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public kv.a f87364b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f87365c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f87366e;

    public c0(kv.a initializer, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializer, "initializer");
        this.f87364b = initializer;
        this.f87365c = r0.f87402a;
        this.f87366e = obj == null ? this : obj;
    }

    @Override // tu.o
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f87365c;
        r0 r0Var = r0.f87402a;
        if (obj != r0Var) {
            return obj;
        }
        synchronized (this.f87366e) {
            objInvoke = this.f87365c;
            if (objInvoke == r0Var) {
                kv.a aVar = this.f87364b;
                kotlin.jvm.internal.e0.checkNotNull(aVar);
                objInvoke = aVar.invoke();
                this.f87365c = objInvoke;
                this.f87364b = null;
            }
        }
        return objInvoke;
    }

    @Override // tu.o
    public boolean isInitialized() {
        return this.f87365c != r0.f87402a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ c0(kv.a aVar, Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
