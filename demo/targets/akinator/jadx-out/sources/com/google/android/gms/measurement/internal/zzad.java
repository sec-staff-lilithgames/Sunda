package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i10, int i11) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i10));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0969, code lost:
    
        r0 = r13.zzaV().zze();
        r2 = com.google.android.gms.measurement.internal.zzgu.zzl(r34.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x097b, code lost:
    
        if (r12.zza() == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x097d, code lost:
    
        r3 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0986, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0987, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0854 A[PHI: r0 r13 r36
      0x0854: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:452:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:452:0x019c }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(java.lang.String r35, java.util.List r36, java.util.List r37, java.lang.Long r38, java.lang.Long r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzad.zzb(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }
}
