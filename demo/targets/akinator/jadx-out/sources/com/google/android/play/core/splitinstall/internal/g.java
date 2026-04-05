package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ih.f f29608a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29609b;

    /* renamed from: c, reason: collision with root package name */
    public final f f29610c;

    /* renamed from: d, reason: collision with root package name */
    public PackageInfo f29611d;

    public g(Context context, ih.f fVar, b bVar) {
        f fVar2 = new f(new ih.b(fVar));
        this.f29608a = fVar;
        this.f29609b = context;
        this.f29610c = fVar2;
    }

    public final boolean zza(File[] fileArr) throws XmlPullParserException, IOException {
        PackageInfo packageInfo;
        f fVar;
        Context context = this.f29609b;
        if (this.f29611d == null) {
            try {
                this.f29611d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                packageInfo = this.f29611d;
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        } else {
            packageInfo = this.f29611d;
        }
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        AssetManager assetManager = (AssetManager) c0.zzc(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            File file = fileArr[length];
            fVar = this.f29610c;
            fVar.zzb(assetManager, file);
        } while (longVersionCode == fVar.zza());
        return false;
    }

    public final boolean zzb(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f29608a.zzg(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        android.util.Log.e("SplitCompat", "Downloaded split " + r6 + " is not signed.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(java.io.File[] r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.g.zzc(java.io.File[]):boolean");
    }
}
