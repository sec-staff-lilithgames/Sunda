package fp;

import gn.z0;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import ko.a0;
import ko.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f55957a;

    /* renamed from: b, reason: collision with root package name */
    public long f55958b;

    /* renamed from: c, reason: collision with root package name */
    public int f55959c;

    /* renamed from: d, reason: collision with root package name */
    public int f55960d;

    /* renamed from: e, reason: collision with root package name */
    public int f55961e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f55962f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final m0 f55963g = new m0(255);

    public boolean populate(a0 a0Var, boolean z10) throws IOException {
        reset();
        m0 m0Var = this.f55963g;
        m0Var.reset(27);
        if (d0.peekFullyQuietly(a0Var, m0Var.getData(), 0, 27, z10) && m0Var.readUnsignedInt() == 1332176723) {
            if (m0Var.readUnsignedByte() == 0) {
                this.f55957a = m0Var.readUnsignedByte();
                this.f55958b = m0Var.readLittleEndianLong();
                m0Var.readLittleEndianUnsignedInt();
                m0Var.readLittleEndianUnsignedInt();
                m0Var.readLittleEndianUnsignedInt();
                int unsignedByte = m0Var.readUnsignedByte();
                this.f55959c = unsignedByte;
                this.f55960d = unsignedByte + 27;
                m0Var.reset(unsignedByte);
                if (d0.peekFullyQuietly(a0Var, m0Var.getData(), 0, this.f55959c, z10)) {
                    for (int i10 = 0; i10 < this.f55959c; i10++) {
                        int unsignedByte2 = m0Var.readUnsignedByte();
                        this.f55962f[i10] = unsignedByte2;
                        this.f55961e += unsignedByte2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw z0.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
        }
        return false;
    }

    public void reset() {
        this.f55957a = 0;
        this.f55958b = 0L;
        this.f55959c = 0;
        this.f55960d = 0;
        this.f55961e = 0;
    }

    public boolean skipToNextPage(a0 a0Var) throws IOException {
        return skipToNextPage(a0Var, -1L);
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
    public boolean skipToNextPage(ko.a0 r10, long r11) throws java.io.IOException {
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
            io.bidmachine.media3.common.util.a.checkArgument(r0)
            io.bidmachine.media3.common.util.m0 r0 = r9.f55963g
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
            boolean r5 = ko.d0.peekFullyQuietly(r10, r5, r1, r3, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: fp.g.skipToNextPage(ko.a0, long):boolean");
    }
}
