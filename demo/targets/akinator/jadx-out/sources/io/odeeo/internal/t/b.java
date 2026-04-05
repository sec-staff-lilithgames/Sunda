package io.odeeo.internal.t;

import io.odeeo.internal.q0.w;
import io.odeeo.internal.s.d;
import io.odeeo.internal.s.g;
import io.odeeo.internal.t0.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends g {
    @Override // io.odeeo.internal.s.g
    public io.odeeo.internal.s.a a(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new w(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    public static io.odeeo.internal.s.a a(w wVar) {
        wVar.skipBits(12);
        int bytePosition = (wVar.getBytePosition() + wVar.readBits(12)) - 4;
        wVar.skipBits(44);
        wVar.skipBytes(wVar.readBits(12));
        wVar.skipBits(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String bytesAsString = null;
            if (wVar.getBytePosition() >= bytePosition) {
                break;
            }
            wVar.skipBits(48);
            int bits = wVar.readBits(8);
            wVar.skipBits(4);
            int bytePosition2 = wVar.getBytePosition() + wVar.readBits(12);
            String bytesAsString2 = null;
            while (wVar.getBytePosition() < bytePosition2) {
                int bits2 = wVar.readBits(8);
                int bits3 = wVar.readBits(8);
                int bytePosition3 = wVar.getBytePosition() + bits3;
                if (bits2 == 2) {
                    int bits4 = wVar.readBits(16);
                    wVar.skipBits(8);
                    if (bits4 == 3) {
                        while (wVar.getBytePosition() < bytePosition3) {
                            bytesAsString = wVar.readBytesAsString(wVar.readBits(8), e.f66404a);
                            int bits5 = wVar.readBits(8);
                            for (int i10 = 0; i10 < bits5; i10++) {
                                wVar.skipBytes(wVar.readBits(8));
                            }
                        }
                    }
                } else if (bits2 == 21) {
                    bytesAsString2 = wVar.readBytesAsString(bits3, e.f66404a);
                }
                wVar.setPosition(bytePosition3 * 8);
            }
            wVar.setPosition(bytePosition2 * 8);
            if (bytesAsString != null && bytesAsString2 != null) {
                arrayList.add(new a(bits, bytesAsString.concat(bytesAsString2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new io.odeeo.internal.s.a(arrayList);
    }
}
