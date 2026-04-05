package com.bytedance.sdk.openadsdk.component.reward.jpo;

import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: jd, reason: collision with root package name */
    public static int f19977jd = 1;
    public static int jpo = 0;
    public static int wqx = 2;

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f19978cm;
    private zz my;

    public xyk(jpo jpoVar, dt dtVar) {
        this.f19978cm = dtVar.cgk();
        this.my = rv.jj(dtVar) ? new qk(jpoVar) : new zz(jpoVar);
    }

    public void cm() {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.cm();
        }
    }

    public boolean jd() {
        return false;
    }

    public void jj() {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.jpo();
        }
    }

    public com.bytedance.sdk.openadsdk.nmd.xyk jpo() {
        return null;
    }

    public void my() {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.zz();
        }
    }

    public void qk() {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.my();
        }
    }

    public com.bytedance.sdk.openadsdk.p001if.my wqx() {
        return null;
    }

    public void xyk() {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.oya();
        }
    }

    public boolean yd() {
        zz zzVar = this.my;
        if (zzVar != null) {
            return zzVar.prr();
        }
        return false;
    }

    public void zz() {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.wqx();
        }
    }

    public void jd(int i10) {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.jpo(i10);
        }
    }

    public boolean jpo(int i10) {
        zz zzVar = this.my;
        if (zzVar != null) {
            return zzVar.yd();
        }
        return false;
    }

    public void wqx(int i10) {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.jpo(i10);
        }
    }

    public void cm(int i10) {
        zz zzVar;
        if (i10 == wqx || (zzVar = this.my) == null) {
            return;
        }
        zzVar.jj();
    }

    public boolean my(int i10) {
        zz zzVar;
        if (i10 != f19977jd || (zzVar = this.my) == null) {
            return false;
        }
        return zzVar.au();
    }

    public void jd(boolean z10) {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.wqx(z10);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.my myVar) {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.jpo(myVar);
        }
    }

    public void jpo(boolean z10) {
        zz zzVar = this.my;
        if (zzVar != null) {
            zzVar.jd(z10);
        }
    }
}
