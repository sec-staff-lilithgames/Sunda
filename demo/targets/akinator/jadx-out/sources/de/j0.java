package de;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class j0 implements f0 {
    @Override // de.f0
    public final com.google.android.exoplayer2.drm.e acquireExoMediaDrm(UUID uuid) {
        try {
            return com.google.android.exoplayer2.drm.f.newInstance(uuid);
        } catch (r0 unused) {
            com.google.android.exoplayer2.util.f0.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new com.google.android.exoplayer2.drm.d();
        }
    }
}
