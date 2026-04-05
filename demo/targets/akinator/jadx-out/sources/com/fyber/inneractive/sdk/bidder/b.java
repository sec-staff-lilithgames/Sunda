package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.v0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements e, v0, com.fyber.inneractive.sdk.config.cellular.h {

    /* renamed from: h, reason: collision with root package name */
    public static final b f23083h = new b();

    /* renamed from: a, reason: collision with root package name */
    public final k f23084a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f23085b;

    /* renamed from: c, reason: collision with root package name */
    public final d f23086c;

    /* renamed from: d, reason: collision with root package name */
    public f f23087d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f23088e = new AtomicReference(null);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f23089f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final Object f23090g = new Object();

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.f23085b = cVar;
        d dVar = new d(cVar);
        this.f23086c = dVar;
        this.f23084a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        iAConfigManager.f23229x.f23423d = this;
        if (iAConfigManager.f23226u.f23394b.a(true, "bidding_token_wait_for_ua")) {
            s1 s1Var = iAConfigManager.f23230y;
            s1Var.b();
            if (!s1Var.f26814d.get()) {
                s1Var.c();
            }
            dVar.f23093b = iAConfigManager.f23230y.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.N) != null) {
            try {
                aVar.f23240c.add(this);
            } catch (Throwable th2) {
                IAlog.a("failed to add network observer", th2, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.f23087d = fVar;
        fVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x056f  */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a() throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.b.a():byte[]");
    }

    public final void b() {
        if (this.f23089f.compareAndSet(false, true)) {
            try {
                this.f23088e.set(Base64.encodeToString(a(), 2));
            } catch (Throwable th2) {
                IAlog.b("Failed to generate token with error: %s", th2.getMessage());
            }
            this.f23089f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.f26796a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z10 = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.f23086c.f23115x;
        if (bool == null || bool.booleanValue() != z10) {
            this.f23086c.f23115x = Boolean.valueOf(z10);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f26803a.execute(new a(this));
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        if (TextUtils.equals(this.f23086c.f23108q, z0Var.b())) {
            return;
        }
        this.f23086c.f23108q = z0Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, l0 l0Var) {
        ArrayList arrayList;
        int i10;
        j0 j0Var;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.f23229x.f23420a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.f23149b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i10 = Integer.parseInt(iAConfigManager.f23226u.f23394b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i10 = 5;
            }
            int i11 = i10 >= 0 ? i10 : 5;
            if (i11 > 0 && arrayList != null && arrayList.size() >= i11) {
                if (str.equals("video")) {
                    j0Var = j0.VIDEO;
                } else if (!str.equals("display")) {
                    j0Var = j0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    j0Var = j0.DISPLAY;
                }
                o0 o0VarNewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f26483b).setSubType(j0Var);
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) it.next();
                    e0 e0VarNewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i13 = gVar.f23155b;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f26483b).setClicks(i13);
                    int i14 = gVar.f23154a;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f26483b).setImpressions(i14);
                    if (str.equals("video") || l0Var.equals(l0.REWARDED)) {
                        int i15 = gVar.f23156c;
                        e0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f26483b).setCompletions(i15);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.a();
                    o0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f26483b).addSessionDataItems(sessionData);
                    i12++;
                    if (i12 >= i11) {
                        break;
                    }
                }
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f26483b).setType(l0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.f23084a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.f26483b).addUserSessions(userSession);
        }
    }
}
