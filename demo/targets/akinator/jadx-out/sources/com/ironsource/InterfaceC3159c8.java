package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3159c8<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.c8$a */
    public static class a<ListenerType> implements InterfaceC3159c8<ListenerType> {

        /* renamed from: a, reason: collision with root package name */
        private ListenerType f36133a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        public static final class C0225a extends AbstractRunnableC3273ie {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f36134b;

            public C0225a(Runnable runnable) {
                this.f36134b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC3273ie
            public void a() {
                this.f36134b.run();
            }
        }

        public final ListenerType a() {
            return this.f36133a;
        }

        public final void b(ListenerType listenertype) {
            this.f36133a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        public final void a(Runnable runnable, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0225a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.InterfaceC3159c8
        public void a(ListenerType listenertype) {
            this.f36133a = listenertype;
        }
    }

    void a(T t10);
}
