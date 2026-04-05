package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 extends t0 {

    /* renamed from: p, reason: collision with root package name */
    public final String f24220p;

    /* renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.adm.y f24221q;

    /* renamed from: r, reason: collision with root package name */
    public int f24222r;

    /* renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f24223s;

    /* renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f24224t;

    /* renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f24225u;

    public f1(com.fyber.inneractive.sdk.bidder.adm.v vVar, String str, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        super(vVar, g0.f24226c.a(), rVar);
        this.f24222r = 0;
        this.f24296o = true;
        this.f24220p = str;
        this.f24221q = yVar;
        this.f24223s = eVar;
        this.f24224t = rVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
        String strName = unitDisplayType2.name();
        Locale locale = Locale.US;
        String lowerCase = strName.toLowerCase(locale);
        if (eVar == null || (unitDisplayType = eVar.f26644p) == null) {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = yVar.f23079a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = com.fyber.inneractive.sdk.util.n1.a(String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        String str2 = IAConfigManager.O.f23217l;
        com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
        this.f24225u = TextUtils.isEmpty(str2) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(jVar, lowerCase) : new com.fyber.inneractive.sdk.network.timeouts.request.c(lowerCase, jVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0, t1 {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f24239c;
            if (inputStream != null) {
                d(System.currentTimeMillis());
                StringBuffer stringBufferB = com.fyber.inneractive.sdk.util.v.b(inputStream);
                b(System.currentTimeMillis());
                String string = stringBufferB.toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f24221q.f23079a;
                int iA = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
                com.fyber.inneractive.sdk.bidder.adm.y yVar = this.f24221q;
                yVar.f23081c = string;
                com.fyber.inneractive.sdk.response.e eVarA = a(iA, null, yVar, null);
                eVarA.f26636h = string;
                o0Var.f24261a = eVarA;
            }
            return o0Var;
        } catch (b e10) {
            e = e10;
            IAlog.a("failed parse adm network request but will re-try", e, new Object[0]);
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            b(System.currentTimeMillis());
            throw new n0(e11.getMessage(), e11);
        } catch (SocketTimeoutException e12) {
            e = e12;
            IAlog.a("failed parse adm network request but will re-try", e, new Object[0]);
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (UnknownHostException e13) {
            e = e13;
            IAlog.a("failed parse adm network request but will re-try", e, new Object[0]);
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (Exception e14) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse adm network request", e14, new Object[0]);
            throw new n0(e14);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j10) {
        super.b(j10);
        IAlog.a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j10) {
        super.c(j10);
        IAlog.a("%s : NetworkRequestMarkup : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", IAlog.a(this), Integer.valueOf(this.f24222r));
        l0 l0Var = IAConfigManager.O.f23224s;
        this.f24282a = true;
        f1 f1Var = new f1(this);
        if (l0Var == null || !l0Var.c(f1Var)) {
            IAlog.a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", IAlog.a(this), Integer.valueOf(this.f24222r));
            a((Object) null, new Exception("Bidding ad request passed allowed time"), false);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return this.f24225u.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        int iQ = super.q();
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f24225u;
        return ((aVar.c() + aVar.f24302f) * this.f24222r) + iQ;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.config.global.r k() {
        return this.f24224t;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f24225u;
        return new l1(aVar.f24306i, aVar.f24305h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f24220p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f24225u.f24302f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        if (this.f24282a) {
            return false;
        }
        int i10 = this.f24222r + 1;
        this.f24222r = i10;
        if (i10 > this.f24225u.b()) {
            IAlog.a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f24222r - 1), Integer.valueOf(this.f24225u.b()), this.f24288g);
            return false;
        }
        IAlog.a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f24222r - 1), Integer.valueOf(this.f24225u.b()), this.f24288g);
        this.f24225u.a(this.f24222r);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d(long j10) {
        super.d(j10);
        IAlog.a("%s : NetworkRequestMarkup : set start read timestamp", IAlog.a(this));
    }

    public f1(f1 f1Var) {
        super(f1Var);
        this.f24222r = 0;
        this.f24296o = true;
        this.f24220p = f1Var.f24220p;
        this.f24221q = f1Var.f24221q;
        this.f24223s = f1Var.f24223s;
        this.f24224t = f1Var.f24224t;
        this.f24225u = f1Var.f24225u;
        this.f24222r = f1Var.f24222r;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(this.f24222r), Integer.valueOf(p().f24250a), Integer.valueOf(p().f24251b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j10) {
        super.a(j10);
        IAlog.a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }
}
