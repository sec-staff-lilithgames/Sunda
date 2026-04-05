package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import uu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class CharArrayPoolBase {
    private final u arrays = new u();
    private int charsTotal;

    public final void releaseImpl(char[] array) {
        e0.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (this.charsTotal + array.length < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                this.charsTotal += array.length;
                this.arrays.addLast(array);
            }
        }
    }

    public final char[] take(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.arrays.removeLastOrNull();
            if (cArr != null) {
                this.charsTotal -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
