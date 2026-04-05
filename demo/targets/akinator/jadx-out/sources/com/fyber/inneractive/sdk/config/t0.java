package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f23399a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f23400b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f23401c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f23402d;

    /* renamed from: e, reason: collision with root package name */
    public Orientation f23403e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f23404f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f23405g;

    /* renamed from: h, reason: collision with root package name */
    public Skip f23406h;

    /* renamed from: i, reason: collision with root package name */
    public TapAction f23407i;

    /* renamed from: j, reason: collision with root package name */
    public UnitDisplayType f23408j;

    /* renamed from: k, reason: collision with root package name */
    public List f23409k;

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.f23399a = bool;
        this.f23400b = 5000;
        this.f23401c = 0;
        this.f23402d = bool;
        this.f23404f = 0;
        this.f23405g = 2048;
        this.f23406h = Skip.fromValue(0);
        this.f23409k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.f23399a);
        c1.a(jSONObject, "maxBitrate", this.f23400b);
        c1.a(jSONObject, "minBitrate", this.f23401c);
        c1.a(jSONObject, "muted", this.f23402d);
        c1.a(jSONObject, "orientation", this.f23403e);
        c1.a(jSONObject, "padding", this.f23404f);
        c1.a(jSONObject, "pivotBitrate", this.f23405g);
        c1.a(jSONObject, "skip", this.f23406h);
        c1.a(jSONObject, "tapAction", this.f23407i);
        c1.a(jSONObject, "unitDisplayType", this.f23408j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f23409k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
