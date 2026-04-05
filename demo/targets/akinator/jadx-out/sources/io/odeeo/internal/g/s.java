package io.odeeo.internal.g;

import io.odeeo.internal.x.g;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f64166a = new io.odeeo.internal.q0.x(10);

    public io.odeeo.internal.s.a peekId3Data(i iVar, g.a aVar) throws IOException {
        io.odeeo.internal.s.a aVarDecode = null;
        int i10 = 0;
        while (true) {
            try {
                iVar.peekFully(this.f64166a.getData(), 0, 10);
                this.f64166a.setPosition(0);
                if (this.f64166a.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.f64166a.skipBytes(3);
                int synchSafeInt = this.f64166a.readSynchSafeInt();
                int i11 = synchSafeInt + 10;
                if (aVarDecode == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f64166a.getData(), 0, bArr, 0, 10);
                    iVar.peekFully(bArr, 10, synchSafeInt);
                    aVarDecode = new io.odeeo.internal.x.g(aVar).decode(bArr, i11);
                } else {
                    iVar.advancePeekPosition(synchSafeInt);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        iVar.resetPeekPosition();
        iVar.advancePeekPosition(i10);
        return aVarDecode;
    }
}
