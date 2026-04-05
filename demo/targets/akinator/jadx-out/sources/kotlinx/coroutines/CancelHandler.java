package kotlinx.coroutines;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CancelHandler extends NotCompleted {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UserSupplied implements CancelHandler {
        private final l handler;

        public UserSupplied(l lVar) {
            this.handler = lVar;
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(Throwable th2) {
            this.handler.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + DebugStringsKt.getClassSimpleName(this.handler) + '@' + DebugStringsKt.getHexAddress(this) + AbstractJsonLexerKt.END_LIST;
        }
    }

    void invoke(Throwable th2);
}
