package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3470u1 implements N1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u1$a */
    public static final class a implements androidx.lifecycle.v0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3304ka f38972a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0248a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38973a;

            static {
                int[] iArr = new int[androidx.lifecycle.i0.values().length];
                try {
                    iArr[androidx.lifecycle.i0.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.i0.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.i0.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.i0.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f38973a = iArr;
            }
        }

        public a(InterfaceC3304ka listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            this.f38972a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(androidx.lifecycle.i0 event, a this$0) {
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "$event");
            kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
            int i10 = C0248a.f38973a[event.ordinal()];
            if (i10 == 1) {
                this$0.f38972a.b();
                return;
            }
            if (i10 == 2) {
                this$0.f38972a.c();
            } else if (i10 == 3) {
                this$0.f38972a.d();
            } else {
                if (i10 != 4) {
                    return;
                }
                this$0.f38972a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC3304ka interfaceC3304ka = this.f38972a;
            a aVar = obj instanceof a ? (a) obj : null;
            return kotlin.jvm.internal.e0.areEqual(interfaceC3304ka, aVar != null ? aVar.f38972a : null);
        }

        public int hashCode() {
            return this.f38972a.hashCode();
        }

        @Override // androidx.lifecycle.v0
        public void onStateChanged(androidx.lifecycle.b1 source, androidx.lifecycle.i0 event) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new gi(0, event, this), 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC3304ka observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.b2.f6515k.get().getLifecycle().addObserver(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC3304ka observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.b2.f6515k.get().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.N1
    public void a(InterfaceC3304ka observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new fi(observer, 0), 0L, 2, null);
    }

    @Override // com.ironsource.N1
    public void b(InterfaceC3304ka observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new fi(observer, 1), 0L, 2, null);
    }
}
