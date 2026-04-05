package com.ironsource;

import android.app.Activity;
import com.ironsource.C3191e4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3318l6 extends AbstractC3553z implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* renamed from: x, reason: collision with root package name */
    private WeakReference<InterfaceC3336m6> f37158x;

    /* renamed from: y, reason: collision with root package name */
    private C3317l5 f37159y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3318l6(V0 adTools, A instanceData, G adInstancePayload, InterfaceC3336m6 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f37158x = new WeakReference<>(listener);
    }

    private final void O() {
        IronLog.INTERNAL.verbose(AbstractC3553z.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void P() {
        IronLog.INTERNAL.verbose(AbstractC3553z.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3318l6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3318l6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3318l6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    @Override // com.ironsource.AbstractC3553z
    public void A() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objG).loadAd(n().g(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.AbstractC3553z
    public void a(I adInstancePresenter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC3553z
    public void c() {
        if (Mb.f34856s.d().g().i()) {
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
                return;
            }
            Object objG = g();
            kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
            ((AdapterAdFullScreenInterface) objG).destroyAd(n().g());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new zh(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new zh(this, 1));
    }

    @Override // com.ironsource.AbstractC3553z, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new zh(this, 3));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new zh(this, 4));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new zh(this, 2));
    }

    private final List<String> I() {
        JSONObject jSONObjectOptJSONObject = new S6().a(new String[]{"md"}).optJSONObject("md");
        if (jSONObjectOptJSONObject == null) {
            return uu.p0.emptyList();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(Q6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> J() {
        Map mapCreateMapBuilder = uu.o1.createMapBuilder();
        for (String str : I()) {
            List listSplit$default = sv.n0.split$default((CharSequence) str, new String[]{C3191e4.i.f36525b}, false, 2, 2, (Object) null);
            if (listSplit$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listSplit$default.get(0);
                mapCreateMapBuilder.put("custom_" + str2, (String) listSplit$default.get(1));
            }
        }
        return uu.o1.build(mapCreateMapBuilder);
    }

    private final void K() {
        this.f37159y = new C3317l5();
        IronLog.INTERNAL.verbose(AbstractC3553z.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC3336m6 interfaceC3336m6 = this.f37158x.get();
        if (interfaceC3336m6 != null) {
            interfaceC3336m6.b(this);
        }
        c();
    }

    private final void L() {
        IronLog.INTERNAL.verbose(AbstractC3553z.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void M() {
        Map<String, Object> mapJ = J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C3317l5.a(this.f37159y);
        LevelPlayReward levelPlayRewardA = Mb.f34856s.d().B().a(k(), n().i().b().c());
        if (levelPlayRewardA == null) {
            levelPlayRewardA = M4.f34835a.a();
        }
        LevelPlayReward levelPlayReward = levelPlayRewardA;
        f().e().a().a(k(), levelPlayReward.getName(), levelPlayReward.getAmount(), jCurrentTimeMillis, strA, jA, mapJ, f().j());
        InterfaceC3336m6 interfaceC3336m6 = this.f37158x.get();
        if (interfaceC3336m6 != null) {
            interfaceC3336m6.a(this, levelPlayReward);
        }
    }

    private final void N() {
        IronLog.INTERNAL.verbose(AbstractC3553z.a(this, (String) null, 1, (Object) null));
        InterfaceC3336m6 interfaceC3336m6 = this.f37158x.get();
        if (interfaceC3336m6 != null) {
            interfaceC3336m6.a(this);
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objG = g();
                kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), activity, this);
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("showAd - exception = ", th2.getMessage());
            IronLog.INTERNAL.error(a(strK));
            f().e().h().g(strK);
            a(C3554z0.h(n().h()), strK);
        }
    }

    @Override // com.ironsource.AbstractC3553z, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        a(new gi(17, this, extraData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3318l6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3318l6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3318l6 this$0, Map extraData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(extraData, "$extraData");
        this$0.l().putAll(extraData);
        this$0.N();
    }
}
