package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2867l6 extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f33044d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f33045e;

    /* renamed from: f, reason: collision with root package name */
    public short f33046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2867l6(C2985s6 adUnit, H0 eventListener) {
        super(adUnit, (byte) 5);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventListener, "eventListener");
        this.f33044d = new WeakReference(adUnit);
        this.f33045e = new WeakReference(eventListener);
    }

    @Override // com.inmobi.media.Re
    public final void a(Object obj) {
        H0 h02;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C2985s6 c2985s6 = (C2985s6) this.f33044d.get();
        if (c2985s6 == null || (h02 = (H0) this.f33045e.get()) == null) {
            return;
        }
        if (!zBooleanValue) {
            short s10 = this.f33046f;
            if (s10 != 0) {
                c2985s6.a(this.f33045e, s10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            } else {
                c2985s6.b(h02, (short) 85);
                return;
            }
        }
        InterfaceC3063x interfaceC3063xK = c2985s6.k();
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycY = c2985s6.y();
        if (gestureDetectorOnGestureListenerC3093ycY != null) {
            if (interfaceC3063xK instanceof C2734d8) {
                C2734d8 c2734d8 = (C2734d8) interfaceC3063xK;
                c2734d8.H = gestureDetectorOnGestureListenerC3093ycY;
                c2734d8.K = c2985s6.U();
            } else {
                c2985s6.b(h02, (short) 84);
            }
        }
        C2985s6.a(c2985s6, h02, (Context) null, 2, (Object) null);
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        C2985s6 c2985s6 = (C2985s6) this.f33044d.get();
        if (c2985s6 == null || ((H0) this.f33045e.get()) == null) {
            return;
        }
        c2985s6.a(this.f33045e, (short) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        C2985s6 c2985s6 = (C2985s6) this.f33044d.get();
        H0 h02 = (H0) this.f33045e.get();
        if (c2985s6 != null && h02 != null) {
            if (c2985s6.F0()) {
                short sC = c2985s6.c(h02);
                this.f33046f = sC;
                b(Boolean.valueOf(sC == 0));
                return;
            }
            b(Boolean.FALSE);
            return;
        }
        b(Boolean.FALSE);
    }
}
