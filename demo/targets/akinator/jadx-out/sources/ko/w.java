package ko;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f71791a;

    public w(String str) {
        this.f71791a = str;
    }

    public static w parse(io.bidmachine.media3.common.util.m0 m0Var) {
        String str;
        m0Var.skipBytes(2);
        int unsignedByte = m0Var.readUnsignedByte();
        int i10 = unsignedByte >> 1;
        int unsignedByte2 = ((m0Var.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbU = o2.u(str);
        sbU.append(i10 < 10 ? ".0" : ".");
        sbU.append(i10);
        return new w(o2.l(unsignedByte2, unsignedByte2 < 10 ? ".0" : ".", sbU));
    }
}
