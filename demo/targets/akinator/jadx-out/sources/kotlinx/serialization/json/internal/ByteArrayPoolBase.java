package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import uu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class ByteArrayPoolBase {
    private final u arrays = new u();
    private int bytesTotal;

    public final void releaseImpl(byte[] array) {
        e0.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (this.bytesTotal + array.length < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                this.bytesTotal += array.length / 2;
                this.arrays.addLast(array);
            }
        }
    }

    public final byte[] take(int i10) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.arrays.removeLastOrNull();
            if (bArr != null) {
                this.bytesTotal -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i10] : bArr;
    }
}
