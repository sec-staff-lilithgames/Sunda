package com.google.android.gms.internal.ads;

import k4.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfwo implements zzfvh {
    private final CoroutineScope zza;
    private final Mutex zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private boolean zze;
    private zzfvf zzf;
    private boolean zzg;
    private final n zzh;
    private final zzdss zzi;

    public zzfwo(n adQualityDataStore, zzfwq coroutineScopeProvider, zzdss dataPinger, zzfvq clock) {
        e0.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        e0.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        e0.checkNotNullParameter(dataPinger, "dataPinger");
        e0.checkNotNullParameter(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = MutexKt.Mutex$default(false, 1, null);
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(java.lang.String r8, zu.d r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfvt
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfvt r0 = (com.google.android.gms.internal.ads.zzfvt) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfvt r0 = new com.google.android.gms.internal.ads.zzfvt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r9 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.zzb
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            tu.a0.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L49:
            tu.a0.throwOnFailure(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.zzd
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 == r1) goto L80
        L5a:
            k4.n r2 = r7.zzh     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfvu r4 = new com.google.android.gms.internal.ads.zzfvu     // Catch: java.lang.Throwable -> L78
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L78
            r0.zza = r9     // Catch: java.lang.Throwable -> L78
            r0.zzb = r5     // Catch: java.lang.Throwable -> L78
            r0.zze = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 == r1) goto L80
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            com.google.android.gms.internal.ads.zzfvk r9 = (com.google.android.gms.internal.ads.zzfvk) r9     // Catch: java.lang.Throwable -> L31
            r8.unlock(r5)
            tu.x0 r8 = tu.x0.f87415a
            return r8
        L78:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7c:
            r8.unlock(r5)
            throw r9
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzs(java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzt(zu.d r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfvw
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfvw r0 = (com.google.android.gms.internal.ads.zzfvw) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfvw r0 = new com.google.android.gms.internal.ads.zzfvw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L31
            goto L67
        L31:
            r8 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            tu.a0.throwOnFailure(r8)
            r8 = r2
            goto L53
        L44:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.zzd
            r0.zza = r8
            r0.zzd = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 == r1) goto L77
        L53:
            k4.n r2 = r7.zzh     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfvx r4 = new com.google.android.gms.internal.ads.zzfvx     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r0.zza = r8     // Catch: java.lang.Throwable -> L6f
            r0.zzd = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == r1) goto L77
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.zzfvk r8 = (com.google.android.gms.internal.ads.zzfvk) r8     // Catch: java.lang.Throwable -> L31
            r0.unlock(r5)
            tu.x0 r8 = tu.x0.f87415a
            return r8
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            r0.unlock(r5)
            throw r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzt(zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(long r6, zu.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfvv
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfvv r0 = (com.google.android.gms.internal.ads.zzfvv) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfvv r0 = new com.google.android.gms.internal.ads.zzfvv
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            tu.a0.throwOnFailure(r8)
            goto L4a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r5.zzb
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 == r1) goto L7e
            r0 = r8
        L4a:
            com.google.android.gms.internal.ads.zzfvf r8 = r5.zzf     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "adQualityDataBuilder"
            if (r8 != 0) goto L57
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L55
            r8 = r4
            goto L57
        L55:
            r6 = move-exception
            goto L7a
        L57:
            com.google.android.gms.internal.ads.zzfvf r2 = r5.zzf     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L5f
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r4
        L5f:
            long r2 = r2.zzi()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 - r2
            com.google.android.gms.internal.ads.zzfvf r2 = r5.zzf     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L6c
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r4
        L6c:
            long r1 = r2.zzg()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 - r1
            r8.zzb(r6)     // Catch: java.lang.Throwable -> L55
            r0.unlock(r4)
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L7a:
            r0.unlock(r4)
            throw r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzu(long, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(zu.d r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfwa
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfwa r0 = (com.google.android.gms.internal.ads.zzfwa) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfwa r0 = new com.google.android.gms.internal.ads.zzfwa
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L9f
        L35:
            r8 = move-exception
            goto La9
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L40:
            java.lang.Object r2 = r0.zzb
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.zza
            com.google.android.gms.internal.ads.zzfvg r4 = (com.google.android.gms.internal.ads.zzfvg) r4
            tu.a0.throwOnFailure(r8)
            goto L8b
        L4c:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            tu.a0.throwOnFailure(r8)
            goto L63
        L54:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r2 = r7.zzb
            r0.zza = r2
            r0.zze = r5
            java.lang.Object r8 = r2.lock(r6, r0)
            if (r8 == r1) goto Lb1
        L63:
            com.google.android.gms.internal.ads.zzfvf r8 = r7.zzf     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L70
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r8)     // Catch: java.lang.Throwable -> L6e
            r8 = r6
            goto L70
        L6e:
            r8 = move-exception
            goto Lad
        L70:
            com.google.android.gms.internal.ads.zzhwo r8 = r8.zzbu()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfvg r8 = (com.google.android.gms.internal.ads.zzfvg) r8     // Catch: java.lang.Throwable -> L6e
            r2.unlock(r6)
            kotlin.jvm.internal.e0.checkNotNull(r8)
            kotlinx.coroutines.sync.Mutex r2 = r7.zzd
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r4
            java.lang.Object r4 = r2.lock(r6, r0)
            if (r4 == r1) goto Lb1
            r4 = r8
        L8b:
            k4.n r8 = r7.zzh     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.zzfwb r5 = new com.google.android.gms.internal.ads.zzfwb     // Catch: java.lang.Throwable -> La7
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> La7
            r0.zza = r2     // Catch: java.lang.Throwable -> La7
            r0.zzb = r6     // Catch: java.lang.Throwable -> La7
            r0.zze = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r8 = r8.updateData(r5, r0)     // Catch: java.lang.Throwable -> La7
            if (r8 == r1) goto Lb1
            r0 = r2
        L9f:
            com.google.android.gms.internal.ads.zzfvk r8 = (com.google.android.gms.internal.ads.zzfvk) r8     // Catch: java.lang.Throwable -> L35
            r0.unlock(r6)
            tu.x0 r8 = tu.x0.f87415a
            return r8
        La7:
            r8 = move-exception
            r0 = r2
        La9:
            r0.unlock(r6)
            throw r8
        Lad:
            r2.unlock(r6)
            throw r8
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzv(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean zzw(com.google.android.gms.internal.ads.zzfvg r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = uu.y0.lastOrNull(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzw(com.google.android.gms.internal.ads.zzfvg):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfwj(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zzb(String gwsQueryId) {
        e0.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfwd(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zzc() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfvz(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zzd() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfwn(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zze() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfwh(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zzf() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfwl(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zzg() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfwf(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzfwo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(zu.d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.zzfwi
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.zzfwi r0 = (com.google.android.gms.internal.ads.zzfwi) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfwi r0 = new com.google.android.gms.internal.ads.zzfwi
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.zzb
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zzd
            tu.x0 r3 = tu.x0.f87415a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            tu.a0.throwOnFailure(r10)
            goto Ld5
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L43
            goto L6e
        L43:
            r10 = move-exception
            goto Ld6
        L46:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            tu.a0.throwOnFailure(r10)
            goto L5e
        L4e:
            tu.a0.throwOnFailure(r10)
            kotlinx.coroutines.sync.Mutex r10 = r9.zzd
            r0.zza = r10
            r0.zzd = r6
            java.lang.Object r2 = r10.lock(r7, r0)
            if (r2 == r1) goto Lda
            r2 = r10
        L5e:
            k4.n r10 = r9.zzh     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.flow.Flow r10 = r10.getData()     // Catch: java.lang.Throwable -> L43
            r0.zza = r2     // Catch: java.lang.Throwable -> L43
            r0.zzd = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r10, r0)     // Catch: java.lang.Throwable -> L43
            if (r10 == r1) goto Lda
        L6e:
            com.google.android.gms.internal.ads.zzfvk r10 = (com.google.android.gms.internal.ads.zzfvk) r10     // Catch: java.lang.Throwable -> L43
            r2.unlock(r7)
            if (r10 == 0) goto Ld5
            int r2 = r10.zza()
            if (r2 != 0) goto L7c
            goto Ld5
        L7c:
            java.util.Map r10 = r10.zzb()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L88:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getValue()
            com.google.android.gms.internal.ads.zzfvg r5 = (com.google.android.gms.internal.ads.zzfvg) r5
            com.google.android.gms.internal.ads.zzhwi r5 = r5.zzcc()
            java.lang.String r8 = "toBuilder(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r8)
            com.google.android.gms.internal.ads.zzfvf r5 = (com.google.android.gms.internal.ads.zzfvf) r5
            java.lang.Object r2 = r2.getValue()
            java.lang.String r8 = "<get-value>(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r8)
            com.google.android.gms.internal.ads.zzfvg r2 = (com.google.android.gms.internal.ads.zzfvg) r2
            boolean r2 = zzw(r2)
            if (r2 == 0) goto Lb9
            r5.zzf(r6)
        Lb9:
            com.google.android.gms.internal.ads.zzdss r2 = r9.zzi
            com.google.android.gms.internal.ads.zzhwo r5 = r5.zzbu()
            java.lang.String r8 = "build(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r8)
            com.google.android.gms.internal.ads.zzfvg r5 = (com.google.android.gms.internal.ads.zzfvg) r5
            r2.zza(r5)
            goto L88
        Lca:
            r0.zza = r7
            r0.zzd = r4
            java.lang.Object r10 = r9.zzt(r0)
            if (r10 != r1) goto Ld5
            goto Lda
        Ld5:
            return r3
        Ld6:
            r2.unlock(r7)
            throw r10
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzh(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(java.lang.String r8, zu.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfwc
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfwc r0 = (com.google.android.gms.internal.ads.zzfwc) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfwc r0 = new com.google.android.gms.internal.ads.zzfwc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.zzb
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.String r0 = r0.zzf
            tu.a0.throwOnFailure(r9)
            goto L54
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            tu.a0.throwOnFailure(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.zzb
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzf = r8
            r0.zza = r9
            r0.zzb = r5
            r0.zze = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 == r1) goto L8a
            r0 = r8
            r8 = r9
            r1 = r5
        L54:
            boolean r9 = r7.zze     // Catch: java.lang.Throwable -> L7a
            tu.x0 r5 = tu.x0.f87415a
            if (r9 == 0) goto L5e
            r8.unlock(r4)
            return r5
        L5e:
            r7.zze = r3     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzfvg r9 = com.google.android.gms.internal.ads.zzfvg.zzp()     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzhwi r9 = r9.zzcc()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "toBuilder(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r9, r3)     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzfvf r9 = (com.google.android.gms.internal.ads.zzfvf) r9     // Catch: java.lang.Throwable -> L7a
            r7.zzf = r9     // Catch: java.lang.Throwable -> L7a
            if (r9 != 0) goto L7c
            java.lang.String r9 = "adQualityDataBuilder"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r9)     // Catch: java.lang.Throwable -> L7a
            r9 = r4
            goto L7c
        L7a:
            r9 = move-exception
            goto L86
        L7c:
            r9.zza(r0)     // Catch: java.lang.Throwable -> L7a
            r9.zzj(r1)     // Catch: java.lang.Throwable -> L7a
            r8.unlock(r4)
            return r5
        L86:
            r8.unlock(r4)
            throw r9
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzi(java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:30:0x0083, B:32:0x0087, B:35:0x0090), top: B:50:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(zu.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.zzfvy
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.gms.internal.ads.zzfvy r0 = (com.google.android.gms.internal.ads.zzfvy) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfvy r0 = new com.google.android.gms.internal.ads.zzfvy
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.zzc
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            tu.x0 r3 = tu.x0.f87415a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L54
            if (r2 == r7) goto L4c
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            tu.a0.throwOnFailure(r12)
            goto La9
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3e:
            tu.a0.throwOnFailure(r12)
            goto La0
        L42:
            long r6 = r0.zzb
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            tu.a0.throwOnFailure(r12)
            goto L83
        L4c:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            tu.a0.throwOnFailure(r12)
            goto L63
        L54:
            tu.a0.throwOnFailure(r12)
            kotlinx.coroutines.sync.Mutex r2 = r11.zzc
            r0.zza = r2
            r0.zze = r7
            java.lang.Object r12 = r2.lock(r8, r0)
            if (r12 == r1) goto Lb3
        L63:
            boolean r12 = r11.zzg     // Catch: java.lang.Throwable -> Lae
            if (r12 == 0) goto L6b
            r2.unlock(r8)
            return r3
        L6b:
            r11.zzg = r7     // Catch: java.lang.Throwable -> Lae
            r2.unlock(r8)
            kotlinx.coroutines.sync.Mutex r2 = r11.zzb
            long r9 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r9
            r0.zze = r6
            java.lang.Object r12 = r2.lock(r8, r0)
            if (r12 == r1) goto Lb3
            r6 = r9
        L83:
            com.google.android.gms.internal.ads.zzfvf r12 = r11.zzf     // Catch: java.lang.Throwable -> L8e
            if (r12 != 0) goto L90
            java.lang.String r12 = "adQualityDataBuilder"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r12)     // Catch: java.lang.Throwable -> L8e
            r12 = r8
            goto L90
        L8e:
            r12 = move-exception
            goto Laa
        L90:
            r12.zzo(r6)     // Catch: java.lang.Throwable -> L8e
            r2.unlock(r8)
            r0.zza = r8
            r0.zze = r5
            java.lang.Object r12 = r11.zzu(r6, r0)
            if (r12 == r1) goto Lb3
        La0:
            r0.zze = r4
            java.lang.Object r12 = r11.zzv(r0)
            if (r12 != r1) goto La9
            goto Lb3
        La9:
            return r3
        Laa:
            r2.unlock(r8)
            throw r12
        Lae:
            r12 = move-exception
            r2.unlock(r8)
            throw r12
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzj(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:27:0x0076, B:30:0x007c, B:33:0x0084, B:36:0x008c, B:38:0x0090, B:39:0x0094, B:41:0x00b0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c1, B:47:0x00c5, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00df, B:56:0x00e3, B:58:0x00ff, B:59:0x0103, B:60:0x010b, B:62:0x010f, B:63:0x0113), top: B:72:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:27:0x0076, B:30:0x007c, B:33:0x0084, B:36:0x008c, B:38:0x0090, B:39:0x0094, B:41:0x00b0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c1, B:47:0x00c5, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00df, B:56:0x00e3, B:58:0x00ff, B:59:0x0103, B:60:0x010b, B:62:0x010f, B:63:0x0113), top: B:72:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:27:0x0076, B:30:0x007c, B:33:0x0084, B:36:0x008c, B:38:0x0090, B:39:0x0094, B:41:0x00b0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c1, B:47:0x00c5, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00df, B:56:0x00e3, B:58:0x00ff, B:59:0x0103, B:60:0x010b, B:62:0x010f, B:63:0x0113), top: B:72:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:27:0x0076, B:30:0x007c, B:33:0x0084, B:36:0x008c, B:38:0x0090, B:39:0x0094, B:41:0x00b0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c1, B:47:0x00c5, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00df, B:56:0x00e3, B:58:0x00ff, B:59:0x0103, B:60:0x010b, B:62:0x010f, B:63:0x0113), top: B:72:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:27:0x0076, B:30:0x007c, B:33:0x0084, B:36:0x008c, B:38:0x0090, B:39:0x0094, B:41:0x00b0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c1, B:47:0x00c5, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00df, B:56:0x00e3, B:58:0x00ff, B:59:0x0103, B:60:0x010b, B:62:0x010f, B:63:0x0113), top: B:72:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzk(zu.d r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzk(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #0 {all -> 0x0094, blocks: (B:31:0x0089, B:34:0x008f, B:37:0x0096, B:39:0x009a, B:40:0x009e, B:42:0x00a8, B:43:0x00ac, B:45:0x00b8, B:46:0x00bc, B:48:0x00c3, B:49:0x00c7), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:31:0x0089, B:34:0x008f, B:37:0x0096, B:39:0x009a, B:40:0x009e, B:42:0x00a8, B:43:0x00ac, B:45:0x00b8, B:46:0x00bc, B:48:0x00c3, B:49:0x00c7), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:31:0x0089, B:34:0x008f, B:37:0x0096, B:39:0x009a, B:40:0x009e, B:42:0x00a8, B:43:0x00ac, B:45:0x00b8, B:46:0x00bc, B:48:0x00c3, B:49:0x00c7), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:31:0x0089, B:34:0x008f, B:37:0x0096, B:39:0x009a, B:40:0x009e, B:42:0x00a8, B:43:0x00ac, B:45:0x00b8, B:46:0x00bc, B:48:0x00c3, B:49:0x00c7), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:31:0x0089, B:34:0x008f, B:37:0x0096, B:39:0x009a, B:40:0x009e, B:42:0x00a8, B:43:0x00ac, B:45:0x00b8, B:46:0x00bc, B:48:0x00c3, B:49:0x00c7), top: B:65:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(zu.d r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzl(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #0 {all -> 0x0097, blocks: (B:30:0x008c, B:33:0x0092, B:36:0x009a, B:38:0x009e, B:39:0x00a2, B:41:0x00ac, B:42:0x00b0, B:44:0x00bc, B:45:0x00c0, B:47:0x00c7, B:48:0x00cb, B:50:0x00d2, B:51:0x00d6), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:30:0x008c, B:33:0x0092, B:36:0x009a, B:38:0x009e, B:39:0x00a2, B:41:0x00ac, B:42:0x00b0, B:44:0x00bc, B:45:0x00c0, B:47:0x00c7, B:48:0x00cb, B:50:0x00d2, B:51:0x00d6), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:30:0x008c, B:33:0x0092, B:36:0x009a, B:38:0x009e, B:39:0x00a2, B:41:0x00ac, B:42:0x00b0, B:44:0x00bc, B:45:0x00c0, B:47:0x00c7, B:48:0x00cb, B:50:0x00d2, B:51:0x00d6), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:30:0x008c, B:33:0x0092, B:36:0x009a, B:38:0x009e, B:39:0x00a2, B:41:0x00ac, B:42:0x00b0, B:44:0x00bc, B:45:0x00c0, B:47:0x00c7, B:48:0x00cb, B:50:0x00d2, B:51:0x00d6), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:30:0x008c, B:33:0x0092, B:36:0x009a, B:38:0x009e, B:39:0x00a2, B:41:0x00ac, B:42:0x00b0, B:44:0x00bc, B:45:0x00c0, B:47:0x00c7, B:48:0x00cb, B:50:0x00d2, B:51:0x00d6), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:30:0x008c, B:33:0x0092, B:36:0x009a, B:38:0x009e, B:39:0x00a2, B:41:0x00ac, B:42:0x00b0, B:44:0x00bc, B:45:0x00c0, B:47:0x00c7, B:48:0x00cb, B:50:0x00d2, B:51:0x00d6), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(zu.d r18) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzm(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(zu.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfwe
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfwe r0 = (com.google.android.gms.internal.ads.zzfwe) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfwe r0 = new com.google.android.gms.internal.ads.zzfwe
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            tu.a0.throwOnFailure(r8)
            goto L4f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.zzb
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzb = r8
            r0.zza = r5
            r0.zze = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 == r1) goto L69
            r0 = r8
            r1 = r5
        L4f:
            com.google.android.gms.internal.ads.zzfvf r8 = r7.zzf     // Catch: java.lang.Throwable -> L5a
            if (r8 != 0) goto L5c
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r8)     // Catch: java.lang.Throwable -> L5a
            r8 = r4
            goto L5c
        L5a:
            r8 = move-exception
            goto L65
        L5c:
            r8.zzs(r1)     // Catch: java.lang.Throwable -> L5a
            r0.unlock(r4)
            tu.x0 r8 = tu.x0.f87415a
            return r8
        L65:
            r0.unlock(r4)
            throw r8
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwo.zzn(zu.d):java.lang.Object");
    }
}
