package com.ironsource;

import com.ironsource.InterfaceC3459t7;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S4 implements InterfaceC3459t7, InterfaceC3459t7.a {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, P4> f35442a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC3459t7
    public O3 a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        P4 p42 = this.f35442a.get(identifier);
        return (p42 == null || p42.a()) ? new O3(false, null, 2, null) : new O3(true, Q3.Delivery);
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public void b(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public Object a(String identifier, Q3 cappingType, InterfaceC3425r7 cappingConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objA = cappingConfig.a();
        boolean zM7137isSuccessimpl = tu.z.m7137isSuccessimpl(objA);
        tu.x0 x0Var = tu.x0.f87415a;
        if (zM7137isSuccessimpl) {
            P4 p42 = (P4) objA;
            if (p42 != null) {
                this.f35442a.put(identifier, p42);
            }
            return tu.z.m7131constructorimpl(x0Var);
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objA);
        if (thM7134exceptionOrNullimpl != null) {
            return tu.z.m7131constructorimpl(tu.a0.createFailure(thM7134exceptionOrNullimpl));
        }
        return tu.z.m7131constructorimpl(x0Var);
    }
}
