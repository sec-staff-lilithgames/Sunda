package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2698b6 {

    /* renamed from: a, reason: collision with root package name */
    public static I6 f32681a;

    public static final I6 a() {
        I6 i6A;
        if (f32681a == null) {
            Context contextD = C2925od.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                i6A = H6.a(contextD, "CrashSession-store");
            } else {
                i6A = null;
            }
            f32681a = i6A;
        }
        return f32681a;
    }

    public static final long a(AbstractC2982s3 crashType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(crashType, "crashType");
        I6 i6A = a();
        if (i6A == null) {
            return 0L;
        }
        String key = crashType.f33353b;
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return i6A.f31866a.getLong(key, 0L);
    }
}
