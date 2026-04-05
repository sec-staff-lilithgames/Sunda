package io.odeeo.internal.m0;

import io.odeeo.internal.d0.a;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.d0.e {

    /* renamed from: o, reason: collision with root package name */
    public final x f64633o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f64633o = new x();
    }

    @Override // io.odeeo.internal.d0.e
    public io.odeeo.internal.d0.f a(byte[] bArr, int i10, boolean z10) throws io.odeeo.internal.d0.h {
        this.f64633o.reset(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f64633o.bytesLeft() > 0) {
            if (this.f64633o.bytesLeft() < 8) {
                throw new io.odeeo.internal.d0.h("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i11 = this.f64633o.readInt();
            if (this.f64633o.readInt() == 1987343459) {
                arrayList.add(a(this.f64633o, i11 - 8));
            } else {
                this.f64633o.skipBytes(i11 - 8);
            }
        }
        return new b(arrayList);
    }

    public static io.odeeo.internal.d0.a a(x xVar, int i10) throws io.odeeo.internal.d0.h {
        CharSequence charSequenceA = null;
        a.b bVarC = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int i11 = xVar.readInt();
                int i12 = xVar.readInt();
                int i13 = i11 - 8;
                String strFromUtf8Bytes = g0.fromUtf8Bytes(xVar.getData(), xVar.getPosition(), i13);
                xVar.skipBytes(i13);
                i10 = (i10 - 8) - i13;
                if (i12 == 1937011815) {
                    bVarC = f.c(strFromUtf8Bytes);
                } else if (i12 == 1885436268) {
                    charSequenceA = f.a((String) null, strFromUtf8Bytes.trim(), (List<d>) Collections.EMPTY_LIST);
                }
            } else {
                throw new io.odeeo.internal.d0.h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        if (bVarC != null) {
            return bVarC.setText(charSequenceA).build();
        }
        return f.a(charSequenceA);
    }
}
