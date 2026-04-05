package com.bytedance.sdk.openadsdk.core.ju.jj;

import com.bytedance.adsdk.ugeno.core.opi;
import com.bytedance.sdk.component.adexpress.jd.au;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends au {

    /* renamed from: cm, reason: collision with root package name */
    private float f20518cm;

    /* renamed from: jd, reason: collision with root package name */
    private opi f20519jd;
    private JSONObject jpo;
    private boolean my;
    private float wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ju.jj.jpo$jpo, reason: collision with other inner class name */
    public static class C0128jpo extends au.jpo {

        /* renamed from: cm, reason: collision with root package name */
        private float f20520cm;

        /* renamed from: jd, reason: collision with root package name */
        private opi f20521jd;
        private JSONObject jpo;
        private boolean my;
        private float wqx;

        public C0128jpo jj(boolean z10) {
            this.my = z10;
            return this;
        }

        public C0128jpo jd(float f10) {
            this.f20520cm = f10;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.jd.au.jpo
        /* renamed from: jd, reason: merged with bridge method [inline-methods] */
        public jpo jpo() {
            return new jpo(this);
        }

        public C0128jpo jpo(JSONObject jSONObject) {
            this.jpo = jSONObject;
            return this;
        }

        public C0128jpo jpo(opi opiVar) {
            this.f20521jd = opiVar;
            return this;
        }

        public C0128jpo jpo(float f10) {
            this.wqx = f10;
            return this;
        }
    }

    public jpo(C0128jpo c0128jpo) {
        super(c0128jpo);
        this.jpo = c0128jpo.jpo;
        this.f20519jd = c0128jpo.f20521jd;
        this.wqx = c0128jpo.wqx;
        this.f20518cm = c0128jpo.f20520cm;
        this.my = c0128jpo.my;
    }

    public boolean ef() {
        return this.my;
    }

    public opi kln() {
        return this.f20519jd;
    }

    public float rv() {
        return this.wqx;
    }

    public JSONObject sz() {
        return this.jpo;
    }

    public float uu() {
        return this.f20518cm;
    }
}
