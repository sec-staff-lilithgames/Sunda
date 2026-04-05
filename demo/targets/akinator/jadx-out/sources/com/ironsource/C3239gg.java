package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3239gg implements InterfaceC3203eg {

    /* renamed from: a, reason: collision with root package name */
    public static final C3239gg f36817a = new C3239gg();

    /* renamed from: b, reason: collision with root package name */
    private static final tu.o f36818b = tu.q.lazy(a.f36819a);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.gg$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36819a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                IronLog.INTERNAL.warning(th2.getMessage());
                return null;
            }
        }
    }

    private C3239gg() {
    }

    @Override // com.ironsource.InterfaceC3203eg
    public String a() {
        return (String) f36818b.getValue();
    }
}
