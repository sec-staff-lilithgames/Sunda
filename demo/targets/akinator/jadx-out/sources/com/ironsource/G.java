package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3486v0 f34390a;

    /* renamed from: b, reason: collision with root package name */
    private final NetworkSettings f34391b;

    /* renamed from: c, reason: collision with root package name */
    private final tu.o f34392c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V0 f34393a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f34394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V0 v02, G g8) {
            super(0);
            this.f34393a = v02;
            this.f34394b = g8;
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f34393a.a(this.f34394b.e(), this.f34394b.a(), this.f34394b.d());
        }
    }

    public G(V0 adTools, AbstractC3486v0 adUnitData, NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        this.f34390a = adUnitData;
        this.f34391b = providerSettings;
        this.f34392c = tu.q.lazy(new a(adTools, this));
    }

    public final IronSource.a a() {
        return this.f34390a.b().a();
    }

    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f34392c.getValue();
    }

    public final String c() {
        String providerName = this.f34391b.getProviderName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    public final UUID d() {
        return this.f34390a.b().b();
    }

    public final NetworkSettings e() {
        return this.f34391b;
    }
}
