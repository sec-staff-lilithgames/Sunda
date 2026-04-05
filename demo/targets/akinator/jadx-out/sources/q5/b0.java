package q5;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b0 {
    public static final <T> T runBlockingUninterruptible(kv.p block) {
        e0.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) BuildersKt__BuildersKt.runBlocking$default(null, new a0(block, null), 1, null);
    }
}
