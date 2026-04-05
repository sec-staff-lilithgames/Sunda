package ne;

import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import com.inmobi.commons.core.configs.AdConfig;
import ee.a0;
import ee.w;
import ee.y;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends k {

    /* renamed from: n, reason: collision with root package name */
    public a0 f76020n;

    /* renamed from: o, reason: collision with root package name */
    public c f76021o;

    public static boolean verifyBitstreamType(v0 v0Var) {
        return v0Var.bytesLeft() >= 5 && v0Var.readUnsignedByte() == 127 && v0Var.readUnsignedInt() == 1179402563;
    }

    @Override // ne.k
    public final long b(v0 v0Var) {
        if (v0Var.getData()[0] != -1) {
            return -1L;
        }
        int i10 = (v0Var.getData()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6 || i10 == 7) {
            v0Var.skipBytes(4);
            v0Var.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = w.readFrameBlockSizeSamplesFromKey(v0Var, i10);
        v0Var.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    @Override // ne.k
    public final boolean c(v0 v0Var, long j10, androidx.localbroadcastmanager.content.b bVar) {
        byte[] data = v0Var.getData();
        a0 a0Var = this.f76020n;
        if (a0Var == null) {
            a0 a0Var2 = new a0(data, 17);
            this.f76020n = a0Var2;
            bVar.f6756a = a0Var2.getFormat(Arrays.copyOfRange(data, 9, v0Var.limit()), null);
            return true;
        }
        byte b10 = data[0];
        if ((b10 & AbstractJsonLexerKt.TC_INVALID) == 3) {
            a0.a seekTableMetadataBlock = y.readSeekTableMetadataBlock(v0Var);
            a0 a0VarCopyWithSeekTable = a0Var.copyWithSeekTable(seekTableMetadataBlock);
            this.f76020n = a0VarCopyWithSeekTable;
            this.f76021o = new c(a0VarCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        c cVar = this.f76021o;
        if (cVar != null) {
            cVar.setFirstFrameOffset(j10);
            bVar.f6757b = this.f76021o;
        }
        com.google.android.exoplayer2.util.a.checkNotNull((z0) bVar.f6756a);
        return false;
    }

    @Override // ne.k
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f76020n = null;
            this.f76021o = null;
        }
    }
}
