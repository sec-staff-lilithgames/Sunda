package com.google.android.gms.internal.common;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzl {
    public static Object zza(Class cls, String str, zzj... zzjVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zzjVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzj... zzjVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zzjVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z10, zzj... zzjVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = zzjVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < zzjVarArr.length; i10++) {
            zzj zzjVar = zzjVarArr[i10];
            zzjVar.getClass();
            clsArr[i10] = zzjVar.zzc();
            objArr[i10] = zzjVarArr[i10].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
