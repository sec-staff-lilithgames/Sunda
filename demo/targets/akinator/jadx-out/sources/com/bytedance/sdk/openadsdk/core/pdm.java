package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class pdm {
    private static pdm jpo;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.my.jpo f20824cm;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.cm.jd f20826jj;
    private com.bytedance.sdk.openadsdk.jpo.wqx.jd my;

    /* renamed from: jd, reason: collision with root package name */
    private int f20825jd = 0;
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.jpo> wqx = new ConcurrentHashMap();

    /* renamed from: qk, reason: collision with root package name */
    private final Map<String, jpo> f20827qk = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();
    }

    private pdm() {
    }

    public static pdm jpo() {
        if (jpo == null) {
            jpo = new pdm();
        }
        return jpo;
    }

    public com.bytedance.sdk.openadsdk.jpo.cm.jd cm() {
        return this.f20826jj;
    }

    public com.bytedance.sdk.openadsdk.jpo.my.jpo jd() {
        return this.f20824cm;
    }

    public void my() {
        this.f20824cm = null;
        this.my = null;
        this.f20826jj = null;
    }

    public com.bytedance.sdk.openadsdk.jpo.wqx.jd wqx() {
        return this.my;
    }

    private static String cm(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar == null) {
            return null;
        }
        String strHbg = dtVar.hbg();
        return TextUtils.isEmpty(strHbg) ? String.valueOf(dtVar.hashCode()) : strHbg;
    }

    public com.bytedance.sdk.openadsdk.core.model.jpo jd(int i10) {
        return this.wqx.remove(Integer.valueOf(i10));
    }

    public void wqx(int i10) {
        this.wqx.remove(Integer.valueOf(i10));
    }

    public void jd(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        jpo jpoVar;
        if (dtVar == null) {
            return;
        }
        String strCm = cm(dtVar);
        if (TextUtils.isEmpty(strCm) || (jpoVar = this.f20827qk.get(strCm)) == null) {
            return;
        }
        jpoVar.jpo();
    }

    public void wqx(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        String strCm = cm(dtVar);
        if (TextUtils.isEmpty(strCm)) {
            return;
        }
        this.f20827qk.remove(strCm);
    }

    public com.bytedance.sdk.openadsdk.core.model.dt jpo(int i10) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarRemove = this.wqx.remove(Integer.valueOf(i10));
        if (jpoVarRemove != null) {
            return jpoVarRemove.prr();
        }
        return null;
    }

    public int jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.model.jpo();
        jpoVar.jd(dtVar);
        return jpo(jpoVar);
    }

    public void jpo(com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar) {
        this.my = jdVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar) {
        this.f20824cm = jpoVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.jpo.cm.jd jdVar) {
        this.f20826jj = jdVar;
    }

    public int jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        int i10 = this.f20825jd + 1;
        this.f20825jd = i10;
        this.wqx.put(Integer.valueOf(i10), jpoVar);
        return this.f20825jd;
    }

    public static int jpo(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, jpo jpoVar) {
        if (dtVar == null || jpoVar == null) {
            return;
        }
        String strCm = cm(dtVar);
        if (TextUtils.isEmpty(strCm)) {
            return;
        }
        this.f20827qk.put(strCm, jpoVar);
    }
}
