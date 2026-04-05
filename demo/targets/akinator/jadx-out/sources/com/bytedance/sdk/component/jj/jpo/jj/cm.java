package com.bytedance.sdk.component.jj.jpo.jj;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: jd, reason: collision with root package name */
    private final String f18683jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f18684jj;
    private final String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f18685ju;
    private final int my;

    /* renamed from: qk, reason: collision with root package name */
    private String f18686qk;
    private final boolean wqx;
    private String xyk;

    /* renamed from: cm, reason: collision with root package name */
    private int f18682cm = -1;
    private int zz = 0;

    /* renamed from: yd, reason: collision with root package name */
    private String f18687yd = null;

    public cm(String str, String str2, boolean z10, int i10, String str3) {
        this.jpo = str;
        this.f18683jd = str2;
        this.wqx = z10;
        this.my = i10;
        this.f18684jj = str3;
    }

    public int cm() {
        return this.f18682cm;
    }

    public String jd() {
        return this.f18683jd;
    }

    public String jj() {
        return this.f18684jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public boolean ju() {
        return this.f18682cm == -1;
    }

    public int my() {
        return this.my;
    }

    public String qk() {
        return this.f18686qk;
    }

    public boolean wqx() {
        return this.wqx;
    }

    public int xyk() {
        return this.zz;
    }

    public boolean yd() {
        return this.f18685ju;
    }

    public String zz() {
        return this.xyk;
    }

    public void jd(int i10) {
        this.zz = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f18686qk)) {
            this.f18686qk = String.valueOf(this.zz);
            return;
        }
        this.f18686qk += "," + this.zz;
    }

    public void jpo(int i10) {
        this.f18682cm = i10;
    }

    public void wqx(String str) {
        this.f18687yd = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.xyk)) {
            this.xyk = String.valueOf(this.f18687yd);
            return;
        }
        this.xyk += "," + this.f18687yd;
    }

    public void jpo(String str) {
        this.f18686qk = str;
    }

    public void jpo(boolean z10) {
        this.f18685ju = z10;
    }

    public Runnable jpo(String str, Map<String, String> map) {
        return jpo.jpo().jpo(this, str, map);
    }

    public void jd(String str) {
        this.xyk = str;
    }
}
