package de;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class v {
    public static boolean isDeniedByServerException(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean isNotProvisionedException(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
