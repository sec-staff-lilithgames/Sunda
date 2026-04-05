package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.play_billing.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import j5.h;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzpp extends zzjf {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {uQjDr.AgqLHMmUryZqAUw};
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private h zzg;
    private Boolean zzh;
    private Integer zzi;

    public zzpp(zzic zzicVar) {
        super(zzicVar);
        this.zzi = null;
        this.zze = new AtomicLong(0L);
    }

    public static MessageDigest zzO() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long zzP(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i10 = 0;
        Preconditions.checkState(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static boolean zzQ(Context context, boolean z10) {
        Preconditions.checkNotNull(context);
        return zzR(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzR(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzZ(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean zzaA(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzaf(String str) {
        return !zzc[0].equals(str);
    }

    public static ArrayList zzas(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzahVar.zzd);
            bundle.putString("name", zzahVar.zzc.zzb);
            zzjh.zza(bundle, Preconditions.checkNotNull(zzahVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzahVar.zze);
            String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbg zzbgVar = zzahVar.zzg;
            if (zzbgVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbgVar.zza);
                zzbe zzbeVar = zzbgVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbeVar.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzahVar.zzh);
            zzbg zzbgVar2 = zzahVar.zzi;
            if (zzbgVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbgVar2.zza);
                zzbe zzbeVar2 = zzbgVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbeVar2.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzahVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzahVar.zzj);
            zzbg zzbgVar3 = zzahVar.zzk;
            if (zzbgVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbgVar3.zza);
                zzbe zzbeVar3 = zzbgVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbeVar3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean zzau(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void zzav(zzlu zzluVar, Bundle bundle, boolean z10) {
        if (bundle != null && zzluVar != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = zzluVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.zzc);
                return;
            }
            z10 = false;
        }
        if (bundle != null && zzluVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean zzax(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    private final Object zzay(int i10, Object obj, boolean z10, boolean z11, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzC(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleZzab = zzab((Bundle) parcelable, null);
                if (!bundleZzab.isEmpty()) {
                    arrayList.add(bundleZzab);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int zzaz(String str) {
        if ("_ldl".equals(str)) {
            this.zzu.zzc();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzc();
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if ("_lgclid".equals(str)) {
            this.zzu.zzc();
            return 100;
        }
        this.zzu.zzc();
        return 36;
    }

    public static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final boolean zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            this.zzu.zzaV().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.zzu.zzaV().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgu.zzl(str));
        return false;
    }

    public final boolean zzB(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String zzC(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat(APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return null;
    }

    public final Object zzE(String str, Object obj) {
        if ("_ev".equals(str)) {
            return zzay(this.zzu.zzc().zzf(null, false), obj, true, true, null);
        }
        return zzay(zzZ(str) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj, false, true, null);
    }

    public final Bundle zzF(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iZzq;
        List list2 = list;
        boolean zZzaA = zzaA(str2, zzjm.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzic zzicVar = this.zzu;
        int iZzc = zzicVar.zzc().zzc();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                iZzq = !z10 ? zzq(str3) : 0;
                if (iZzq == 0) {
                    iZzq = zzs(str3);
                }
            } else {
                iZzq = 0;
            }
            if (iZzq != 0) {
                zzJ(bundle2, iZzq, str3, iZzq == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iZzD = zzD(str, str2, str3, bundle.get(str3), bundle2, list2, z10, zZzaA);
                if (iZzD == 17) {
                    zzJ(bundle2, 17, str3, Boolean.FALSE);
                } else if (iZzD != 0 && !"_ev".equals(str3)) {
                    zzJ(bundle2, iZzD, iZzD == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3) && (i10 = i10 + 1) > iZzc) {
                    if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z11) {
                        zzicVar.zzaV().zzd().zzc(e2.n(new StringBuilder(String.valueOf(iZzc).length() + 37), "Event can't contain more than ", iZzc, " params"), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                    }
                    zzax(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final void zzG(zzgv zzgvVar, int i10) {
        Bundle bundle = zzgvVar.zzd;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzh(str) && (i11 = i11 + 1) > i10) {
                zzic zzicVar = this.zzu;
                if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z10) {
                    zzicVar.zzaV().zzd().zzc(e2.n(new StringBuilder(String.valueOf(i10).length() + 37), "Event can't contain more than ", i10, " params"), zzicVar.zzl().zza(zzgvVar.zza), zzicVar.zzl().zze(bundle));
                    zzax(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final void zzH(Parcelable[] parcelableArr, int i10) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzh(str) && !zzaA(str, zzjn.zzd) && (i11 = i11 + 1) > i10) {
                    zzic zzicVar = this.zzu;
                    if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z10) {
                        zzicVar.zzaV().zzd().zzc(e2.n(new StringBuilder(String.valueOf(i10).length() + 60), "Param can't contain more than ", i10, " item-scoped custom parameters"), zzicVar.zzl().zzb(str), zzicVar.zzl().zze(bundle));
                    }
                    zzax(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final void zzI(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzu.zzk().zzM(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzJ(Bundle bundle, int i10, String str, Object obj) {
        if (zzax(bundle, i10)) {
            this.zzu.zzc();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int zzK(String str, Object obj) {
        return "_ldl".equals(str) ? zzu("user property referrer", str, zzaz(str), obj) : zzu("user property", str, zzaz(str), obj) ? 0 : 7;
    }

    public final Object zzL(String str, Object obj) {
        return "_ldl".equals(str) ? zzay(zzaz(str), obj, true, false, null) : zzay(zzaz(str), obj, false, false, null);
    }

    public final void zzM(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzh().zzc("Not putting event parameter. Invalid value type. name, type", zzicVar.zzl().zzb(str), simpleName);
        }
    }

    public final void zzN(zzpo zzpoVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        zzax(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        zzpoVar.zza(str, "_err", bundle);
    }

    public final boolean zzS() {
        zzg();
        return zzV() == 1;
    }

    public final h zzT() {
        if (this.zzg == null) {
            this.zzg = h.from(this.zzu.zzaY());
        }
        return this.zzg;
    }

    public final int zzU() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final long zzV() {
        long j10;
        zzg();
        if (!zzX(this.zzu.zzv().zzj())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            zzic zzicVar = this.zzu;
            int iZzU = zzU();
            zzicVar.zzc();
            j10 = iZzU < ((Integer) zzfy.zzal.zzb(null)).intValue() ? 16L : 0L;
        }
        if (!zzY("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !zzW()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final boolean zzW() {
        Object e10;
        Integer num;
        if (this.zzh == null) {
            h hVarZzT = zzT();
            boolean z10 = false;
            if (hVarZzT == null) {
                return false;
            }
            try {
                num = (Integer) hVarZzT.getMeasurementApiStatusAsync().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e11) {
                        e10 = e11;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e10);
                        this.zzh = Boolean.FALSE;
                        this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                        return this.zzh.booleanValue();
                    } catch (CancellationException e12) {
                        e10 = e12;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e10);
                        this.zzh = Boolean.FALSE;
                        this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                        return this.zzh.booleanValue();
                    } catch (ExecutionException e13) {
                        e10 = e13;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e10);
                        this.zzh = Boolean.FALSE;
                        this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                        return this.zzh.booleanValue();
                    } catch (TimeoutException e14) {
                        e10 = e14;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e10);
                        this.zzh = Boolean.FALSE;
                        this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
                        return this.zzh.booleanValue();
                    }
                }
                this.zzh = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                e10 = e15;
                num = null;
            }
            this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
        }
        return this.zzh.booleanValue();
    }

    public final boolean zzX(String str) {
        String str2 = (String) zzfy.zzar.zzb(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean zzY(String str) {
        zzg();
        zzic zzicVar = this.zzu;
        if (Wrappers.packageManager(zzicVar.zzaY()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzicVar.zzaV().zzj().zzb("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return true;
    }

    public final boolean zzaa(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzic zzicVar = this.zzu;
        String strZzA = zzicVar.zzc().zzA();
        zzicVar.zzaU();
        return strZzA.equals(str);
    }

    public final Bundle zzab(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objZzE = zzE(str2, bundle.get(str2));
                if (objZzE == null) {
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaV().zzh().zzb("Param value can't be null", zzicVar.zzl().zzb(str2));
                } else {
                    zzM(bundle2, str2, objZzE);
                }
            }
        }
        return bundle2;
    }

    public final zzbg zzac(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzn(str2) != 0) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzb("Invalid conditional property event name", zzicVar.zzl().zzc(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZzF = zzF(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z10) {
            bundleZzF = zzab(bundleZzF, str);
        }
        Preconditions.checkNotNull(bundleZzF);
        return new zzbg(str2, new zzbe(bundleZzF), str3, j10);
    }

    public final boolean zzad(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzu.zzaV().zzb().zzb("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.zzu.zzaV().zzb().zzb("Error obtaining certificate", e11);
            return true;
        }
    }

    public final byte[] zzae(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean zzag(int i10, boolean z10) {
        Boolean boolZzJ = this.zzu.zzt().zzJ();
        if (zzah() < i10 / 1000) {
            return (boolZzJ == null || boolZzJ.booleanValue()) ? false : true;
        }
        return true;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzah() {
        if (this.zzi == null) {
            this.zzi = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaY()) / 1000);
        }
        return this.zzi.intValue();
    }

    public final int zzai(int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaY(), 12451000);
    }

    public final long zzaj(long j10, long j11) {
        return ((j11 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j10) / 86400000;
    }

    public final void zzak(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.zzu.zzaV().zze().zzb("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void zzal(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning string value to wrapper", e10);
        }
    }

    public final void zzam(com.google.android.gms.internal.measurement.zzcu zzcuVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning long value to wrapper", e10);
        }
    }

    public final void zzan(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning int value to wrapper", e10);
        }
    }

    public final void zzao(com.google.android.gms.internal.measurement.zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning byte array to wrapper", e10);
        }
    }

    public final void zzap(com.google.android.gms.internal.measurement.zzcu zzcuVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning boolean value to wrapper", e10);
        }
    }

    public final void zzaq(com.google.android.gms.internal.measurement.zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning bundle value to wrapper", e10);
        }
    }

    public final void zzar(com.google.android.gms.internal.measurement.zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.zzu.zzaV().zze().zzb("Error returning bundle list to wrapper", e10);
        }
    }

    public final URL zzat(long j10, String str, String str2, long j11, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + zzah()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j11;
            if (str.equals(this.zzu.zzc().zzB())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat(C3191e4.i.f36527c);
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.zzu.zzaV().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            this.zzu.zzaV().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final String zzaw() {
        byte[] bArr = new byte[16];
        zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final void zzba() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                a.C(this.zzu, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(jNextLong);
    }

    public final long zzd() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.zzu.zzaZ().currentTimeMillis()).nextLong();
            int i10 = this.zzf + 1;
            this.zzf = i10;
            j10 = jNextLong + i10;
        }
        return j10;
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom zzf() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    public final Bundle zzi(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString(MBInterstitialActivity.INTENT_CAMAPIGN, queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.zzu.zzaV().zze().zzb("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    public final boolean zzj(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzu.zzaV().zzd().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzk(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzu.zzaV().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzl(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zzb;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.zzu.zzaV().zzd().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaA(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaA(str2, strArr2)) {
            return true;
        }
        this.zzu.zzaV().zzd().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzm(String str, int i10, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.zzu.zzaV().zzd().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final int zzn(String str) {
        if (!zzk(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!zzl(NotificationCompat.CATEGORY_EVENT, zzjm.zza, zzjm.zzb, str)) {
            return 13;
        }
        this.zzu.zzc();
        return !zzm(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    public final int zzp(String str) {
        if (!zzk("user property", str)) {
            return 6;
        }
        if (!zzl("user property", zzjo.zza, null, str)) {
            return 15;
        }
        this.zzu.zzc();
        return !zzm("user property", 24, str) ? 6 : 0;
    }

    public final int zzq(String str) {
        if (!zzj("event param", str)) {
            return 3;
        }
        if (!zzl("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzm("event param", 40, str) ? 3 : 0;
    }

    public final int zzs(String str) {
        if (!zzk("event param", str)) {
            return 3;
        }
        if (!zzl("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzm("event param", 40, str) ? 3 : 0;
    }

    public final boolean zzt(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zzu(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.zzu.zzaV().zzh().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final void zzz(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int iZzq;
        String str4;
        int iZzD;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        int i10 = true != zzicVar.zzc().zzu.zzk().zzag(231100000, true) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list2 == null || !list2.contains(str5)) {
                iZzq = !z10 ? zzq(str5) : 0;
                if (iZzq == 0) {
                    iZzq = zzs(str5);
                }
            } else {
                iZzq = 0;
            }
            if (iZzq != 0) {
                zzJ(bundle, iZzq, str5, iZzq == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (zzt(bundle.get(str5))) {
                    zzicVar.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iZzD = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iZzD = zzD(str, str2, str5, bundle.get(str5), bundle, list2, z10, false);
                }
                if (iZzD != 0 && !"_ev".equals(str5)) {
                    zzJ(bundle, iZzD, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (zzh(str5) && !zzaA(str5, zzjn.zzd)) {
                    i11++;
                    if (!zzag(231100000, true)) {
                        zzicVar.zzaV().zzd().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        zzax(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!zzicVar.zzc().zzp(str4, zzfy.zzbe) || !z11) {
                            zzicVar.zzaV().zzd().zzc(e2.n(new StringBuilder(String.valueOf(i10).length() + 55), "Item can't contain more than ", i10, " item-scoped custom params"), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        }
                        zzax(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z11 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzD(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpp.zzD(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }
}
