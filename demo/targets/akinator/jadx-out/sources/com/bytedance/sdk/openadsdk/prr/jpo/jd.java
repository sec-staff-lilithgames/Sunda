package com.bytedance.sdk.openadsdk.prr.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.tic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    private int f21432cm;

    /* renamed from: jd, reason: collision with root package name */
    private dt f21433jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f21434jj;
    private String jpo;
    private boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private int f21435qk;
    private String wqx;
    private int xyk = 0;
    private int zz = 0;

    public int cm() {
        return this.f21432cm;
    }

    public dt jd() {
        return this.f21433jd;
    }

    public String jj() {
        return this.f21434jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public boolean my() {
        return this.my;
    }

    public int qk() {
        return this.f21435qk;
    }

    public String wqx() {
        dt dtVar;
        if (TextUtils.isEmpty(this.wqx) && (dtVar = this.f21433jd) != null) {
            this.wqx = tic.jpo(dtVar);
        }
        return this.wqx;
    }

    public int xyk() {
        return this.xyk;
    }

    public int zz() {
        return this.zz;
    }

    public void jd(String str) {
        this.wqx = str;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void jd(int i10) {
        this.f21435qk = i10;
    }

    public void jpo(dt dtVar) {
        this.f21433jd = dtVar;
    }

    public void jpo(int i10) {
        this.f21432cm = i10;
    }

    public void jpo(boolean z10) {
        this.my = z10;
    }

    public void wqx(String str) {
        this.f21434jj = str;
    }
}
