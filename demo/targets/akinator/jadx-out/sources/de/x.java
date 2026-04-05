package de;

import android.media.MediaDrmResetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x {
    public static boolean isMediaDrmResetException(Throwable th2) {
        return th2 instanceof MediaDrmResetException;
    }
}
