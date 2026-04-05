package android.support.v4.media.session;

import androidx.media.AudioAttributesCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioAttributesCompat f4615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4617d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4618e;

    public o(int i10, AudioAttributesCompat audioAttributesCompat, int i11, int i12, int i13) {
        this.f4614a = i10;
        this.f4615b = audioAttributesCompat;
        this.f4616c = i11;
        this.f4617d = i12;
        this.f4618e = i13;
    }

    public AudioAttributesCompat getAudioAttributes() {
        return this.f4615b;
    }

    @Deprecated
    public int getAudioStream() {
        return this.f4615b.getLegacyStreamType();
    }

    public int getCurrentVolume() {
        return this.f4618e;
    }

    public int getMaxVolume() {
        return this.f4617d;
    }

    public int getPlaybackType() {
        return this.f4614a;
    }

    public int getVolumeControl() {
        return this.f4616c;
    }
}
