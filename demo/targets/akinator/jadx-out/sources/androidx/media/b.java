package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes.Builder f6789a;

    public b() {
        this.f6789a = new AudioAttributes.Builder();
    }

    @Override // androidx.media.a
    public AudioAttributesImpl build() {
        return new AudioAttributesImplApi21(this.f6789a.build(), 0);
    }

    @Override // androidx.media.a
    public b setContentType(int i10) {
        this.f6789a.setContentType(i10);
        return this;
    }

    @Override // androidx.media.a
    public b setFlags(int i10) {
        this.f6789a.setFlags(i10);
        return this;
    }

    @Override // androidx.media.a
    public b setLegacyStreamType(int i10) {
        this.f6789a.setLegacyStreamType(i10);
        return this;
    }

    @Override // androidx.media.a
    public b setUsage(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        this.f6789a.setUsage(i10);
        return this;
    }

    public b(Object obj) {
        this.f6789a = new AudioAttributes.Builder((AudioAttributes) obj);
    }
}
