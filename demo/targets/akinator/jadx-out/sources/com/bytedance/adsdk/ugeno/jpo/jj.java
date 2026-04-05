package com.bytedance.adsdk.ugeno.jpo;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jd.wqx f17874cm;

    /* renamed from: jd, reason: collision with root package name */
    private List<jpo> f17875jd;
    private List<wqx> jpo;
    private Context wqx;

    public jj(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, List<wqx> list) {
        this.f17874cm = wqxVar;
        this.wqx = context;
        this.jpo = list;
        cm();
    }

    private void cm() {
        this.f17875jd = new ArrayList();
        List<wqx> list = this.jpo;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.jpo.size(); i10++) {
            wqx wqxVar = this.jpo.get(i10);
            if (wqxVar != null) {
                this.f17875jd.add(new jpo(this.wqx, this.f17874cm, wqxVar));
            }
        }
    }

    public void jd() {
        List<jpo> list = this.f17875jd;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jpo jpoVar : this.f17875jd) {
            if (jpoVar != null) {
                jpoVar.jpo();
            }
        }
    }

    public void jpo() {
        List<jpo> list = this.f17875jd;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jpo jpoVar : this.f17875jd) {
            if (jpoVar != null) {
                jpoVar.cm();
            }
        }
    }

    public void wqx() {
        List<jpo> list = this.f17875jd;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jpo jpoVar : this.f17875jd) {
            if (jpoVar != null) {
                jpoVar.wqx();
            }
        }
    }

    public void jd(Canvas canvas) {
        List<jpo> list = this.f17875jd;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jpo jpoVar : this.f17875jd) {
            if (jpoVar != null) {
                jpoVar.jd(canvas);
            }
        }
    }

    public void jpo(Canvas canvas) {
        List<jpo> list = this.f17875jd;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jpo jpoVar : this.f17875jd) {
            if (jpoVar != null) {
                jpoVar.jpo(canvas);
            }
        }
    }

    public void jpo(int i10, int i11) {
        List<jpo> list = this.f17875jd;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (jpo jpoVar : this.f17875jd) {
            if (jpoVar != null) {
                jpoVar.jpo(i10, i11);
            }
        }
    }

    public jpo jpo(String str) {
        List<jpo> list = this.f17875jd;
        if (list != null && !list.isEmpty()) {
            for (jpo jpoVar : this.f17875jd) {
                if (jpoVar != null && TextUtils.equals(jpoVar.my(), str)) {
                    return jpoVar;
                }
            }
        }
        return null;
    }
}
