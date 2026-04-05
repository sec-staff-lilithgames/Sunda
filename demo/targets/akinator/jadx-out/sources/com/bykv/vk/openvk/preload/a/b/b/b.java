package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.d;
import java.lang.reflect.AccessibleObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f16885a;

    static {
        f16885a = d.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return f16885a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
