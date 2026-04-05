package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f32126a;

    public P5(JSONObject jSONObject) {
        this.f32126a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean boolC = Se.f32278a.c();
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        if (zBooleanValue) {
            return;
        }
        W5.a(this.f32126a);
    }
}
