package com.ironsource;

import com.ironsource.InterfaceC3459t7;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Zc implements InterfaceC3459t7, InterfaceC3459t7.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3456t4 f35883a;

    /* renamed from: b, reason: collision with root package name */
    private final M7 f35884b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Yc> f35885c;

    public Zc(InterfaceC3456t4 currentTimeProvider, M7 repository) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(repository, "repository");
        this.f35883a = currentTimeProvider;
        this.f35884b = repository;
        this.f35885c = new LinkedHashMap();
    }

    public final Map<String, Yc> a() {
        return this.f35885c;
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public void b(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        if (this.f35885c.get(identifier) == null) {
            return;
        }
        this.f35884b.a(this.f35883a.a(), identifier);
    }

    private final boolean a(Yc yc2, String str) {
        Long lA = this.f35884b.a(str);
        return lA != null && this.f35883a.a() - lA.longValue() < yc2.a();
    }

    @Override // com.ironsource.InterfaceC3459t7
    public O3 a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        Yc yc2 = this.f35885c.get(identifier);
        if (yc2 == null) {
            return new O3(false, null, 2, null);
        }
        if (a(yc2, identifier)) {
            return new O3(true, Q3.Pacing);
        }
        return new O3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public Object a(String identifier, Q3 cappingType, InterfaceC3425r7 cappingConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objB = cappingConfig.b();
        boolean zM7137isSuccessimpl = tu.z.m7137isSuccessimpl(objB);
        tu.x0 x0Var = tu.x0.f87415a;
        if (zM7137isSuccessimpl) {
            Yc yc2 = (Yc) objB;
            if (yc2 != null) {
                this.f35885c.put(identifier, yc2);
            }
            return tu.z.m7131constructorimpl(x0Var);
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objB);
        if (thM7134exceptionOrNullimpl != null) {
            return tu.z.m7131constructorimpl(tu.a0.createFailure(thM7134exceptionOrNullimpl));
        }
        return tu.z.m7131constructorimpl(x0Var);
    }
}
