package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3099z1 implements nv.b {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.f0 f33667a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33668b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f33669c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f33670d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33671e;

    public /* synthetic */ C3099z1(Integer num, kv.a aVar, boolean z10, int i10) {
        this((Object) num, aVar, (i10 & 4) != 0 ? false : z10, false);
    }

    public final void a() {
        if (this.f33670d.compareAndSet(false, true)) {
            this.f33671e = true;
            ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).submit(new zg.h(this, 21));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.f0, kv.a] */
    public final void b() {
        if (this.f33670d.compareAndSet(false, true)) {
            this.f33671e = true;
            try {
                this.f33669c = this.f33667a.invoke();
            } catch (Exception unused) {
            } catch (Throwable th2) {
                this.f33670d.set(false);
                throw th2;
            }
            this.f33670d.set(false);
        }
    }

    @Override // nv.b
    public final Object getValue(Object obj, KProperty property) {
        kotlin.jvm.internal.e0.checkNotNullParameter(property, "property");
        if (this.f33668b || !this.f33671e) {
            a();
        }
        return this.f33669c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3099z1(Object obj, kv.a refreshLogic, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(refreshLogic, "refreshLogic");
        this.f33667a = (kotlin.jvm.internal.f0) refreshLogic;
        this.f33668b = z10;
        this.f33669c = obj;
        this.f33670d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.f0, kv.a] */
    public static final void a(C3099z1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f33669c = this$0.f33667a.invoke();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            this$0.f33670d.set(false);
            throw th2;
        }
        this$0.f33670d.set(false);
    }
}
