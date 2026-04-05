package io;

import android.content.Context;
import gn.f2;
import gn.g2;
import gn.h2;
import gn.i2;
import java.util.concurrent.Executor;
import mh.e3;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final v2 f68185a = e3.memoize(new com.google.android.exoplayer2.w(1));

    @Override // gn.g2
    public i2 create(Context context, gn.p pVar, gn.n nVar, boolean z10, Executor executor, h2 h2Var) throws f2 {
        ((q) ((g2) f68185a.get())).create(context, pVar, nVar, z10, executor, h2Var);
        return null;
    }
}
