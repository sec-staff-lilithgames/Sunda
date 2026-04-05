package ee;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.v0;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f54179a = new v0(10);

    public Metadata peekId3Data(q qVar, we.g gVar) throws Throwable {
        v0 v0Var = this.f54179a;
        Metadata metadataDecode = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.peekFully(v0Var.getData(), 0, 10);
                v0Var.setPosition(0);
                if (v0Var.readUnsignedInt24() != 4801587) {
                    break;
                }
                v0Var.skipBytes(3);
                int synchSafeInt = v0Var.readSynchSafeInt();
                int i11 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(v0Var.getData(), 0, bArr, 0, 10);
                    qVar.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new we.h(gVar).decode(bArr, i11);
                } else {
                    qVar.advancePeekPosition(synchSafeInt);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        return metadataDecode;
    }
}
