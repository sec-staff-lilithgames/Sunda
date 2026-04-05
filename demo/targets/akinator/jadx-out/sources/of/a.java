package of;

import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import ef.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import of.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends ef.i {

    /* renamed from: n, reason: collision with root package name */
    public final v0 f79325n;

    public a() {
        super("Mp4WebvttDecoder");
        this.f79325n = new v0();
    }

    @Override // ef.i
    public final ef.j c(byte[] bArr, int i10, boolean z10) throws l {
        ef.b bVarBuild;
        v0 v0Var = this.f79325n;
        v0Var.reset(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (v0Var.bytesLeft() > 0) {
            if (v0Var.bytesLeft() < 8) {
                throw new l("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i11 = v0Var.readInt();
            if (v0Var.readInt() == 1987343459) {
                int i12 = i11 - 8;
                CharSequence charSequenceF = null;
                ef.a cueBuilder = null;
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new l("Incomplete vtt cue box header found.");
                    }
                    int i13 = v0Var.readInt();
                    int i14 = v0Var.readInt();
                    int i15 = i13 - 8;
                    String strFromUtf8Bytes = n1.fromUtf8Bytes(v0Var.getData(), v0Var.getPosition(), i15);
                    v0Var.skipBytes(i15);
                    i12 = (i12 - 8) - i15;
                    if (i14 == 1937011815) {
                        Pattern pattern = h.f79358a;
                        h.b bVar = new h.b();
                        h.e(strFromUtf8Bytes, bVar);
                        cueBuilder = bVar.toCueBuilder();
                    } else if (i14 == 1885436268) {
                        charSequenceF = h.f(null, strFromUtf8Bytes.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (cueBuilder != null) {
                    bVarBuild = cueBuilder.setText(charSequenceF).build();
                } else {
                    Pattern pattern2 = h.f79358a;
                    h.b bVar2 = new h.b();
                    bVar2.f79366c = charSequenceF;
                    bVarBuild = bVar2.toCueBuilder().build();
                }
                arrayList.add(bVarBuild);
            } else {
                v0Var.skipBytes(i11 - 8);
            }
        }
        return new b(arrayList);
    }
}
