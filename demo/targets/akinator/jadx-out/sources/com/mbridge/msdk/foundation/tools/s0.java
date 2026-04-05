package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    static String f41188a = "";

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f41189b = false;

    /* renamed from: c, reason: collision with root package name */
    private static int f41190c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static int f41191d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static long f41192e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            s0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f41189b) {
                return;
            }
            f41189b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f41188a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            p0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f41188a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f41188a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f41188a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f41188a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f41191d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f41192e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f41190c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f41191d = Long.valueOf(((statFs.getBlockCount() * blockSize) / 1000) / 1000).intValue();
            f41190c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f41192e = System.currentTimeMillis();
        } catch (Exception e10) {
            p0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
