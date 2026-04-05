package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements com.bytedance.sdk.component.adexpress.wqx {

    /* renamed from: au, reason: collision with root package name */
    public JSONObject f20650au;

    /* renamed from: cm, reason: collision with root package name */
    public final float f20651cm;

    /* renamed from: if, reason: not valid java name */
    public int f127if;

    /* renamed from: jd, reason: collision with root package name */
    public final float f20652jd;

    /* renamed from: jj, reason: collision with root package name */
    public final long f20653jj;
    public final float jpo;

    /* renamed from: ju, reason: collision with root package name */
    public final boolean f20654ju;
    public final long my;
    public boolean oya;
    public int prr;

    /* renamed from: qk, reason: collision with root package name */
    public final String f20655qk;
    public final float wqx;
    public int xyk;

    /* renamed from: yd, reason: collision with root package name */
    public SparseArray<wqx.jpo> f20656yd;
    public JSONObject zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: au, reason: collision with root package name */
        private JSONObject f20657au;

        /* renamed from: cm, reason: collision with root package name */
        private float f20658cm;

        /* renamed from: if, reason: not valid java name */
        private int f128if;

        /* renamed from: jd, reason: collision with root package name */
        private long f20659jd;

        /* renamed from: jj, reason: collision with root package name */
        private float f20660jj;

        /* renamed from: ju, reason: collision with root package name */
        private JSONObject f20661ju;
        private float my;
        private boolean prr;

        /* renamed from: qk, reason: collision with root package name */
        private float f20662qk;
        private long wqx;
        private int xyk;

        /* renamed from: yd, reason: collision with root package name */
        private int f20663yd;
        private String zz;
        private boolean oya = false;
        protected SparseArray<wqx.jpo> jpo = new SparseArray<>();

        public jpo cm(float f10) {
            this.f20662qk = f10;
            return this;
        }

        public jpo jd(int i10) {
            this.f20663yd = i10;
            return this;
        }

        public jpo jpo(int i10) {
            this.f128if = i10;
            return this;
        }

        public jpo wqx(int i10) {
            this.xyk = i10;
            return this;
        }

        public jpo jd(long j10) {
            this.wqx = j10;
            return this;
        }

        public jpo jpo(JSONObject jSONObject) {
            this.f20661ju = jSONObject;
            return this;
        }

        public jpo wqx(float f10) {
            this.f20660jj = f10;
            return this;
        }

        public jpo jd(float f10) {
            this.my = f10;
            return this;
        }

        public jpo jpo(boolean z10) {
            this.prr = z10;
            return this;
        }

        public jpo jd(JSONObject jSONObject) {
            this.f20657au = jSONObject;
            return this;
        }

        public jpo jpo(long j10) {
            this.f20659jd = j10;
            return this;
        }

        public jpo jd(boolean z10) {
            this.oya = z10;
            return this;
        }

        public jpo jpo(float f10) {
            this.f20658cm = f10;
            return this;
        }

        public jpo jpo(String str) {
            this.zz = str;
            return this;
        }

        public jpo jpo(SparseArray<wqx.jpo> sparseArray) {
            this.jpo = sparseArray;
            return this;
        }

        public hna jpo() {
            return new hna(this);
        }
    }

    private hna(jpo jpoVar) {
        this.oya = false;
        this.jpo = jpoVar.f20662qk;
        this.f20652jd = jpoVar.f20660jj;
        this.wqx = jpoVar.my;
        this.f20651cm = jpoVar.f20658cm;
        this.my = jpoVar.wqx;
        this.f20653jj = jpoVar.f20659jd;
        this.f20655qk = jpoVar.zz;
        this.f20656yd = jpoVar.jpo;
        this.f20654ju = jpoVar.prr;
        this.xyk = jpoVar.f20663yd;
        this.zz = jpoVar.f20661ju;
        this.f127if = jpoVar.f128if;
        this.f20650au = jpoVar.f20657au;
        this.oya = jpoVar.oya;
        this.prr = jpoVar.xyk;
    }
}
