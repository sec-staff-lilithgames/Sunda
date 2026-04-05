package com.inmobi.media;

import java.io.IOException;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2817i6 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2833j6 f32926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2817i6(C2833j6 c2833j6) {
        super(0);
        this.f32926a = c2833j6;
    }

    @Override // kv.a
    public final Object invoke() throws JSONException, IOException {
        C2766f6 c2766f6 = this.f32926a.f32962a;
        JSONObject jSONObject = c2766f6.f32835a;
        JSONArray jSONArray = c2766f6.f32836b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String string = jSONObject2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        AbstractC2986s7.a("IncompleteLogFinalizer", string, this.f32926a.f32962a.f32837c.f32807a);
        String str = this.f32926a.f32962a.f32837c.f32807a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C2750e7 c2750e7 = this.f32926a.f32962a.f32837c;
        AbstractC2807hd.d().b(new C2750e7(str, timeInMillis, 0, c2750e7.f32810d, true, c2750e7.f32812f));
        return tu.x0.f87415a;
    }
}
