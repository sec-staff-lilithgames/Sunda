package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.cm.xyk;
import com.bytedance.adsdk.ugeno.cm.yd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    private static volatile my jpo;

    /* renamed from: cm, reason: collision with root package name */
    private jpo f17919cm;

    /* renamed from: jd, reason: collision with root package name */
    private List<com.bytedance.adsdk.ugeno.core.jd> f17920jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.jd.cm f17921jj;
    private com.bytedance.adsdk.ugeno.wqx.jpo my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.jpo.jpo f17922qk;
    private com.bytedance.adsdk.ugeno.core.wqx wqx;

    private my() {
    }

    private void jj() {
        ArrayList arrayList = new ArrayList();
        this.f17920jd = arrayList;
        com.bytedance.adsdk.ugeno.core.wqx wqxVar = this.wqx;
        if (wqxVar != null) {
            arrayList.addAll(wqxVar.jpo());
        }
        com.bytedance.adsdk.ugeno.core.cm.jpo(this.f17920jd);
    }

    public static my jpo() {
        if (jpo == null) {
            synchronized (my.class) {
                try {
                    if (jpo == null) {
                        jpo = new my();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public com.bytedance.adsdk.ugeno.core.jd.cm cm() {
        return this.f17921jj;
    }

    public jpo jd() {
        return this.f17919cm;
    }

    public com.bytedance.adsdk.ugeno.core.jpo.jpo my() {
        return this.f17922qk;
    }

    public com.bytedance.adsdk.ugeno.wqx.jpo wqx() {
        return this.my;
    }

    public void jpo(Context context, com.bytedance.adsdk.ugeno.core.wqx wqxVar, jpo jpoVar) {
        this.wqx = wqxVar;
        this.f17919cm = jpoVar;
        jj();
    }

    public void jpo(com.bytedance.adsdk.ugeno.wqx.jpo jpoVar) {
        this.my = jpoVar;
    }

    public void jpo(xyk xykVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.cm.jpo().jpo());
        if (xykVar != null) {
            arrayList.addAll(xykVar.jpo());
        }
        yd.jpo(arrayList);
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm.wqx wqxVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.cm.my().jpo());
        if (wqxVar != null) {
            arrayList.addAll(wqxVar.jpo());
        }
        com.bytedance.adsdk.ugeno.cm.cm.jpo(arrayList);
    }
}
