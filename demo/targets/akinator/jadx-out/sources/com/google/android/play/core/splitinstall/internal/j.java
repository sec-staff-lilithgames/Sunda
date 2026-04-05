package com.google.android.play.core.splitinstall.internal;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j implements k {
    @Override // com.google.android.play.core.splitinstall.internal.k
    public final boolean zza(Object obj, File file, File file2) {
        return new File((String) c0.zzg(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
