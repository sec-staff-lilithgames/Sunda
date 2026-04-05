package io.ktor.utils.io.internal;

import io.ktor.utils.io.ClosedWriteChannelException;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ClosedElement {
    public static final Companion Companion = new Companion(null);
    private static final ClosedElement EmptyCause = new ClosedElement(null);
    private final Throwable cause;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ClosedElement getEmptyCause() {
            return ClosedElement.EmptyCause;
        }

        private Companion() {
        }
    }

    public ClosedElement(Throwable th2) {
        this.cause = th2;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final Throwable getSendException() {
        Throwable th2 = this.cause;
        return th2 == null ? new ClosedWriteChannelException("The channel was closed") : th2;
    }

    public String toString() {
        return "Closed[" + getSendException() + AbstractJsonLexerKt.END_LIST;
    }
}
