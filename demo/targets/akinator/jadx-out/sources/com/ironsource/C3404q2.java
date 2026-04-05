package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C3404q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3404q2 extends Ag {

    /* renamed from: e, reason: collision with root package name */
    private final V0 f38199e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3486v0 f38200f;

    /* renamed from: g, reason: collision with root package name */
    private final C3420r2 f38201g;

    /* renamed from: h, reason: collision with root package name */
    private final Xc f38202h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3437s2 f38203i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.q2$a */
    public static final class a implements InterfaceC3437s2 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f38205b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bg f38206c;

        public a(C c10, Bg bg2) {
            this.f38205b = c10;
            this.f38206c = bg2;
        }

        @Override // com.ironsource.InterfaceC3437s2
        public void a(final List<C3352n2> newWaterfall, final Map<String, G> adInstancePayloads, final String auctionId, final C3352n2 c3352n2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i10, final long j10, final int i11, final String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "auctionId");
            V0 v02 = C3404q2.this.f38199e;
            final C3404q2 c3404q2 = C3404q2.this;
            final C c10 = this.f38205b;
            final Bg bg2 = this.f38206c;
            v02.a(new Runnable() { // from class: com.ironsource.ci
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3404q2.a.a(c3404q2, c10, bg2, newWaterfall, adInstancePayloads, auctionId, c3352n2, jSONObject, jSONObject2, i10, j10, i11, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3404q2 this$0, C adInstanceFactory, Bg waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.e0.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.e0.checkNotNullParameter(newWaterfall, "$newWaterfall");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "$auctionId");
            this$0.f38203i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c3352n2, jSONObject, jSONObject2, i10, j10, i11, str);
        }

        @Override // com.ironsource.InterfaceC3437s2
        public void a(final int i10, final String str, final int i11, final String auctionFallback, final long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionFallback, "auctionFallback");
            V0 v02 = C3404q2.this.f38199e;
            final C3404q2 c3404q2 = C3404q2.this;
            final C c10 = this.f38205b;
            final Bg bg2 = this.f38206c;
            v02.a(new Runnable() { // from class: com.ironsource.di
                @Override // java.lang.Runnable
                public final void run() {
                    C3404q2.a.a(c3404q2, c10, bg2, i10, str, i11, auctionFallback, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3404q2 this$0, C adInstanceFactory, Bg waterfallFetcherListener, int i10, String str, int i11, String auctionFallback, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.e0.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.f38203i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i10, str, i11, auctionFallback, j10);
        }

        @Override // com.ironsource.InterfaceC3437s2
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.e0.checkNotNullParameter(errorReason, "errorReason");
            this.f38206c.a(i10, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3404q2(V0 adTools, AbstractC3486v0 adUnitData) {
        super(adTools, adUnitData);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f38199e = adTools;
        this.f38200f = adUnitData;
        C3420r2 c3420r2 = new C3420r2(adTools, adUnitData);
        this.f38201g = c3420r2;
        this.f38202h = c3420r2.b();
    }

    @Override // com.ironsource.Ag
    public Xc a() {
        return this.f38202h;
    }

    @Override // com.ironsource.Ag
    public void a(C adInstanceFactory, Bg waterfallFetcherListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f38201g.a(aVar);
        this.f38203i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C c10, Bg bg2, List<C3352n2> list, Map<String, G> map, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) throws JSONException {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38199e, (String) null, (String) null, 3, (Object) null));
        C3296k2 c3296k2 = new C3296k2(str, jSONObject, c3352n2, i10, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f38199e.e().h().a(i11, str2);
        }
        a(jSONObject2);
        Cg cgA = a(list, map, c3296k2, c10);
        this.f38199e.e().a(new U1(c3296k2));
        this.f38199e.e().b().a(j10, j1.o2.g(cgA.c(), this.f38200f.v(), ";wtf="));
        this.f38199e.e().b().c(cgA.d());
        a(cgA, bg2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C c10, Bg bg2, int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38199e, "Auction failed (error " + i10 + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zN = this.f38200f.e().n();
        String strA = Y1.f35721a.a(zN);
        C3296k2 c3296k2 = new C3296k2(strA, null, null, i11, str2);
        E5 e5E = this.f38199e.e();
        e5E.a(new U1(c3296k2));
        e5E.b().a(j10, i10, str);
        if (zN) {
            a(c10, bg2, i11, str2, strA);
        } else {
            a(bg2);
        }
    }

    private final void a(Cg cg2, Bg bg2) {
        this.f38199e.h().a(cg2);
        bg2.a(cg2);
    }

    private final void a(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f38200f.b(false);
                IronLog.INTERNAL.verbose(C3350n0.a(this.f38199e, a.b.k("loading configuration from auction response is null, using the following: ", this.f38200f.v()), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f37337x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f37337x)) > 0) {
                    this.f38200f.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f37338y)) {
                    this.f38200f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f37338y));
                }
                this.f38200f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f37339z, false));
                IronLog.INTERNAL.verbose(C3350n0.a(this.f38199e, this.f38200f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f38200f.b().a() + " Error: " + e10.getMessage());
                ironLog.verbose(C3350n0.a(this.f38199e, this.f38200f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(C3350n0.a(this.f38199e, this.f38200f.v(), (String) null, 2, (Object) null));
            throw th2;
        }
    }

    private final void a(C c10, Bg bg2, int i10, String str, String str2) {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38199e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Fc(this.f38199e, this.f38200f).a(bg2, i10, str, str2, c10);
    }

    private final void a(Bg bg2) {
        bg2.a(509, "Mediation No fill");
    }
}
