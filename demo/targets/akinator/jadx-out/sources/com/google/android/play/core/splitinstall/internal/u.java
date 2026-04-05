package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u implements k {
    @Override // com.google.android.play.core.splitinstall.internal.k
    public final boolean zza(Object obj, File file, File file2) {
        try {
            return !((Boolean) c0.zzf(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
