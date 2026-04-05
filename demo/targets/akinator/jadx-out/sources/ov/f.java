package ov;

import java.util.Random;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f {
    public static final Random asJavaRandom(g gVar) {
        Random impl;
        e0.checkNotNullParameter(gVar, "<this>");
        a aVar = gVar instanceof a ? (a) gVar : null;
        return (aVar == null || (impl = aVar.getImpl()) == null) ? new d(gVar) : impl;
    }

    public static final g asKotlinRandom(Random random) {
        g impl;
        e0.checkNotNullParameter(random, "<this>");
        d dVar = random instanceof d ? (d) random : null;
        return (dVar == null || (impl = dVar.getImpl()) == null) ? new e(random) : impl;
    }

    public static final double doubleFromParts(int i10, int i11) {
        return ((i10 << 27) + i11) / 9.007199254740992E15d;
    }
}
