package com.google.android.gms.internal.ads;

import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfve {
    public static Object zza(String str, String str2, zzfvd... zzfvdVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Class.forName(str).getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
    }
}
