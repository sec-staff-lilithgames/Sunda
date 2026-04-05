package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends r {
    @Override // android.support.v4.media.session.q, android.support.v4.media.session.p
    public void prepare() {
        this.f4619a.prepare();
    }

    @Override // android.support.v4.media.session.q, android.support.v4.media.session.p
    public void prepareFromMediaId(String str, Bundle bundle) {
        this.f4619a.prepareFromMediaId(str, bundle);
    }

    @Override // android.support.v4.media.session.q, android.support.v4.media.session.p
    public void prepareFromSearch(String str, Bundle bundle) {
        this.f4619a.prepareFromSearch(str, bundle);
    }

    @Override // android.support.v4.media.session.q, android.support.v4.media.session.p
    public void prepareFromUri(Uri uri, Bundle bundle) {
        this.f4619a.prepareFromUri(uri, bundle);
    }
}
