package com.facebook.ads.redexgen.core;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: com.facebook.ads.redexgen.X.58, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass58 {
    public static boolean A00(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
