package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34396a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34397b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34398c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34399d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34400e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34401f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34402g;

    /* renamed from: h, reason: collision with root package name */
    private final int f34403h;

    /* renamed from: i, reason: collision with root package name */
    private final int f34404i;

    /* renamed from: j, reason: collision with root package name */
    private final List<Integer> f34405j;

    /* renamed from: k, reason: collision with root package name */
    private final List<Integer> f34406k;

    /* renamed from: l, reason: collision with root package name */
    private final List<Integer> f34407l;

    /* renamed from: m, reason: collision with root package name */
    private final List<Integer> f34408m;

    public G1(JSONObject applicationEvents) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationEvents, "applicationEvents");
        this.f34396a = applicationEvents.optBoolean(I1.f34631a, false);
        this.f34397b = applicationEvents.optBoolean(I1.f34632b, false);
        this.f34398c = applicationEvents.optBoolean(I1.f34633c, false);
        this.f34399d = applicationEvents.optInt(I1.f34634d, -1);
        String strOptString = applicationEvents.optString(I1.f34635e);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f34400e = strOptString;
        String strOptString2 = applicationEvents.optString(I1.f34636f);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f34401f = strOptString2;
        this.f34402g = applicationEvents.optInt(I1.f34637g, -1);
        this.f34403h = applicationEvents.optInt(I1.f34638h, -1);
        this.f34404i = applicationEvents.optInt(I1.f34639i, 5000);
        this.f34405j = a(applicationEvents, I1.f34640j);
        this.f34406k = a(applicationEvents, I1.f34641k);
        this.f34407l = a(applicationEvents, I1.f34642l);
        this.f34408m = a(applicationEvents, I1.f34643m);
    }

    public final int a() {
        return this.f34402g;
    }

    public final boolean b() {
        return this.f34398c;
    }

    public final int c() {
        return this.f34399d;
    }

    public final String d() {
        return this.f34401f;
    }

    public final int e() {
        return this.f34404i;
    }

    public final int f() {
        return this.f34403h;
    }

    public final List<Integer> g() {
        return this.f34408m;
    }

    public final List<Integer> h() {
        return this.f34406k;
    }

    public final List<Integer> i() {
        return this.f34405j;
    }

    public final boolean j() {
        return this.f34397b;
    }

    public final boolean k() {
        return this.f34396a;
    }

    public final String l() {
        return this.f34400e;
    }

    public final List<Integer> m() {
        return this.f34407l;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return uu.p0.emptyList();
        }
        qv.m mVarUntil = qv.v.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator it = mVarUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((uu.j1) it).nextInt())));
        }
        return arrayList;
    }
}
