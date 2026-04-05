package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f13431a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13432b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13433c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13434d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13435e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13436f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13437g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13438h;

    /* renamed from: i, reason: collision with root package name */
    private final float f13439i;

    /* renamed from: j, reason: collision with root package name */
    private final float f13440j;

    public a8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f13431a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f13432b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f13433c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f13434d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f13435e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f13436f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f13437g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f13438h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f13439i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f13440j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f13439i;
    }

    public long b() {
        return this.f13437g;
    }

    public float c() {
        return this.f13440j;
    }

    public long d() {
        return this.f13438h;
    }

    public int e() {
        return this.f13434d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a8 a8Var = (a8) obj;
            if (this.f13431a == a8Var.f13431a && this.f13432b == a8Var.f13432b && this.f13433c == a8Var.f13433c && this.f13434d == a8Var.f13434d && this.f13435e == a8Var.f13435e && this.f13436f == a8Var.f13436f && this.f13437g == a8Var.f13437g && this.f13438h == a8Var.f13438h && Float.compare(a8Var.f13439i, this.f13439i) == 0 && Float.compare(a8Var.f13440j, this.f13440j) == 0) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f13432b;
    }

    public int g() {
        return this.f13433c;
    }

    public long h() {
        return this.f13436f;
    }

    public int hashCode() {
        int i10 = ((((((((((((((this.f13431a * 31) + this.f13432b) * 31) + this.f13433c) * 31) + this.f13434d) * 31) + (this.f13435e ? 1 : 0)) * 31) + this.f13436f) * 31) + this.f13437g) * 31) + this.f13438h) * 31;
        float f10 = this.f13439i;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f13440j;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f13431a;
    }

    public boolean j() {
        return this.f13435e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoButtonProperties{widthPercentOfScreen=");
        sb2.append(this.f13431a);
        sb2.append(", heightPercentOfScreen=");
        sb2.append(this.f13432b);
        sb2.append(", margin=");
        sb2.append(this.f13433c);
        sb2.append(", gravity=");
        sb2.append(this.f13434d);
        sb2.append(", tapToFade=");
        sb2.append(this.f13435e);
        sb2.append(", tapToFadeDurationMillis=");
        sb2.append(this.f13436f);
        sb2.append(", fadeInDurationMillis=");
        sb2.append(this.f13437g);
        sb2.append(", fadeOutDurationMillis=");
        sb2.append(this.f13438h);
        sb2.append(", fadeInDelay=");
        sb2.append(this.f13439i);
        sb2.append(", fadeOutDelay=");
        return a.b.n(sb2, this.f13440j, AbstractJsonLexerKt.END_OBJ);
    }
}
