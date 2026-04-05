package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class CronetProviderInstaller {
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final String zza = "CronetProviderInstaller";
    private static final GoogleApiAvailabilityLight zzb = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzc = new Object();
    private static DynamiteModule zzd = null;
    private static String zze = "0";

    private CronetProviderInstaller() {
    }

    public static Task<Void> installProvider(final Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (isInstalled()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable() { // from class: com.google.android.gms.net.zza
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    CronetProviderInstaller.zzc(context2);
                    taskCompletionSource2.setResult(null);
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    public static DynamiteModule zza() {
        DynamiteModule dynamiteModule;
        synchronized (zzc) {
            dynamiteModule = zzd;
        }
        return dynamiteModule;
    }

    public static String zzb() {
        String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    @Deprecated
    public static void zzc(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        synchronized (zzc) {
            try {
                if (isInstalled()) {
                    return;
                }
                Preconditions.checkNotNull(context, "Context must not be null");
                try {
                    ((ClassLoader) Preconditions.checkNotNull(CronetProviderInstaller.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = zzb;
                    googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                    try {
                        DynamiteModule dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleLoad.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                                Log.e(zza, "ImplVersion class is missing from Cronet module.");
                                throw new GooglePlayServicesNotAvailableException(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            int iIntValue = ((Integer) Preconditions.checkNotNull((Integer) method.invoke(null, null))).intValue();
                            zze = (String) Preconditions.checkNotNull((String) method2.invoke(null, null));
                            if (apiLevel <= iIntValue) {
                                zzd = dynamiteModuleLoad;
                                return;
                            }
                            Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                            if (errorResolutionIntent == null) {
                                Log.e(zza, "Unable to fetch error resolution intent");
                                throw new GooglePlayServicesNotAvailableException(2);
                            }
                            String str = zze;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 174);
                            sb2.append("Google Play Services update is required. The API Level of the client is ");
                            sb2.append(apiLevel);
                            sb2.append(". The API Level of the implementation is ");
                            sb2.append(iIntValue);
                            sb2.append(". The Cronet implementation version is ");
                            sb2.append(str);
                            throw new GooglePlayServicesRepairableException(2, sb2.toString(), errorResolutionIntent);
                        } catch (Exception e10) {
                            Log.e(zza, "Unable to read Cronet version from the Cronet module ", e10);
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e10));
                        }
                    } catch (DynamiteModule.LoadingException e11) {
                        Log.e(zza, "Unable to load Cronet module", e11);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e11));
                    }
                } catch (ClassNotFoundException e12) {
                    Log.e(zza, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e12));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
