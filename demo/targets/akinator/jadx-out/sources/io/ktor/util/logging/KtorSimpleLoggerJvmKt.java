package io.ktor.util.logging;

import bx.a;
import bx.b;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class KtorSimpleLoggerJvmKt {
    public static final a KtorSimpleLogger(String name) {
        e0.checkNotNullParameter(name, "name");
        a logger = b.getLogger(name);
        e0.checkNotNullExpressionValue(logger, gjnZrsdA.IiHy);
        return logger;
    }
}
