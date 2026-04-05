package com.inmobi.media;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class H6 {
    public static I6 a(Context context, String fileKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(fileKey, "fileKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(fileKey, "fileKey");
        String str = "com.im.keyValueStore." + fileKey;
        I6 i62 = (I6) I6.f31865b.get(str);
        if (i62 == null) {
            i62 = new I6(context, str);
            I6 i63 = (I6) I6.f31865b.putIfAbsent(str, i62);
            if (i63 != null) {
                return i63;
            }
        }
        return i62;
    }
}
