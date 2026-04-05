package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public AudioManager f61569a;

    /* renamed from: b, reason: collision with root package name */
    public t f61570b;

    /* renamed from: c, reason: collision with root package name */
    public io.bidmachine.media3.common.util.e f61571c;

    public final boolean a() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61569a)).getDevices(2)) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                return true;
            }
            int i10 = io.bidmachine.media3.common.util.a1.f60679a;
            if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                return true;
            }
            if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                return true;
            }
            if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                return true;
            }
            if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void disable() {
        ((io.bidmachine.media3.common.util.e) io.bidmachine.media3.common.util.a.checkNotNull(this.f61571c)).runInBackground(new c(this, 2));
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void enable(h2 h2Var, Context context, Looper looper, Looper looper2, io.bidmachine.media3.common.util.g gVar) {
        io.bidmachine.media3.common.util.e eVar = new io.bidmachine.media3.common.util.e(Boolean.TRUE, looper2, looper, gVar, new s(h2Var, 0));
        this.f61571c = eVar;
        eVar.runInBackground(new im.k(7, this, context));
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isSelectedOutputSuitableForPlayback() {
        io.bidmachine.media3.common.util.e eVar = this.f61571c;
        if (eVar == null) {
            return true;
        }
        return ((Boolean) eVar.get()).booleanValue();
    }
}
