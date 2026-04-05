package com.ironsource;

import com.ironsource.N7;
import com.unity3d.mediation.LevelPlay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3363nd implements N7, N7.a {

    /* renamed from: a, reason: collision with root package name */
    private final M3 f37981a;

    /* renamed from: b, reason: collision with root package name */
    private final S4 f37982b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.nd$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37983a;

        static {
            int[] iArr = new int[Q3.values().length];
            try {
                iArr[Q3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37983a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3363nd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.N7
    public synchronized O3 a(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C3448sd(placementName, adFormat).a();
        O3 o3A = this.f37982b.a(strA);
        if (o3A.d()) {
            return o3A;
        }
        return this.f37981a.a(strA);
    }

    @Override // com.ironsource.N7.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C3448sd(placementName, adFormat).a();
        if (!this.f37982b.a(strA).d()) {
            this.f37981a.b(strA);
        }
    }

    public C3363nd(M3 cappingService, S4 deliveryHandler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingService, "cappingService");
        kotlin.jvm.internal.e0.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.f37981a = cappingService;
        this.f37982b = deliveryHandler;
    }

    public /* synthetic */ C3363nd(M3 m32, S4 s42, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new M3(null, null, null, 7, null) : m32, (i10 & 2) != 0 ? new S4() : s42);
    }

    @Override // com.ironsource.N7.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, Q3 cappingType, InterfaceC3425r7 cappingConfig) {
        Object objA;
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
            kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
            kotlin.jvm.internal.e0.checkNotNullParameter(cappingType, "cappingType");
            kotlin.jvm.internal.e0.checkNotNullParameter(cappingConfig, "cappingConfig");
            String strA = new C3448sd(placementName, adFormat).a();
            int i10 = a.f37983a[cappingType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new tu.t();
                }
                objA = this.f37981a.a(strA, cappingType, cappingConfig);
            } else {
                objA = this.f37982b.a(strA, cappingType, cappingConfig);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objA;
    }
}
