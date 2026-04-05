package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC3456t4;
import com.ironsource.InterfaceC3459t7;
import com.ironsource.environment.ContextProvider;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M3 implements InterfaceC3459t7, InterfaceC3459t7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Zc f34832a;

    /* renamed from: b, reason: collision with root package name */
    private final C3365nf f34833b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34834a;

        static {
            int[] iArr = new int[Q3.values().length];
            try {
                iArr[Q3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34834a = iArr;
        }
    }

    public M3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC3459t7
    public synchronized O3 a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        O3 o3A = this.f34832a.a(identifier);
        if (o3A.d()) {
            return o3A;
        }
        return this.f34833b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public synchronized void b(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f34832a.b(identifier);
        this.f34833b.b(identifier);
    }

    public M3(InterfaceC3456t4 currentTimeProvider, M7 pacingDataRepository, T8 showCountDataRepository) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        kotlin.jvm.internal.e0.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.f34832a = new Zc(currentTimeProvider, pacingDataRepository);
        this.f34833b = new C3365nf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC3459t7.a
    public synchronized Object a(String identifier, Q3 cappingType, InterfaceC3425r7 cappingConfig) {
        Object objA;
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
            kotlin.jvm.internal.e0.checkNotNullParameter(cappingType, "cappingType");
            kotlin.jvm.internal.e0.checkNotNullParameter(cappingConfig, "cappingConfig");
            int i10 = a.f34834a[cappingType.ordinal()];
            if (i10 == 1) {
                objA = this.f34832a.a(identifier, cappingType, cappingConfig);
            } else if (i10 == 2) {
                objA = this.f34833b.a(identifier, cappingType, cappingConfig);
            } else {
                if (i10 != 3) {
                    throw new tu.t();
                }
                int i11 = tu.z.f87419c;
                objA = tu.z.m7131constructorimpl(tu.x0.f87415a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objA;
    }

    public /* synthetic */ M3(InterfaceC3456t4 interfaceC3456t4, M7 m72, T8 t82, int i10, kotlin.jvm.internal.u uVar) {
        interfaceC3456t4 = (i10 & 1) != 0 ? new InterfaceC3456t4.a() : interfaceC3456t4;
        if ((i10 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            m72 = new C3128ad(new Cif(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i10 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            t82 = new C3327lf(new Cif(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC3456t4, m72, t82);
    }
}
