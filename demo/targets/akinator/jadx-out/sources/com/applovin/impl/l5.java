package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.e0;
import com.applovin.impl.j5;
import com.applovin.impl.l7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.sdk.AppLovinAdLoadListener;
import cv.BLca.YsiBvdpw;
import h2.rl.UeklptUrP;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
class l5 extends j5 {

    /* renamed from: q, reason: collision with root package name */
    private final l7 f14354q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class a implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t7 f14355a;

        public a(t7 t7Var) {
            this.f14355a = t7Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f14355a.a(uri);
                l5.this.f14354q.b(true);
                return;
            }
            com.applovin.impl.sdk.o oVar = l5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f14005c.b(l5Var.f14004b, "Failed to cache static companion ad");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class b implements j5.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t7 f14357a;

        public b(t7 t7Var) {
            this.f14357a = t7Var;
        }

        @Override // com.applovin.impl.j5.e
        public void a(String str) {
            this.f14357a.a(str);
            l5.this.f14354q.b(true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class c implements j5.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t7 f14359a;

        public c(t7 t7Var) {
            this.f14359a = t7Var;
        }

        @Override // com.applovin.impl.j5.e
        public void a(String str) {
            this.f14359a.a(str);
            l5.this.f14354q.b(true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class d implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z7 f14361a;

        public d(z7 z7Var) {
            this.f14361a = z7Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.o oVar = l5.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f14005c.a(l5Var.f14004b, "Video file successfully cached into: " + uri);
                }
                this.f14361a.a(uri);
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f14005c.b(l5Var2.f14004b, "Failed to cache video file: " + this.f14361a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class e implements j5.e {
        public e() {
        }

        @Override // com.applovin.impl.j5.e
        public void a(String str) {
            if (l5.this.f14354q.isOpenMeasurementEnabled()) {
                str = l5.this.f14003a.e0().a(str, e2.a((AppLovinAdImpl) l5.this.f14185g));
            }
            l5.this.f14354q.d(str);
            com.applovin.impl.sdk.o oVar = l5.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f14005c.a(l5Var.f14004b, "Finish caching HTML template " + l5.this.f14354q.u1() + " for ad #" + l5.this.f14354q.getAdIdNumber());
            }
        }
    }

    public l5(l7 l7Var, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", l7Var, kVar, appLovinAdLoadListener);
        this.f14354q = l7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f14003a.a(v4.X4)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.EMPTY_LIST, false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.f14185g.a(uriA);
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void n() {
        if (l() || !x7.a(this.f14354q)) {
            return;
        }
        String strU1 = this.f14354q.u1();
        if (!StringUtils.isValidString(strU1)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strA = a(strU1, this.f14354q.c0(), this.f14185g);
        if (this.f14354q.isOpenMeasurementEnabled()) {
            strA = this.f14003a.e0().a(strA, e2.a((AppLovinAdImpl) this.f14185g));
        }
        this.f14354q.d(strA);
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Finish caching HTML template " + this.f14354q.u1() + " for ad #" + this.f14354q.getAdIdNumber());
        }
    }

    private void o() {
        z7 z7VarC1;
        Uri uriE;
        if (l()) {
            return;
        }
        if (!this.f14354q.H1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f14354q.B1() == null || (z7VarC1 = this.f14354q.C1()) == null || (uriE = z7VarC1.e()) == null) {
            return;
        }
        Uri uriB = b(uriE.toString(), Collections.EMPTY_LIST, false);
        if (uriB != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Video file successfully cached into: " + uriB);
            }
            z7VarC1.a(uriB);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Failed to cache video file: " + z7VarC1);
        }
    }

    private c0 p() {
        if (!this.f14354q.G1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        o7 o7VarS1 = this.f14354q.s1();
        if (o7VarS1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        t7 t7VarE = o7VarS1.e();
        if (t7VarE == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriC = t7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = t7VarE.b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strB)) {
            if (t7VarE.d() == t7.a.STATIC) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.a(this.f14004b, "Caching static companion ad at " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                return new e0(string, this.f14354q, Collections.EMPTY_LIST, false, this.f14187i, this.f14003a, new a(t7VarE));
            }
            if (t7VarE.d() == t7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        b0.e2.y("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f14005c, this.f14004b);
                    }
                    return a(strB, Collections.EMPTY_LIST, new c(t7VarE));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.a(this.f14004b, "Begin caching HTML companion ad. Fetching from " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                String strC = c(string, null, false);
                if (StringUtils.isValidString(strC)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14005c.a(this.f14004b, "HTML fetched. Caching HTML now...");
                    }
                    return a(strC, Collections.EMPTY_LIST, new b(t7VarE));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Unable to load companion ad resources from " + string);
                }
            } else if (t7VarE.d() == t7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.k(this.f14004b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.j5
    public void f() {
        this.f14354q.getAdEventTracker().h();
        super.f();
    }

    public d0 q() {
        if (!TextUtils.isEmpty(this.f14354q.u1())) {
            return a(this.f14354q.u1(), this.f14354q.c0(), new e());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return null;
        }
        this.f14005c.a(this.f14004b, "Unable to load HTML template");
        return null;
    }

    public e0 r() {
        z7 z7VarC1;
        Uri uriE;
        if (!this.f14354q.H1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f14354q.B1() == null || (z7VarC1 = this.f14354q.C1()) == null || (uriE = z7VarC1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Caching video file " + z7VarC1 + " creative...");
        }
        return a(uriE.toString(), Collections.EMPTY_LIST, false, new d(z7VarC1));
    }

    @Override // com.applovin.impl.j5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zO0 = this.f14354q.O0();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f14005c;
            String str = this.f14004b;
            StringBuilder sb2 = new StringBuilder("Begin caching for VAST ");
            sb2.append(zO0 ? "streaming " : "");
            sb2.append("ad #");
            sb2.append(this.f14185g.getAdIdNumber());
            sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
            oVar.a(str, sb2.toString());
        }
        if (zO0) {
            if (((Boolean) this.f14003a.a(v4.I0)).booleanValue()) {
                if (!o0.e()) {
                    a(e());
                }
                if (this.f14354q.E1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c0 c0VarP = p();
                    if (c0VarP != null) {
                        arrayList.add(c0VarP);
                    }
                    d0 d0VarQ = q();
                    if (d0VarQ != null) {
                        arrayList.add(d0VarQ);
                    }
                    e0 e0VarR = r();
                    if (e0VarR != null) {
                        arrayList.add(e0VarR);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f14354q.v1() == l7.c.COMPANION_AD) {
                        c0 c0VarP2 = p();
                        if (c0VarP2 != null) {
                            arrayList2.add(c0VarP2);
                        }
                        d0 d0VarQ2 = q();
                        if (d0VarQ2 != null) {
                            arrayList2.add(d0VarQ2);
                        }
                        a(arrayList2);
                        f();
                        e0 e0VarR2 = r();
                        if (e0VarR2 != null) {
                            arrayList3.add(e0VarR2);
                        }
                        a(arrayList3);
                    } else {
                        e0 e0VarR3 = r();
                        if (e0VarR3 != null) {
                            arrayList2.add(e0VarR3);
                        }
                        a(arrayList2);
                        f();
                        c0 c0VarP3 = p();
                        if (c0VarP3 != null) {
                            arrayList3.add(c0VarP3);
                        }
                        d0 d0VarQ3 = q();
                        if (d0VarQ3 != null) {
                            arrayList3.add(d0VarQ3);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f14354q.E1()) {
                    f();
                }
                l7.c cVarV1 = this.f14354q.v1();
                l7.c cVar = l7.c.COMPANION_AD;
                if (cVarV1 == cVar) {
                    m();
                    n();
                    a(this.f14354q);
                } else {
                    o();
                }
                if (!this.f14354q.E1()) {
                    f();
                }
                if (this.f14354q.v1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f14354q);
                }
            }
        } else if (((Boolean) this.f14003a.a(v4.I0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!o0.e()) {
                arrayList4.addAll(e());
            }
            c0 c0VarP4 = p();
            if (c0VarP4 != null) {
                arrayList4.add(c0VarP4);
            }
            e0 e0VarR4 = r();
            if (e0VarR4 != null) {
                arrayList4.add(e0VarR4);
            }
            d0 d0VarQ4 = q();
            if (d0VarQ4 != null) {
                arrayList4.add(d0VarQ4);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f14354q);
            f();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Finished caching VAST ad #" + this.f14354q.getAdIdNumber());
        }
        this.f14354q.F1();
        k();
    }

    @Override // com.applovin.impl.j5
    public void a(int i10) {
        this.f14354q.getAdEventTracker().f();
        super.a(i10);
    }

    private void m() {
        String string;
        if (!l()) {
            if (this.f14354q.G1()) {
                o7 o7VarS1 = this.f14354q.s1();
                if (o7VarS1 != null) {
                    t7 t7VarE = o7VarS1.e();
                    if (t7VarE != null) {
                        Uri uriC = t7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = t7VarE.b();
                        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f14005c.k(this.f14004b, YsiBvdpw.MuHntVydRRZpjx);
                                return;
                            }
                            return;
                        }
                        if (t7VarE.d() == t7.a.STATIC) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f14005c.a(this.f14004b, "Caching static companion ad at " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
                            }
                            Uri uriA = a(string, Collections.EMPTY_LIST, false);
                            if (uriA != null) {
                                t7VarE.a(uriA);
                                this.f14354q.b(true);
                                return;
                            } else {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f14005c.b(this.f14004b, "Failed to cache static companion ad");
                                    return;
                                }
                                return;
                            }
                        }
                        if (t7VarE.d() == t7.a.HTML) {
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f14005c.a(this.f14004b, "Begin caching HTML companion ad. Fetching from " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                String strC = c(string, null, false);
                                if (StringUtils.isValidString(strC)) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f14005c.a(this.f14004b, "HTML fetched. Caching HTML now...");
                                    }
                                    t7VarE.a(a(strC, Collections.EMPTY_LIST, this.f14354q));
                                    this.f14354q.b(true);
                                    return;
                                }
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f14005c.b(this.f14004b, "Unable to load companion ad resources from " + string);
                                    return;
                                }
                                return;
                            }
                            if (com.applovin.impl.sdk.o.a()) {
                                b0.e2.y("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f14005c, this.f14004b);
                            }
                            if (((Boolean) this.f14003a.a(v4.W4)).booleanValue()) {
                                strB = d(strB);
                            }
                            t7VarE.a(a(strB, Collections.EMPTY_LIST, this.f14354q));
                            this.f14354q.b(true);
                            return;
                        }
                        if (t7VarE.d() == t7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                            this.f14005c.a(this.f14004b, "Skip caching of iFrame resource...");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14005c.b(this.f14004b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.a(this.f14004b, "No companion ad provided. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, UeklptUrP.kUgJIoGidZ);
            }
        }
    }
}
