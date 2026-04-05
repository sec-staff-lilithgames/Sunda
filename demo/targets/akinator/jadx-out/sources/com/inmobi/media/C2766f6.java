package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2766f6 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f32835a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f32836b;

    /* renamed from: c, reason: collision with root package name */
    public final C2750e7 f32837c;

    public C2766f6(JSONObject vitals, JSONArray logs, C2750e7 data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vitals, "vitals");
        kotlin.jvm.internal.e0.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        this.f32835a = vitals;
        this.f32836b = logs;
        this.f32837c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2766f6)) {
            return false;
        }
        C2766f6 c2766f6 = (C2766f6) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32835a, c2766f6.f32835a) && kotlin.jvm.internal.e0.areEqual(this.f32836b, c2766f6.f32836b) && kotlin.jvm.internal.e0.areEqual(this.f32837c, c2766f6.f32837c);
    }

    public final int hashCode() {
        return this.f32837c.hashCode() + ((this.f32836b.hashCode() + (this.f32835a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f32835a + ", logs=" + this.f32836b + ", data=" + this.f32837c + ')';
    }
}
