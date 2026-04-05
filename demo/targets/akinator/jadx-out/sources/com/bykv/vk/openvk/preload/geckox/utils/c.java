package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f17221a;

    public static c a() {
        if (f17221a == null) {
            synchronized (c.class) {
                try {
                    if (f17221a == null) {
                        f17221a = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17221a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
