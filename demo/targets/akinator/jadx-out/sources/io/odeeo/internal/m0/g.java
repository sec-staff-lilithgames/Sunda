package io.odeeo.internal.m0;

import android.text.TextUtils;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends io.odeeo.internal.d0.e {

    /* renamed from: o, reason: collision with root package name */
    public final x f64683o;

    /* renamed from: p, reason: collision with root package name */
    public final c f64684p;

    public g() {
        super("WebvttDecoder");
        this.f64683o = new x();
        this.f64684p = new c();
    }

    public static void b(x xVar) {
        while (!TextUtils.isEmpty(xVar.readLine())) {
        }
    }

    @Override // io.odeeo.internal.d0.e
    public io.odeeo.internal.d0.f a(byte[] bArr, int i10, boolean z10) throws io.odeeo.internal.d0.h {
        e cue;
        this.f64683o.reset(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.validateWebvttHeaderLine(this.f64683o);
            while (!TextUtils.isEmpty(this.f64683o.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iA = a(this.f64683o);
                if (iA == 0) {
                    return new i(arrayList2);
                }
                if (iA == 1) {
                    b(this.f64683o);
                } else if (iA == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new io.odeeo.internal.d0.h("A style block was found after the first cue.");
                    }
                    this.f64683o.readLine();
                    arrayList.addAll(this.f64684p.parseBlock(this.f64683o));
                } else if (iA == 3 && (cue = f.parseCue(this.f64683o, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (g0 e10) {
            throw new io.odeeo.internal.d0.h(e10);
        }
    }

    public static int a(x xVar) {
        int i10 = -1;
        int position = 0;
        while (i10 == -1) {
            position = xVar.getPosition();
            String line = xVar.readLine();
            if (line == null) {
                i10 = 0;
            } else if ("STYLE".equals(line)) {
                i10 = 2;
            } else {
                i10 = line.startsWith("NOTE") ? 1 : 3;
            }
        }
        xVar.setPosition(position);
        return i10;
    }
}
