package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hx {
    public static ConcurrentHashMap<Integer, hx> jpo = new ConcurrentHashMap<>();

    /* renamed from: cm, reason: collision with root package name */
    private int f20355cm;

    /* renamed from: jj, reason: collision with root package name */
    private String f20357jj;
    private int my;

    /* renamed from: jd, reason: collision with root package name */
    private String f20356jd = "";
    private String wqx = "";

    private void jj() {
        this.f20356jd = "";
        this.wqx = "";
        this.f20355cm = 0;
        this.my = 0;
    }

    public int cm() {
        return this.f20355cm;
    }

    public String jd() {
        return this.f20356jd;
    }

    public String jpo() {
        return this.f20357jj;
    }

    public int my() {
        return this.my;
    }

    public String wqx() {
        return this.wqx;
    }

    public static void wqx(int i10) {
        hx hxVar;
        if (i10 == 0) {
            return;
        }
        if (jpo == null) {
            jpo = new ConcurrentHashMap<>();
        }
        if (!jpo.containsKey(Integer.valueOf(i10)) || (hxVar = jpo.get(Integer.valueOf(i10))) == null) {
            return;
        }
        hxVar.jd(1);
    }

    public void jd(int i10) {
        this.my = i10;
    }

    public void jpo(int i10) {
        this.f20355cm = i10;
    }

    public static void jd(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar == null || TextUtils.isEmpty(dtVar.fxd())) {
            return;
        }
        int iJl = dtVar.jl();
        Integer numValueOf = Integer.valueOf(iJl);
        if (iJl == 0) {
            return;
        }
        if (jpo == null) {
            jpo = new ConcurrentHashMap<>();
        }
        hx hxVar = jpo.containsKey(numValueOf) ? jpo.get(numValueOf) : null;
        if (hxVar == null) {
            hxVar = new hx();
        }
        String strHbg = dtVar.hbg();
        if (TextUtils.isEmpty(strHbg) || !strHbg.equals(hxVar.jpo())) {
            hxVar.jj();
            hxVar.jpo(dtVar);
            jpo.put(numValueOf, hxVar);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar != null) {
            String strHbg = dtVar.hbg();
            if (!TextUtils.isEmpty(strHbg)) {
                this.f20357jj = strHbg;
            }
            String strIwg = dtVar.iwg();
            if (TextUtils.isEmpty(strIwg) && dtVar.ig()) {
                strIwg = dtVar.zuz().zz();
            }
            if (!TextUtils.isEmpty(strIwg)) {
                String[] strArrSplit = strIwg.split("/");
                if (strArrSplit.length >= 3) {
                    this.f20356jd = strArrSplit[2];
                }
            }
            if (dtVar.xur() == null || TextUtils.isEmpty(dtVar.xur().wqx())) {
                return;
            }
            this.wqx = dtVar.xur().wqx();
        }
    }

    public static void wqx(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        hx hxVar;
        if (dtVar == null) {
            return;
        }
        int iJl = dtVar.jl();
        Integer numValueOf = Integer.valueOf(iJl);
        if (iJl == 0) {
            return;
        }
        if (jpo == null) {
            jpo = new ConcurrentHashMap<>();
        }
        if (!jpo.containsKey(numValueOf) || (hxVar = jpo.get(numValueOf)) == null) {
            return;
        }
        hxVar.jpo(1);
    }
}
