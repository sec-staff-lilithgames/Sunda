package io.odeeo.internal.o;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.g.m;
import io.odeeo.internal.g.n;
import io.odeeo.internal.g.o;
import io.odeeo.internal.g.p;
import io.odeeo.internal.g.v;
import io.odeeo.internal.o.h;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends h {

    /* renamed from: n, reason: collision with root package name */
    public p f65117n;

    /* renamed from: o, reason: collision with root package name */
    public a f65118o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public p f65119a;

        /* renamed from: b, reason: collision with root package name */
        public p.a f65120b;

        /* renamed from: c, reason: collision with root package name */
        public long f65121c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f65122d = -1;

        public a(p pVar, p.a aVar) {
            this.f65119a = pVar;
            this.f65120b = aVar;
        }

        @Override // io.odeeo.internal.o.f
        public v createSeekMap() {
            io.odeeo.internal.q0.a.checkState(this.f65121c != -1);
            return new o(this.f65119a, this.f65121c);
        }

        @Override // io.odeeo.internal.o.f
        public long read(io.odeeo.internal.g.i iVar) {
            long j10 = this.f65122d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f65122d = -1L;
            return j11;
        }

        public void setFirstFrameOffset(long j10) {
            this.f65121c = j10;
        }

        @Override // io.odeeo.internal.o.f
        public void startSeek(long j10) {
            long[] jArr = this.f65120b.f64160a;
            this.f65122d = jArr[g0.binarySearchFloor(jArr, j10, true, true)];
        }
    }

    public static boolean verifyBitstreamType(x xVar) {
        return xVar.bytesLeft() >= 5 && xVar.readUnsignedByte() == 127 && xVar.readUnsignedInt() == 1179402563;
    }

    @Override // io.odeeo.internal.o.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f65117n = null;
            this.f65118o = null;
        }
    }

    public final int b(x xVar) {
        int i10 = (xVar.getData()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6 || i10 == 7) {
            xVar.skipBytes(4);
            xVar.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = m.readFrameBlockSizeSamplesFromKey(xVar, i10);
        xVar.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    public static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // io.odeeo.internal.o.h
    public long a(x xVar) {
        if (a(xVar.getData())) {
            return b(xVar);
        }
        return -1L;
    }

    @Override // io.odeeo.internal.o.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean a(x xVar, long j10, h.b bVar) {
        byte[] data = xVar.getData();
        p pVar = this.f65117n;
        if (pVar == null) {
            p pVar2 = new p(data, 17);
            this.f65117n = pVar2;
            bVar.f65158a = pVar2.getFormat(Arrays.copyOfRange(data, 9, xVar.limit()), null);
            return true;
        }
        if ((data[0] & AbstractJsonLexerKt.TC_INVALID) == 3) {
            p.a seekTableMetadataBlock = n.readSeekTableMetadataBlock(xVar);
            p pVarCopyWithSeekTable = pVar.copyWithSeekTable(seekTableMetadataBlock);
            this.f65117n = pVarCopyWithSeekTable;
            this.f65118o = new a(pVarCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!a(data)) {
            return true;
        }
        a aVar = this.f65118o;
        if (aVar != null) {
            aVar.setFirstFrameOffset(j10);
            bVar.f65159b = this.f65118o;
        }
        io.odeeo.internal.q0.a.checkNotNull(bVar.f65158a);
        return false;
    }
}
