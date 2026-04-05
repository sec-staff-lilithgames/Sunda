package android.support.v4.media.session;

import a2.h4;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends b0 {
    public c0(Object obj) {
        super(obj);
        this.f4626d = ((MediaSession) obj).getController().getSessionInfo();
    }

    @Override // android.support.v4.media.session.z
    public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
        return h4.c(context, str, bundle);
    }
}
