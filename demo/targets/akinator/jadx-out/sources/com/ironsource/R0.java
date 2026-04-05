package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R0 extends com.ironsource.mediationsdk.h {

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, J> f35377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(List<? extends NetworkSettings> providers, int i10) {
        super(providers, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(providers, "providers");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(providers, 10)), 16));
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            tu.v vVar = tu.e0.to(((NetworkSettings) it.next()).getProviderName(), new J(i10));
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        this.f35377e = linkedHashMap;
    }

    public final void a(Cg waterfallInstances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        List<AbstractC3553z> listB = waterfallInstances.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(listB, 10)), 16));
        for (AbstractC3553z abstractC3553z : listB) {
            tu.v vVar = tu.e0.to(abstractC3553z.p(), abstractC3553z.s());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        a(linkedHashMap);
    }

    @Override // com.ironsource.mediationsdk.h
    public String a(String instanceName) {
        String strD;
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceName, "instanceName");
        J j10 = this.f35377e.get(instanceName);
        return (j10 == null || (strD = j10.d()) == null) ? "" : strD;
    }

    private final void a(Map<String, H> map) {
        for (Map.Entry<String, J> entry : this.f35377e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
