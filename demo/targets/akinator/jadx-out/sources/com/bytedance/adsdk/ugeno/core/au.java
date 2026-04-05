package com.bytedance.adsdk.ugeno.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {

    /* renamed from: cm, reason: collision with root package name */
    private au f17704cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f17705jd;
    private com.bytedance.adsdk.ugeno.jd.wqx jpo;
    private au my;
    private JSONObject wqx;

    public au cm() {
        return this.f17704cm;
    }

    public int jd() {
        return this.f17705jd;
    }

    public com.bytedance.adsdk.ugeno.jd.wqx jpo() {
        return this.jpo;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.jpo + ", mEventType=" + this.f17705jd + ", mEvent=" + this.wqx + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject wqx() {
        return this.wqx;
    }

    public void jd(au auVar) {
        this.my = auVar;
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.jpo = wqxVar;
    }

    public void jpo(int i10) {
        this.f17705jd = i10;
    }

    public void jpo(JSONObject jSONObject) {
        this.wqx = jSONObject;
    }

    public void jpo(au auVar) {
        this.f17704cm = auVar;
    }
}
