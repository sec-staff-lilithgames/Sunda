package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ag {

    /* renamed from: d, reason: collision with root package name */
    public static final a f33850d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final V0 f33851a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3486v0 f33852b;

    /* renamed from: c, reason: collision with root package name */
    private final Xc f33853c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Ag a(V0 adTools, AbstractC3486v0 adUnitData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C3404q2(adTools, adUnitData) : new Fc(adTools, adUnitData);
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Xc {
    }

    public Ag(V0 adTools, AbstractC3486v0 adUnitData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f33851a = adTools;
        this.f33852b = adUnitData;
        this.f33853c = new b();
    }

    public Xc a() {
        return this.f33853c;
    }

    public abstract void a(C c10, Bg bg2);

    public final Cg a(List<? extends C3352n2> waterfallItems, Map<String, G> adInstancePayloads, C3296k2 auctionData, C adInstanceFactory) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallItems, "waterfallItems");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f33851a, a.b.e(waterfallItems.size(), "waterfall.size() = "), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3352n2 c3352n2 = waterfallItems.get(i10);
            AbstractC3553z abstractC3553zA = a(c3352n2, auctionData, adInstanceFactory, adInstancePayloads.get(c3352n2.c()));
            if (abstractC3553zA != null && abstractC3553zA.g() != null) {
                arrayList.add(abstractC3553zA);
            }
        }
        Cg cg2 = new Cg(arrayList);
        IronLog.INTERNAL.verbose(C3350n0.a(this.f33851a, "updateWaterfall() - next waterfall is " + cg2 + ".toWaterfallString()", (String) null, 2, (Object) null));
        return cg2;
    }

    private final AbstractC3553z a(C3352n2 c3352n2, C3296k2 c3296k2, C c10, G g8) throws JSONException {
        AbstractC3486v0 abstractC3486v0 = this.f33852b;
        String strC = c3352n2.c();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC, "item.instanceName");
        NetworkSettings networkSettingsA = abstractC3486v0.a(strC);
        if (networkSettingsA == null) {
            String strC2 = c3352n2.c();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC2, "item.instanceName");
            a("Could not find matching provider settings for auction response item", strC2);
            return null;
        }
        if (g8 == null) {
            String strC3 = c3352n2.c();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC3, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", strC3);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f33852b.b().a(), this.f33852b.b().b());
        int iF = this.f33851a.f();
        AbstractC3486v0 abstractC3486v02 = this.f33852b;
        return c10.a(new A(abstractC3486v02, networkSettingsA, c3296k2, new C3134b1(networkSettingsA, abstractC3486v02.b(networkSettingsA), this.f33852b.b().a()), c3352n2, iF), g8);
    }

    private final void a(String str, String str2) {
        String strD = w0.i.d(str, " - item = ", str2);
        IronLog.INTERNAL.error(C3350n0.a(this.f33851a, strD, (String) null, 2, (Object) null));
        this.f33851a.e().h().i(strD);
    }
}
