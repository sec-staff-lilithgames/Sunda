package sf;

import com.google.android.exoplayer2.util.v0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85621a;

    public c(String str) {
        this.f85621a = str;
    }

    public static c parse(v0 v0Var) {
        String str;
        v0Var.skipBytes(2);
        int unsignedByte = v0Var.readUnsignedByte();
        int i10 = unsignedByte >> 1;
        int unsignedByte2 = ((v0Var.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        return new c(o2.l(unsignedByte2, unsignedByte2 >= 10 ? "." : ".0", sb2));
    }
}
