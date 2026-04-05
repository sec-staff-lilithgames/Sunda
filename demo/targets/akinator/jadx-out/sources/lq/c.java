package lq;

import android.content.Context;
import dq.d0;
import kotlin.jvm.internal.e0;
import nq.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c {
    public static final b a(Context context, String str) {
        e0.checkNotNullParameter(context, "context");
        if (e0.areEqual(str, "exo")) {
            d0.b("PlayerFactory", "Create player (ExoPlayerImpl)", new Object[0]);
            return new mq.b(context);
        }
        d0.b("PlayerFactory", "Create player (MediaPlayerImpl)", new Object[0]);
        return new f(context);
    }
}
