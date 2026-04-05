package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import j1.o2;
import java.io.Serializable;
import java.util.HashMap;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f40646a;

    /* renamed from: b, reason: collision with root package name */
    private int f40647b;

    /* renamed from: c, reason: collision with root package name */
    private String f40648c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f40649d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f40650e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f40651f;

    /* renamed from: g, reason: collision with root package name */
    private String f40652g;

    /* renamed from: h, reason: collision with root package name */
    private String f40653h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40654i;

    /* renamed from: j, reason: collision with root package name */
    private int f40655j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f40656k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f40657l;

    /* renamed from: m, reason: collision with root package name */
    private int f40658m;

    /* renamed from: n, reason: collision with root package name */
    private String f40659n;

    /* renamed from: o, reason: collision with root package name */
    private String f40660o;

    /* renamed from: p, reason: collision with root package name */
    private String f40661p;

    public b(int i10) {
        this.f40646a = i10;
        this.f40647b = a.b(i10);
    }

    public void a(Throwable th2) {
        this.f40649d = th2;
    }

    public int b() {
        return this.f40646a;
    }

    public void c(String str) {
        this.f40648c = str;
    }

    public void d(String str) {
        this.f40656k = str;
    }

    public MBridgeIds e() {
        if (this.f40651f == null) {
            this.f40651f = new MBridgeIds();
        }
        return this.f40651f;
    }

    public String f() {
        return this.f40653h;
    }

    public String g() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f40648c) ? this.f40648c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f40646a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f40649d;
        if (th2 == null) {
            return strA;
        }
        String message = th2.getMessage();
        return !TextUtils.isEmpty(message) ? i.d(strA, " # ", message) : strA;
    }

    public String h() {
        return this.f40656k;
    }

    public int i() {
        return this.f40655j;
    }

    public CampaignEx a() {
        return this.f40650e;
    }

    public void b(String str) {
        this.f40653h = str;
    }

    public int c() {
        return this.f40647b;
    }

    public String d() {
        return this.f40661p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MBFailureReason{errorCode=");
        sb2.append(this.f40646a);
        sb2.append(", errorSubType=");
        sb2.append(this.f40647b);
        sb2.append(", message='");
        sb2.append(this.f40648c);
        sb2.append("', cause=");
        sb2.append(this.f40649d);
        sb2.append(", campaign=");
        sb2.append(this.f40650e);
        sb2.append(", ids=");
        sb2.append(this.f40651f);
        sb2.append(", requestId='");
        sb2.append(this.f40652g);
        sb2.append("', localRequestId='");
        sb2.append(this.f40653h);
        sb2.append("', isHeaderBidding=");
        sb2.append(this.f40654i);
        sb2.append(", typeD=");
        sb2.append(this.f40655j);
        sb2.append(", reasonD='");
        sb2.append(this.f40656k);
        sb2.append(rJqlArycrfkilN.NvHMYgAghWaXzm);
        sb2.append(this.f40657l);
        sb2.append(", serverErrorCode=");
        sb2.append(this.f40658m);
        sb2.append(", errorUrl='");
        sb2.append(this.f40659n);
        sb2.append("', serverErrorResponse='");
        return o2.o(sb2, this.f40660o, "'}");
    }

    public void a(CampaignEx campaignEx) {
        this.f40650e = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f40651f = mBridgeIds;
    }

    public b(int i10, String str) {
        this.f40646a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f40648c = str;
        this.f40647b = a.b(i10);
    }

    public void a(boolean z10) {
        this.f40654i = z10;
    }

    public void a(Object obj, Object obj2) {
        if (this.f40657l == null) {
            this.f40657l = new HashMap<>();
        }
        this.f40657l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f40657l;
        if (map != null && map.containsKey(obj)) {
            return this.f40657l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f40655j = i10;
    }

    public void a(String str) {
        this.f40661p = str;
    }
}
