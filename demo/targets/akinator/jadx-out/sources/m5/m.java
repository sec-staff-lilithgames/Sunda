package m5;

import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends p {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) li.a.e());
        e0.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(li.a.d(systemService));
    }
}
