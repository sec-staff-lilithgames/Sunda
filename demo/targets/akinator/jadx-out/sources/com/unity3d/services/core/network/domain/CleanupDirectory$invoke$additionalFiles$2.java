package com.unity3d.services.core.network.domain;

import ao.kwoC.zAQQWzBxnS;
import java.io.File;
import java.util.Collection;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import tu.v;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CleanupDirectory$invoke$additionalFiles$2 extends f0 implements p {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    public CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // kv.p
    public final v invoke(v vVar, File file) {
        e0.checkNotNullParameter(vVar, "<name for destructuring parameter 0>");
        e0.checkNotNullParameter(file, zAQQWzBxnS.LPl);
        return tu.e0.to(Long.valueOf(((Number) vVar.component1()).longValue() - file.length()), y0.plus((Collection<? extends File>) vVar.component2(), file));
    }
}
