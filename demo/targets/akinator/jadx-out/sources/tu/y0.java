package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 implements o, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public kv.a f87417b;

    /* renamed from: c, reason: collision with root package name */
    public Object f87418c;

    public y0(kv.a initializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializer, "initializer");
        this.f87417b = initializer;
        this.f87418c = r0.f87402a;
    }

    @Override // tu.o
    public Object getValue() {
        if (this.f87418c == r0.f87402a) {
            kv.a aVar = this.f87417b;
            kotlin.jvm.internal.e0.checkNotNull(aVar);
            this.f87418c = aVar.invoke();
            this.f87417b = null;
        }
        return this.f87418c;
    }

    @Override // tu.o
    public boolean isInitialized() {
        return this.f87418c != r0.f87402a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
