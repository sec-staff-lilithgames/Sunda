package uo;

import gn.u0;
import io.bidmachine.media3.common.util.l0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import to.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends c {
    @Override // to.c
    public final u0 a(to.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            l0 l0Var = new l0(byteBuffer.array(), byteBuffer.limit());
            l0Var.skipBits(12);
            int bytePosition = (l0Var.getBytePosition() + l0Var.readBits(12)) - 4;
            l0Var.skipBits(44);
            l0Var.skipBytes(l0Var.readBits(12));
            l0Var.skipBits(16);
            ArrayList arrayList = new ArrayList();
            while (l0Var.getBytePosition() < bytePosition) {
                l0Var.skipBits(48);
                int bits = l0Var.readBits(8);
                l0Var.skipBits(4);
                int bytePosition2 = l0Var.getBytePosition() + l0Var.readBits(12);
                String bytesAsString = null;
                String bytesAsString2 = null;
                while (l0Var.getBytePosition() < bytePosition2) {
                    int bits2 = l0Var.readBits(8);
                    int bits3 = l0Var.readBits(8);
                    int bytePosition3 = l0Var.getBytePosition() + bits3;
                    if (bits2 == 2) {
                        int bits4 = l0Var.readBits(16);
                        l0Var.skipBits(8);
                        if (bits4 == 3) {
                            while (l0Var.getBytePosition() < bytePosition3) {
                                bytesAsString = l0Var.readBytesAsString(l0Var.readBits(8), StandardCharsets.US_ASCII);
                                int bits5 = l0Var.readBits(8);
                                for (int i10 = 0; i10 < bits5; i10++) {
                                    l0Var.skipBytes(l0Var.readBits(8));
                                }
                            }
                        }
                    } else if (bits2 == 21) {
                        bytesAsString2 = l0Var.readBytesAsString(bits3, StandardCharsets.US_ASCII);
                    }
                    l0Var.setPosition(bytePosition3 * 8);
                }
                l0Var.setPosition(bytePosition2 * 8);
                if (bytesAsString != null && bytesAsString2 != null) {
                    arrayList.add(new a(bits, bytesAsString.concat(bytesAsString2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new u0(arrayList);
            }
        }
        return null;
    }
}
