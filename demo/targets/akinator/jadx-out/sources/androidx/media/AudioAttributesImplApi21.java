package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f6765a;

    /* renamed from: b, reason: collision with root package name */
    public int f6766b = -1;

    public AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f6765a.equals(((AudioAttributesImplApi21) obj).f6765a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return this.f6765a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f6765a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f6765a.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i10 = this.f6766b;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(getFlags(), getUsage(), false);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.f6766b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.f6765a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return AudioAttributesCompat.a(getFlags(), getUsage(), true);
    }

    public int hashCode() {
        return this.f6765a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f6765a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f6765a = audioAttributes;
    }
}
