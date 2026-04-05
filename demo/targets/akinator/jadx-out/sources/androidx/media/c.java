package androidx.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends b {
    @Override // androidx.media.b, androidx.media.a
    public AudioAttributesImpl build() {
        return new AudioAttributesImplApi26(this.f6789a.build(), 0);
    }

    @Override // androidx.media.b, androidx.media.a
    public c setUsage(int i10) {
        this.f6789a.setUsage(i10);
        return this;
    }
}
