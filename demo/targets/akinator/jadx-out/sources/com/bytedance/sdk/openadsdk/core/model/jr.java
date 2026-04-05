package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr {

    /* renamed from: jd, reason: collision with root package name */
    public static int f20700jd = 2;
    public static int jpo = 1;
    private int wqx = 5;

    /* renamed from: cm, reason: collision with root package name */
    private int f20701cm = 30;
    private int my = 70;

    /* renamed from: jj, reason: collision with root package name */
    private int f20702jj = 1;

    /* renamed from: qk, reason: collision with root package name */
    private int f20703qk = jpo;
    private int xyk = 0;
    private int zz = 0;

    /* renamed from: yd, reason: collision with root package name */
    private int f20704yd = 3;

    public int cm() {
        return this.wqx;
    }

    public int jd() {
        return this.zz;
    }

    public int jj() {
        return this.my;
    }

    public int jpo() {
        return this.f20704yd;
    }

    public int my() {
        return this.f20701cm;
    }

    public int qk() {
        return this.f20702jj;
    }

    public int wqx() {
        return this.xyk;
    }

    public int xyk() {
        return this.f20703qk;
    }

    public void cm(int i10) {
        this.wqx = i10;
    }

    public void jd(int i10) {
        this.zz = i10;
    }

    public void jj(int i10) {
        this.my = i10;
    }

    public void jpo(int i10) {
        this.f20704yd = i10;
    }

    public void my(int i10) {
        this.f20701cm = i10;
    }

    public void qk(int i10) {
        this.f20702jj = i10;
    }

    public void wqx(int i10) {
        this.xyk = i10;
    }

    public void xyk(int i10) {
        this.f20703qk = i10;
    }

    public boolean jpo(boolean z10) {
        if (z10) {
            int i10 = this.xyk;
            return i10 == 1 || i10 == 3;
        }
        int i11 = this.xyk;
        return i11 == 3 || i11 == 2;
    }

    public JSONObject jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.wqx);
            jSONObject.put("ceiling_ratio", this.f20701cm);
            jSONObject.put("expand_ratio", this.my);
            jSONObject.put("back_type", this.f20702jj);
            jSONObject.put("boc_return_type", this.f20703qk);
            jSONObject.put("pre_render_status", this.xyk);
            jSONObject.put("pre_render_use_gecko", this.zz);
            jSONObject.put("pre_render_add_type", this.f20704yd);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("InteractionParams", th2.getMessage());
            return jSONObject;
        }
    }
}
