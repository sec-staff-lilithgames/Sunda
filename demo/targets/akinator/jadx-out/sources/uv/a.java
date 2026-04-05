package uv;

import j$.time.Instant;
import kotlin.jvm.internal.e0;
import tv.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {
    public static final Instant toJavaInstant(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(nVar.getEpochSeconds(), nVar.getNanosecondsOfSecond());
        e0.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    public static final n toKotlinInstant(Instant instant) {
        e0.checkNotNullParameter(instant, "<this>");
        return n.f87449e.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }
}
