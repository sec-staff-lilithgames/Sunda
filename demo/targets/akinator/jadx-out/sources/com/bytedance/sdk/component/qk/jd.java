package com.bytedance.sdk.component.qk;

import com.bytedance.sdk.component.jd.jpo.yd;
import java.io.File;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    final String f18976cm;

    /* renamed from: jd, reason: collision with root package name */
    final String f18977jd;

    /* renamed from: jj, reason: collision with root package name */
    final long f18978jj;
    final int jpo;
    final long my;

    /* renamed from: qk, reason: collision with root package name */
    yd f18979qk;
    final Map<String, String> wqx;
    private File xyk = null;

    /* renamed from: yd, reason: collision with root package name */
    private byte[] f18980yd = null;
    private final boolean zz;

    public jd(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.zz = z10;
        this.jpo = i10;
        this.f18977jd = str;
        this.wqx = map;
        this.f18976cm = str2;
        this.my = j10;
        this.f18978jj = j11;
    }

    public String cm() {
        return this.f18976cm;
    }

    public String jd() {
        return this.f18977jd;
    }

    public boolean jj() {
        return this.zz;
    }

    public int jpo() {
        return this.jpo;
    }

    public File my() {
        return this.xyk;
    }

    public yd qk() {
        return this.f18979qk;
    }

    public Map<String, String> wqx() {
        return this.wqx;
    }

    public void jpo(File file) {
        this.xyk = file;
    }

    public void jpo(byte[] bArr) {
        this.f18980yd = bArr;
    }

    public void jpo(yd ydVar) {
        this.f18979qk = ydVar;
    }
}
