package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();
    private static Method zzc = null;
    private static boolean zzd = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i10, Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:14:0x0040, B:15:0x0045, B:17:0x0047, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0050, B:22:0x0055, B:25:0x007f, B:12:0x002a), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0026, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:14:0x0040, B:15:0x0045, B:17:0x0047, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0050, B:22:0x0055, B:25:0x007f, B:12:0x002a), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x0026, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:14:0x0040, B:15:0x0045, B:17:0x0047, B:28:0x0091, B:29:0x0096, B:31:0x0098, B:32:0x00a6, B:20:0x0050, B:22:0x0055, B:25:0x007f, B:12:0x002a), top: B:37:0x0014, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void installIfNeeded(android.content.Context r11) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11, r0)
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            r1 = 11925000(0xb5f608, float:1.6710484E-38)
            r0.verifyGooglePlayServicesIsAvailable(r11, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> L26
            r4 = 0
            if (r3 != 0) goto L47
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L26 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29
            java.lang.String r5 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r11, r3, r5)     // Catch: java.lang.Throwable -> L26 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29
            android.content.Context r3 = r3.getModuleContext()     // Catch: java.lang.Throwable -> L26 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L29
            goto L3e
        L26:
            r11 = move-exception
            goto La7
        L29:
            r3 = move-exception
            java.lang.String r5 = "ProviderInstaller"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "Failed to load providerinstaller module: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> L26
            android.util.Log.w(r5, r3)     // Catch: java.lang.Throwable -> L26
            r3 = r4
        L3e:
            if (r3 == 0) goto L47
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r3, r11, r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            goto L97
        L47:
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> L26
            android.content.Context r5 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r11)     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L50
            goto L8f
        L50:
            r4 = 1
            com.google.android.gms.security.ProviderInstaller.zzd = r4     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L8e
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            java.lang.String r3 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r8 = "reportRequestStats2"
            java.lang.ClassLoader r9 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            com.google.android.gms.internal.common.zzj r10 = com.google.android.gms.internal.common.zzj.zzb(r10, r11)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            com.google.android.gms.internal.common.zzi r0 = com.google.android.gms.internal.common.zzi.zza(r0)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            com.google.android.gms.internal.common.zzi r1 = com.google.android.gms.internal.common.zzi.zza(r6)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            r6 = 3
            com.google.android.gms.internal.common.zzj[] r6 = new com.google.android.gms.internal.common.zzj[r6]     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            r7 = 0
            r6[r7] = r10     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            r6[r4] = r0     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            r0 = 2
            r6[r0] = r1     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            com.google.android.gms.internal.common.zzl.zzb(r3, r8, r9, r6)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L7e
            goto L8e
        L7e:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Failed to report request stats: "
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L26
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L26
        L8e:
            r4 = r5
        L8f:
            if (r4 == 0) goto L98
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r4, r11, r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
        L97:
            return
        L98:
            java.lang.String r11 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r11, r0)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r11 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L26
            r0 = 8
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L26
            throw r11     // Catch: java.lang.Throwable -> L26
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context):void");
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzb(Context context, Context context2, String str) throws IllegalAccessException, GooglePlayServicesNotAvailableException, IllegalArgumentException, InvocationTargetException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
