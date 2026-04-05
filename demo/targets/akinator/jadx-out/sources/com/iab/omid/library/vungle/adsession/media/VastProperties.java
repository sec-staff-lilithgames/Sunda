package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.ironsource.C3191e4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31407a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f31408b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31409c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f31410d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f31407a = z10;
        this.f31408b = f10;
        this.f31409c = z11;
        this.f31410d = position;
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
            jSONObject.put("skippable", this.f31407a);
            if (this.f31407a) {
                jSONObject.put("skipOffset", this.f31408b);
            }
            jSONObject.put("autoPlay", this.f31409c);
            jSONObject.put(C3191e4.h.L, this.f31410d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f31410d;
    }

    public Float getSkipOffset() {
        return this.f31408b;
    }

    public boolean isAutoPlay() {
        return this.f31409c;
    }

    public boolean isSkippable() {
        return this.f31407a;
    }
}
