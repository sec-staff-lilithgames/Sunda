package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.qc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2958qc implements InterfaceC3048w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f33292a;

    public C2958qc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f33292a = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // com.inmobi.media.InterfaceC3048w1
    public final void a(C2843k assetBatch, byte b10) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        if (assetBatch.f32987c == null || assetBatch.f32991g.size() <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", ((C2826j) assetBatch.f32991g.get(0)).f32940b);
            jSONObject.put("reason", (int) ((C2826j) assetBatch.f32991g.get(0)).f32950l);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        String strR = p0.o2.r(new StringBuilder("sendSaveContentResult(\"saveContent_"), assetBatch.f32990f, "\", 'failed', \"", sv.k0.replace$default(string, "\"", "\\\"", false, 4, (Object) null), "\");");
        F5 f52 = this.f33292a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f52).b(str, O6.a(str, "access$getTAG$cp(...)", "Failure injection ", strR));
        }
        this.f33292a.a(assetBatch.f32987c, strR);
    }

    @Override // com.inmobi.media.InterfaceC3048w1
    public final void a(C2843k assetBatch) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        if (assetBatch.f32987c == null || assetBatch.f32991g.size() <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("sendSaveContentResult(\"saveContent_");
        sb2.append(assetBatch.f32990f);
        sb2.append("\", 'success', \"");
        String strO = j1.o2.o(sb2, ((C2826j) assetBatch.f32991g.get(0)).f32948j, "\");");
        F5 f52 = this.f33292a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f52).a(str, O6.a(str, "access$getTAG$cp(...)", "Success injection ", strO));
        }
        this.f33292a.a(assetBatch.f32987c, strO);
    }
}
