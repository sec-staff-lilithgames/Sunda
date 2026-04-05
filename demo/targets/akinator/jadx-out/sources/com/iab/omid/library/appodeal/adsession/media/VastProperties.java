package com.iab.omid.library.appodeal.adsession.media;

import com.iab.omid.library.appodeal.utils.d;
import com.iab.omid.library.appodeal.utils.g;
import com.ironsource.C3191e4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30355a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f30356b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30357c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f30358d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f30355a = z10;
        this.f30356b = f10;
        this.f30357c = z11;
        this.f30358d = position;
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
            jSONObject.put("skippable", this.f30355a);
            if (this.f30355a) {
                jSONObject.put("skipOffset", this.f30356b);
            }
            jSONObject.put("autoPlay", this.f30357c);
            jSONObject.put(C3191e4.h.L, this.f30358d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f30358d;
    }

    public Float getSkipOffset() {
        return this.f30356b;
    }

    public boolean isAutoPlay() {
        return this.f30357c;
    }

    public boolean isSkippable() {
        return this.f30355a;
    }
}
