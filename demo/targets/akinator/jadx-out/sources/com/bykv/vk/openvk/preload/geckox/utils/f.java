package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f17223a;

    public static f a() {
        if (f17223a == null) {
            synchronized (f.class) {
                try {
                    if (f17223a == null) {
                        f17223a = new f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17223a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
