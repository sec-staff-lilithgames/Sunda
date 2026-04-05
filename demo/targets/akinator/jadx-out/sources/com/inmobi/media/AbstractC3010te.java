package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3010te {

    /* renamed from: a, reason: collision with root package name */
    public static final I6 f33402a;

    /* renamed from: b, reason: collision with root package name */
    public static int f33403b;

    /* renamed from: c, reason: collision with root package name */
    public static Integer f33404c;

    static {
        I6 i6A;
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            i6A = H6.a(contextD, "imtelemetrydboverflow");
        } else {
            i6A = null;
        }
        f33402a = i6A;
        f33403b = -1;
    }

    public static int a() {
        if (f33403b == -1) {
            I6 i62 = f33402a;
            int i10 = 0;
            if (i62 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("count", C3191e4.h.W);
                i10 = i62.f31866a.getInt("count", 0);
            }
            f33403b = i10;
        }
        return f33403b;
    }
}
