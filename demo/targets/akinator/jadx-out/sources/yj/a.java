package yj;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.b;
import yi.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f94584a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f94585b;

    /* renamed from: c, reason: collision with root package name */
    public final c f94586c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f94587d;

    public a(Context context, String str, c cVar) {
        Context contextCreateDeviceProtectedStorageContext = m3.a.createDeviceProtectedStorageContext(context);
        this.f94584a = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f94585b = sharedPreferences;
        this.f94586c = cVar;
        this.f94587d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f94584a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z10) {
        if (this.f94587d != z10) {
            this.f94587d = z10;
            this.f94586c.publish(new yi.a(b.class, new b(z10)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f94587d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.f94585b.edit().remove("firebase_data_collection_default_enabled").apply();
                b(a());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f94585b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                b(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
