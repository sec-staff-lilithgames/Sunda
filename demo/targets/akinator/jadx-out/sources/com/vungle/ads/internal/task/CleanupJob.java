package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;
import tu.o;
import tu.q;
import tu.s;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CleanupJob implements Job {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final PathProvider pathProvider;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ JobInfo makeJobInfo$default(Companion companion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return companion.makeJobInfo(str);
        }

        public final JobInfo makeJobInfo(String str) {
            JobInfo priority = new JobInfo(CleanupJob.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(CleanupJob.AD_ID_KEY, str);
            }
            return priority.setExtras(bundle).setUpdateCurrent(str == null);
        }

        private Companion() {
        }
    }

    public CleanupJob(Context context, PathProvider pathProvider) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVarLazy = q.lazy(s.f87403b, (a) new CleanupJob$checkIfSdkUpgraded$$inlined$inject$1(this.context));
        int i10 = m3646checkIfSdkUpgraded$lambda4(oVarLazy).getInt("VERSION_CODE", -1);
        if (i10 < 70600) {
            if (i10 < 70000) {
                dropV6Data();
            }
            if (i10 < 70100) {
                dropV700Data();
            }
            if (i10 < 70301) {
                dropV730TempData();
            }
            if (i10 < 70500) {
                dropV742TpatData();
            }
            if (i10 < 70600) {
                dropV750Data();
            }
            m3646checkIfSdkUpgraded$lambda4(oVarLazy).put("VERSION_CODE", BuildConfig.VERSION_CODE).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-4, reason: not valid java name */
    private static final FilePreferences m3646checkIfSdkUpgraded$lambda4(o oVar) {
        return (FilePreferences) oVar.getValue();
    }

    private final void dropV6Data() {
        Logger.Companion.d(TAG, "CleanupJob: drop old files data");
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            FileUtility.delete$default(file, null, 2, null);
            FileUtility.delete$default(new File(file.getPath() + "-journal"), null, 2, null);
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        String string = this.context.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
        this.context.deleteSharedPreferences("com.vungle.sdk");
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        e0.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        FileUtility.delete$default(new File(noBackupFilesDir, "vungle_settings"), null, 2, null);
        if (string != null) {
            FileUtility.delete$default(new File(string), null, 2, null);
        }
    }

    private final void dropV700Data() {
        FileUtility.delete$default(new File(this.context.getApplicationInfo().dataDir, "vungle"), null, 2, null);
    }

    private final void dropV730TempData() {
        try {
            FileUtility.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"), null, 2, null);
            FileUtility.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"), null, 2, null);
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to delete temp data", e10);
        }
    }

    private final void dropV742TpatData() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            FileUtility.delete$default(new File(noBackupFilesDir, "failedTpats"), null, 2, null);
            FileUtility.delete$default(new File(noBackupFilesDir, "failedGenericTpats"), null, 2, null);
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to delete 742 tpat data", e10);
        }
    }

    private final void dropV750Data() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            FileUtility.delete$default(new File(noBackupFilesDir, "vungle_cache/downloads"), null, 2, null);
            FileUtility.delete$default(new File(noBackupFilesDir, "vungle_cache/js"), null, 2, null);
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to delete 750 data", e10);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        File downloadsDirForAd;
        e0.checkNotNullParameter(bundle, "bundle");
        e0.checkNotNullParameter(jobRunner, "jobRunner");
        File vmDir = this.pathProvider.getVmDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = vmDir;
        }
        Logger.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!e0.areEqual(downloadsDirForAd, vmDir)) {
                FileUtility.delete$default(downloadsDirForAd, null, 2, null);
                return 0;
            }
            checkIfSdkUpgraded();
            FileUtility.deleteContents(downloadsDirForAd, c2.setOf((Object[]) new String[]{Constants.OM_SDK_JS, Constants.OM_SESSION_JS}));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
