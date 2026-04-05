package com.bytedance.sdk.component.my.wqx.jpo;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bytedance.sdk.component.my.jd, Cloneable {

    /* renamed from: jj, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.my.jd f18905jj;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f18906cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18907jd;
    private long jpo;
    private File my;
    private boolean wqx;

    public jpo(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    private static long ju() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static com.bytedance.sdk.component.my.jd yd() {
        return f18905jj;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public int cm() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public int jd() {
        return this.f18907jd;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean jj() {
        return false;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public long jpo() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean my() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean qk() {
        return this.f18906cm;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public int wqx() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public File xyk() {
        return this.my;
    }

    @Override // com.bytedance.sdk.component.my.jd
    public boolean zz() {
        return true;
    }

    public jpo(int i10, long j10, boolean z10, boolean z11, File file) {
        this.jpo = j10;
        this.f18907jd = i10;
        this.wqx = z10;
        this.f18906cm = z11;
        this.my = file;
    }

    public static void jpo(Context context, com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar != null) {
            f18905jj = jdVar;
        } else {
            f18905jj = jpo(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.my.jd jpo(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (f18905jj == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(ju() / 16, 41943040L);
        } else {
            iMin = Math.min(f18905jj.jd() / 2, 31457280);
            jMin = Math.min(f18905jj.jpo() / 2, 41943040L);
        }
        return new jpo(Math.max(iMin, 26214400), Math.max(jMin, ServiceProvider.HTTP_CACHE_DISK_SIZE), file);
    }
}
