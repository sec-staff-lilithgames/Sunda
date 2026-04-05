package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import com.ironsource.C3191e4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30491a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f30492b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30493c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f30494d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f30491a = z10;
        this.f30492b = f10;
        this.f30493c = z11;
        this.f30494d = position;
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
            jSONObject.put("skippable", this.f30491a);
            if (this.f30491a) {
                jSONObject.put("skipOffset", this.f30492b);
            }
            jSONObject.put("autoPlay", this.f30493c);
            jSONObject.put(C3191e4.h.L, this.f30494d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f30494d;
    }

    public Float getSkipOffset() {
        return this.f30492b;
    }

    public boolean isAutoPlay() {
        return this.f30493c;
    }

    public boolean isSkippable() {
        return this.f30491a;
    }
}
