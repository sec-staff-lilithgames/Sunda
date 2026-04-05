package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3141b8<T> {
    T a(String str);

    void a(T t10);

    void a(String str, T t10);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.b8$a */
    public static final class a implements InterfaceC3141b8<ISDemandOnlyInterstitialListener> {

        /* renamed from: a, reason: collision with root package name */
        private C3123a8 f36057a = new C3123a8();

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, C3123a8> f36058b = new HashMap();

        @Override // com.ironsource.InterfaceC3141b8
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            C3123a8 c3123a8 = this.f36058b.get(instanceId);
            return c3123a8 != null ? c3123a8 : this.f36057a;
        }

        @Override // com.ironsource.InterfaceC3141b8
        public void a(ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            this.f36057a.a(listener);
            Iterator<String> it = this.f36058b.keySet().iterator();
            while (it.hasNext()) {
                C3123a8 c3123a8 = this.f36058b.get(it.next());
                if (c3123a8 != null) {
                    c3123a8.a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3141b8
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            if (this.f36058b.containsKey(instanceId)) {
                C3123a8 c3123a8 = this.f36058b.get(instanceId);
                if (c3123a8 != null) {
                    c3123a8.a(listener);
                    return;
                }
                return;
            }
            this.f36058b.put(instanceId, new C3123a8(listener));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.b8$b */
    public static final class b implements InterfaceC3141b8<ISDemandOnlyRewardedVideoListener> {

        /* renamed from: a, reason: collision with root package name */
        private C3177d8 f36059a = new C3177d8();

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, C3177d8> f36060b = new HashMap();

        @Override // com.ironsource.InterfaceC3141b8
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            C3177d8 c3177d8 = this.f36060b.get(instanceId);
            return c3177d8 != null ? c3177d8 : this.f36059a;
        }

        @Override // com.ironsource.InterfaceC3141b8
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            this.f36059a.a(listener);
            Iterator<String> it = this.f36060b.keySet().iterator();
            while (it.hasNext()) {
                C3177d8 c3177d8 = this.f36060b.get(it.next());
                if (c3177d8 != null) {
                    c3177d8.a(listener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3141b8
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            if (this.f36060b.containsKey(instanceId)) {
                C3177d8 c3177d8 = this.f36060b.get(instanceId);
                if (c3177d8 != null) {
                    c3177d8.a(listener);
                    return;
                }
                return;
            }
            this.f36060b.put(instanceId, new C3177d8(listener));
        }
    }
}
