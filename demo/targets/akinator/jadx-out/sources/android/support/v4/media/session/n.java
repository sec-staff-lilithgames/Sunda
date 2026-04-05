package android.support.v4.media.session;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends m {
    @Override // android.support.v4.media.session.m, android.support.v4.media.session.k
    public Bundle getSessionInfo() {
        if (this.f4612e != null) {
            return new Bundle(this.f4612e);
        }
        Bundle sessionInfo = this.f4608a.getSessionInfo();
        this.f4612e = sessionInfo;
        Bundle bundleUnparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(sessionInfo);
        this.f4612e = bundleUnparcelWithClassLoader;
        return bundleUnparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.f4612e);
    }
}
