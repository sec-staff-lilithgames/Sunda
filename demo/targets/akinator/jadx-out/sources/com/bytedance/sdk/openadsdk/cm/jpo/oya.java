package com.bytedance.sdk.openadsdk.cm.jpo;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya {
    public static oya jpo = new oya();

    /* renamed from: cm, reason: collision with root package name */
    private volatile boolean f19565cm;

    /* renamed from: jd, reason: collision with root package name */
    private jpo f19566jd;
    private final Map<String, jpo> wqx = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final int f19567jd;
        private final int jpo;

        public jpo(int i10, int i11) {
            this.jpo = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.f19567jd = i11 < 10 ? 30 : i11;
        }

        public int jd() {
            return this.f19567jd;
        }

        public int jpo() {
            return this.jpo;
        }
    }

    private int jd() {
        jpo jpoVar = this.f19566jd;
        if (jpoVar != null) {
            return jpoVar.jpo();
        }
        return 3;
    }

    private int wqx() {
        jpo jpoVar = this.f19566jd;
        if (jpoVar != null) {
            return jpoVar.jd();
        }
        return 30;
    }

    public void jpo(jpo jpoVar) {
        this.f19566jd = jpoVar;
    }

    public void jpo(String str, jpo jpoVar) {
        if (TextUtils.isEmpty(str) || jpoVar == null) {
            return;
        }
        this.wqx.put(str, jpoVar);
    }

    public int jd(String str) {
        jpo jpoVar = this.wqx.get(str);
        if (jpoVar == null) {
            return wqx();
        }
        return jpoVar.jd();
    }

    public int jpo(String str) {
        if (!jpo()) {
            return 4;
        }
        jpo jpoVar = this.wqx.get(str);
        if (jpoVar == null) {
            return jd();
        }
        return jpoVar.jpo();
    }

    public boolean jpo() {
        return this.f19565cm;
    }

    public void jpo(boolean z10) {
        this.f19565cm = z10;
    }
}
