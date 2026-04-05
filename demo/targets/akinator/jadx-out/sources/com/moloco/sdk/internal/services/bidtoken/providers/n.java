package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import uu.o1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n implements m {

    /* renamed from: b, reason: collision with root package name */
    public final List f46906b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public n(List<? extends j> signalProviders) {
        e0.checkNotNullParameter(signalProviders, "signalProviders");
        this.f46906b = signalProviders;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.m, com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        Iterator it = this.f46906b.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.m, com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        List<j> list = this.f46906b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (j jVar : list) {
            boolean zB = jVar.b();
            if (zB) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ClientBidTokenSignalProviderImpl", "[CBT] Signal provider " + jVar.c() + " needs refresh", null, false, 12, null);
            }
            if (zB) {
                return true;
            }
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.m, com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "ClientBidTokenSignalProviderImpl";
    }

    public final List<j> e() {
        return this.f46906b;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.m, com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k d() {
        List list = this.f46906b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(c1.getOrCreateKotlinClass(((j) obj).getClass()), obj);
        }
        Object obj2 = linkedHashMap.get(c1.getOrCreateKotlinClass(x.class));
        e0.checkNotNull(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.SDKInitStateSignalProvider");
        boolean zBooleanValue = ((x) obj2).d().booleanValue();
        Object obj3 = linkedHashMap.get(c1.getOrCreateKotlinClass(w.class));
        e0.checkNotNull(obj3, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.PrivacyStateSignalProvider");
        MolocoPrivacy.PrivacySettings privacySettingsD = ((w) obj3).d();
        Object obj4 = linkedHashMap.get(c1.getOrCreateKotlinClass(t.class));
        e0.checkNotNull(obj4, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.MemorySignalProvider");
        s sVarF = ((t) obj4).d();
        Object obj5 = linkedHashMap.get(c1.getOrCreateKotlinClass(e.class));
        e0.checkNotNull(obj5, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AppDirInfoSignalProvider");
        d dVarD = ((e) obj5).d();
        Object obj6 = linkedHashMap.get(c1.getOrCreateKotlinClass(v.class));
        e0.checkNotNull(obj6, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.NetworkInfoSignalProvider");
        u uVarF = ((v) obj6).d();
        Object obj7 = linkedHashMap.get(c1.getOrCreateKotlinClass(i.class));
        e0.checkNotNull(obj7, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.BatteryInfoSignalProvider");
        h hVarD = ((i) obj7).d();
        Object obj8 = linkedHashMap.get(c1.getOrCreateKotlinClass(c.class));
        e0.checkNotNull(obj8, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AdvertisingSignalProvider");
        com.moloco.sdk.internal.services.o oVarD = ((c) obj8).d();
        Object obj9 = linkedHashMap.get(c1.getOrCreateKotlinClass(p.class));
        e0.checkNotNull(obj9, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.DeviceSignalProvider");
        o oVarF = ((p) obj9).d();
        Object obj10 = linkedHashMap.get(c1.getOrCreateKotlinClass(g.class));
        e0.checkNotNull(obj10, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AudioSignalProvider");
        f fVarD = ((g) obj10).d();
        Object obj11 = linkedHashMap.get(c1.getOrCreateKotlinClass(b.class));
        e0.checkNotNull(obj11, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AccessibilitySignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.a aVarD = ((b) obj11).d();
        Object obj12 = linkedHashMap.get(c1.getOrCreateKotlinClass(r.class));
        e0.checkNotNull(obj12, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.IlrdSignalProvider");
        return new k(zBooleanValue, privacySettingsD, sVarF, dVarD, uVarF, hVarD, oVarD, oVarF, fVarD, aVarD, ((r) obj12).d());
    }
}
