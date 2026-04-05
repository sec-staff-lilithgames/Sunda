package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.l0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* renamed from: b, reason: collision with root package name */
    private String f40620b;

    /* renamed from: c, reason: collision with root package name */
    private int f40621c;

    /* renamed from: e, reason: collision with root package name */
    private int f40623e;

    /* renamed from: f, reason: collision with root package name */
    private String f40624f;

    /* renamed from: g, reason: collision with root package name */
    private String f40625g;

    /* renamed from: h, reason: collision with root package name */
    private String f40626h;

    /* renamed from: i, reason: collision with root package name */
    private String f40627i;

    /* renamed from: j, reason: collision with root package name */
    private String f40628j;

    /* renamed from: k, reason: collision with root package name */
    private String f40629k;

    /* renamed from: l, reason: collision with root package name */
    private String f40630l;

    /* renamed from: m, reason: collision with root package name */
    private String f40631m;

    /* renamed from: n, reason: collision with root package name */
    private String f40632n;

    /* renamed from: o, reason: collision with root package name */
    private String f40633o;

    /* renamed from: p, reason: collision with root package name */
    private int f40634p;

    /* renamed from: q, reason: collision with root package name */
    private String f40635q;

    /* renamed from: r, reason: collision with root package name */
    private String f40636r;

    /* renamed from: s, reason: collision with root package name */
    private String f40637s;

    /* renamed from: u, reason: collision with root package name */
    private int f40639u;

    /* renamed from: v, reason: collision with root package name */
    private String f40640v;

    /* renamed from: w, reason: collision with root package name */
    private String f40641w;

    /* renamed from: x, reason: collision with root package name */
    private String f40642x;

    /* renamed from: y, reason: collision with root package name */
    private String f40643y;

    /* renamed from: z, reason: collision with root package name */
    private String f40644z;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f40619a = null;

    /* renamed from: d, reason: collision with root package name */
    private int f40622d = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f40638t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f40635q = str;
        this.f40639u = i10;
        this.f40640v = str5;
        this.f40634p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f40641w = URLEncoder.encode(str2, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f40642x = str3;
        this.C = i14;
        this.f40627i = str4;
        this.K = i15;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f40620b;
    }

    public void b(String str) {
        this.f40624f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40625g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f40624f;
    }

    public String e() {
        return this.f40625g;
    }

    public String f() {
        return this.f40626h;
    }

    public String g() {
        return this.f40627i;
    }

    public String h() {
        return this.f40628j;
    }

    public String i() {
        return this.f40629k;
    }

    public void j(String str) {
        this.f40635q = str;
    }

    public String k() {
        return this.f40631m;
    }

    public void l(String str) {
        this.f40640v = str;
    }

    public void m(String str) {
        this.f40642x = str;
    }

    public String n() {
        return this.f40635q;
    }

    public void o(String str) {
        this.f40644z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f40639u;
    }

    public String r() {
        return this.f40640v;
    }

    public String s() {
        return this.f40641w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f40642x) ? "" : this.f40642x;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardReportData [key=");
        sb2.append(this.f40635q);
        sb2.append(", networkType=");
        sb2.append(this.f40639u);
        sb2.append(", isCompleteView=");
        sb2.append(this.f40634p);
        sb2.append(", watchedMillis=");
        sb2.append(this.M);
        sb2.append(", videoLength=");
        sb2.append(this.J);
        sb2.append(", offerUrl=");
        sb2.append(this.f40641w);
        sb2.append(", reason=");
        sb2.append(this.f40642x);
        sb2.append(", result=");
        sb2.append(this.C);
        sb2.append(", duration=");
        sb2.append(this.f40627i);
        sb2.append(", videoSize=");
        return a.b.g(this.K, C3191e4.i.f36531e, sb2);
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f40644z;
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(String str) {
        this.f40620b = str;
    }

    public int b() {
        return this.f40621c;
    }

    public void d(String str) {
        this.f40626h = str;
    }

    public void e(String str) {
        this.f40627i = str;
    }

    public void f(String str) {
        this.f40628j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f40629k = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f40630l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f40633o = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f40630l;
    }

    public void k(String str) {
        this.f40637s = str;
    }

    public String l() {
        return this.f40633o;
    }

    public int m() {
        return this.f40634p;
    }

    public void n(String str) {
        this.f40643y = str;
    }

    public String o() {
        return this.f40636r;
    }

    public int p() {
        return this.f40638t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, G5.N);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f40643y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f40621c = i10;
    }

    public void b(int i10) {
        this.f40638t = i10;
    }

    public void c(int i10) {
        this.f40639u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f40619a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f40619a == null) {
            this.f40619a = new HashMap();
        }
        try {
            this.f40619a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f40623e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f40635q = str;
        this.f40640v = str4;
        this.f40639u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f40641w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f40642x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f40635q = str;
        this.f40639u = i10;
        this.f40640v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f40641w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f40627i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f40635q = "m_download_end";
        } else if (i11 == 95) {
            this.f40635q = "2000025";
        }
        int iS = l0.s(context);
        this.f40639u = iS;
        this.f40640v = l0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f40643y = campaignEx.getRequestId();
        this.f40644z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f40641w)) {
            try {
                this.f40641w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f40627i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f40635q = str;
        this.f40631m = str2;
        this.H = str3;
        this.f40636r = str4;
        this.I = str5;
        this.f40624f = str6;
        this.f40639u = i10;
        this.f40640v = str7;
    }

    public n(String str) {
        this.f40632n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f40635q = str;
        this.C = i10;
        this.f40627i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f40629k = URLEncoder.encode(str3, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f40624f = str4;
        this.I = str5;
        this.f40642x = str6;
        this.f40628j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f40635q = str;
        this.f40624f = str2;
        this.f40643y = str3;
        this.f40644z = str4;
        this.I = str5;
        this.f40639u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f40635q = str;
        this.f40624f = str2;
        this.f40643y = str3;
        this.f40644z = str4;
        this.I = str5;
        this.f40639u = i10;
        this.f40642x = str6;
        this.f40623e = i11;
    }
}
