package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx {

    /* renamed from: cm, reason: collision with root package name */
    protected final jd f19408cm;

    /* renamed from: jd, reason: collision with root package name */
    protected final dt f19409jd;
    protected final Activity jpo;
    protected String my;
    protected String wqx;

    public wqx(Activity activity, dt dtVar, jd jdVar) {
        this.jpo = activity;
        this.f19409jd = dtVar;
        if (dtVar != null) {
            this.wqx = rv.dt(dtVar);
        }
        if (activity != null) {
            this.my = String.valueOf(activity.hashCode());
        }
        this.f19408cm = jdVar;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.wqx au();

    public abstract List<dt> hna();

    /* renamed from: if */
    public xyk mo432if() {
        return null;
    }

    public void jd() {
    }

    public abstract void jd(xyk xykVar, int i10);

    public boolean jj() {
        return true;
    }

    public void jpo() {
    }

    public abstract void jpo(int i10);

    public abstract boolean jpo(xyk xykVar, int i10);

    public abstract void jr();

    public abstract int ju();

    public boolean my() {
        return false;
    }

    public abstract void nmd();

    public xyk oya() {
        return null;
    }

    public my prr() {
        return null;
    }

    public abstract int zz();

    public void jpo(float f10) {
    }

    public void jpo(int i10, int i11) {
    }

    public void jpo(Activity activity) {
    }

    public void jpo(Bundle bundle) {
    }

    public void jpo(View view) {
    }

    public void jpo(View view, boolean z10) {
    }

    public void jpo(jpo jpoVar, boolean z10) {
    }

    public void jpo(xyk xykVar) {
    }

    public void jpo(xyk xykVar, jd.my myVar) {
    }

    public void jpo(xyk xykVar, xyk xykVar2, jd.my myVar) {
    }

    public void jpo(xyk xykVar, boolean z10) {
    }

    public void jpo(xyk xykVar, boolean z10, boolean z11, boolean z12, int i10) {
    }

    public void jpo(Map<String, Object> map, xyk xykVar, float f10, float f11) {
    }

    public void jpo(boolean z10) {
    }

    public void cm() {
    }

    public void opi() {
    }

    public void qk() {
    }

    public void sq() {
    }

    public void wqx() {
    }

    public void xyk() {
    }

    public void yd() {
    }
}
