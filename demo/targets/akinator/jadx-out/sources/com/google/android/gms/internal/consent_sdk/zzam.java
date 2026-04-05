package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import xh.a;
import xh.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzam {
    private final Context zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();

    public zzam(Application application) {
        this.zza = application.getApplicationContext();
    }

    public final Object zza(String str) {
        Object obj;
        AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null || (obj = ((Bundle) atomicReference.get()).get(str)) == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void zzb(Context context) {
        AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData);
            } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
                Log.w("UserMessagingPlatform", "Failed to get metadata. ", e10);
            }
        }
    }

    public final void zzc(Map map) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            try {
                map2.put((Enum) ((Method) this.zze.get()).invoke(null, str), (Enum) ((Method) this.zzd.get()).invoke(null, map.get(str)));
            } catch (Exception e10) {
                Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e10);
            }
        }
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == null || map2.isEmpty()) {
            return;
        }
        try {
            ((Method) atomicReference.get()).invoke(this.zzb.get(), map2);
        } catch (Exception e11) {
            Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e11);
        }
    }

    public final boolean zzd() throws NoSuchMethodException, SecurityException {
        AtomicReference atomicReference = this.zzg;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context context = this.zza;
        if (context == null) {
            atomicReference.set(Boolean.FALSE);
            return false;
        }
        try {
            this.zzb.set(FirebaseAnalytics.class.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context));
            this.zzc.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
            Method declaredMethod = a.class.getDeclaredMethod("valueOf", String.class);
            Method declaredMethod2 = b.class.getDeclaredMethod("valueOf", String.class);
            this.zzd.set(declaredMethod);
            this.zze.set(declaredMethod2);
            this.zzg.set(Boolean.TRUE);
            return true;
        } catch (Exception e10) {
            Log.w("UserMessagingPlatform", "No Firebase class found. ", e10);
            this.zzg.set(Boolean.FALSE);
            return false;
        }
    }
}
