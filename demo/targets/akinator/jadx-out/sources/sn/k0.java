package sn;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class k0 implements g0 {
    @Override // sn.g0
    public final i0 acquireExoMediaDrm(UUID uuid) {
        try {
            return m0.newInstance(uuid);
        } catch (r0 unused) {
            io.bidmachine.media3.common.util.b0.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new z();
        }
    }
}
