package com.bytedance.sdk.component.my.cm.wqx.jpo;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements com.bytedance.sdk.component.my.jd, Cloneable {
    private static volatile com.bytedance.sdk.component.my.jd zz;

    /* renamed from: cm, reason: collision with root package name */
    private int f18817cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18818jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f18819jj;
    private long jpo;
    private boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f18820qk;
    private int wqx;
    private File xyk;

    public jd(int i10, int i11, int i12, long j10, File file) {
        this(i10, i11, i12, j10, i11 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.my.jd yd() {
        return zz;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public int cm() {
        return this.f18817cm;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public int jd() {
        return this.f18818jd;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean jj() {
        return this.f18820qk;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public long jpo() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean my() {
        return this.my;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean qk() {
        return this.f18819jj;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public int wqx() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public File xyk() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean zz() {
        return true;
    }

    public jd(int i10, int i11, int i12, long j10, boolean z10, boolean z11, File file) {
        this.jpo = j10;
        this.f18818jd = i10;
        this.wqx = i11;
        this.f18817cm = i12;
        this.my = z10;
        this.f18819jj = z11;
        this.xyk = file;
        this.f18820qk = i12 != 0;
    }

    public static void jpo(Context context, com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar != null) {
            zz = jdVar;
        } else {
            zz = jpo(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.my.jd jpo(File file) {
        long jJpo;
        int iWqx;
        int iCm;
        file.mkdirs();
        if (zz == null) {
            iWqx = 10;
            iCm = 14;
            jJpo = 20;
        } else {
            jJpo = zz.jpo();
            iWqx = zz.wqx();
            iCm = zz.cm();
        }
        return new jd(0, iWqx, iCm, jJpo, file);
    }
}
