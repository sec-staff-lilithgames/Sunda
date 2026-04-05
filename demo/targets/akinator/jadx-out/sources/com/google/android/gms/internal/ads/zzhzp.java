package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhzp {
    public static final zzhzp zza;
    public static final zzhzp zzb;
    public static final zzhzp zzc;
    public static final zzhzp zzd;
    public static final zzhzp zze;
    public static final zzhzp zzf;
    public static final zzhzp zzg;
    public static final zzhzp zzh;
    public static final zzhzp zzi;
    public static final zzhzp zzj;
    public static final zzhzp zzk;
    public static final zzhzp zzl;
    public static final zzhzp zzm;
    public static final zzhzp zzn;
    public static final zzhzp zzo;
    public static final zzhzp zzp;
    public static final zzhzp zzq;
    public static final zzhzp zzr;
    private static final /* synthetic */ zzhzp[] zzu;
    private final zzhzq zzs;
    private final int zzt;

    static {
        zzhzp zzhzpVar = new zzhzp("DOUBLE", 0, zzhzq.DOUBLE, 1);
        zza = zzhzpVar;
        zzhzp zzhzpVar2 = new zzhzp("FLOAT", 1, zzhzq.FLOAT, 5);
        zzb = zzhzpVar2;
        zzhzq zzhzqVar = zzhzq.LONG;
        zzhzp zzhzpVar3 = new zzhzp("INT64", 2, zzhzqVar, 0);
        zzc = zzhzpVar3;
        zzhzp zzhzpVar4 = new zzhzp("UINT64", 3, zzhzqVar, 0);
        zzd = zzhzpVar4;
        zzhzq zzhzqVar2 = zzhzq.INT;
        zzhzp zzhzpVar5 = new zzhzp("INT32", 4, zzhzqVar2, 0);
        zze = zzhzpVar5;
        zzhzp zzhzpVar6 = new zzhzp("FIXED64", 5, zzhzqVar, 1);
        zzf = zzhzpVar6;
        zzhzp zzhzpVar7 = new zzhzp("FIXED32", 6, zzhzqVar2, 5);
        zzg = zzhzpVar7;
        zzhzp zzhzpVar8 = new zzhzp("BOOL", 7, zzhzq.BOOLEAN, 0);
        zzh = zzhzpVar8;
        zzhzp zzhzpVar9 = new zzhzp("STRING", 8, zzhzq.STRING, 2);
        zzi = zzhzpVar9;
        zzhzq zzhzqVar3 = zzhzq.zzi;
        zzhzp zzhzpVar10 = new zzhzp("GROUP", 9, zzhzqVar3, 3);
        zzj = zzhzpVar10;
        zzhzp zzhzpVar11 = new zzhzp("MESSAGE", 10, zzhzqVar3, 2);
        zzk = zzhzpVar11;
        zzhzp zzhzpVar12 = new zzhzp("BYTES", 11, zzhzq.BYTE_STRING, 2);
        zzl = zzhzpVar12;
        zzhzp zzhzpVar13 = new zzhzp("UINT32", 12, zzhzqVar2, 0);
        zzm = zzhzpVar13;
        zzhzp zzhzpVar14 = new zzhzp("ENUM", 13, zzhzq.ENUM, 0);
        zzn = zzhzpVar14;
        zzhzp zzhzpVar15 = new zzhzp("SFIXED32", 14, zzhzqVar2, 5);
        zzo = zzhzpVar15;
        zzhzp zzhzpVar16 = new zzhzp("SFIXED64", 15, zzhzqVar, 1);
        zzp = zzhzpVar16;
        zzhzp zzhzpVar17 = new zzhzp("SINT32", 16, zzhzqVar2, 0);
        zzq = zzhzpVar17;
        zzhzp zzhzpVar18 = new zzhzp("SINT64", 17, zzhzqVar, 0);
        zzr = zzhzpVar18;
        zzu = new zzhzp[]{zzhzpVar, zzhzpVar2, zzhzpVar3, zzhzpVar4, zzhzpVar5, zzhzpVar6, zzhzpVar7, zzhzpVar8, zzhzpVar9, zzhzpVar10, zzhzpVar11, zzhzpVar12, zzhzpVar13, zzhzpVar14, zzhzpVar15, zzhzpVar16, zzhzpVar17, zzhzpVar18};
    }

    private zzhzp(String str, int i10, zzhzq zzhzqVar, int i11) {
        this.zzs = zzhzqVar;
        this.zzt = i11;
    }

    public static zzhzp[] values() {
        return (zzhzp[]) zzu.clone();
    }

    public final zzhzq zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
