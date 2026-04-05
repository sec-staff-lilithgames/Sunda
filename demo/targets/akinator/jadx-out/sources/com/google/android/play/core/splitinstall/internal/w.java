package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class w implements h {
    @Override // com.google.android.play.core.splitinstall.internal.h
    public final void zza(ClassLoader classLoader, Set set) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p.zzc(classLoader, set, new t());
    }

    @Override // com.google.android.play.core.splitinstall.internal.h
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return kotlin.jvm.internal.d0.J(classLoader, file, file2, z10, new m(), "path", new u());
    }
}
