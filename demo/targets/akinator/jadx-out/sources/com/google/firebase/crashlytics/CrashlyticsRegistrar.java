package com.google.firebase.crashlytics;

import ai.a;
import ai.b;
import ai.c;
import bi.b0;
import bi.q;
import bk.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.g;
import fk.d;
import fk.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import tj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f29669d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f29670a = b0.qualified(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final b0 f29671b = b0.qualified(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final b0 f29672c = b0.qualified(c.class, ExecutorService.class);

    static {
        d.addDependency(e.f55731b);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bi.c> getComponents() {
        return Arrays.asList(bi.c.builder(di.e.class).name("fire-cls").add(q.required((Class<?>) g.class)).add(q.required((Class<?>) f.class)).add(q.required(this.f29670a)).add(q.required(this.f29671b)).add(q.required(this.f29672c)).add(q.deferred((Class<?>) ei.a.class)).add(q.deferred((Class<?>) yh.d.class)).add(q.deferred((Class<?>) ck.a.class)).factory(new bi.a(this, 2)).eagerInDefaultApp().build(), i.create("fire-cls", "20.0.3"));
    }
}
