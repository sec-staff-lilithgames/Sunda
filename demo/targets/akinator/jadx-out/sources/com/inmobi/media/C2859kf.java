package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2859kf {

    /* renamed from: h, reason: collision with root package name */
    public static final List f33024h = uu.p0.listOf((Object[]) new String[]{"image/jpeg", "image/png", "image/jpg"});

    /* renamed from: a, reason: collision with root package name */
    public final int f33025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33026b;

    /* renamed from: d, reason: collision with root package name */
    public final String f33028d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33031g;

    /* renamed from: c, reason: collision with root package name */
    public String f33027c = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f33029e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f33030f = new ArrayList();

    public C2859kf(int i10, int i11, String str) {
        this.f33025a = i10;
        this.f33026b = i11;
        this.f33028d = str;
    }

    public final ArrayList a(int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33029e.iterator();
        while (it.hasNext()) {
            C2842jf c2842jf = (C2842jf) it.next();
            if (c2842jf.f32983a == i10) {
                arrayList.add(c2842jf);
            }
        }
        return arrayList;
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f33028d;
            if (str != null) {
                jSONObject.put("id", str);
            }
            jSONObject.put("width", this.f33025a);
            jSONObject.put("height", this.f33026b);
            jSONObject.put("clickThroughUrl", this.f33027c);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f33029e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C2842jf) it.next()).toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f33030f.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((C2752e9) it2.next()).toString());
            }
            jSONObject.put("trackers", jSONArray2);
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("kf", "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return "";
        }
    }

    public final ArrayList a(String trackerEventType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerEventType, "trackerEventType");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33030f.iterator();
        while (it.hasNext()) {
            C2752e9 c2752e9 = (C2752e9) it.next();
            if (kotlin.jvm.internal.e0.areEqual(c2752e9.f32815b, trackerEventType)) {
                arrayList.add(c2752e9);
            }
        }
        return arrayList;
    }
}
