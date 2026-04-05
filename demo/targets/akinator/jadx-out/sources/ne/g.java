package ne;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;
import ee.q;
import ee.t;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f76030a;

    /* renamed from: b, reason: collision with root package name */
    public long f76031b;

    /* renamed from: c, reason: collision with root package name */
    public int f76032c;

    /* renamed from: d, reason: collision with root package name */
    public int f76033d;

    /* renamed from: e, reason: collision with root package name */
    public int f76034e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f76035f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final v0 f76036g = new v0(255);

    public boolean populate(q qVar, boolean z10) throws IOException {
        reset();
        v0 v0Var = this.f76036g;
        v0Var.reset(27);
        if (t.peekFullyQuietly(qVar, v0Var.getData(), 0, 27, z10) && v0Var.readUnsignedInt() == 1332176723) {
            if (v0Var.readUnsignedByte() == 0) {
                this.f76030a = v0Var.readUnsignedByte();
                this.f76031b = v0Var.readLittleEndianLong();
                v0Var.readLittleEndianUnsignedInt();
                v0Var.readLittleEndianUnsignedInt();
                v0Var.readLittleEndianUnsignedInt();
                int unsignedByte = v0Var.readUnsignedByte();
                this.f76032c = unsignedByte;
                this.f76033d = unsignedByte + 27;
                v0Var.reset(unsignedByte);
                if (t.peekFullyQuietly(qVar, v0Var.getData(), 0, this.f76032c, z10)) {
                    for (int i10 = 0; i10 < this.f76032c; i10++) {
                        int unsignedByte2 = v0Var.readUnsignedByte();
                        this.f76035f[i10] = unsignedByte2;
                        this.f76034e += unsignedByte2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw h2.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
        }
        return false;
    }

    public void reset() {
        this.f76030a = 0;
        this.f76031b = 0L;
        this.f76032c = 0;
        this.f76033d = 0;
        this.f76034e = 0;
    }

    public boolean skipToNextPage(q qVar) throws IOException {
        return skipToNextPage(qVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r11 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r10.getPosition() >= r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r10.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean skipToNextPage(ee.q r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r10.getPosition()
            long r2 = r10.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.exoplayer2.util.a.checkArgument(r0)
            com.google.android.exoplayer2.util.v0 r0 = r9.f76036g
            r3 = 4
            r0.reset(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2b
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4b
        L2b:
            byte[] r5 = r0.getData()
            boolean r5 = ee.t.peekFullyQuietly(r10, r5, r1, r3, r2)
            if (r5 == 0) goto L4b
            r0.setPosition(r1)
            long r4 = r0.readUnsignedInt()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L47
            r10.resetPeekPosition()
            return r2
        L47:
            r10.skipFully(r2)
            goto L1a
        L4b:
            if (r4 == 0) goto L55
            long r5 = r10.getPosition()
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L55:
            int r0 = r10.skip(r2)
            r3 = -1
            if (r0 == r3) goto L5d
            goto L4b
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.g.skipToNextPage(ee.q, long):boolean");
    }
}
