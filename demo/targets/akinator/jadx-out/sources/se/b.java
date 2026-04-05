package se;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import mh.h0;
import re.e;
import re.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends g {
    @Override // re.g
    public final Metadata a(e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            u0 u0Var = new u0(byteBuffer.array(), byteBuffer.limit());
            u0Var.skipBits(12);
            int bytePosition = (u0Var.getBytePosition() + u0Var.readBits(12)) - 4;
            u0Var.skipBits(44);
            u0Var.skipBytes(u0Var.readBits(12));
            u0Var.skipBits(16);
            ArrayList arrayList = new ArrayList();
            while (u0Var.getBytePosition() < bytePosition) {
                u0Var.skipBits(48);
                int bits = u0Var.readBits(8);
                u0Var.skipBits(4);
                int bytePosition2 = u0Var.getBytePosition() + u0Var.readBits(12);
                String bytesAsString = null;
                String bytesAsString2 = null;
                while (u0Var.getBytePosition() < bytePosition2) {
                    int bits2 = u0Var.readBits(8);
                    int bits3 = u0Var.readBits(8);
                    int bytePosition3 = u0Var.getBytePosition() + bits3;
                    if (bits2 == 2) {
                        int bits4 = u0Var.readBits(16);
                        u0Var.skipBits(8);
                        if (bits4 == 3) {
                            while (u0Var.getBytePosition() < bytePosition3) {
                                bytesAsString = u0Var.readBytesAsString(u0Var.readBits(8), h0.f74626a);
                                int bits5 = u0Var.readBits(8);
                                for (int i10 = 0; i10 < bits5; i10++) {
                                    u0Var.skipBytes(u0Var.readBits(8));
                                }
                            }
                        }
                    } else if (bits2 == 21) {
                        bytesAsString2 = u0Var.readBytesAsString(bits3, h0.f74626a);
                    }
                    u0Var.setPosition(bytePosition3 * 8);
                }
                u0Var.setPosition(bytePosition2 * 8);
                if (bytesAsString != null && bytesAsString2 != null) {
                    arrayList.add(new AppInfoTable(bits, bytesAsString.concat(bytesAsString2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}
