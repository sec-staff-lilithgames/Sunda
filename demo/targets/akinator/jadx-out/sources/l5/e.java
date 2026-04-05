package l5;

import android.content.Context;
import j1.u;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) u.l());
        e0.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
        super(u.b(systemService));
    }
}
