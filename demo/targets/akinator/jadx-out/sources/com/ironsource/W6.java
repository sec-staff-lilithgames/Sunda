package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.InterfaceC3501vf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W6 implements InterfaceC3501vf {

    /* renamed from: a, reason: collision with root package name */
    private final a f35677a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(Runnable runnable, long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3501vf.a f35678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f35679c;

        public b(InterfaceC3501vf.a aVar, Runnable runnable) {
            this.f35678b = aVar;
            this.f35679c = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            if (this.f35678b.b()) {
                return;
            }
            this.f35679c.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3501vf
    public InterfaceC3501vf.a a(Runnable task, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        InterfaceC3501vf.a aVar = new InterfaceC3501vf.a();
        this.f35677a.a(a(aVar, task), tv.f.m7195getInWholeMillisecondsimpl(j10));
        return aVar;
    }

    public W6(a handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
        this.f35677a = handler;
    }

    public /* synthetic */ W6(a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? X6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    private final AbstractRunnableC3273ie a(InterfaceC3501vf.a aVar, Runnable runnable) {
        return new b(aVar, runnable);
    }
}
