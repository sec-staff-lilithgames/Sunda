package gv;

import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p extends o {
    public static final j walk(File file, l direction) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(direction, "direction");
        return new j(file, direction);
    }

    public static /* synthetic */ j walk$default(File file, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f58499b;
        }
        return walk(file, lVar);
    }

    public static final j walkBottomUp(File file) {
        e0.checkNotNullParameter(file, "<this>");
        return walk(file, l.f58500c);
    }

    public static j walkTopDown(File file) {
        e0.checkNotNullParameter(file, "<this>");
        return walk(file, l.f58499b);
    }
}
