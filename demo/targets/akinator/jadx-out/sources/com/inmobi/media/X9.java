package com.inmobi.media;

import com.amazon.device.ads.DtbConstants;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class X9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32493b;

    /* renamed from: c, reason: collision with root package name */
    public final Te f32494c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32495d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f32496e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32497f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32498g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32499h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f32500i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f32501j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f32502k;

    /* renamed from: l, reason: collision with root package name */
    public JSONObject f32503l;

    /* renamed from: m, reason: collision with root package name */
    public String f32504m;

    /* renamed from: n, reason: collision with root package name */
    public Z9 f32505n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32506o;

    /* renamed from: p, reason: collision with root package name */
    public int f32507p;

    /* renamed from: q, reason: collision with root package name */
    public int f32508q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32509r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32510s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32511t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32512u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32513v;

    /* renamed from: w, reason: collision with root package name */
    public Nc f32514w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32515x;

    public X9(String requestType, String str, Te te2, boolean z10, F5 f52, String requestContentType, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestType, "requestType");
        kotlin.jvm.internal.e0.checkNotNullParameter(requestContentType, "requestContentType");
        this.f32492a = requestType;
        this.f32493b = str;
        this.f32494c = te2;
        this.f32495d = z10;
        this.f32496e = f52;
        this.f32497f = requestContentType;
        this.f32498g = z11;
        this.f32499h = "X9";
        this.f32500i = new HashMap();
        this.f32504m = C2925od.b();
        this.f32507p = DtbConstants.NETWORK_READ_TIMEOUT;
        this.f32508q = DtbConstants.NETWORK_READ_TIMEOUT;
        this.f32509r = true;
        this.f32511t = true;
        this.f32512u = true;
        this.f32513v = true;
        this.f32515x = true;
        if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36943a, requestType)) {
            this.f32501j = new HashMap();
        } else if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36944b, requestType)) {
            this.f32502k = new HashMap();
            this.f32503l = new JSONObject();
        }
    }

    public final void a(kv.l onResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onResponse, "onResponse");
        F5 f52 = this.f32496e;
        if (f52 != null) {
            String str = this.f32499h;
            StringBuilder sbA = N6.a(str, "TAG", "executeAsync: ");
            sbA.append(this.f32493b);
            ((G5) f52).a(str, sbA.toString());
        }
        e();
        if (!this.f32495d) {
            F5 f53 = this.f32496e;
            if (f53 != null) {
                String TAG = this.f32499h;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f53).c(TAG, "Dropping REQUEST FOR GDPR");
            }
            Z9 z92 = new Z9();
            z92.f32602d = new S9(EnumC3017u4.f33427j, "Network Request dropped as current request is not GDPR compliant.");
            onResponse.invoke(z92);
            return;
        }
        Oc request = a();
        W9 responseListener = new W9(this, onResponse);
        kotlin.jvm.internal.e0.checkNotNullParameter(responseListener, "responseListener");
        request.f32111l = responseListener;
        Set set = Qc.f32173a;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        Qc.f32173a.add(request);
        Qc.a(request, 0L);
    }

    public final Z9 b() {
        Sc scA;
        S9 s92;
        F5 f52 = this.f32496e;
        if (f52 != null) {
            String str = this.f32499h;
            StringBuilder sbA = N6.a(str, "TAG", "Executing network request to URL: ");
            sbA.append(this.f32493b);
            ((G5) f52).c(str, sbA.toString());
        }
        e();
        if (!this.f32495d) {
            F5 f53 = this.f32496e;
            if (f53 != null) {
                String TAG = this.f32499h;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f53).c(TAG, "Dropping REQUEST FOR GDPR");
            }
            Z9 z92 = new Z9();
            z92.f32602d = new S9(EnumC3017u4.f33427j, "Network Request dropped as current request is not GDPR compliant.");
            return z92;
        }
        if (this.f32505n != null) {
            F5 f54 = this.f32496e;
            if (f54 != null) {
                String str2 = this.f32499h;
                StringBuilder sbA2 = N6.a(str2, "TAG", "response has been failed before execute - ");
                Z9 z93 = this.f32505n;
                sbA2.append(z93 != null ? z93.f32602d : null);
                ((G5) f54).c(str2, sbA2.toString());
            }
            Z9 z94 = this.f32505n;
            kotlin.jvm.internal.e0.checkNotNull(z94);
            return z94;
        }
        Oc request = a();
        F5 f55 = this.f32496e;
        if (f55 != null) {
            String str3 = this.f32499h;
            StringBuilder sbA3 = N6.a(str3, "TAG", "Making network request to: ");
            sbA3.append(request.f32100a);
            ((G5) f55).c(str3, sbA3.toString());
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        do {
            scA = R9.a(request, (kv.p) null);
            s92 = scA.f32272a;
        } while ((s92 != null ? s92.f32266a : null) == EnumC3017u4.f33430m);
        Z9 response = J4.a(scA);
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.e0.checkNotNullParameter(this, "request");
        return response;
    }

    public final String c() {
        String str = this.f32497f;
        if (kotlin.jvm.internal.e0.areEqual(str, com.ironsource.G5.L)) {
            return String.valueOf(this.f32503l);
        }
        if (!kotlin.jvm.internal.e0.areEqual(str, "application/x-www-form-urlencoded")) {
            return "";
        }
        boolean z10 = C2736da.f32781a;
        C2736da.a(this.f32502k);
        return C2736da.a(C3191e4.i.f36527c, (Map) this.f32502k);
    }

    public final String d() {
        String strL = this.f32493b;
        HashMap map = this.f32501j;
        if (map != null) {
            C2736da.a(map);
            String strA = C2736da.a(C3191e4.i.f36527c, (Map) this.f32501j);
            F5 f52 = this.f32496e;
            if (f52 != null) {
                String str = this.f32499h;
                ((G5) f52).c(str, O6.a(str, "TAG", "Get params: ", strA));
            }
            int length = strA.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) strA.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (strA.subSequence(i10, length + 1).toString().length() > 0) {
                if (strL != null && !sv.n0.contains$default((CharSequence) strL, (CharSequence) "?", false, 2, (Object) null)) {
                    strL = strL.concat("?");
                }
                if (strL != null && !sv.k0.endsWith$default(strL, C3191e4.i.f36527c, false, 2, null) && !sv.k0.endsWith$default(strL, "?", false, 2, null)) {
                    strL = strL.concat(C3191e4.i.f36527c);
                }
                strL = j1.o2.l(strL, strA);
            }
        }
        kotlin.jvm.internal.e0.checkNotNull(strL);
        return strL;
    }

    public final void e() {
        f();
        this.f32500i.put(Command.HTTP_HEADER_USER_AGENT, C2925od.k());
        if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36944b, this.f32492a)) {
            this.f32500i.put("Content-Type", this.f32497f);
            if (this.f32498g) {
                this.f32500i.put("Content-Encoding", "gzip");
            } else {
                this.f32500i.put("Content-Length", String.valueOf(c().length()));
            }
        }
    }

    public void f() {
        HashMap map;
        JSONObject jSONObjectC;
        HashMap map2;
        M4 m42 = M4.f32021a;
        m42.j();
        this.f32495d = m42.a(this.f32495d);
        if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36943a, this.f32492a)) {
            HashMap map3 = this.f32501j;
            if (this.f32511t) {
                if (map3 != null) {
                    map3.putAll(C2778g1.f32859e);
                }
                if (map3 != null) {
                    map3.putAll(R3.f32183a.a(this.f32506o));
                }
                if (map3 != null) {
                    map3.putAll(AbstractC2748e5.a());
                }
            }
            HashMap map4 = this.f32501j;
            if (this.f32512u) {
                a(map4);
            }
        } else if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36944b, this.f32492a)) {
            HashMap map5 = this.f32502k;
            if (this.f32511t) {
                if (map5 != null) {
                    map5.putAll(C2778g1.f32859e);
                }
                if (map5 != null) {
                    map5.putAll(R3.f32183a.a(this.f32506o));
                }
                if (map5 != null) {
                    map5.putAll(AbstractC2748e5.a());
                }
            }
            HashMap map6 = this.f32502k;
            if (this.f32512u) {
                a(map6);
            }
        }
        if (this.f32513v && (jSONObjectC = M4.c()) != null) {
            if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36943a, this.f32492a)) {
                HashMap map7 = this.f32501j;
                if (map7 != null) {
                    String string = jSONObjectC.toString();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                }
            } else if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36944b, this.f32492a) && (map2 = this.f32502k) != null) {
                String string2 = jSONObjectC.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(...)");
            }
        }
        if (this.f32515x) {
            if (kotlin.jvm.internal.e0.areEqual(C3271ic.f36943a, this.f32492a)) {
                HashMap map8 = this.f32501j;
                if (map8 != null) {
                    return;
                }
                return;
            }
            if (!kotlin.jvm.internal.e0.areEqual(C3271ic.f36944b, this.f32492a) || (map = this.f32502k) == null) {
                return;
            }
        }
    }

    public final Oc a() {
        String type = this.f32492a;
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        Lc method = (!kotlin.jvm.internal.e0.areEqual(type, C3271ic.f36943a) && kotlin.jvm.internal.e0.areEqual(type, C3271ic.f36944b)) ? Lc.f32010b : Lc.f32009a;
        String url = this.f32493b;
        kotlin.jvm.internal.e0.checkNotNull(url);
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(method, "method");
        Kc kc2 = new Kc(url, method);
        boolean z10 = C2736da.f32781a;
        C2736da.a(this.f32500i);
        HashMap header = this.f32500i;
        kotlin.jvm.internal.e0.checkNotNullParameter(header, "header");
        kc2.f31958c = header;
        kc2.f31963h = Integer.valueOf(this.f32507p);
        kc2.f31964i = Integer.valueOf(this.f32508q);
        kc2.f31961f = Boolean.valueOf(this.f32509r);
        kc2.f31965j = Boolean.valueOf(this.f32510s);
        Nc retryPolicy = this.f32514w;
        if (retryPolicy != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(retryPolicy, "retryPolicy");
            kc2.f31962g = retryPolicy;
        }
        int iOrdinal = method.ordinal();
        if (iOrdinal == 0) {
            HashMap queryParams = this.f32501j;
            if (queryParams != null) {
                F5 f52 = this.f32496e;
                if (f52 != null) {
                    String TAG = this.f32499h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).c(TAG, "getParams " + queryParams);
                }
                kotlin.jvm.internal.e0.checkNotNullParameter(queryParams, "queryParams");
                kc2.f31959d = queryParams;
            }
        } else if (iOrdinal == 1) {
            String postBody = c();
            F5 f53 = this.f32496e;
            if (f53 != null) {
                String str = this.f32499h;
                ((G5) f53).c(str, O6.a(str, "TAG", "httpPostBody ", postBody));
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(postBody, "postBody");
            kc2.f31960e = postBody;
        }
        return new Oc(kc2);
    }

    public /* synthetic */ X9(String str, String str2, Te te2, boolean z10, F5 f52, String str3, int i10) {
        this(str, str2, te2, (i10 & 8) != 0 ? false : z10, f52, (i10 & 32) != 0 ? "application/x-www-form-urlencoded" : str3, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X9(String url, F5 f52) {
        this(C3271ic.f36943a, url, (Te) null, false, f52, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.e0.checkNotNullParameter(C3271ic.f36943a, "requestType");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f32513v = false;
    }

    public final void a(HashMap map) {
        X0 x0B;
        String strA;
        Te te2 = this.f32494c;
        if (te2 == null || map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        try {
            if (te2.f32308a.a() && (x0B = Se.f32278a.b()) != null && (strA = x0B.a()) != null) {
                kotlin.jvm.internal.e0.checkNotNull(strA);
                map3.put("GPID", strA);
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Te", "getSimpleName(...)");
        }
        String string = new JSONObject(map3).toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        map2.put("u-id-map", string);
        map.putAll(map2);
    }
}
