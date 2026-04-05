package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final String f32520a;

    /* renamed from: b, reason: collision with root package name */
    private long f32521b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f32522c;

    /* renamed from: d, reason: collision with root package name */
    private String f32523d;

    /* renamed from: e, reason: collision with root package name */
    private String f32524e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32525f;

    /* renamed from: g, reason: collision with root package name */
    private String f32526g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32527h;

    /* renamed from: i, reason: collision with root package name */
    private String f32528i;

    /* renamed from: j, reason: collision with root package name */
    private String f32529j;

    public Y(String mAdType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mAdType, "mAdType");
        this.f32520a = mAdType;
        this.f32521b = Long.MIN_VALUE;
        this.f32525f = w0.i.c("toString(...)");
        this.f32526g = "";
        this.f32528i = "activity";
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    public final Y a(long j10) {
        this.f32521b = j10;
        return this;
    }

    public final Y d(String m10Context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(m10Context, "m10Context");
        this.f32528i = m10Context;
        return this;
    }

    public final Y e(String str) {
        this.f32524e = str;
        return this;
    }

    public final Y a(C2675a0 placement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        this.f32521b = placement.g();
        this.f32528i = placement.j();
        this.f32522c = placement.f();
        this.f32526g = placement.a();
        return this;
    }

    public final Y b(String str) {
        this.f32529j = str;
        return this;
    }

    public final Y c(String str) {
        this.f32523d = str;
        return this;
    }

    public final Y a(String adSize) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSize, "adSize");
        this.f32526g = adSize;
        return this;
    }

    public final Y a(Map<String, String> map) {
        this.f32522c = map;
        return this;
    }

    public final Y a(boolean z10) {
        this.f32527h = z10;
        return this;
    }

    public final C2675a0 a() throws IllegalStateException {
        String str;
        long j10 = this.f32521b;
        if (j10 != Long.MIN_VALUE) {
            Map<String, String> map = this.f32522c;
            if (map == null || (str = map.get("tp")) == null) {
                str = "";
            }
            C2675a0 c2675a0 = new C2675a0(j10, str, this.f32520a, this.f32524e, null);
            c2675a0.f32614d = this.f32523d;
            c2675a0.a(this.f32522c);
            c2675a0.a(this.f32526g);
            c2675a0.b(this.f32528i);
            c2675a0.f32617g = this.f32525f;
            c2675a0.f32620j = this.f32527h;
            c2675a0.f32621k = this.f32529j;
            return c2675a0;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }
}
