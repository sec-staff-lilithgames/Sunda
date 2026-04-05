package com.bytedance.sdk.component.jd.jpo;

import com.ironsource.C3271ic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.component.jd.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class Cif {

    /* renamed from: jd, reason: collision with root package name */
    public com.bytedance.sdk.component.wqx.jpo.jpo f18559jd = new com.bytedance.sdk.component.wqx.jpo.jpo();
    public ju jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.jd.jpo.if$jpo */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        String f18560cm;

        /* renamed from: jd, reason: collision with root package name */
        Map<String, List<String>> f18561jd;

        /* renamed from: jj, reason: collision with root package name */
        au f18562jj;
        com.bytedance.sdk.component.jd.jpo.jpo jpo;
        Object my;

        /* renamed from: qk, reason: collision with root package name */
        int f18563qk;
        qk wqx;
        String xyk;

        public jpo() {
            this.f18561jd = new HashMap();
        }

        public jpo jd(String str) {
            return jpo(qk.wqx(str));
        }

        public jpo jpo(com.bytedance.sdk.component.jd.jpo.jpo jpoVar) {
            this.jpo = jpoVar;
            return this;
        }

        public jpo jd(String str, String str2) {
            if (!this.f18561jd.containsKey(str)) {
                this.f18561jd.put(str, new ArrayList());
            }
            this.f18561jd.get(str).add(str2);
            return this;
        }

        public jpo jpo(String str) {
            this.xyk = str;
            return this;
        }

        public jpo(Cif cif) {
            this.wqx = cif.jd();
            this.f18560cm = cif.wqx();
            this.f18561jd = cif.cm();
            this.my = cif.jpo();
            this.f18562jj = cif.xyk();
            this.jpo = cif.my();
            this.f18563qk = cif.qk();
            this.xyk = cif.jj();
        }

        public jpo jpo(int i10) {
            this.f18563qk = i10;
            return this;
        }

        public jpo jpo(Object obj) {
            this.my = obj;
            return this;
        }

        public Cif jd() {
            return new Cif() { // from class: com.bytedance.sdk.component.jd.jpo.if.jpo.1
                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public Map cm() {
                    return jpo.this.f18561jd;
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public qk jd() {
                    return jpo.this.wqx;
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public String jj() {
                    return jpo.this.xyk;
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public Object jpo() {
                    return jpo.this.my;
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public com.bytedance.sdk.component.jd.jpo.jpo my() {
                    return jpo.this.jpo;
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public int qk() {
                    return jpo.this.f18563qk;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public String wqx() {
                    return jpo.this.f18560cm;
                }

                @Override // com.bytedance.sdk.component.jd.jpo.Cif
                public au xyk() {
                    return jpo.this.f18562jj;
                }
            };
        }

        public jpo jpo(qk qkVar) {
            this.wqx = qkVar;
            return this;
        }

        public jpo jpo(String str, String str2) {
            return jd(str, str2);
        }

        public jpo jpo() {
            return jpo(C3271ic.f36943a, (au) null);
        }

        private jpo jpo(String str, au auVar) {
            this.f18560cm = str;
            this.f18562jj = auVar;
            return this;
        }

        public jpo jpo(au auVar) {
            return jpo(C3271ic.f36944b, auVar);
        }
    }

    public abstract Map<String, List<String>> cm();

    public abstract qk jd();

    public abstract String jj();

    public abstract Object jpo();

    public void jpo(ju juVar) {
        this.jpo = juVar;
    }

    public abstract com.bytedance.sdk.component.jd.jpo.jpo my();

    public abstract int qk();

    public abstract String wqx();

    public au xyk() {
        return null;
    }

    public jpo zz() {
        return new jpo(this);
    }
}
