package a1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3416a = Saver(new n(0), new o(0));

    public static final <Original, Saveable> m Saver(kv.p pVar, kv.l lVar) {
        return new p(pVar, lVar);
    }

    public static final <T> m autoSaver() {
        m mVar = f3416a;
        e0.checkNotNull(mVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return mVar;
    }
}
