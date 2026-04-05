package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.ironsource.C3191e4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30220a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f30221b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30222c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f30223d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f30220a = z10;
        this.f30221b = f10;
        this.f30222c = z11;
        this.f30223d = position;
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
            jSONObject.put("skippable", this.f30220a);
            if (this.f30220a) {
                jSONObject.put("skipOffset", this.f30221b);
            }
            jSONObject.put("autoPlay", this.f30222c);
            jSONObject.put(C3191e4.h.L, this.f30223d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f30223d;
    }

    public Float getSkipOffset() {
        return this.f30221b;
    }

    public boolean isAutoPlay() {
        return this.f30222c;
    }

    public boolean isSkippable() {
        return this.f30220a;
    }
}
