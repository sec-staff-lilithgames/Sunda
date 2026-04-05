package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2733d7 implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public static final C2733d7 f32734a = new C2733d7();

    /* renamed from: b, reason: collision with root package name */
    public static final LocationManager f32735b;

    /* renamed from: c, reason: collision with root package name */
    public static final HandlerThread f32736c;

    /* renamed from: d, reason: collision with root package name */
    public static GoogleApiClient f32737d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f32738e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f32739f;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f32736c = handlerThread;
        f32738e = "d7";
        J4.a(handlerThread, "LThread");
        Context contextD = C2925od.d();
        if (contextD != null) {
            Object systemService = contextD.getSystemService(DtbConstants.PRIVACY_LOCATION_KEY);
            f32735b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static boolean c() {
        try {
            if (Ga.a(C2925od.d(), "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return Ga.a(C2925od.d(), "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = f32738e;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() throws Settings.SettingNotFoundException {
        int i10;
        Context contextD = C2925od.d();
        if (contextD == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = f32735b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i10 = Settings.Secure.getInt(contextD.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i10 = 0;
        }
        return i10 != 0;
    }

    public final void a() {
        LocationManager locationManager = f32735b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(f32738e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f32736c.getLooper());
            } else {
                String TAG = f32738e;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[PHI: r1
      0x0083: PHI (r1v4 android.location.Location) = (r1v3 android.location.Location), (r1v21 android.location.Location), (r1v21 android.location.Location) binds: [B:31:0x0089, B:23:0x006f, B:25:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149 A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175 A[Catch: all -> 0x002e, LOOP:0: B:83:0x016f->B:85:0x0175, LOOP_END, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.HashMap b() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2733d7.b():java.util.HashMap");
    }

    public final synchronized void d() {
        try {
            if (c() && e()) {
                a();
                try {
                    kotlin.jvm.internal.c1.getOrCreateKotlinClass(GoogleApiClient.class).getSimpleName();
                    kotlin.jvm.internal.c1.getOrCreateKotlinClass(FusedLocationProviderClient.class).getSimpleName();
                    kotlin.jvm.internal.c1.getOrCreateKotlinClass(LocationServices.class).getSimpleName();
                    a(C2925od.d());
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception unused2) {
            String TAG = f32738e;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        kotlin.jvm.internal.e0.checkNotNullParameter(location, "location");
        try {
            String TAG = f32738e;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!c() || (locationManager = f32735b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = f32737d;
            if (googleApiClient == null) {
                String TAG = f32738e;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                kotlin.jvm.internal.e0.checkNotNull(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C2716c7()).addOnConnectionFailedListener(new zk.j0()).addApi(LocationServices.API).build();
                f32737d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception unused) {
            String TAG2 = f32738e;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
        }
    }

    public static final void a(ConnectionResult it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        f32739f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[PHI: r1
      0x0057: PHI (r1v4 android.location.Location) = 
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v3 android.location.Location)
      (r1v5 android.location.Location)
     binds: [B:31:0x0057, B:17:0x0047, B:19:0x004d, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.location.Location a(int r5, int r6) {
        /*
            android.location.Criteria r0 = new android.location.Criteria
            r0.<init>()
            r0.setAccuracy(r5)
            r0.setPowerRequirement(r6)
            r6 = 0
            r0.setCostAllowed(r6)
            android.location.LocationManager r6 = com.inmobi.media.C2733d7.f32735b
            r1 = 0
            if (r6 == 0) goto L5d
            r2 = 1
            java.lang.String r0 = r6.getBestProvider(r0, r2)
            if (r0 == 0) goto L5d
            android.location.Location r6 = r6.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
            r6 = r1
        L21:
            if (r6 != 0) goto L5c
            if (r5 == r2) goto L5c
            android.location.LocationManager r5 = com.inmobi.media.C2733d7.f32735b
            if (r5 == 0) goto L5d
            kotlin.jvm.internal.e0.checkNotNull(r5)
            java.util.List r5 = r5.getProviders(r2)
            java.lang.String r6 = "getProviders(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
            int r6 = r5.size()
            int r6 = r6 + (-1)
            if (r6 < 0) goto L5d
        L3d:
            int r0 = r6 + (-1)
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.location.LocationManager r3 = com.inmobi.media.C2733d7.f32735b     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L57
            boolean r4 = r3.isProviderEnabled(r6)     // Catch: java.lang.Exception -> L57
            if (r4 != r2) goto L57
            android.location.Location r6 = r3.getLastKnownLocation(r6)     // Catch: java.lang.SecurityException -> L54 java.lang.Exception -> L57
            r1 = r6
        L54:
            if (r1 == 0) goto L57
            goto L5d
        L57:
            if (r0 >= 0) goto L5a
            goto L5d
        L5a:
            r6 = r0
            goto L3d
        L5c:
            r1 = r6
        L5d:
            java.lang.String r5 = com.inmobi.media.C2733d7.f32738e
            java.lang.String r6 = "TAG"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2733d7.a(int, int):android.location.Location");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap a(android.location.Location r7, boolean r8, android.location.Location r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.Context r1 = com.inmobi.media.C2925od.d()
            if (r1 != 0) goto Ld
            goto Lde
        Ld:
            r2 = 44
            if (r7 == 0) goto L5b
            long r3 = r7.getTime()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L28
            long r3 = r7.getTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "u-ll-ts"
            r0.put(r4, r3)
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            double r4 = r7.getLatitude()
            r3.append(r4)
            r3.append(r2)
            double r4 = r7.getLongitude()
            r3.append(r4)
            r3.append(r2)
            float r7 = r7.getAccuracy()
            int r7 = (int) r7
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r3 = "u-latlong-accu"
            r0.put(r3, r7)
            java.lang.String r7 = "sdk-collected"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r7, r8)
        L5b:
            com.inmobi.media.od r7 = com.inmobi.media.C2925od.f33208a
            java.lang.String r7 = r7.h()
            if (r7 == 0) goto L7d
            java.util.LinkedHashMap r8 = com.inmobi.media.Q2.f32149a
            java.lang.String r8 = "signals"
            r3 = 0
            com.inmobi.commons.core.configs.Config r7 = com.inmobi.media.O2.a(r8, r7, r3)
            java.lang.String r8 = "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig"
            kotlin.jvm.internal.e0.checkNotNull(r7, r8)
            com.inmobi.commons.core.configs.SignalsConfig r7 = (com.inmobi.commons.core.configs.SignalsConfig) r7
            com.inmobi.commons.core.configs.SignalsConfig$IceConfig r7 = r7.getIceConfig()
            boolean r7 = r7.isLocationEnabled()
            if (r7 == 0) goto L8a
        L7d:
            boolean r7 = e()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "loc-allowed"
            r0.put(r8, r7)
        L8a:
            if (r9 == 0) goto Lc3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            double r3 = r9.getLatitude()
            r7.append(r3)
            r7.append(r2)
            double r3 = r9.getLongitude()
            r7.append(r3)
            r7.append(r2)
            float r8 = r9.getAccuracy()
            int r8 = (int) r8
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "u-latlong-accu-fine"
            r0.put(r8, r7)
            long r7 = r9.getTime()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "u-ll-ts-fine"
            r0.put(r8, r7)
        Lc3:
            boolean r7 = e()
            java.lang.String r8 = "loc-granularity"
            if (r7 == 0) goto Ldf
            boolean r7 = c()
            if (r7 == 0) goto Ldf
            java.lang.String r7 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r7 = com.inmobi.media.Ga.a(r1, r7)
            if (r7 == 0) goto Lde
            java.lang.String r7 = "coarse"
            r0.put(r8, r7)
        Lde:
            return r0
        Ldf:
            java.lang.String r7 = "none"
            r0.put(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2733d7.a(android.location.Location, boolean, android.location.Location):java.util.HashMap");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
