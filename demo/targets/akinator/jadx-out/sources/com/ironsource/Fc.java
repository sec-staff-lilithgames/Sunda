package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Fc extends Ag {

    /* renamed from: e, reason: collision with root package name */
    private final V0 f34379e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3486v0 f34380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fc(V0 tools, AbstractC3486v0 adUnitData) {
        super(tools, adUnitData);
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f34379e = tools;
        this.f34380f = adUnitData;
    }

    private final C3296k2 b() {
        return new C3296k2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, G> c() {
        Hf hfG = this.f34380f.b().g();
        List<NetworkSettings> listM = this.f34380f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (hfG == null || hfG.a(networkSettings, this.f34380f.b().a())) {
                if (!networkSettings.isBidder(this.f34380f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) it.next();
            tu.v vVar = tu.e0.to(networkSettings2.getProviderInstanceName(), new G(this.f34379e, this.f34380f, networkSettings2));
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C3352n2> d() {
        Hf hfG = this.f34380f.b().g();
        List<NetworkSettings> listM = this.f34380f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (hfG == null || hfG.a(networkSettings, this.f34380f.b().a())) {
                if (!networkSettings.isBidder(this.f34380f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3352n2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.Ag
    public void a(C adInstanceFactory, Bg waterfallFetcherListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f34379e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }

    public final void a(Bg waterfallFetcherListener, int i10, String auctionFallback, String auctionId, C adInstanceFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionFallback, "auctionFallback");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C3296k2(auctionId, new JSONObject(), null, i10, auctionFallback), adInstanceFactory);
    }

    private final void a(Bg bg2, C3296k2 c3296k2, C c10) {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f34379e, (String) null, (String) null, 3, (Object) null));
        bg2.a(a(d(), c(), c3296k2, c10));
    }
}
