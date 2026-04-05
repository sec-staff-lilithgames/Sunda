package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class p implements h {
    public static void zzc(ClassLoader classLoader, Set set, o oVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objZzc = c0.zzb(classLoader, "pathList", Object.class).zzc();
        b0 b0VarZzb = c0.zzb(objZzc, "nativeLibraryDirectories", List.class);
        synchronized (jh.i.class) {
            ArrayList arrayList = new ArrayList((Collection) b0VarZzb.zzc());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            b0VarZzb.zze(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrZza = oVar.zza(objZzc, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (jh.i.class) {
                c0.zza(objZzc, "nativeLibraryPathElements", Object.class).zzb(Arrays.asList(objArrZza));
            }
            return;
        }
        z zVar = new z("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zVar, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw zVar;
    }

    public static boolean zzd(ClassLoader classLoader, File file, File file2, boolean z10, String str) {
        return kotlin.jvm.internal.d0.J(classLoader, file, file2, z10, new m(), "zip", new j());
    }
}
