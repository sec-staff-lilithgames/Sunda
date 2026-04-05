package hr;

import io.bidmachine.AdRequestParameters;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface j extends d {
    @Override // hr.d
    /* bridge */ /* synthetic */ default AdRequestParameters getAdRequestParameters() {
        return ((j2) this).getAdRequestParameters();
    }

    @Override // hr.d
    FullScreenAdRequestParameters getAdRequestParameters();

    @Override // hr.d
    /* synthetic */ up.e getDeviceInfo();
}
