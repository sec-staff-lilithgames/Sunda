package androidx.lifecycle;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i3 implements tu.o {

    /* renamed from: b, reason: collision with root package name */
    public final KClass f6608b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.a f6609c;

    /* renamed from: e, reason: collision with root package name */
    public final kv.a f6610e;

    /* renamed from: f, reason: collision with root package name */
    public final kv.a f6611f;

    /* renamed from: g, reason: collision with root package name */
    public g3 f6612g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i3(KClass<g3> viewModelClass, kv.a storeProducer, kv.a factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(storeProducer, "storeProducer");
        kotlin.jvm.internal.e0.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // tu.o
    public boolean isInitialized() {
        return this.f6612g != null;
    }

    public i3(KClass<g3> viewModelClass, kv.a storeProducer, kv.a factoryProducer, kv.a extrasProducer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.e0.checkNotNullParameter(storeProducer, "storeProducer");
        kotlin.jvm.internal.e0.checkNotNullParameter(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.e0.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f6608b = viewModelClass;
        this.f6609c = storeProducer;
        this.f6610e = factoryProducer;
        this.f6611f = extrasProducer;
    }

    @Override // tu.o
    public g3 getValue() {
        g3 g3Var = this.f6612g;
        if (g3Var != null) {
            return g3Var;
        }
        g3 g3Var2 = j3.f6623b.create((m3) this.f6609c.invoke(), (l3) this.f6610e.invoke(), (b5.a) this.f6611f.invoke()).get((KClass<g3>) this.f6608b);
        this.f6612g = g3Var2;
        return g3Var2;
    }

    public /* synthetic */ i3(KClass kClass, kv.a aVar, kv.a aVar2, kv.a aVar3, int i10, kotlin.jvm.internal.u uVar) {
        this(kClass, aVar, aVar2, (i10 & 8) != 0 ? new a1.k(1) : aVar3);
    }
}
