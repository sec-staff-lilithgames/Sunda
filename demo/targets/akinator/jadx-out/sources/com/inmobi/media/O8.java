package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class O8 extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f32093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8(C2886m8 adUnit) {
        super(adUnit, (byte) 6);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f32093d = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Re
    public final void a(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        U0 u02 = (C2886m8) this.f32093d.get();
        if (u02 == null) {
            return;
        }
        if (sShortValue != 0) {
            u02.a(new WeakReference<>(u02.r()), sShortValue, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        if (2 == u02.R()) {
            u02.d((byte) 4);
            InterfaceC3063x interfaceC3063xK = u02.k();
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY = u02.y();
            H0 h0R = u02.r();
            if (!(interfaceC3063xK instanceof C2734d8)) {
                if (h0R != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    h0R.a(u02, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            C2734d8 c2734d8 = (C2734d8) interfaceC3063xK;
            c2734d8.H = gestureDetectorOnGestureListenerC3093ycY;
            c2734d8.K = u02.U();
            W0 w0S = u02.s();
            w0S.getClass();
            w0S.f32423i = SystemClock.elapsedRealtime();
            u02.v0();
            u02.A0();
            if (h0R != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                u02.f(h0R);
            }
        }
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        H0 h0R;
        super.c();
        U0 u02 = (C2886m8) this.f32093d.get();
        if (u02 == null || (h0R = u02.r()) == null) {
            return;
        }
        h0R.a(u02, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        C2886m8 c2886m8 = (C2886m8) this.f32093d.get();
        if (c2886m8 == null) {
            b((short) 13);
            return;
        }
        H0 h0R = c2886m8.r();
        if (h0R != null) {
            b(Short.valueOf(c2886m8.c(h0R)));
        }
    }
}
