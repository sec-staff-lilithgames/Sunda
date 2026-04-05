package fp;

import com.inmobi.commons.core.configs.AdConfig;
import io.bidmachine.media3.common.util.m0;
import java.util.Arrays;
import ko.g0;
import ko.i0;
import ko.k0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends k {

    /* renamed from: n, reason: collision with root package name */
    public k0 f55947n;

    /* renamed from: o, reason: collision with root package name */
    public c f55948o;

    public static boolean verifyBitstreamType(m0 m0Var) {
        return m0Var.bytesLeft() >= 5 && m0Var.readUnsignedByte() == 127 && m0Var.readUnsignedInt() == 1179402563;
    }

    @Override // fp.k
    public final long b(m0 m0Var) {
        if (m0Var.getData()[0] != -1) {
            return -1L;
        }
        int i10 = (m0Var.getData()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6 || i10 == 7) {
            m0Var.skipBytes(4);
            m0Var.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = g0.readFrameBlockSizeSamplesFromKey(m0Var, i10);
        m0Var.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    @Override // fp.k
    public final boolean c(m0 m0Var, long j10, androidx.localbroadcastmanager.content.b bVar) {
        byte[] data = m0Var.getData();
        k0 k0Var = this.f55947n;
        if (k0Var == null) {
            k0 k0Var2 = new k0(data, 17);
            this.f55947n = k0Var2;
            bVar.f6756a = k0Var2.getFormat(Arrays.copyOfRange(data, 9, m0Var.limit()), null).buildUpon().setContainerMimeType("audio/ogg").build();
            return true;
        }
        byte b10 = data[0];
        if ((b10 & AbstractJsonLexerKt.TC_INVALID) == 3) {
            k0.a seekTableMetadataBlock = i0.readSeekTableMetadataBlock(m0Var);
            k0 k0VarCopyWithSeekTable = k0Var.copyWithSeekTable(seekTableMetadataBlock);
            this.f55947n = k0VarCopyWithSeekTable;
            this.f55948o = new c(k0VarCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        c cVar = this.f55948o;
        if (cVar != null) {
            cVar.setFirstFrameOffset(j10);
            bVar.f6757b = this.f55948o;
        }
        io.bidmachine.media3.common.util.a.checkNotNull((io.bidmachine.media3.common.b) bVar.f6756a);
        return false;
    }

    @Override // fp.k
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f55947n = null;
            this.f55948o = null;
        }
    }
}
