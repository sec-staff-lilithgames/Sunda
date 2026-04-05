package android.support.v4.media.session;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends s {
    @Override // android.support.v4.media.session.q, android.support.v4.media.session.p
    public void setPlaybackSpeed(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        this.f4619a.setPlaybackSpeed(f10);
    }
}
