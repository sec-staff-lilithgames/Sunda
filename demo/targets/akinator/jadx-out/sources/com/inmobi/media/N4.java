package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N4 extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final long f32044d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f32045e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f32046f;

    /* renamed from: g, reason: collision with root package name */
    public L f32047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(U0 adUnit, long j10, F5 f52) {
        super(adUnit, (byte) 2);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f32044d = j10;
        this.f32045e = f52;
        this.f32046f = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Re
    public final void a(Object obj) {
        byte[] bArr = (byte[]) obj;
        U0 u02 = (U0) this.f32046f.get();
        if (u02 == null) {
            return;
        }
        if (this.f32047g != null) {
            F5 f52 = this.f32045e;
            if (f52 != null) {
                ((G5) f52).d("GetSignalsWorker", "AdUnit " + u02 + " state - FAILED");
            }
            u02.d((byte) 3);
        }
        H0 h0R = u02.r();
        if (h0R == null) {
            return;
        }
        L l9 = this.f32047g;
        if (l9 != null) {
            F5 f53 = this.f32045e;
            if (f53 != null) {
                ((G5) f53).a("GetSignalsWorker", "get signals failed", l9);
            }
            u02.a((int) l9.f31981b, this.f32044d);
            h0R.b(new InMobiAdRequestStatus(l9.f31980a.getStatusCode()));
            return;
        }
        if (bArr != null) {
            u02.b(this.f32044d);
            h0R.a(bArr);
            F5 f54 = this.f32045e;
            if (f54 != null) {
                ((G5) f54).a("GetSignalsWorker", "callback - onRequestCreated");
                return;
            }
            return;
        }
        u02.d((byte) 3);
        F5 f55 = this.f32045e;
        if (f55 != null) {
            ((G5) f55).d("GetSignalsWorker", "AdUnit " + this + " state - FAILED");
        }
        F5 f56 = this.f32045e;
        if (f56 != null) {
            ((G5) f56).b("GetSignalsWorker", "no request created - fail");
        }
        u02.a(13, this.f32044d);
        h0R.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        U0 u02 = (U0) this.f32046f.get();
        if (u02 == null) {
            return;
        }
        H0 h0R = u02.r();
        F5 f52 = this.f32045e;
        if (f52 != null) {
            ((G5) f52).a("GetSignalsWorker", "onOOM");
        }
        if (h0R != null) {
            h0R.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        U0 u02 = (U0) this.f32046f.get();
        if ((u02 != null ? u02.I() : null) == null) {
            F5 f52 = this.f32045e;
            if (f52 != null) {
                ((G5) f52).b("GetSignalsWorker", "OAManager is null");
            }
            b(null);
            return;
        }
        if (u02.r() == null) {
            F5 f53 = this.f32045e;
            if (f53 != null) {
                ((G5) f53).b("GetSignalsWorker", "listener is null");
            }
            b(null);
            return;
        }
        try {
            C2888ma c2888maI = u02.I();
            b(c2888maI != null ? new C2905na(c2888maI.f33094a).a() : null);
        } catch (L e10) {
            this.f32047g = e10;
            b(null);
        }
    }
}
