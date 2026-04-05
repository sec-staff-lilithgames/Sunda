package nj;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f76943a;

    public i1(com.google.firebase.g gVar) {
        this.f76943a = gVar;
    }

    public void clearPreference(String str) {
        SharedPreferences.Editor editorEdit = ((Application) this.f76943a.getApplicationContext()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public boolean getAndSetBooleanPreference(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f76943a.getApplicationContext()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z10);
        }
        setBooleanPreference(str, z10);
        return z10;
    }

    public boolean getBooleanManifestValue(String str, boolean z10) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f76943a.getApplicationContext();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z10;
    }

    public boolean getBooleanPreference(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f76943a.getApplicationContext()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getBoolean(str, z10) : z10;
    }

    public boolean isManifestSet(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f76943a.getApplicationContext();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                if (bundle.containsKey(str)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public boolean isPreferenceSet(String str) {
        return ((Application) this.f76943a.getApplicationContext()).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains(str);
    }

    public void setBooleanPreference(String str, boolean z10) {
        SharedPreferences.Editor editorEdit = ((Application) this.f76943a.getApplicationContext()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }
}
