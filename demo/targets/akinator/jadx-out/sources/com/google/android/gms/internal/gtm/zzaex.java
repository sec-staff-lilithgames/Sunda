package com.google.android.gms.internal.gtm;

import io.odeeo.internal.h.vfsA.QCmNMSGd;

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
public final class zzaex {
    public static final zzaex zza;
    public static final zzaex zzb;
    public static final zzaex zzc;
    public static final zzaex zzd;
    public static final zzaex zze;
    public static final zzaex zzf;
    public static final zzaex zzg;
    public static final zzaex zzh;
    public static final zzaex zzi;
    public static final zzaex zzj;
    public static final zzaex zzk;
    public static final zzaex zzl;
    public static final zzaex zzm;
    public static final zzaex zzn;
    public static final zzaex zzo;
    public static final zzaex zzp;
    public static final zzaex zzq;
    public static final zzaex zzr;
    private static final /* synthetic */ zzaex[] zzs;
    private final zzaey zzt;

    private zzaex(String str, int i10, zzaey zzaeyVar, int i11) {
        this.zzt = zzaeyVar;
    }

    public static zzaex[] values() {
        return (zzaex[]) zzs.clone();
    }

    public final zzaey zza() {
        return this.zzt;
    }

    static {
        zzaex zzaexVar = new zzaex("DOUBLE", 0, zzaey.DOUBLE, 1);
        zza = zzaexVar;
        zzaex zzaexVar2 = new zzaex("FLOAT", 1, zzaey.FLOAT, 5);
        zzb = zzaexVar2;
        zzaey zzaeyVar = zzaey.LONG;
        zzaex zzaexVar3 = new zzaex("INT64", 2, zzaeyVar, 0);
        zzc = zzaexVar3;
        zzaex zzaexVar4 = new zzaex("UINT64", 3, zzaeyVar, 0);
        zzd = zzaexVar4;
        zzaey zzaeyVar2 = zzaey.INT;
        zzaex zzaexVar5 = new zzaex("INT32", 4, zzaeyVar2, 0);
        zze = zzaexVar5;
        zzaex zzaexVar6 = new zzaex("FIXED64", 5, zzaeyVar, 1);
        zzf = zzaexVar6;
        zzaex zzaexVar7 = new zzaex("FIXED32", 6, zzaeyVar2, 5);
        zzg = zzaexVar7;
        zzaex zzaexVar8 = new zzaex("BOOL", 7, zzaey.BOOLEAN, 0);
        zzh = zzaexVar8;
        zzaex zzaexVar9 = new zzaex("STRING", 8, zzaey.STRING, 2);
        zzi = zzaexVar9;
        zzaey zzaeyVar3 = zzaey.MESSAGE;
        zzaex zzaexVar10 = new zzaex("GROUP", 9, zzaeyVar3, 3);
        zzj = zzaexVar10;
        zzaex zzaexVar11 = new zzaex("MESSAGE", 10, zzaeyVar3, 2);
        zzk = zzaexVar11;
        zzaex zzaexVar12 = new zzaex("BYTES", 11, zzaey.BYTE_STRING, 2);
        zzl = zzaexVar12;
        zzaex zzaexVar13 = new zzaex("UINT32", 12, zzaeyVar2, 0);
        zzm = zzaexVar13;
        zzaex zzaexVar14 = new zzaex("ENUM", 13, zzaey.ENUM, 0);
        zzn = zzaexVar14;
        zzaex zzaexVar15 = new zzaex(QCmNMSGd.DtNpYcJQSaqJMC, 14, zzaeyVar2, 5);
        zzo = zzaexVar15;
        zzaex zzaexVar16 = new zzaex("SFIXED64", 15, zzaeyVar, 1);
        zzp = zzaexVar16;
        zzaex zzaexVar17 = new zzaex("SINT32", 16, zzaeyVar2, 0);
        zzq = zzaexVar17;
        zzaex zzaexVar18 = new zzaex("SINT64", 17, zzaeyVar, 0);
        zzr = zzaexVar18;
        zzs = new zzaex[]{zzaexVar, zzaexVar2, zzaexVar3, zzaexVar4, zzaexVar5, zzaexVar6, zzaexVar7, zzaexVar8, zzaexVar9, zzaexVar10, zzaexVar11, zzaexVar12, zzaexVar13, zzaexVar14, zzaexVar15, zzaexVar16, zzaexVar17, zzaexVar18};
    }
}
