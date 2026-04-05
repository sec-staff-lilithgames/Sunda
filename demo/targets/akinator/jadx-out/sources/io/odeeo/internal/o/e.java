package io.odeeo.internal.o;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.k;
import io.odeeo.internal.q0.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f65132a;

    /* renamed from: b, reason: collision with root package name */
    public int f65133b;

    /* renamed from: c, reason: collision with root package name */
    public long f65134c;

    /* renamed from: d, reason: collision with root package name */
    public long f65135d;

    /* renamed from: e, reason: collision with root package name */
    public long f65136e;

    /* renamed from: f, reason: collision with root package name */
    public long f65137f;

    /* renamed from: g, reason: collision with root package name */
    public int f65138g;

    /* renamed from: h, reason: collision with root package name */
    public int f65139h;

    /* renamed from: i, reason: collision with root package name */
    public int f65140i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f65141j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    public final x f65142k = new x(255);

    public boolean populate(io.odeeo.internal.g.i iVar, boolean z10) throws IOException {
        reset();
        this.f65142k.reset(27);
        if (!k.peekFullyQuietly(iVar, this.f65142k.getData(), 0, 27, z10) || this.f65142k.readUnsignedInt() != 1332176723) {
            return false;
        }
        int unsignedByte = this.f65142k.readUnsignedByte();
        this.f65132a = unsignedByte;
        if (unsignedByte != 0) {
            if (z10) {
                return false;
            }
            throw g0.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f65133b = this.f65142k.readUnsignedByte();
        this.f65134c = this.f65142k.readLittleEndianLong();
        this.f65135d = this.f65142k.readLittleEndianUnsignedInt();
        this.f65136e = this.f65142k.readLittleEndianUnsignedInt();
        this.f65137f = this.f65142k.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.f65142k.readUnsignedByte();
        this.f65138g = unsignedByte2;
        this.f65139h = unsignedByte2 + 27;
        this.f65142k.reset(unsignedByte2);
        if (!k.peekFullyQuietly(iVar, this.f65142k.getData(), 0, this.f65138g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f65138g; i10++) {
            this.f65141j[i10] = this.f65142k.readUnsignedByte();
            this.f65140i += this.f65141j[i10];
        }
        return true;
    }

    public void reset() {
        this.f65132a = 0;
        this.f65133b = 0;
        this.f65134c = 0L;
        this.f65135d = 0L;
        this.f65136e = 0L;
        this.f65137f = 0L;
        this.f65138g = 0;
        this.f65139h = 0;
        this.f65140i = 0;
    }

    public boolean skipToNextPage(io.odeeo.internal.g.i iVar) throws IOException {
        return skipToNextPage(iVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean skipToNextPage(io.odeeo.internal.g.i r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            io.odeeo.internal.q0.a.checkArgument(r0)
            io.odeeo.internal.q0.x r0 = r8.f65142k
            r3 = 4
            r0.reset(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            io.odeeo.internal.q0.x r4 = r8.f65142k
            byte[] r4 = r4.getData()
            boolean r4 = io.odeeo.internal.g.k.peekFullyQuietly(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            io.odeeo.internal.q0.x r0 = r8.f65142k
            r0.setPosition(r1)
            io.odeeo.internal.q0.x r0 = r8.f65142k
            long r4 = r0.readUnsignedInt()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.resetPeekPosition()
            return r2
        L4d:
            r9.skipFully(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.skip(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.o.e.skipToNextPage(io.odeeo.internal.g.i, long):boolean");
    }
}
