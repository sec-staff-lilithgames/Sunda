package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A1 extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f31612d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f31613e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f31614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(U0 adUnit, JSONObject response, F5 f52) {
        super(adUnit, (byte) 4);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        this.f31612d = response;
        this.f31613e = f52;
        this.f31614f = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Re
    public final void a(Object obj) {
        H0 h0R;
        InMobiAdRequestStatus inMobiAdRequestStatus = (InMobiAdRequestStatus) obj;
        U0 u02 = (U0) this.f31614f.get();
        if (u02 == null || (h0R = u02.r()) == null) {
            return;
        }
        if (inMobiAdRequestStatus != null) {
            u02.b(inMobiAdRequestStatus, true, (short) 2182);
            return;
        }
        u02.d((byte) 2);
        F5 f52 = this.f31613e;
        if (f52 != null) {
            ((G5) f52).d("AuctionCloseWorker", "AdUnit " + u02 + " state - AVAILABLE");
        }
        u02.e(h0R);
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        U0 u02 = (U0) this.f31614f.get();
        if (u02 == null) {
            return;
        }
        u02.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (short) 2181);
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        A0 a0Z;
        U0 u02 = (U0) this.f31614f.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if ((u02 != null ? u02.z() : null) == null) {
            b(inMobiAdRequestStatus);
            return;
        }
        try {
            AdConfig adConfigJ = u02.j();
            if (adConfigJ != null && (a0Z = u02.z()) != null) {
                a0Z.a(this.f31612d, adConfigJ, this.f31613e);
            }
            b(null);
        } catch (Exception unused) {
            U0.e();
            b(inMobiAdRequestStatus);
        }
    }
}
