package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f26360a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f26361b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f26360a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f26361b = cls2 != null;
    }

    public static boolean a() {
        return (f26360a == null || f26361b) ? false : true;
    }
}
