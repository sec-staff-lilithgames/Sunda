package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.utils.d;
import com.iab.omid.library.fyber.utils.g;
import com.ironsource.C3191e4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30621a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f30622b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30623c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f30624d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f30621a = z10;
        this.f30622b = f10;
        this.f30623c = z11;
        this.f30624d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f30621a);
            if (this.f30621a) {
                jSONObject.put("skipOffset", this.f30622b);
            }
            jSONObject.put("autoPlay", this.f30623c);
            jSONObject.put(C3191e4.h.L, this.f30624d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f30624d;
    }

    public Float getSkipOffset() {
        return this.f30622b;
    }

    public boolean isAutoPlay() {
        return this.f30623c;
    }

    public boolean isSkippable() {
        return this.f30621a;
    }
}
