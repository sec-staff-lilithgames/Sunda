package n5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import sh.n1;
import w2.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final s f75674a = s.create();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f75675b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static l f75676c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static l b(boolean z10, boolean z11, boolean z12, int i10) {
        l lVar = new l(z10, z11, z12, i10);
        f75676c = lVar;
        f75674a.set(lVar);
        return f75676c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n5.l c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.m.c(android.content.Context, boolean):n5.l");
    }

    public static n1 getCompilationStatusAsync() {
        return f75674a;
    }

    public static l writeProfileVerification(Context context) {
        return c(context, false);
    }
}
