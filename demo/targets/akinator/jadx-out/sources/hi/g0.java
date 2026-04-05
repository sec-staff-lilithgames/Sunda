package hi;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.core.request.NJc.yFkbx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f58815a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.g f58816b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f58817c;

    /* renamed from: d, reason: collision with root package name */
    public TaskCompletionSource f58818d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58819e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58820f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f58821g;

    /* renamed from: h, reason: collision with root package name */
    public final TaskCompletionSource f58822h;

    public g0(com.google.firebase.g gVar) {
        Boolean boolValueOf;
        Object obj = new Object();
        this.f58817c = obj;
        this.f58818d = new TaskCompletionSource();
        this.f58819e = false;
        this.f58820f = false;
        this.f58822h = new TaskCompletionSource();
        Context applicationContext = gVar.getApplicationContext();
        this.f58816b = gVar;
        SharedPreferences sharedPrefs = j.getSharedPrefs(applicationContext);
        this.f58815a = sharedPrefs;
        if (sharedPrefs.contains("firebase_crashlytics_collection_enabled")) {
            this.f58820f = false;
            boolValueOf = Boolean.valueOf(sharedPrefs.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        this.f58821g = boolValueOf == null ? a(applicationContext) : boolValueOf;
        synchronized (obj) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    this.f58818d.trySetResult(null);
                    this.f58819e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Boolean a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e10) {
            ei.f.getLogger().e("Could not read data collection permission from manifest", e10);
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            this.f58820f = false;
            return null;
        }
        this.f58820f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public void grantDataCollectionPermission(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f58822h.trySetResult(null);
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zIsDataCollectionDefaultEnabled;
        Boolean bool = this.f58821g;
        if (bool != null) {
            zIsDataCollectionDefaultEnabled = bool.booleanValue();
        } else {
            try {
                zIsDataCollectionDefaultEnabled = this.f58816b.isDataCollectionDefaultEnabled();
            } catch (IllegalStateException unused) {
                zIsDataCollectionDefaultEnabled = false;
            }
        }
        ei.f.getLogger().d(e3.g.l("Crashlytics automatic data collection ", zIsDataCollectionDefaultEnabled ? "ENABLED" : "DISABLED", " by ", this.f58821g == null ? "global Firebase setting" : this.f58820f ? "firebase_crashlytics_collection_enabled manifest flag" : yFkbx.IVaSsiyX, "."));
        return zIsDataCollectionDefaultEnabled;
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(Boolean bool) {
        if (bool != null) {
            try {
                this.f58820f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58821g = bool != null ? bool : a(this.f58816b.getApplicationContext());
        SharedPreferences.Editor editorEdit = this.f58815a.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
        synchronized (this.f58817c) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    if (!this.f58819e) {
                        this.f58818d.trySetResult(null);
                        this.f58819e = true;
                    }
                } else if (this.f58819e) {
                    this.f58818d = new TaskCompletionSource();
                    this.f58819e = false;
                }
            } finally {
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.f58817c) {
            task = this.f58818d.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        return ii.a.race(this.f58822h.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
