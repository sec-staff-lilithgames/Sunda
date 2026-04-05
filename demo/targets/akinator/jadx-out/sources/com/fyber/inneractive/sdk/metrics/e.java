package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public Long f24051a = null;

    /* renamed from: b, reason: collision with root package name */
    public Long f24052b = null;

    /* renamed from: c, reason: collision with root package name */
    public Long f24053c = null;

    /* renamed from: d, reason: collision with root package name */
    public Long f24054d = null;

    /* renamed from: e, reason: collision with root package name */
    public Long f24055e = null;

    /* renamed from: f, reason: collision with root package name */
    public Long f24056f = null;

    /* renamed from: g, reason: collision with root package name */
    public Long f24057g = null;

    /* renamed from: h, reason: collision with root package name */
    public Long f24058h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24057g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24051a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24054d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24056f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24052b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24053c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24058h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f24055e = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final HashMap j() {
        HashMap map = new HashMap();
        Long l9 = this.f24052b;
        if (l9 != null && this.f24051a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l9.longValue() - this.f24051a.longValue()));
        }
        Long l10 = this.f24058h;
        if (l10 != null && this.f24052b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l10.longValue() - this.f24052b.longValue()));
        }
        Long l11 = this.f24054d;
        if (l11 != null && this.f24058h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l11.longValue() - this.f24058h.longValue()));
        }
        Long l12 = this.f24053c;
        if (l12 != null && this.f24052b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l12.longValue() - this.f24052b.longValue()));
        }
        Long l13 = this.f24054d;
        if (l13 != null && this.f24053c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l13.longValue() - this.f24053c.longValue()));
        }
        Long l14 = this.f24055e;
        if (l14 != null && this.f24054d != null) {
            map.put("ad_loaded_result", Long.valueOf(l14.longValue() - this.f24054d.longValue()));
        }
        Long l15 = this.f24056f;
        if (l15 != null && this.f24055e != null) {
            map.put("publisher_notified", Long.valueOf(l15.longValue() - this.f24055e.longValue()));
        }
        Long l16 = this.f24057g;
        if (l16 != null && this.f24051a != null) {
            map.put("roundtrip", Long.valueOf(l16.longValue() - this.f24051a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsCollectorData{");
        if (this.f24051a != null && this.f24052b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f24052b.longValue() - this.f24051a.longValue());
        }
        if (this.f24058h != null && this.f24052b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f24058h.longValue() - this.f24052b.longValue());
        }
        if (this.f24053c != null && this.f24052b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f24053c.longValue() - this.f24052b.longValue());
        }
        if (this.f24054d != null && this.f24053c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f24054d.longValue() - this.f24053c.longValue());
        }
        if (this.f24055e != null && this.f24054d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f24055e.longValue() - this.f24054d.longValue());
        }
        if (this.f24056f != null && this.f24055e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f24056f.longValue() - this.f24055e.longValue());
        }
        if (this.f24057g != null && this.f24051a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f24057g.longValue() - this.f24051a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
