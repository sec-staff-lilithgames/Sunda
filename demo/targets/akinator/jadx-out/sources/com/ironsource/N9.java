package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class N9 {

    /* renamed from: a, reason: collision with root package name */
    private String f35045a;

    /* renamed from: e, reason: collision with root package name */
    private String f35049e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f35050f;

    /* renamed from: g, reason: collision with root package name */
    private final Ic f35051g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35052h;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35046b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35047c = false;

    /* renamed from: d, reason: collision with root package name */
    private C3267i8 f35048d = null;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f35053i = false;

    /* renamed from: j, reason: collision with root package name */
    protected String f35054j = null;

    public N9(String str, Ic ic2) throws NullPointerException {
        this.f35045a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f35051g = (Ic) SDKUtils.requireNonNull(ic2, "AdListener name can't be null");
    }

    public N9 a(boolean z10) {
        this.f35047c = z10;
        return this;
    }

    public N9 b(boolean z10) {
        this.f35053i = z10;
        return this;
    }

    public N9 c() {
        this.f35046b = true;
        return this;
    }

    public N9 a(C3267i8 c3267i8) {
        this.f35048d = c3267i8;
        return this;
    }

    public N9 b(String str) {
        this.f35054j = str;
        return this;
    }

    public N9 c(boolean z10) {
        this.f35052h = z10;
        return this;
    }

    public N9 a(String str) {
        this.f35049e = str;
        return this;
    }

    public String b() throws JSONException {
        String str = this.f35049e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f35045a);
            jSONObject.put("rewarded", this.f35046b);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return (this.f35047c || this.f35052h) ? X9.a() : X9.a(jSONObject);
    }

    public N9 a(Map<String, String> map) {
        this.f35050f = map;
        return this;
    }

    public M9 a() {
        return new M9(b(), this.f35045a, this.f35046b, this.f35047c, this.f35052h, this.f35053i, this.f35054j, this.f35050f, this.f35051g, this.f35048d);
    }
}
