package bq;

import android.content.Context;
import br.h0;
import dq.g;
import io.bidmachine.rendering.ad.fullscreen.FullScreenActivity;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static e f9724a;

    public static final void startActivity(e eVar, Context context) {
        e0.checkNotNullParameter(eVar, "<this>");
        e0.checkNotNullParameter(context, "context");
        try {
            f9724a = eVar;
            context.startActivity(g.a(context, FullScreenActivity.class));
        } catch (Throwable unused) {
            f9724a = null;
            eVar.notifyAdFailToShow(new h0("Ad is null"));
        }
    }
}
