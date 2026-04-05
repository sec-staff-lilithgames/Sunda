package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzic implements zzjg {
    private static volatile zzic zzb;
    private volatile Boolean zzA;
    private volatile boolean zzB;
    private int zzC;
    private int zzD;
    final long zza;
    private final Context zzc;
    private final boolean zzd;
    private final zzae zze;
    private final zzal zzf;
    private final zzhh zzg;
    private final zzgu zzh;
    private final zzhz zzi;
    private final zzoc zzj;
    private final zzpp zzk;
    private final zzgn zzl;
    private final Clock zzm;
    private final zzmb zzn;
    private final zzlj zzo;
    private final zzd zzp;
    private final zzlo zzq;
    private final String zzr;
    private zzgl zzs;
    private zznl zzt;
    private zzba zzu;
    private zzgi zzv;
    private zzlq zzw;
    private Boolean zzy;
    private long zzz;
    private boolean zzx = false;
    private final AtomicInteger zzE = new AtomicInteger(0);

    public zzic(zzjs zzjsVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzjsVar);
        Context context = zzjsVar.zza;
        zzae zzaeVar = new zzae(context);
        this.zze = zzaeVar;
        zzfr.zza = zzaeVar;
        this.zzc = context;
        this.zzd = zzjsVar.zze;
        this.zzA = zzjsVar.zzb;
        this.zzr = zzjsVar.zzg;
        this.zzB = true;
        com.google.android.gms.internal.measurement.zzkm.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzm = defaultClock;
        Long l9 = zzjsVar.zzf;
        this.zza = l9 != null ? l9.longValue() : defaultClock.currentTimeMillis();
        this.zzf = new zzal(this);
        zzhh zzhhVar = new zzhh(this);
        zzhhVar.zzx();
        this.zzg = zzhhVar;
        zzgu zzguVar = new zzgu(this);
        zzguVar.zzx();
        this.zzh = zzguVar;
        zzpp zzppVar = new zzpp(this);
        zzppVar.zzx();
        this.zzk = zzppVar;
        this.zzl = new zzgn(new zzjr(zzjsVar, this));
        this.zzp = new zzd(this);
        zzmb zzmbVar = new zzmb(this);
        zzmbVar.zzc();
        this.zzn = zzmbVar;
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzc();
        this.zzo = zzljVar;
        zzoc zzocVar = new zzoc(this);
        zzocVar.zzc();
        this.zzj = zzocVar;
        zzlo zzloVar = new zzlo(this);
        zzloVar.zzx();
        this.zzq = zzloVar;
        zzhz zzhzVar = new zzhz(this);
        zzhzVar.zzx();
        this.zzi = zzhzVar;
        com.google.android.gms.internal.measurement.zzdd zzddVar = zzjsVar.zzd;
        boolean z10 = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzO(zzljVar);
            if (zzljVar.zzu.zzc.getApplicationContext() instanceof Application) {
                Application application = (Application) zzljVar.zzu.zzc.getApplicationContext();
                if (zzljVar.zza == null) {
                    zzljVar.zza = new zzky(zzljVar);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzljVar.zza);
                    application.registerActivityLifecycleCallbacks(zzljVar.zza);
                    zzgu zzguVar2 = zzljVar.zzu.zzh;
                    zzP(zzguVar2);
                    zzguVar2.zzk().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzP(zzguVar);
            zzguVar.zze().zza("Application context is not an Application");
        }
        zzhzVar.zzj(new zzia(this, zzjsVar));
    }

    public static final void zzL() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzM(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzN(zzje zzjeVar) {
        if (zzjeVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzO(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzgVar.zza()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgVar.getClass())));
        }
    }

    private static final void zzP(zzjf zzjfVar) {
        if (zzjfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzjfVar.zzv()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzjfVar.getClass())));
        }
    }

    public static zzic zzy(Context context, com.google.android.gms.internal.measurement.zzdd zzddVar, Long l9) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.zzd;
            zzddVar = new com.google.android.gms.internal.measurement.zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzic.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzic(new zzjs(context, zzddVar, l9));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zzA = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    public final boolean zzA() {
        return this.zzA != null && this.zzA.booleanValue();
    }

    public final boolean zzB() {
        return zzC() == 0;
    }

    public final int zzC() {
        zzhz zzhzVar = this.zzi;
        zzP(zzhzVar);
        zzhzVar.zzg();
        zzal zzalVar = this.zzf;
        if (zzalVar.zzt()) {
            return 1;
        }
        zzP(zzhzVar);
        zzhzVar.zzg();
        if (!this.zzB) {
            return 8;
        }
        zzhh zzhhVar = this.zzg;
        zzN(zzhhVar);
        Boolean boolZzi = zzhhVar.zzi();
        if (boolZzi != null) {
            return boolZzi.booleanValue() ? 0 : 3;
        }
        zzae zzaeVar = zzalVar.zzu.zze;
        Boolean boolZzr = zzalVar.zzr("firebase_analytics_collection_enabled");
        return boolZzr != null ? boolZzr.booleanValue() ? 0 : 4 : (this.zzA == null || this.zzA.booleanValue()) ? 0 : 7;
    }

    public final void zzD(boolean z10) {
        zzhz zzhzVar = this.zzi;
        zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzB = z10;
    }

    public final boolean zzE() {
        zzhz zzhzVar = this.zzi;
        zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzB;
    }

    public final void zzF() {
        this.zzC++;
    }

    public final void zzG() {
        this.zzE.incrementAndGet();
    }

    public final boolean zzH() {
        if (!this.zzx) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzhz zzhzVar = this.zzi;
        zzP(zzhzVar);
        zzhzVar.zzg();
        Boolean bool = this.zzy;
        if (bool == null || this.zzz == 0 || (!bool.booleanValue() && Math.abs(this.zzm.elapsedRealtime() - this.zzz) > 1000)) {
            this.zzz = this.zzm.elapsedRealtime();
            zzpp zzppVar = this.zzk;
            zzN(zzppVar);
            boolean z10 = false;
            if (zzppVar.zzY("android.permission.INTERNET")) {
                zzN(zzppVar);
                if (zzppVar.zzY("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.zzc;
                    if (Wrappers.packageManager(context).isCallerInstantApp() || this.zzf.zzE() || (zzpp.zzau(context) && zzpp.zzQ(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.zzy = boolValueOf;
            if (boolValueOf.booleanValue()) {
                zzN(zzppVar);
                this.zzy = Boolean.valueOf(zzppVar.zzA(zzv().zzk()));
            }
        }
        return this.zzy.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzI() throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzic.zzI():boolean");
    }

    public final /* synthetic */ void zzJ(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
            if (i10 != 304) {
                i11 = i10;
            }
            zzgu zzguVar = this.zzh;
            zzP(zzguVar);
            zzguVar.zze().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            zzhh zzhhVar = this.zzg;
            zzN(zzhhVar);
            zzhhVar.zzo.zzb(true);
            if (bArr == null || bArr.length == 0) {
                zzgu zzguVar2 = this.zzh;
                zzP(zzguVar2);
                zzguVar2.zzj().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    zzgu zzguVar3 = this.zzh;
                    zzP(zzguVar3);
                    zzguVar3.zzj().zza("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                zzpp zzppVar = this.zzk;
                zzN(zzppVar);
                zzic zzicVar = zzppVar.zzu;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = zzicVar.zzc;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.zzo.zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
                        zzN(zzppVar);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = zzppVar.zzu.zzc;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            zzgu zzguVar4 = zzppVar.zzu.zzh;
                            zzP(zzguVar4);
                            zzguVar4.zzb().zzb("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                zzgu zzguVar5 = this.zzh;
                zzP(zzguVar5);
                zzguVar5.zze().zzd("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                zzgu zzguVar6 = this.zzh;
                zzP(zzguVar6);
                zzguVar6.zzb().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        zzgu zzguVar7 = this.zzh;
        zzP(zzguVar7);
        zzguVar7.zze().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final /* synthetic */ void zzK(zzjs zzjsVar) {
        zzhz zzhzVar = this.zzi;
        zzP(zzhzVar);
        zzhzVar.zzg();
        zzal zzalVar = this.zzf;
        zzalVar.zzb();
        zzba zzbaVar = new zzba(this);
        zzbaVar.zzx();
        this.zzu = zzbaVar;
        com.google.android.gms.internal.measurement.zzdd zzddVar = zzjsVar.zzd;
        zzgi zzgiVar = new zzgi(this, zzjsVar.zzc, zzddVar == null ? 0L : zzddVar.zza);
        zzgiVar.zzc();
        this.zzv = zzgiVar;
        zzgl zzglVar = new zzgl(this);
        zzglVar.zzc();
        this.zzs = zzglVar;
        zznl zznlVar = new zznl(this);
        zznlVar.zzc();
        this.zzt = zznlVar;
        zzpp zzppVar = this.zzk;
        zzppVar.zzy();
        this.zzg.zzy();
        this.zzv.zzd();
        zzlq zzlqVar = new zzlq(this);
        zzlqVar.zzc();
        this.zzw = zzlqVar;
        zzlqVar.zzd();
        zzgu zzguVar = this.zzh;
        zzP(zzguVar);
        zzgs zzgsVarZzi = zzguVar.zzi();
        zzalVar.zzi();
        zzgsVarZzi.zzb("App measurement initialized, version", 133005L);
        zzP(zzguVar);
        zzguVar.zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzj = zzgiVar.zzj();
        zzN(zzppVar);
        if (zzppVar.zzaa(strZzj, zzalVar.zzz())) {
            zzP(zzguVar);
            zzguVar.zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            zzP(zzguVar);
            zzguVar.zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strZzj)));
        }
        zzP(zzguVar);
        zzguVar.zzj().zza("Debug-level message logging enabled");
        int i10 = this.zzC;
        AtomicInteger atomicInteger = this.zzE;
        if (i10 != atomicInteger.get()) {
            zzP(zzguVar);
            zzguVar.zzb().zzc("Not all components initialized", Integer.valueOf(this.zzC), Integer.valueOf(atomicInteger.get()));
        }
        this.zzx = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdd r14) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzic.zza(com.google.android.gms.internal.measurement.zzdd):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    @Pure
    public final zzae zzaU() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    @Pure
    public final zzgu zzaV() {
        zzgu zzguVar = this.zzh;
        zzP(zzguVar);
        return zzguVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    @Pure
    public final zzhz zzaW() {
        zzhz zzhzVar = this.zzi;
        zzP(zzhzVar);
        return zzhzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    @Pure
    public final Context zzaY() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    @Pure
    public final Clock zzaZ() {
        return this.zzm;
    }

    @Pure
    public final zzal zzc() {
        return this.zzf;
    }

    @Pure
    public final zzhh zzd() {
        zzhh zzhhVar = this.zzg;
        zzN(zzhhVar);
        return zzhhVar;
    }

    public final zzgu zzf() {
        zzgu zzguVar = this.zzh;
        if (zzguVar == null || !zzguVar.zzv()) {
            return null;
        }
        return zzguVar;
    }

    @Pure
    public final zzoc zzh() {
        zzoc zzocVar = this.zzj;
        zzO(zzocVar);
        return zzocVar;
    }

    @SideEffectFree
    public final zzhz zzi() {
        return this.zzi;
    }

    @Pure
    public final zzlj zzj() {
        zzlj zzljVar = this.zzo;
        zzO(zzljVar);
        return zzljVar;
    }

    @Pure
    public final zzpp zzk() {
        zzpp zzppVar = this.zzk;
        zzN(zzppVar);
        return zzppVar;
    }

    @Pure
    public final zzgn zzl() {
        return this.zzl;
    }

    @Pure
    public final zzgl zzm() {
        zzO(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzlo zzn() {
        zzlo zzloVar = this.zzq;
        zzP(zzloVar);
        return zzloVar;
    }

    @Pure
    public final boolean zzp() {
        return this.zzd;
    }

    @Pure
    public final String zzq() {
        return this.zzr;
    }

    @Pure
    public final zzmb zzs() {
        zzmb zzmbVar = this.zzn;
        zzO(zzmbVar);
        return zzmbVar;
    }

    @Pure
    public final zznl zzt() {
        zzO(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzba zzu() {
        zzP(this.zzu);
        return this.zzu;
    }

    @Pure
    public final zzgi zzv() {
        zzO(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzd zzw() {
        zzd zzdVar = this.zzp;
        zzM(zzdVar);
        return zzdVar;
    }

    @Pure
    public final zzlq zzx() {
        zzM(this.zzw);
        return this.zzw;
    }

    public final void zzz(boolean z10) {
        this.zzA = Boolean.valueOf(z10);
    }
}
