package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi {

    /* renamed from: cm, reason: collision with root package name */
    private double f20763cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f20764jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f20765jj;
    private String jpo;
    private boolean my;
    private int wqx;

    public double cm() {
        return this.f20763cm;
    }

    public int jd() {
        return this.f20764jd;
    }

    public boolean jj() {
        return this.my;
    }

    public String jpo() {
        return this.jpo;
    }

    public boolean my() {
        return !TextUtils.isEmpty(this.jpo) && this.f20764jd > 0 && this.wqx > 0;
    }

    public String qk() {
        return this.f20765jj;
    }

    public int wqx() {
        return this.wqx;
    }

    public void jd(int i10) {
        this.wqx = i10;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void jd(String str) {
        this.f20765jj = str;
    }

    public void jpo(int i10) {
        this.f20764jd = i10;
    }

    public void jpo(boolean z10) {
        this.my = z10;
    }
}
