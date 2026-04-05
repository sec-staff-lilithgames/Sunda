package qp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import qp.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f83422a = new m0();

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ hp.i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) {
        m0 m0Var = this.f83422a;
        m0Var.reset(bArr, i11 + i10);
        m0Var.setPosition(i10);
        ArrayList arrayList = new ArrayList();
        while (m0Var.bytesLeft() > 0) {
            io.bidmachine.media3.common.util.a.checkArgument(m0Var.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i12 = m0Var.readInt();
            if (m0Var.readInt() == 1987343459) {
                int i13 = i12 - 8;
                CharSequence charSequenceF = null;
                in.a cueBuilder = null;
                while (i13 > 0) {
                    io.bidmachine.media3.common.util.a.checkArgument(i13 >= 8, "Incomplete vtt cue box header found.");
                    int i14 = m0Var.readInt();
                    int i15 = m0Var.readInt();
                    int i16 = i14 - 8;
                    String strFromUtf8Bytes = a1.fromUtf8Bytes(m0Var.getData(), m0Var.getPosition(), i16);
                    m0Var.skipBytes(i16);
                    i13 = (i13 - 8) - i16;
                    if (i15 == 1937011815) {
                        Pattern pattern = g.f83454a;
                        g.b bVar = new g.b();
                        g.e(strFromUtf8Bytes, bVar);
                        cueBuilder = bVar.toCueBuilder();
                    } else if (i15 == 1885436268) {
                        charSequenceF = g.f(null, strFromUtf8Bytes.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                arrayList.add(cueBuilder != null ? cueBuilder.setText(charSequenceF).build() : g.newCueForText(charSequenceF));
            } else {
                m0Var.skipBytes(i12 - 8);
            }
        }
        kVar.accept(new hp.c(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
