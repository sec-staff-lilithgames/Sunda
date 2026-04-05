package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzm extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzzm(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String strConcat = th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : "";
        super(a.b.o(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th2);
    }
}
