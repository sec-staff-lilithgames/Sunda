package io.odeeo.internal.r0;

import io.odeeo.internal.q0.x;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f66136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66137b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66138c;

    public c(int i10, int i11, String str) {
        this.f66136a = i10;
        this.f66137b = i11;
        this.f66138c = str;
    }

    public static c parse(x xVar) {
        String str;
        xVar.skipBytes(2);
        int unsignedByte = xVar.readUnsignedByte();
        int i10 = unsignedByte >> 1;
        int unsignedByte2 = ((xVar.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
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
        return new c(i10, unsignedByte2, o2.l(unsignedByte2, unsignedByte2 >= 10 ? "." : ".0", sb2));
    }
}
