package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.play_billing.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sfbx.appconsent.core.IABConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import j5.h;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import nh.ej;
import nh.g5;
import nh.l6;
import nh.m5;
import sh.b1;
import sh.n1;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzlj extends zzg {
    protected zzky zza;
    final zzx zzb;
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzay zzk;
    private zzay zzl;
    private PriorityQueue zzm;
    private boolean zzn;
    private zzjl zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzay zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzay zzt;
    private final zzpo zzv;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzo = zzjl.zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    private final zzlr zzar(final zzom zzomVar) throws IllegalStateException, MalformedURLException {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) throws java.lang.IllegalStateException {
                    /*
                        r6 = this;
                        com.google.android.gms.measurement.internal.zzlj r7 = r6.zza
                        r7.zzg()
                        com.google.android.gms.measurement.internal.zzom r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        com.google.android.gms.measurement.internal.zzic r8 = r7.zzu
                        com.google.android.gms.measurement.internal.zzgu r8 = r8.zzaV()
                        com.google.android.gms.measurement.internal.zzgs r8 = r8.zzk()
                        long r0 = r10.zza
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.zzb(r11, r9)
                        com.google.android.gms.measurement.internal.zzlr r8 = com.google.android.gms.measurement.internal.zzlr.SUCCESS
                        goto L69
                    L2e:
                        com.google.android.gms.measurement.internal.zzic r11 = r7.zzu
                        com.google.android.gms.measurement.internal.zzgu r11 = r11.zzaV()
                        com.google.android.gms.measurement.internal.zzgs r11 = r11.zze()
                        long r0 = r10.zza
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.zzd(r2, r0, r1, r9)
                        com.google.android.gms.measurement.internal.zzfx r9 = com.google.android.gms.measurement.internal.zzfy.zzt
                        r11 = 0
                        java.lang.Object r9 = r9.zzb(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        com.google.android.gms.measurement.internal.zzlr r8 = com.google.android.gms.measurement.internal.zzlr.BACKOFF
                        goto L69
                    L67:
                        com.google.android.gms.measurement.internal.zzlr r8 = com.google.android.gms.measurement.internal.zzlr.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        com.google.android.gms.measurement.internal.zzic r11 = r7.zzu
                        com.google.android.gms.measurement.internal.zznl r11 = r11.zzt()
                        com.google.android.gms.measurement.internal.zzaf r0 = new com.google.android.gms.measurement.internal.zzaf
                        long r1 = r10.zza
                        int r3 = r8.zza()
                        long r4 = r10.zzf
                        r0.<init>(r1, r3, r4)
                        r11.zzy(r0)
                        com.google.android.gms.measurement.internal.zzic r7 = r7.zzu
                        com.google.android.gms.measurement.internal.zzgu r7 = r7.zzaV()
                        com.google.android.gms.measurement.internal.zzgs r7 = r7.zzk()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.zzc(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaW().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzaZ().currentTimeMillis();
                long j10 = jCurrentTimeMillis + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = j10 - zzicVar2.zzaZ().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                a.C(this.zzu, "[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e10);
            return zzlr.FAILURE;
        }
    }

    private final void zzas(Boolean bool, boolean z10) throws IllegalStateException {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z10) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzal() throws IllegalStateException {
        zzlj zzljVar;
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza == null) {
            zzljVar = this;
        } else if ("unset".equals(strZza)) {
            zzljVar = this;
            zzljVar.zzN(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", null, zzicVar.zzaZ().currentTimeMillis());
        } else {
            zzN(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), zzicVar.zzaZ().currentTimeMillis());
            zzljVar = this;
        }
        if (!zzljVar.zzu.zzB() || !zzljVar.zzc) {
            zzicVar.zzaV().zzj().zza("Updating Scion state (FE)");
            zzljVar.zzu.zzt().zzi();
        } else {
            zzicVar.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzU();
            zzljVar.zzu.zzh().zza.zza();
            zzicVar.zzaW().zzj(new zzjz(this));
        }
    }

    public final void zzA(zzjl zzjlVar) {
        zzg();
        boolean z10 = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z10 != zzicVar.zzE()) {
            zzicVar.zzD(z10);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            Boolean boolValueOf = zzhhVarZzd.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzas(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void zzB(String str, String str2, Bundle bundle) throws IllegalStateException {
        zzC(str, str2, bundle, true, true, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzC(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws IllegalStateException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.zzu.zzs().zzj(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.zzd != null && !zzpp.zzZ(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        zzJ(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    public final void zzD() {
        zzic zzicVar;
        zzod zzodVar;
        zzod zzodVar2;
        com.google.android.gms.internal.measurement.zzkq zzkqVar;
        zzg();
        zzic zzicVar2 = this.zzu;
        zzicVar2.zzaV().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar2.zzd().zze();
        HashMap map = new HashMap();
        zzfx zzfxVar = zzfy.zzaZ;
        if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
            int i10 = zzof.zzb;
            com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzoe zzoeVar = zzoe.CONSENT;
            int i11 = 2;
            Objects.requireNonNull(zzkpVar);
            Objects.requireNonNull(zzoeVar);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(zzkpVar, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i12 = 1;
            zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
            Objects.requireNonNull(zzkpVar2);
            Objects.requireNonNull(zzoeVar2);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(zzkpVar2, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            zzicVar = zzicVar2;
            Objects.requireNonNull(zzkpVar3);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(zzkpVar3, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            Objects.requireNonNull(zzkpVar4);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(zzkpVar4, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar5 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            Objects.requireNonNull(zzkpVar5);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry5 = new AbstractMap.SimpleImmutableEntry(zzkpVar5, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar6 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS;
            Objects.requireNonNull(zzkpVar6);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry6 = new AbstractMap.SimpleImmutableEntry(zzkpVar6, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar7 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS;
            Objects.requireNonNull(zzkpVar7);
            m5 m5VarOfEntries = m5.ofEntries(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, simpleImmutableEntry5, simpleImmutableEntry6, new AbstractMap.SimpleImmutableEntry(zzkpVar7, zzoeVar2));
            l6 l6VarOf = l6.of("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
            int iZzb = zzof.zzb(sharedPreferencesZze, IABConstants.CMP_SDK_ID);
            int iZzb2 = zzof.zzb(sharedPreferencesZze, IABConstants.POLICY_VERSION);
            int iZzb3 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            int iZzb4 = zzof.zzb(sharedPreferencesZze, IABConstants.PURPOSE_ONE_TREATMENT);
            int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            String strZza = zzof.zza(sharedPreferencesZze, IABConstants.PUBLISHER_CC);
            g5 g5VarBuilder = m5.builder();
            ej it = m5VarOfEntries.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzkp zzkpVar8 = (com.google.android.gms.internal.measurement.zzkp) it.next();
                int iZza = zzkpVar8.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strZza2 = zzof.zza(sharedPreferencesZze, sb2.toString());
                if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                    zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strZza2.charAt(754), 10);
                    zzkqVar = (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkq.values().length || iDigit == 0) ? com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != i12 ? iDigit != i11 ? com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                g5VarBuilder.put(zzkpVar8, zzkqVar);
                i11 = 2;
                i12 = 1;
            }
            m5 m5VarBuildOrThrow = g5VarBuilder.buildOrThrow();
            String strZza3 = zzof.zza(sharedPreferencesZze, IABConstants.PURPOSE_CONSENTS);
            String strZza4 = zzof.zza(sharedPreferencesZze, IABConstants.VENDOR_CONSENTS);
            boolean z10 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
            String strZza5 = zzof.zza(sharedPreferencesZze, IABConstants.PURPOSE_LEGITIMATE_INTERESTS);
            String strZza6 = zzof.zza(sharedPreferencesZze, IABConstants.VENDOR_LEGITIMATE_INTERESTS);
            boolean z11 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
            cArr[0] = '2';
            zzodVar = new zzod(zzof.zzd(m5VarOfEntries, m5VarBuildOrThrow, l6VarOf, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z10, z11, zContains));
        } else {
            zzicVar = zzicVar2;
            String strZza7 = zzof.zza(sharedPreferencesZze, IABConstants.VENDOR_CONSENTS);
            if (!"".equals(strZza7) && strZza7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strZza7.charAt(754)));
            }
            int iZzb6 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            if (iZzb6 != -1) {
                map.put("gdprApplies", String.valueOf(iZzb6));
            }
            int iZzb7 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            if (iZzb7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iZzb7));
            }
            int iZzb8 = zzof.zzb(sharedPreferencesZze, IABConstants.POLICY_VERSION);
            if (iZzb8 != -1) {
                map.put("PolicyVersion", String.valueOf(iZzb8));
            }
            String strZza8 = zzof.zza(sharedPreferencesZze, IABConstants.PURPOSE_CONSENTS);
            if (!"".equals(strZza8)) {
                map.put("PurposeConsents", strZza8);
            }
            int iZzb9 = zzof.zzb(sharedPreferencesZze, IABConstants.CMP_SDK_ID);
            if (iZzb9 != -1) {
                map.put("CmpSdkID", String.valueOf(iZzb9));
            }
            zzodVar = new zzod(map);
        }
        zzicVar.zzaV().zzk().zzb("Tcf preferences read", zzodVar);
        if (!zzicVar.zzc().zzp(null, zzfxVar)) {
            if (zzicVar.zzd().zzm(zzodVar)) {
                Bundle bundleZzb = zzodVar.zzb();
                zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb);
                if (bundleZzb != Bundle.EMPTY) {
                    zzp(bundleZzb, -30, zzicVar.zzaZ().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", zzodVar.zze());
                zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_tcf", bundle);
                return;
            }
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzg();
        String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzodVar2 = new zzod(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split(C3191e4.i.f36525b);
                if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzodVar2 = new zzod(map2);
        }
        if (zzicVar.zzd().zzm(zzodVar)) {
            Bundle bundleZzb2 = zzodVar.zzb();
            zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb2);
            if (bundleZzb2 != Bundle.EMPTY) {
                zzp(bundleZzb2, -30, zzicVar.zzaZ().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", zzodVar.zzd(zzodVar2));
            bundle2.putString("_tcfd2", zzodVar.zzc());
            bundle2.putString("_tcfd", zzodVar.zze());
            zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_tcf", bundle2);
        }
    }

    public final void zzE() {
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new zzkb(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzag(sharedPreferences, str);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzF(String str, String str2, Bundle bundle) {
        zzg();
        zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
    }

    public final void zzG(String str, String str2, long j10, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzg();
        boolean z10 = true;
        if (this.zzd != null && !zzpp.zzZ(str2)) {
            z10 = false;
        }
        zzH(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void zzI(String str, String str2, Bundle bundle, String str3) throws IllegalStateException {
        zzic.zzL();
        zzJ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.zzu.zzaZ().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzJ(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) throws IllegalStateException {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.zzu.zzaW().zzj(new zzkc(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void zzK(String str, String str2, Object obj, boolean z10) throws IllegalStateException {
        zzL(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.zzu.zzaZ().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzL(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) throws java.lang.IllegalStateException {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.zzic r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzpp r5 = r5.zzk()
            int r5 = r5.zzp(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            com.google.android.gms.measurement.internal.zzic r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzpp r5 = r5.zzk()
            java.lang.String r6 = "user property"
            boolean r7 = r5.zzj(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = com.google.android.gms.measurement.internal.zzjo.zza
            r9 = 0
            boolean r7 = r5.zzl(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            com.google.android.gms.measurement.internal.zzic r7 = r5.zzu
            r7.zzc()
            boolean r5 = r5.zzm(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            com.google.android.gms.measurement.internal.zzic r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzpp r6 = r1.zzk()
            r1.zzc()
            java.lang.String r14 = r6.zzC(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            com.google.android.gms.measurement.internal.zzic r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzpo r10 = r0.zzv
            com.google.android.gms.measurement.internal.zzpp r9 = r1.zzk()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzN(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            com.google.android.gms.measurement.internal.zzic r7 = r0.zzu
            com.google.android.gms.measurement.internal.zzpp r8 = r7.zzk()
            int r12 = r8.zzK(r2, r1)
            if (r12 == 0) goto Laa
            com.google.android.gms.measurement.internal.zzpp r6 = r7.zzk()
            r7.zzc()
            java.lang.String r14 = r6.zzC(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            com.google.android.gms.measurement.internal.zzic r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzpo r10 = r0.zzv
            com.google.android.gms.measurement.internal.zzpp r9 = r1.zzk()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzN(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            com.google.android.gms.measurement.internal.zzpp r3 = r7.zzk()
            java.lang.Object r5 = r3.zzL(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.zzM(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.zzM(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzL(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void zzM(String str, String str2, long j10, Object obj) throws IllegalStateException {
        this.zzu.zzaW().zzj(new zzkd(this, str, str2, obj, j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzN(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r9.zzg()
            r9.zzb()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            com.google.android.gms.measurement.internal.zzic r4 = r9.zzu
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.zzhh r11 = r4.zzd()
            com.google.android.gms.measurement.internal.zzhg r11 = r11.zzh
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.zzb(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            com.google.android.gms.measurement.internal.zzic r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzhh r11 = r11.zzd()
            com.google.android.gms.measurement.internal.zzhg r11 = r11.zzh
            java.lang.String r0 = "unset"
            r11.zzb(r0)
            goto L51
        L63:
            com.google.android.gms.measurement.internal.zzic r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzk()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.zzc(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.zzic r11 = r9.zzu
            boolean r12 = r11.zzB()
            if (r12 != 0) goto L8e
            com.google.android.gms.measurement.internal.zzic r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzgu r10 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgs r10 = r10.zzk()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.zza(r11)
            return
        L8e:
            boolean r11 = r11.zzH()
            if (r11 != 0) goto L95
            return
        L95:
            com.google.android.gms.measurement.internal.zzic r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzpl r3 = new com.google.android.gms.measurement.internal.zzpl
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.zznl r10 = r11.zzt()
            r10.zzA(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzN(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final List zzO(boolean z10) {
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zza("Getting user properties (FE)");
        if (zzicVar.zzaW().zze()) {
            a.r(zzicVar, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            a.r(zzicVar, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z10));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
        return Collections.EMPTY_LIST;
    }

    public final Map zzP(String str, String str2, boolean z10) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            a.r(zzicVar, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            a.r(zzicVar, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzicVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        f fVar = new f(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                fVar.put(zzplVar.zzb, objZza);
            }
        }
        return fVar;
    }

    public final String zzQ() {
        return (String) this.zzg.get();
    }

    public final void zzR(String str) {
        this.zzg.set(str);
    }

    public final void zzS() {
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzo.zza()) {
            zzicVar.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzicVar.zzd().zzp.zza();
        zzicVar.zzd().zzp.zzb(1 + jZza);
        zzicVar.zzc();
        if (jZza >= 5) {
            zzicVar.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzicVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new zzkg(this, this.zzu);
            }
            this.zzr.zzb(0L);
        }
    }

    public final void zzT(long j10) throws IllegalStateException {
        this.zzg.set(null);
        this.zzu.zzaW().zzj(new zzkh(this, j10));
    }

    public final void zzU() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaU();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzicVar.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzS();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzF(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    public final void zzV(zzjp zzjpVar) {
        zzjp zzjpVar2;
        zzg();
        zzb();
        if (zzjpVar != null && zzjpVar != (zzjpVar2 = this.zzd)) {
            Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjpVar;
    }

    public final void zzW(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.add(zzjqVar)) {
            return;
        }
        a.C(this.zzu, "OnEventListener already registered");
    }

    public final void zzX(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        a.C(this.zzu, "OnEventListener had not been registered");
    }

    public final int zzY(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzZ(Bundle bundle) throws IllegalStateException {
        zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzaa(Bundle bundle, long j10) throws IllegalStateException {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            a.C(this.zzu, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, "app_id", String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, "value", Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzp(string) != 0) {
            zzicVar.zzaV().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
            return;
        }
        if (zzicVar.zzk().zzK(string, obj) != 0) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        Object objZzL = zzicVar.zzk().zzL(string, obj);
        if (objZzL == null) {
            zzicVar.zzaV().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzjh.zza(bundle2, objZzL);
        long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzicVar.zzc();
            if (j11 > 15552000000L || j11 < 1) {
                zzicVar.zzaV().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzicVar.zzc();
        if (j12 > 15552000000L || j12 < 1) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j12));
        } else {
            zzicVar.zzaW().zzj(new zzki(this, bundle2));
        }
    }

    public final void zzab(String str, String str2, Bundle bundle) throws IllegalStateException {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaW().zzj(new zzkj(this, bundle2));
    }

    public final ArrayList zzac(String str, String str2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzas(list);
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzad() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zza;
        }
        return null;
    }

    public final String zzae() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zzb;
        }
        return null;
    }

    public final String zzaf() {
        try {
            return zzlt.zza(this.zzu.zzaY(), "google_app_id", this.zzu.zzq());
        } catch (IllegalStateException e10) {
            this.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void zzag(SharedPreferences sharedPreferences, String str) {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzp(null, zzfy.zzaZ)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
        }
    }

    public final /* synthetic */ void zzah(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            zzic zzicVar = this.zzu;
            bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzicVar.zzk().zzt(obj)) {
                        zzicVar.zzk().zzN(this.zzv, null, 27, null, null, 0);
                    }
                    zzicVar.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpp.zzZ(next)) {
                    zzicVar.zzaV().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzu("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzM(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                Iterator it2 = new TreeSet(bundle2.keySet()).iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    i10++;
                    if (i10 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzN(this.zzv, null, 26, null, null, 0);
                zzicVar.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        zzic zzicVar2 = this.zzu;
        zzicVar2.zzd().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzicVar2.zzc().zzp(null, zzfy.zzaW)) {
            this.zzu.zzt().zzH(bundle2);
        }
    }

    public final /* synthetic */ void zzai(int i10) {
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
        }
        this.zzk.zzb(i10 * 1000);
    }

    public final /* synthetic */ void zzaj(Boolean bool, boolean z10) throws IllegalStateException {
        zzas(bool, true);
    }

    public final /* synthetic */ void zzak(zzjl zzjlVar, long j10, boolean z10, boolean z11) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j10 <= this.zzq && zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzicVar.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        int iZzb = zzjlVar.zzb();
        if (!zzhhVarZzd.zzk(iZzb)) {
            zzicVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            return;
        }
        zzic zzicVar3 = this.zzu;
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("consent_settings", zzjlVar.zzl());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzicVar.zzaV().zzk().zzb("Setting storage consent(FE)", zzjlVar);
        this.zzq = j10;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzk(z10);
        } else {
            zzicVar3.zzt().zzj(z10);
        }
        if (z11) {
            zzicVar3.zzt().zzC(new AtomicReference());
        }
    }

    public final /* synthetic */ void zzam(boolean z10) {
        this.zzi = false;
    }

    public final /* synthetic */ int zzan() {
        return this.zzj;
    }

    public final /* synthetic */ void zzao(int i10) {
        this.zzj = i10;
    }

    public final /* synthetic */ zzay zzap() {
        return this.zzr;
    }

    public final /* synthetic */ int zzaq(Throwable th2) {
        String message = th2.getMessage();
        this.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.zzn = true;
        return 1;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = this.zzu;
        if (!(zzicVar.zzaY().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "boolean test flag value", new zzke(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "String test flag value", new zzko(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "long test flag value", new zzkp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "int test flag value", new zzkq(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "double test flag value", new zzkr(this, atomicReference));
    }

    public final void zzn(Boolean bool) throws IllegalStateException {
        zzb();
        this.zzu.zzaW().zzj(new zzks(this, bool));
    }

    public final void zzp(Bundle bundle, int i10, long j10) throws IllegalStateException {
        Object obj;
        String string;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
            zzicVar.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaW().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i10);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzaz zzazVarZzh = zzaz.zzh(bundle, i10);
        if (zzazVarZzh.zzd()) {
            zzq(zzazVarZzh, zZze);
        }
        Boolean boolZzi = zzaz.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i10 == -30 ? "tcf" : MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            if (zZze) {
                zzN(str2, "allow_personalized_ads", boolZzi.toString(), j10);
            } else {
                zzL(str2, "allow_personalized_ads", boolZzi.toString(), false, j10);
            }
        }
    }

    public final void zzq(zzaz zzazVar, boolean z10) {
        zzkt zzktVar = new zzkt(this, zzazVar);
        if (!z10) {
            this.zzu.zzaW().zzj(zzktVar);
        } else {
            zzg();
            zzktVar.run();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzs(com.google.android.gms.measurement.internal.zzjl r10, boolean r11) {
        /*
            r9 = this;
            r9.zzb()
            int r0 = r10.zzb()
            r1 = -10
            if (r0 == r1) goto L2a
            com.google.android.gms.measurement.internal.zzji r2 = r10.zzp()
            com.google.android.gms.measurement.internal.zzji r3 = com.google.android.gms.measurement.internal.zzji.UNINITIALIZED
            if (r2 != r3) goto L2a
            com.google.android.gms.measurement.internal.zzji r2 = r10.zzq()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.zzic r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzgu r10 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgs r10 = r10.zzh()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.zza(r11)
            return
        L2a:
            java.lang.Object r2 = r9.zzh
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzjl r3 = r9.zzo     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.measurement.internal.zzjl.zzu(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            com.google.android.gms.measurement.internal.zzjl r3 = r9.zzo     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.zzr(r3)     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzjk r5 = com.google.android.gms.measurement.internal.zzjk.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.zzo(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            com.google.android.gms.measurement.internal.zzjl r6 = r9.zzo     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.zzo(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            com.google.android.gms.measurement.internal.zzjl r5 = r9.zzo     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzjl r10 = r10.zzt(r5)     // Catch: java.lang.Throwable -> L53
            r9.zzo = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            com.google.android.gms.measurement.internal.zzic r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzgu r10 = r10.zzaV()
            com.google.android.gms.measurement.internal.zzgs r10 = r10.zzi()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.zzb(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.zzp
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.zzg
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.zzku r3 = new com.google.android.gms.measurement.internal.zzku
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.zzg()
            r3.run()
            return
        L97:
            com.google.android.gms.measurement.internal.zzic r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzhz r10 = r10.zzaW()
            r10.zzl(r3)
            return
        La1:
            r4 = r9
            com.google.android.gms.measurement.internal.zzkv r3 = new com.google.android.gms.measurement.internal.zzkv
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.zzg()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            com.google.android.gms.measurement.internal.zzic r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzhz r10 = r10.zzaW()
            r10.zzj(r3)
            return
        Lc1:
            com.google.android.gms.measurement.internal.zzic r10 = r4.zzu
            com.google.android.gms.measurement.internal.zzhz r10 = r10.zzaW()
            r10.zzl(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzs(com.google.android.gms.measurement.internal.zzjl, boolean):void");
    }

    public final void zzu(long j10) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzju(this, this.zzu);
        }
        this.zzl.zzb(j10);
    }

    public final void zzv() {
        zzg();
        zzay zzayVar = this.zzl;
        if (zzayVar != null) {
            zzayVar.zzd();
        }
    }

    public final void zzw() throws IllegalStateException {
        zzqp.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
            if (zzicVar.zzaW().zze()) {
                a.r(zzicVar, "Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaU();
            if (zzae.zza()) {
                a.r(zzicVar, "Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaV().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws IllegalStateException {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i10) || ((Long) sparseArrayZzf.get(i10)).longValue() < zzohVar.zzb) {
                                zzljVar.zzy().add(zzohVar);
                            }
                        }
                        zzljVar.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzx() {
        return this.zzn;
    }

    public final PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
        }
        return this.zzm;
    }

    public final void zzz() {
        zzoh zzohVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.zzi || (zzohVar = (zzoh) zzy().poll()) == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        h hVarZzT = zzicVar.zzk().zzT();
        if (hVarZzT != null) {
            this.zzi = true;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            String str = zzohVar.zza;
            zzgsVarZzk.zzb("Registering trigger URI", str);
            n1 n1VarRegisterTriggerAsync = hVarZzT.registerTriggerAsync(Uri.parse(str));
            if (n1VarRegisterTriggerAsync != null) {
                b1.addCallback(n1VarRegisterTriggerAsync, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.zzi = false;
                zzy().add(zzohVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    public final void zzH(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z13;
        boolean z14;
        zzic zzicVar;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaV().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaV().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar2.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaY().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, this.zzu.zzaY());
                } catch (Exception e10) {
                    this.zzu.zzaV().zze().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaV().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzic zzicVar3 = this.zzu;
        if (!zzicVar3.zzc().zzp(null, zzfy.zzbf) && SFPXhf.rnVlk.equals(str2) && bundle.containsKey("gclid")) {
            zzicVar3.zzaU();
            zzN(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), zzicVar3.zzaZ().currentTimeMillis());
        }
        zzlj zzljVar = this;
        zzicVar3.zzaU();
        if (z10 && zzpp.zzaf(str2)) {
            zzicVar3.zzk().zzI(bundle, zzicVar3.zzd().zzt.zza());
        }
        if (!z12) {
            zzicVar3.zzaU();
            if (!"_iap".equals(str2)) {
                zzic zzicVar4 = zzljVar.zzu;
                zzpp zzppVarZzk = zzicVar4.zzk();
                int i10 = 2;
                if (zzppVarZzk.zzj(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (zzppVarZzk.zzl(NotificationCompat.CATEGORY_EVENT, zzjm.zza, zzjm.zzb, str2)) {
                        zzppVarZzk.zzu.zzc();
                        if (zzppVarZzk.zzm(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    zzicVar3.zzaV().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzicVar3.zzl().zza(str2));
                    zzpp zzppVarZzk2 = zzicVar4.zzk();
                    zzicVar4.zzc();
                    zzicVar4.zzk().zzN(zzljVar.zzv, null, i10, "_ev", zzppVarZzk2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzicVar3.zzaU();
        zzic zzicVar5 = zzljVar.zzu;
        zzlu zzluVarZzh = zzicVar5.zzs().zzh(false);
        if (zzluVarZzh != null && !bundle.containsKey("_sc")) {
            zzluVarZzh.zzd = true;
        }
        zzpp.zzav(zzluVarZzh, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zZzZ = zzpp.zzZ(str2);
        if (!z10 || zzljVar.zzd == null || zZzZ) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                zzicVar3.zzaV().zzj().zzc("Passing event to registered event handler (FE)", zzicVar3.zzl().zza(str2), zzicVar3.zzl().zze(bundle));
                Preconditions.checkNotNull(zzljVar.zzd);
                zzljVar.zzd.interceptEvent(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        zzic zzicVar6 = zzljVar.zzu;
        if (zzicVar6.zzH()) {
            int iZzn = zzicVar3.zzk().zzn(str2);
            if (iZzn != 0) {
                zzicVar3.zzaV().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzicVar3.zzl().zza(str2));
                zzpp zzppVarZzk3 = zzicVar3.zzk();
                zzicVar3.zzc();
                zzicVar6.zzk().zzN(zzljVar.zzv, str3, iZzn, "_ev", zzppVarZzk3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzF = zzicVar3.zzk().zzF(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
            Preconditions.checkNotNull(bundleZzF);
            zzicVar3.zzaU();
            if (zzicVar5.zzs().zzh(false) == null || !"_ae".equals(str2)) {
                z14 = 0;
                zzicVar = zzicVar5;
                j11 = 0;
            } else {
                zzoa zzoaVar = zzicVar5.zzh().zzb;
                j11 = 0;
                long jElapsedRealtime = zzoaVar.zzc.zzu.zzaZ().elapsedRealtime();
                boolean z15 = false;
                zzicVar = zzicVar5;
                long j14 = jElapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = jElapsedRealtime;
                z14 = z15;
                if (j14 > 0) {
                    zzicVar3.zzk().zzak(bundleZzF, j14);
                    z14 = z15;
                }
            }
            if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str5) && "_ssr".equals(str2)) {
                zzpp zzppVarZzk4 = zzicVar3.zzk();
                String string = bundleZzF.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzic zzicVar7 = zzppVarZzk4.zzu;
                if (Objects.equals(string, zzicVar7.zzd().zzq.zza())) {
                    zzicVar7.zzaV().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzicVar7.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzicVar3.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzF.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzF);
            boolean zZzi = zzicVar3.zzc().zzp(null, zzfy.zzaU) ? zzicVar.zzh().zzi() : zzicVar3.zzd().zzn.zza();
            if (zzicVar3.zzd().zzk.zza() > j11 && zzicVar3.zzd().zzp(j10) && zZzi) {
                zzicVar3.zzaV().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                zzN(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", null, zzicVar3.zzaZ().currentTimeMillis());
                zzN(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, zzicVar3.zzaZ().currentTimeMillis());
                zzN(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, zzicVar3.zzaZ().currentTimeMillis());
                zzljVar = this;
                zzicVar3.zzd().zzl.zzb(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleZzF.getLong("extend_session", j12) == 1) {
                zzicVar3.zzaV().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                zzicVar6.zzh().zza.zzb(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleZzF.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = z14; i11 < size; i11++) {
                String str6 = (String) arrayList2.get(i11);
                if (str6 != null) {
                    zzicVar3.zzk();
                    Object obj = bundleZzF.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[z14] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzF.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i12 = z14;
            while (i12 < arrayList.size()) {
                Bundle bundleZzab = (Bundle) arrayList.get(i12);
                String str7 = i12 != 0 ? "_ep" : str2;
                bundleZzab.putString("_o", str5);
                if (z11) {
                    bundleZzab = zzicVar3.zzk().zzab(bundleZzab, null);
                }
                Bundle bundle2 = bundleZzab;
                zzicVar.zzt().zzn(new zzbg(str7, new zzbe(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = zzljVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i12++;
                str5 = str;
                j13 = j10;
            }
            zzicVar3.zzaU();
            if (zzicVar.zzs().zzh(z14) == null || !str4.equals(str2)) {
                return;
            }
            zzicVar.zzh().zzb.zzd(true, true, zzicVar3.zzaZ().elapsedRealtime());
        }
    }

    public final void zzt(Runnable runnable) throws IllegalStateException, MalformedURLException {
        zzb();
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzaW().zze()) {
            if (!zzicVar.zzaW().zzf()) {
                zzicVar.zzaU();
                if (!zzae.zza()) {
                    zzicVar.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
                    boolean z10 = false;
                    int size = 0;
                    int i10 = 0;
                    while (!z10) {
                        zzicVar.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
                        final AtomicReference atomicReference = new AtomicReference();
                        zzicVar.zzaW().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws IllegalStateException {
                                this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                            }
                        });
                        zzoq zzoqVar = (zzoq) atomicReference.get();
                        if (zzoqVar == null) {
                            break;
                        }
                        List list = zzoqVar.zza;
                        if (!list.isEmpty()) {
                            zzicVar.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                            size += list.size();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    zzlr zzlrVarZzar = zzar((zzom) it.next());
                                    if (zzlrVarZzar == zzlr.SUCCESS) {
                                        i10++;
                                    } else if (zzlrVarZzar == zzlr.BACKOFF) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    zzicVar.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
                    runnable.run();
                    return;
                }
                a.r(zzicVar, rJqlArycrfkilN.dpBaxLXdpupLLA);
                return;
            }
            a.r(zzicVar, "Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        a.r(zzicVar, "Cannot retrieve and upload batches from analytics worker thread");
    }
}
