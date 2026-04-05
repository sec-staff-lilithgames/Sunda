package com.ironsource;

import android.app.Activity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3543y6 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.y6$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f39254a;

        public a(c strategyType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(strategyType, "strategyType");
            this.f39254a = strategyType;
        }

        public final c a() {
            return this.f39254a;
        }

        public final c b() {
            return this.f39254a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f39254a == ((a) obj).f39254a;
        }

        public int hashCode() {
            return this.f39254a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f39254a + ")";
        }

        public final a a(c strategyType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f39254a;
            }
            return aVar.a(cVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.y6$b */
    public static final class b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.y6$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39255a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39255a = iArr;
            }
        }

        public final InterfaceC3543y6 a(C3350n0 adTools, a config, InterfaceC3475u6 fullscreenAdUnitFactory, InterfaceC3509w6 fullscreenAdUnitListener, InterfaceC3526x6 listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            int i10 = a.f39255a[config.b().ordinal()];
            if (i10 == 1) {
                return new M6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 2) {
                return new F6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 3) {
                return new C3560z6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new tu.t();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.y6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* renamed from: a, reason: collision with root package name */
        private final String f39260a;

        c(String str) {
            this.f39260a = str;
        }

        public final String b() {
            return this.f39260a;
        }
    }

    void a(Activity activity);

    void loadAd();
}
