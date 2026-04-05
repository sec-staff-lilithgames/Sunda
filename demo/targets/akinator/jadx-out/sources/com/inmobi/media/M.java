package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.RootConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final F5 f32014d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f32015e;

    /* renamed from: f, reason: collision with root package name */
    public L f32016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(U0 adUnit, F5 f52) {
        super(adUnit, (byte) 0);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f32014d = f52;
        this.f32015e = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Re
    public final void a(Object obj) {
        A0 a02 = (A0) obj;
        U0 u02 = (U0) this.f32015e.get();
        if (u02 == null) {
            return;
        }
        u02.b((byte) 0);
        if (this.f32016f == null) {
            if (a02 == null) {
                u02.a(u02.J(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
                return;
            } else if (a02.m()) {
                u02.c(a02);
                return;
            } else {
                u02.d(a02);
                return;
            }
        }
        C2675a0 c2675a0J = u02.J();
        L l9 = this.f32016f;
        kotlin.jvm.internal.e0.checkNotNull(l9);
        InMobiAdRequestStatus inMobiAdRequestStatus = l9.f31980a;
        L l10 = this.f32016f;
        kotlin.jvm.internal.e0.checkNotNull(l10);
        u02.a(c2675a0J, inMobiAdRequestStatus, l10.f31981b);
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        U0 u02 = (U0) this.f32015e.get();
        if (u02 == null) {
            return;
        }
        u02.b((byte) 0);
        u02.a(u02.J(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2117);
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        F5 f52 = this.f32014d;
        if (f52 != null) {
            ((G5) f52).c("AdFetcherTask", "executeTask " + this);
        }
        U0 u02 = (U0) this.f32015e.get();
        if (u02 == null) {
            F5 f53 = this.f32014d;
            if (f53 != null) {
                ((G5) f53).b("AdFetcherTask", "adUnit is null. fail");
            }
            this.f32016f = new L(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 2111);
            b(null);
            return;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        if (!((RootConfig) AbstractC3035v5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).isMonetizationDisabled()) {
            W0 w0S = u02.s();
            w0S.getClass();
            w0S.f32420f = SystemClock.elapsedRealtime();
            try {
                F5 f54 = this.f32014d;
                if (f54 != null) {
                    ((G5) f54).a("AdFetcherTask", "getting ad from store");
                }
                b(u02.p().a(u02.i0(), u02.G()));
                return;
            } catch (L e10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(U0.e(), "<get-TAG>(...)");
                this.f32016f = e10;
                b(null);
                return;
            }
        }
        F5 f55 = this.f32014d;
        if (f55 != null) {
            ((G5) f55).b("AdFetcherTask", "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
        }
        this.f32016f = new L(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
        b(null);
    }
}
