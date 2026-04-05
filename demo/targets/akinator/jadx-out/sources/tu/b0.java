package tu;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements o, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f87361e;

    /* renamed from: b, reason: collision with root package name */
    public volatile kv.a f87362b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f87363c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f87361e = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
    }

    public b0(kv.a initializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializer, "initializer");
        this.f87362b = initializer;
        this.f87363c = r0.f87402a;
    }

    @Override // tu.o
    public Object getValue() {
        Object obj = this.f87363c;
        r0 r0Var = r0.f87402a;
        if (obj != r0Var) {
            return obj;
        }
        kv.a aVar = this.f87362b;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f87361e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, r0Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != r0Var) {
                }
            }
            this.f87362b = null;
            return objInvoke;
        }
        return this.f87363c;
    }

    @Override // tu.o
    public boolean isInitialized() {
        return this.f87363c != r0.f87402a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
