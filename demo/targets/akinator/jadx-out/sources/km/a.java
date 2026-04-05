package km;

import android.text.TextUtils;
import vp.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends t {
    @Override // vp.t, vp.o, vp.u
    public boolean hasVideo() {
        return (TextUtils.isEmpty(getVideoAdm()) && TextUtils.isEmpty(getVideoUrl())) ? false : true;
    }
}
