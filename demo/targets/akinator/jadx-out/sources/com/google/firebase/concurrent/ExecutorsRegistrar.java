package com.google.firebase.concurrent;

import ai.d;
import android.os.Build;
import android.os.StrictMode;
import bi.b0;
import bi.c;
import bi.k;
import bi.v;
import bk.b;
import ci.a;
import ci.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final v f29665a = new v(new k(2));

    /* renamed from: b, reason: collision with root package name */
    public static final v f29666b = new v(new k(3));

    /* renamed from: c, reason: collision with root package name */
    public static final v f29667c = new v(new k(4));

    /* renamed from: d, reason: collision with root package name */
    public static final v f29668d = new v(new k(5));

    public static g a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new g(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f29668d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.builder(b0.qualified(ai.a.class, ScheduledExecutorService.class), b0.qualified(ai.a.class, ExecutorService.class), b0.qualified(ai.a.class, Executor.class)).factory(new b(1)).build(), c.builder(b0.qualified(ai.b.class, ScheduledExecutorService.class), b0.qualified(ai.b.class, ExecutorService.class), b0.qualified(ai.b.class, Executor.class)).factory(new b(2)).build(), c.builder(b0.qualified(ai.c.class, ScheduledExecutorService.class), b0.qualified(ai.c.class, ExecutorService.class), b0.qualified(ai.c.class, Executor.class)).factory(new b(3)).build(), c.builder(b0.qualified(d.class, Executor.class)).factory(new b(4)).build());
    }
}
