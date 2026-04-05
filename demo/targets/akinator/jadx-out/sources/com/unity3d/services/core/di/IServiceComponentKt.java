package com.unity3d.services.core.di;

import ao.kwoC.zAQQWzBxnS;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IServiceComponentKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // kv.a
        public final T invoke() {
            IServiceComponent iServiceComponent = this.$this_inject;
            String str = this.$named;
            IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return registry.getService(str, c1.getOrCreateKotlinClass(Object.class));
        }
    }

    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String named) {
        e0.checkNotNullParameter(iServiceComponent, "<this>");
        e0.checkNotNullParameter(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) registry.getService(named, c1.getOrCreateKotlinClass(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        e0.checkNotNullParameter(iServiceComponent, "<this>");
        e0.checkNotNullParameter(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return registry.getService(named, c1.getOrCreateKotlinClass(Object.class));
    }

    public static final /* synthetic */ <T> o inject(IServiceComponent iServiceComponent, String named, s mode) {
        e0.checkNotNullParameter(iServiceComponent, "<this>");
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(mode, "mode");
        e0.needClassReification();
        return q.lazy(mode, (a) new AnonymousClass1(iServiceComponent, named));
    }

    public static /* synthetic */ o inject$default(IServiceComponent iServiceComponent, String named, s mode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = zAQQWzBxnS.XNZ;
        }
        if ((i10 & 2) != 0) {
            mode = s.f87405e;
        }
        e0.checkNotNullParameter(iServiceComponent, "<this>");
        e0.checkNotNullParameter(named, "named");
        e0.checkNotNullParameter(mode, "mode");
        e0.needClassReification();
        return q.lazy(mode, (a) new AnonymousClass1(iServiceComponent, named));
    }
}
