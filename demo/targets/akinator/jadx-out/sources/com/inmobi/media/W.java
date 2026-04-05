package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final Z9 f32413a;

    /* renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f32414b;

    public W(Z9 mResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mResponse, "mResponse");
        this.f32413a = mResponse;
        S9 s92 = mResponse.f32602d;
        if (s92 != null) {
            switch (V.f32380a[s92.f32266a.ordinal()]) {
                case 1:
                    this.f32414b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    break;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    this.f32414b = inMobiAdRequestStatus;
                    S9 s93 = mResponse.f32602d;
                    String str = s93 != null ? s93.f32267b : null;
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                        break;
                    }
                    break;
                case 3:
                    this.f32414b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.f32414b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    break;
                case 9:
                    this.f32414b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    break;
                default:
                    this.f32414b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    break;
            }
        }
    }
}
