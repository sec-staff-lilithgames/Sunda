package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzmb extends zzg {
    protected zzlu zza;
    private volatile zzlu zzb;
    private volatile zzlu zzc;
    private final Map zzd;
    private com.google.android.gms.internal.measurement.zzdf zze;
    private volatile boolean zzf;
    private volatile zzlu zzg;
    private zzlu zzh;
    private boolean zzi;
    private final Object zzj;

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(zzlu zzluVar, boolean z10, long j10) {
        zzic zzicVar = this.zzu;
        zzicVar.zzw().zzc(zzicVar.zzaZ().elapsedRealtime());
        if (!zzicVar.zzh().zzb.zzd(zzluVar != null && zzluVar.zzd, z10, j10) || zzluVar == null) {
            return;
        }
        zzluVar.zzd = false;
    }

    private final zzlu zzB(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Preconditions.checkNotNull(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.zzd;
        zzlu zzluVar = (zzlu) map.get(numValueOf);
        if (zzluVar == null) {
            zzlu zzluVar2 = new zzlu(null, zzi(zzdfVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(numValueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        return this.zzg != null ? this.zzg : zzluVar;
    }

    private final void zzy(String str, zzlu zzluVar, boolean z10) throws IllegalStateException {
        zzlu zzluVar2;
        zzlu zzluVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzluVar.zzb == null) {
            zzluVar2 = new zzlu(zzluVar.zza, str != null ? zzi(str, "Activity") : null, zzluVar.zzc, zzluVar.zze, zzluVar.zzf);
        } else {
            zzluVar2 = zzluVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzluVar2;
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj(new zzlw(this, zzluVar2, zzluVar3, zzicVar.zzaZ().elapsedRealtime(), z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzz(com.google.android.gms.measurement.internal.zzlu r15, com.google.android.gms.measurement.internal.zzlu r16, long r17, boolean r19, android.os.Bundle r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r20
            r14.zzg()
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2a
            long r7 = r0.zzc
            long r9 = r1.zzc
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L2a
            java.lang.String r7 = r1.zzb
            java.lang.String r8 = r0.zzb
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.lang.String r7 = r1.zza
            java.lang.String r8 = r0.zza
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 != 0) goto L2c
        L2a:
            r7 = r6
            goto L2d
        L2c:
            r7 = r5
        L2d:
            if (r19 == 0) goto L34
            com.google.android.gms.measurement.internal.zzlu r8 = r14.zza
            if (r8 == 0) goto L34
            r5 = r6
        L34:
            if (r7 == 0) goto Lbf
            if (r4 == 0) goto L3f
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r4)
        L3d:
            r13 = r7
            goto L45
        L3f:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            goto L3d
        L45:
            com.google.android.gms.measurement.internal.zzpp.zzav(r15, r13, r6)
            if (r1 == 0) goto L63
            java.lang.String r4 = r1.zza
            if (r4 == 0) goto L53
            java.lang.String r7 = "_pn"
            r13.putString(r7, r4)
        L53:
            java.lang.String r4 = r1.zzb
            if (r4 == 0) goto L5c
            java.lang.String r7 = "_pc"
            r13.putString(r7, r4)
        L5c:
            long r7 = r1.zzc
            java.lang.String r1 = "_pi"
            r13.putLong(r1, r7)
        L63:
            r7 = 0
            if (r5 == 0) goto L82
            com.google.android.gms.measurement.internal.zzic r1 = r14.zzu
            com.google.android.gms.measurement.internal.zzoc r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzoa r1 = r1.zzb
            long r9 = r1.zzb
            long r9 = r2 - r9
            r1.zzb = r2
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L82
            com.google.android.gms.measurement.internal.zzic r1 = r14.zzu
            com.google.android.gms.measurement.internal.zzpp r1 = r1.zzk()
            r1.zzak(r13, r9)
        L82:
            com.google.android.gms.measurement.internal.zzic r1 = r14.zzu
            com.google.android.gms.measurement.internal.zzal r4 = r1.zzc()
            boolean r4 = r4.zzv()
            if (r4 != 0) goto L95
            java.lang.String r4 = "_mst"
            r9 = 1
            r13.putLong(r4, r9)
        L95:
            boolean r4 = r0.zze
            if (r6 == r4) goto L9c
            java.lang.String r9 = "auto"
            goto L9e
        L9c:
            java.lang.String r9 = "app"
        L9e:
            com.google.android.gms.common.util.Clock r1 = r1.zzaZ()
            long r10 = r1.currentTimeMillis()
            if (r4 == 0) goto Lb3
            r19 = r7
            long r7 = r0.zzf
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 != 0) goto Lb1
            goto Lb3
        Lb1:
            r11 = r7
            goto Lb4
        Lb3:
            r11 = r10
        Lb4:
            com.google.android.gms.measurement.internal.zzic r1 = r14.zzu
            java.lang.String r10 = "_vs"
            com.google.android.gms.measurement.internal.zzlj r8 = r1.zzj()
            r8.zzG(r9, r10, r11, r13)
        Lbf:
            if (r5 == 0) goto Lc6
            com.google.android.gms.measurement.internal.zzlu r1 = r14.zza
            r14.zzA(r1, r6, r2)
        Lc6:
            r14.zza = r0
            boolean r1 = r0.zze
            if (r1 == 0) goto Lce
            r14.zzh = r0
        Lce:
            com.google.android.gms.measurement.internal.zzic r1 = r14.zzu
            com.google.android.gms.measurement.internal.zznl r1 = r1.zzt()
            r1.zzG(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmb.zzz(com.google.android.gms.measurement.internal.zzlu, com.google.android.gms.measurement.internal.zzlu, long, boolean, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final zzlu zzh(boolean z10) {
        zzb();
        zzg();
        if (!z10) {
            return this.zza;
        }
        zzlu zzluVar = this.zza;
        return zzluVar != null ? zzluVar : this.zzh;
    }

    public final String zzi(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        zzic zzicVar = this.zzu;
        return str3.length() > zzicVar.zzc().zze(null, false) ? str3.substring(0, zzicVar.zzc().zze(null, false)) : str3;
    }

    public final void zzj(Bundle bundle, long j10) {
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdf zzdfVar = this.zze;
                    string2 = zzdfVar != null ? zzi(zzdfVar.zzb, "Activity") : "Activity";
                }
                zzlu zzluVar = this.zzb;
                if (this.zzf && zzluVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzluVar.zzb, string2);
                    boolean zEquals2 = Objects.equals(zzluVar.zza, string);
                    if (zEquals && zEquals2) {
                        this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzic zzicVar = this.zzu;
                zzicVar.zzaV().zzk().zzc("Logging screen view with name, class", string == null ? AbstractJsonLexerKt.NULL : string, string2 == null ? AbstractJsonLexerKt.NULL : string2);
                zzlu zzluVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlu zzluVar3 = new zzlu(string, string2, zzicVar.zzk().zzd(), true, j10);
                this.zzb = zzluVar3;
                this.zzc = zzluVar2;
                this.zzg = zzluVar3;
                zzicVar.zzaW().zzj(new zzlv(this, bundle, zzluVar3, zzluVar2, zzicVar.zzaZ().elapsedRealtime()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void zzk(com.google.android.gms.internal.measurement.zzdf zzdfVar, String str, String str2) throws IllegalStateException {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzv()) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlu zzluVar = this.zzb;
        if (zzluVar == null) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.zzd;
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(numValueOf) == null) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzdfVar.zzb, "Activity");
        }
        String str3 = zzluVar.zzb;
        String str4 = zzluVar.zza;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzicVar.zzc().zze(null, false))) {
            zzicVar.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzicVar.zzc().zze(null, false))) {
            zzicVar.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzicVar.zzaV().zzk().zzc("Setting current screen to name, class", str == null ? AbstractJsonLexerKt.NULL : str, str2);
        zzlu zzluVar2 = new zzlu(str, str2, zzicVar.zzk().zzd());
        map.put(numValueOf, zzluVar2);
        zzy(zzdfVar.zzb, zzluVar2, true);
    }

    public final zzlu zzl() {
        return this.zzb;
    }

    public final void zzm(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzu.zzc().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(zzdfVar.zza), new zzlu(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzn(com.google.android.gms.internal.measurement.zzdf zzdfVar) throws IllegalStateException {
        Object obj = this.zzj;
        synchronized (obj) {
            this.zzi = true;
            if (!Objects.equals(zzdfVar, this.zze)) {
                synchronized (obj) {
                    this.zze = zzdfVar;
                    this.zzf = false;
                    zzic zzicVar = this.zzu;
                    if (zzicVar.zzc().zzv()) {
                        this.zzg = null;
                        zzicVar.zzaW().zzj(new zzma(this));
                    }
                }
            }
        }
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzicVar2.zzaW().zzj(new zzlx(this));
            return;
        }
        zzy(zzdfVar.zzb, zzB(zzdfVar), false);
        zzd zzdVarZzw = this.zzu.zzw();
        zzic zzicVar3 = zzdVarZzw.zzu;
        zzicVar3.zzaW().zzj(new zzc(zzdVarZzw, zzicVar3.zzaZ().elapsedRealtime()));
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar) throws IllegalStateException {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        zzic zzicVar = this.zzu;
        long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
        if (!zzicVar.zzc().zzv()) {
            this.zzb = null;
            zzicVar.zzaW().zzj(new zzly(this, jElapsedRealtime));
        } else {
            zzlu zzluVarZzB = zzB(zzdfVar);
            this.zzc = this.zzb;
            this.zzb = null;
            zzicVar.zzaW().zzj(new zzlz(this, zzluVarZzB, jElapsedRealtime));
        }
    }

    public final void zzq(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        zzlu zzluVar;
        if (!this.zzu.zzc().zzv() || bundle == null || (zzluVar = (zzlu) this.zzd.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzluVar.zzc);
        bundle2.putString("name", zzluVar.zza);
        bundle2.putString("referrer_name", zzluVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            try {
                if (Objects.equals(this.zze, zzdfVar)) {
                    this.zze = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(Integer.valueOf(zzdfVar.zza));
        }
    }

    public final /* synthetic */ void zzt(Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzz(zzluVar, zzluVar2, j10, true, this.zzu.zzk().zzF(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void zzu(zzlu zzluVar, zzlu zzluVar2, long j10, boolean z10, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzz(zzluVar, zzluVar2, j10, z10, null);
    }

    public final /* synthetic */ void zzv(zzlu zzluVar, boolean z10, long j10) {
        zzA(zzluVar, false, j10);
    }

    public final /* synthetic */ zzlu zzw() {
        return this.zzh;
    }

    public final /* synthetic */ void zzx(zzlu zzluVar) {
        this.zzh = null;
    }
}
