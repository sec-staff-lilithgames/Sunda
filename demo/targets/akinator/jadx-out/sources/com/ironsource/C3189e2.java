package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3189e2 implements Xc {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f36332a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f36333b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36334c;

    public C3189e2(V0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.f36332a = adTools;
        this.f36333b = auctionHandler;
    }

    @Override // com.ironsource.Xc
    public void a(AbstractC3553z instance, String str, C3360na publisherDataHolder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f36333b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance.h(), str);
    }

    @Override // com.ironsource.Xc
    public void a(List<? extends AbstractC3553z> waterfallInstances, AbstractC3553z winnerInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.e0.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.f36334c) {
            return;
        }
        this.f36334c = true;
        C3352n2 c3352n2H = winnerInstance.h();
        this.f36333b.a(c3352n2H, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C3352n2> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC3553z abstractC3553z : waterfallInstances) {
            arrayList.add(abstractC3553z.p());
            concurrentHashMap.put(abstractC3553z.p(), abstractC3553z.h());
        }
        this.f36333b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), c3352n2H);
    }

    private final void a(C3360na c3360na, C3352n2 c3352n2, String str) {
        if (c3352n2 != null) {
            Y8 y8A = c3352n2.a(str);
            if (y8A != null) {
                Iterator it = new HashSet(c3360na.a()).iterator();
                while (it.hasNext()) {
                    this.f36332a.e(new lh(this, 6, (InterfaceC3124a9) it.next(), y8A));
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(C3350n0.a(this.f36332a, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (String) null, 2, (Object) null));
        this.f36332a.e().h().g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3189e2 this$0, InterfaceC3124a9 listener, Y8 impressionData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        IronLog.CALLBACK.verbose(C3350n0.a(this$0.f36332a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(impressionData, "impressionData");
        listener.a(impressionData);
    }
}
