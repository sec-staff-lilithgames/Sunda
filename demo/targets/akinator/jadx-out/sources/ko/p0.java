package ko;

import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f71729a = new io.bidmachine.media3.common.util.m0(10);

    public gn.u0 peekId3Data(a0 a0Var, yo.g gVar) throws Throwable {
        io.bidmachine.media3.common.util.m0 m0Var = this.f71729a;
        gn.u0 u0VarDecode = null;
        int i10 = 0;
        while (true) {
            try {
                a0Var.peekFully(m0Var.getData(), 0, 10);
                m0Var.setPosition(0);
                if (m0Var.readUnsignedInt24() != 4801587) {
                    break;
                }
                m0Var.skipBytes(3);
                int synchSafeInt = m0Var.readSynchSafeInt();
                int i11 = synchSafeInt + 10;
                if (u0VarDecode == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(m0Var.getData(), 0, bArr, 0, 10);
                    a0Var.peekFully(bArr, 10, synchSafeInt);
                    u0VarDecode = new yo.h(gVar).decode(bArr, i11);
                } else {
                    a0Var.advancePeekPosition(synchSafeInt);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        a0Var.resetPeekPosition();
        a0Var.advancePeekPosition(i10);
        return u0VarDecode;
    }
}
