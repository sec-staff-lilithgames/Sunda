package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PathProvider {
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";
    public static final Companion Companion = new Companion(null);
    private static final long UNKNOWN_SIZE = -1;
    private static final String VM_FOLDER = "adAssets";
    private static final String VUNGLE_FOLDER = "vungle_cache";
    private final File cleverCacheDir;
    private final Context context;
    private final File vmDir;
    private final File vungleDir;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public PathProvider(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, VM_FOLDER);
        this.vmDir = file2;
        File file3 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file3;
        for (File file4 : p0.listOf((Object[]) new File[]{file, file2, file3})) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(String path) {
        e0.checkNotNullParameter(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e10) {
            Logger.Companion.w("PathProvider", "Failed to get available bytes " + e10.getMessage());
            return -1L;
        }
    }

    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    public final Context getContext() {
        return this.context;
    }

    public final File getDownloadsDirForAd(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        File file = new File(getVmDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        e0.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    public final File getUnclosedAdFile(String name) {
        e0.checkNotNullParameter(name, "name");
        return new File(getSharedPrefsDir(), name);
    }

    public final File getVmDir() {
        if (!this.vmDir.exists()) {
            this.vmDir.mkdirs();
        }
        return this.vmDir;
    }

    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
