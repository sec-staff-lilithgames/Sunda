package com.google.android.gms.internal.gtm;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class zzacr {
    public static final zzacr zza;
    public static final zzacr zzb;
    public static final zzacr zzc;
    public static final zzacr zzd;
    public static final zzacr zze;
    public static final zzacr zzf;
    public static final zzacr zzg;
    public static final zzacr zzh;
    public static final zzacr zzi;
    public static final zzacr zzj;
    private static final /* synthetic */ zzacr[] zzk;
    private final Class zzl;

    private zzacr(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzacr[] values() {
        return (zzacr[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }

    static {
        zzacr zzacrVar = new zzacr("VOID", 0, Void.class, Void.class, null);
        zza = zzacrVar;
        Class cls = Integer.TYPE;
        zzacr zzacrVar2 = new zzacr("INT", 1, cls, Integer.class, 0);
        zzb = zzacrVar2;
        zzacr zzacrVar3 = new zzacr("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzacrVar3;
        zzacr zzacrVar4 = new zzacr("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzacrVar4;
        zzacr zzacrVar5 = new zzacr("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzacrVar5;
        zzacr zzacrVar6 = new zzacr(OIPXcgrVyyxoLF.IeUHLYdKhXXj, 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzacrVar6;
        zzacr zzacrVar7 = new zzacr("STRING", 6, String.class, String.class, "");
        zzg = zzacrVar7;
        zzacr zzacrVar8 = new zzacr("BYTE_STRING", 7, zzyx.class, zzyx.class, zzyx.zzb);
        zzh = zzacrVar8;
        zzacr zzacrVar9 = new zzacr("ENUM", 8, cls, Integer.class, null);
        zzi = zzacrVar9;
        zzacr zzacrVar10 = new zzacr("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzacrVar10;
        zzk = new zzacr[]{zzacrVar, zzacrVar2, zzacrVar3, zzacrVar4, zzacrVar5, zzacrVar6, zzacrVar7, zzacrVar8, zzacrVar9, zzacrVar10};
    }
}
