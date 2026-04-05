package a0;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {
    public final <T> T synchronizedImpl(kv.a block) {
        T t10;
        e0.checkNotNullParameter(block, "block");
        synchronized (this) {
            try {
                t10 = (T) block.invoke();
                b0.finallyStart(1);
            } catch (Throwable th2) {
                b0.finallyStart(1);
                b0.finallyEnd(1);
                throw th2;
            }
        }
        b0.finallyEnd(1);
        return t10;
    }
}
