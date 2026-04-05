package cc;

import java.io.Serializable;
import java.util.Arrays;
import ub.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e implements Serializable {
    public static int[] standardAsciiEscapesForJSON() {
        int[] iArr = d.get7BitOutputEscapes();
        return Arrays.copyOf(iArr, iArr.length);
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract c0 getEscapeSequence(int i10);
}
