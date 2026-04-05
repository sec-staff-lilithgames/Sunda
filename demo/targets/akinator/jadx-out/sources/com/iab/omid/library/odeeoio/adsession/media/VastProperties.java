package com.iab.omid.library.odeeoio.adsession.media;

import com.iab.omid.library.odeeoio.d.c;
import com.iab.omid.library.odeeoio.d.e;
import com.ironsource.C3191e4;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31168a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f31169b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31170c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f31171d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f31168a = z10;
        this.f31169b = f10;
        this.f31170c = z11;
        this.f31171d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f31168a);
            if (this.f31168a) {
                jSONObject.put("skipOffset", this.f31169b);
            }
            jSONObject.put("autoPlay", this.f31170c);
            jSONObject.put(C3191e4.h.L, this.f31171d);
            return jSONObject;
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f31171d;
    }

    public Float getSkipOffset() {
        return this.f31169b;
    }

    public boolean isAutoPlay() {
        return this.f31170c;
    }

    public boolean isSkippable() {
        return this.f31168a;
    }
}
