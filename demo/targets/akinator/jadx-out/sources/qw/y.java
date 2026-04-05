package qw;

import java.util.GregorianCalendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f83635a = new byte[0];

    public static final long datePartsToEpochMillis(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int getDEFAULT_COMPRESSION() {
        return -1;
    }

    public static final byte[] getEMPTY_BYTE_ARRAY() {
        return f83635a;
    }
}
