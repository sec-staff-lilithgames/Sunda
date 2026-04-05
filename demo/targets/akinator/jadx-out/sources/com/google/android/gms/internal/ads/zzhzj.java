package com.google.android.gms.internal.ads;

import com.moloco.sdk.BKC.JzVV;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhzj {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhzi zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzj.<clinit>():void");
    }

    private zzhzj() {
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i10 = zzhuv.zza;
        Field fieldZzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        Field fieldZzF2 = zzF(Buffer.class, "address");
        if (fieldZzF2 == null || fieldZzF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int zzd(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    public static void zze(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    public static long zzf(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    public static void zzg(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    public static boolean zzh(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    public static void zzi(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    public static float zzj(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    public static void zzk(Object obj, long j10, float f10) {
        zzf.zze(obj, j10, f10);
    }

    public static double zzl(Object obj, long j10) {
        return zzf.zzf(obj, j10);
    }

    public static void zzm(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    public static Object zzn(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    public static void zzo(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    public static void zzp(byte[] bArr, long j10, byte b10) {
        zzf.zza(bArr, zza + j10, b10);
    }

    public static void zzq(long j10, byte[] bArr, long j11, long j12) {
        zzf.zzi(j10, bArr, j11, j12);
    }

    public static byte zzr(long j10) {
        return zzf.zzh(j10);
    }

    public static long zzs(ByteBuffer byteBuffer) {
        zzhzi zzhziVar = zzf;
        return zzhziVar.zza.getLong(byteBuffer, zzi);
    }

    public static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhzf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzu(Class cls) {
        int i10 = zzhuv.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzx(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzy(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void zzB(Throwable th2) {
        Logger.getLogger(zzhzj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", JzVV.YqfGHoIV, "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }
}
