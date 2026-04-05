package com.ironsource;

import com.ironsource.Q1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3420r2 {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f38262a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3486v0 f38263b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f38264c;

    /* renamed from: d, reason: collision with root package name */
    private final C3189e2 f38265d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r2$a */
    public static final class a implements Q1.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3437s2 f38267b;

        public a(InterfaceC3437s2 interfaceC3437s2) {
            this.f38267b = interfaceC3437s2;
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 auction) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auction, "auction");
            C3420r2.this.b(auction, this.f38267b);
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 auction, String error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auction, "auction");
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            C3420r2.this.b(auction, this.f38267b);
        }
    }

    public C3420r2(V0 adTools, AbstractC3486v0 adUnitData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f38262a = adTools;
        this.f38263b = adUnitData;
        C3387p2 c3387p2E = adUnitData.e();
        String strD = IronSourceUtils.d();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strD, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c3387p2E, strD));
        this.f38264c = eVar;
        this.f38265d = new C3189e2(adTools, eVar);
    }

    public final C3189e2 b() {
        return this.f38265d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Q1 q12, InterfaceC3437s2 interfaceC3437s2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(j1.o2.m("auction waterfallString = ", q12.d().c())));
        if (!q12.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f38262a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC3437s2.a(C3554z0.e(this.f38263b.b().a()), "no available ad to load");
        } else {
            this.f38262a.e().b().b(q12.d().c().toString());
            int iF = this.f38262a.f();
            this.f38264c.a(ContextProvider.getInstance().getApplicationContext(), a(q12, iF), new b(interfaceC3437s2, q12));
        }
    }

    public void a(InterfaceC3437s2 completionListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f38262a.e().b().a(this.f38263b.b().d());
        a(new Q1(this.f38262a, this.f38263b), completionListener);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r2$b */
    public static final class b implements S1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3437s2 f38268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q1 f38269b;

        public b(InterfaceC3437s2 interfaceC3437s2, Q1 q12) {
            this.f38268a = interfaceC3437s2;
            this.f38269b = q12;
        }

        @Override // com.ironsource.S1
        public void a(List<C3352n2> newWaterfall, String auctionId, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "auctionId");
            this.f38268a.a(newWaterfall, this.f38269b.c(), auctionId, c3352n2, jSONObject, jSONObject2, i10, j10, i11, str);
        }

        @Override // com.ironsource.S1
        public void a(int i10, String str, int i11, String auctionFallback, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.f38268a.a(i10, str, i11, auctionFallback, j10);
        }
    }

    private final void a(Q1 q12, InterfaceC3437s2 interfaceC3437s2) {
        if (!q12.f()) {
            b(q12, interfaceC3437s2);
        } else {
            q12.a(new a(interfaceC3437s2));
        }
    }

    private final com.ironsource.mediationsdk.i a(Q1 q12, int i10) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f38263b.b().a());
        iVar.b(IronSourceUtils.g());
        iVar.a(q12.d().a());
        iVar.a(q12.d().b());
        iVar.a(this.f38262a.h());
        iVar.a(i10);
        iVar.a(this.f38262a.k());
        Hf hfG = this.f38263b.b().g();
        iVar.e(hfG != null ? hfG.b() : false);
        iVar.a(this.f38263b.b().d());
        InterfaceC3243h2 interfaceC3243h2I = this.f38262a.i();
        if (interfaceC3243h2I != null) {
            interfaceC3243h2I.a(iVar);
        }
        return iVar;
    }

    private final String a(String str) {
        return C3350n0.a(this.f38262a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C3350n0.a(this.f38262a, (String) null, (String) null, 2, (Object) null);
    }
}
