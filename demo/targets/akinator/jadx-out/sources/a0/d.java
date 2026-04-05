package a0;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class d {
    public static final void checkPrecondition(boolean z10, kv.a lazyMessage) {
        e0.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        throwIllegalStateException((String) lazyMessage.invoke());
    }

    public static final void throwIllegalArgumentException(String message) {
        e0.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void throwIllegalStateException(String message) {
        e0.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void throwIndexOutOfBoundsException(String message) {
        e0.checkNotNullParameter(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void throwNoSuchElementException(String message) {
        e0.checkNotNullParameter(message, "message");
        throw new NoSuchElementException(message);
    }

    public static final Void throwNoSuchElementExceptionForInline(String message) {
        e0.checkNotNullParameter(message, "message");
        throw new NoSuchElementException(message);
    }

    public static final void requirePrecondition(boolean z10, kv.a aVar) {
        e0.checkNotNullParameter(aVar, SUvoXnn.VNS);
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) aVar.invoke());
    }
}
