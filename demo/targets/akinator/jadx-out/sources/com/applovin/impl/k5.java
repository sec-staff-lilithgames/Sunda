package com.applovin.impl;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.e0;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class k5 extends j5 {

    /* renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f14236q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f14237r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14238s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                k5.this.f14236q.y1();
                k5.this.f14236q.d(uri);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class b implements j5.e {
        public b() {
        }

        @Override // com.applovin.impl.j5.e
        public void a(String str) {
            k5.this.f14236q.d(k5.this.d(str));
            k5.this.f14236q.b(true);
            com.applovin.impl.sdk.o oVar = k5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                k5 k5Var = k5.this;
                k5Var.f14005c.a(k5Var.f14004b, "Finish caching non-video resources for ad #" + k5.this.f14236q.getAdIdNumber());
            }
            k5 k5Var2 = k5.this;
            k5Var2.f14005c.f(k5Var2.f14004b, "Ad updated with cachedHTML = " + k5.this.f14236q.s1());
        }
    }

    public k5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f14236q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (k7.j(com.applovin.impl.sdk.k.o())) {
            str = k7.c(str);
        }
        if (!this.f14236q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f14003a.e0().a(str, e2.a((AppLovinAdImpl) this.f14185g));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching non-optional HTML resources...");
        }
        this.f14236q.d(d(a(this.f14236q.s1(), this.f14236q.c0(), this.f14236q)));
        this.f14236q.b(true);
        a(this.f14236q);
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Finish caching non-optional HTML resources for ad #" + this.f14236q.getAdIdNumber());
        }
        this.f14005c.f(this.f14004b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f14236q.s1());
    }

    private void n() {
        Uri uriC;
        if (l() || (uriC = c(this.f14236q.w1())) == null) {
            return;
        }
        this.f14236q.y1();
        this.f14236q.d(uriC);
    }

    private d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching HTML resources...");
        }
        return a(this.f14236q.s1(), this.f14236q.c0(), new b());
    }

    private e0 p() {
        return b(this.f14236q.w1(), new a());
    }

    private void q() {
        List<String> listR = this.f14236q.R();
        if (CollectionUtils.isEmpty(listR)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching optional HTML resources...");
        }
        String strS1 = this.f14236q.s1();
        for (String str : listR) {
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.y("Caching optional resource: ", str, this.f14005c, this.f14004b);
            }
            int iA = this.f14003a.H().a(str, this.f14185g);
            Map mapA = e2.a((AppLovinAdImpl) this.f14185g);
            String strA = this.f14003a.H().a(com.applovin.impl.sdk.k.o(), str, this.f14236q.getCachePrefix(), this.f14236q.c0(), true, true, iA, this.f14187i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    b0.e2.y("Updating HTML with cached optional resource: ", strA, this.f14005c, this.f14004b);
                }
                this.f14236q.a(Uri.parse(strA));
                strS1 = strS1.replace(str, strA);
                this.f14236q.d(strS1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Finish caching optional HTML resources for ad #" + this.f14236q.getAdIdNumber());
        }
    }

    public void b(boolean z10) {
        this.f14238s = z10;
    }

    public void c(boolean z10) {
        this.f14237r = z10;
    }

    @Override // com.applovin.impl.j5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zO0 = this.f14236q.O0();
        boolean z10 = this.f14238s;
        if (!zO0 && !z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, TJzY.XBPYv + this.f14236q.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            if (((Boolean) this.f14003a.a(v4.I0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!o0.e()) {
                    arrayList.addAll(e());
                }
                d0 d0VarO = o();
                if (d0VarO != null) {
                    arrayList.add(d0VarO);
                }
                e0 e0VarP = p();
                if (e0VarP != null) {
                    arrayList.add(e0VarP);
                }
                a(arrayList);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Begin caching for streaming ad #" + this.f14236q.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            if (((Boolean) this.f14003a.a(v4.I0)).booleanValue()) {
                if (!o0.e()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (zO0) {
                    if (this.f14237r) {
                        f();
                        d0 d0VarO2 = o();
                        if (d0VarO2 != null) {
                            arrayList2.add(d0VarO2);
                        }
                        e0 e0VarP2 = p();
                        if (e0VarP2 != null) {
                            arrayList2.add(e0VarP2);
                        }
                    } else {
                        d0 d0VarO3 = o();
                        if (d0VarO3 != null) {
                            a(Arrays.asList(d0VarO3));
                        }
                        f();
                        e0 e0VarP3 = p();
                        if (e0VarP3 != null) {
                            arrayList2.add(e0VarP3);
                        }
                    }
                } else {
                    f();
                    d0 d0VarO4 = o();
                    if (d0VarO4 != null) {
                        arrayList2.add(d0VarO4);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (zO0) {
                    if (this.f14237r) {
                        f();
                    }
                    m();
                    if (!this.f14237r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        }
        k();
    }
}
