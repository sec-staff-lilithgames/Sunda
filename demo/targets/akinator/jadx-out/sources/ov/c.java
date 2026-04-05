package ov;

import java.util.Random;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final b f79856e = new b();

    @Override // ov.a
    public Random getImpl() {
        Object obj = this.f79856e.get();
        e0.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
