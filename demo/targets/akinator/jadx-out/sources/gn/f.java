package gn;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f57876a;

    public f(h hVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(hVar.f57898a).setFlags(hVar.f57899b).setUsage(hVar.f57900c);
        int i10 = io.bidmachine.media3.common.util.a1.f60679a;
        if (i10 >= 29) {
            d.setAllowedCapturePolicy(usage, hVar.f57901d);
        }
        if (i10 >= 32) {
            e.setSpatializationBehavior(usage, hVar.f57902e);
        }
        this.f57876a = usage.build();
    }
}
