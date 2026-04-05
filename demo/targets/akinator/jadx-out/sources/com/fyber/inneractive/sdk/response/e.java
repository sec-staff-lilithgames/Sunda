package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {
    public String A;
    public String B;
    public String C;
    public String E;
    public String F;
    public String G;
    public String I;
    public CreativeType M;

    /* renamed from: a, reason: collision with root package name */
    public long f26629a;

    /* renamed from: b, reason: collision with root package name */
    public long f26630b;

    /* renamed from: c, reason: collision with root package name */
    public long f26631c;

    /* renamed from: d, reason: collision with root package name */
    public String f26632d;

    /* renamed from: e, reason: collision with root package name */
    public int f26633e;

    /* renamed from: f, reason: collision with root package name */
    public int f26634f;

    /* renamed from: g, reason: collision with root package name */
    public int f26635g;

    /* renamed from: h, reason: collision with root package name */
    public String f26636h;

    /* renamed from: i, reason: collision with root package name */
    public String f26637i;

    /* renamed from: j, reason: collision with root package name */
    public String f26638j;

    /* renamed from: k, reason: collision with root package name */
    public String f26639k;

    /* renamed from: l, reason: collision with root package name */
    public String f26640l;

    /* renamed from: m, reason: collision with root package name */
    public String f26641m;

    /* renamed from: n, reason: collision with root package name */
    public String f26642n;

    /* renamed from: o, reason: collision with root package name */
    public String f26643o;

    /* renamed from: p, reason: collision with root package name */
    public UnitDisplayType f26644p;

    /* renamed from: q, reason: collision with root package name */
    public String f26645q;

    /* renamed from: r, reason: collision with root package name */
    public Map f26646r;

    /* renamed from: s, reason: collision with root package name */
    public String f26647s;

    /* renamed from: t, reason: collision with root package name */
    public ImpressionData f26648t;

    /* renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.j f26649u;

    /* renamed from: x, reason: collision with root package name */
    public String f26652x;

    /* renamed from: z, reason: collision with root package name */
    public Exception f26654z;

    /* renamed from: v, reason: collision with root package name */
    public int f26650v = 0;

    /* renamed from: w, reason: collision with root package name */
    public float f26651w = -1.0f;

    /* renamed from: y, reason: collision with root package name */
    public int f26653y = -1;
    public boolean D = false;
    public m H = m.NONE;
    public boolean J = false;
    public long K = 0;
    public boolean L = false;

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar);

    public final void a(String str) throws NumberFormatException {
        long j10;
        try {
            j10 = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j10 = 20;
        }
        this.f26630b = j10;
        this.f26629a = TimeUnit.MINUTES.toMillis(j10) + this.f26631c;
    }

    public abstract InneractiveErrorCode b();

    public final boolean a() {
        return (this.H == m.NONE || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.G) || TextUtils.isEmpty(this.I)) ? false : true;
    }
}
