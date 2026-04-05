package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f25356a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25357b;

    public e(int i10, List list) {
        this.f25356a = i10;
        if (!a(32) && list.isEmpty()) {
            list = Collections.singletonList(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.APPLICATION_CEA608, 0, null, -1, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
        }
        this.f25357b = list;
    }

    public final f0 a(int i10, d0 d0Var) {
        if (i10 == 2) {
            return new s(new j());
        }
        if (i10 == 3 || i10 == 4) {
            return new s(new q(d0Var.f25353a));
        }
        if (i10 == 15) {
            if (a(2)) {
                return null;
            }
            return new s(new d(false, d0Var.f25353a));
        }
        if (i10 == 21) {
            return new s(new p());
        }
        if (i10 == 27) {
            if (a(4)) {
                return null;
            }
            return new s(new m(a(d0Var), a(1), a(8)));
        }
        if (i10 == 36) {
            return new s(new o(a(d0Var)));
        }
        if (i10 == 89) {
            return new s(new g(d0Var.f25354b));
        }
        if (i10 != 138) {
            if (i10 != 129) {
                if (i10 != 130) {
                    if (i10 == 134) {
                        if (a(16)) {
                            return null;
                        }
                        return new w(new y());
                    }
                    if (i10 != 135) {
                        return null;
                    }
                }
            }
            return new s(new b(d0Var.f25353a));
        }
        return new s(new f(d0Var.f25353a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final x a(d0 d0Var) {
        int i10;
        String str;
        if (a(32)) {
            return new x(this.f25357b);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(d0Var.f25355c);
        ArrayList arrayList = this.f25357b;
        while (nVar.f26044c - nVar.f26043b > 0) {
            int iJ = nVar.j();
            int iJ2 = nVar.f26043b + nVar.j();
            if (iJ == 134) {
                arrayList = new ArrayList();
                int iJ3 = nVar.j() & 31;
                for (int i11 = 0; i11 < iJ3; i11++) {
                    String strB = nVar.b(3);
                    int iJ4 = nVar.j();
                    if ((iJ4 & 128) != 0) {
                        i10 = iJ4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        i10 = 1;
                        str = MimeTypes.APPLICATION_CEA608;
                    }
                    arrayList.add(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, 0, strB, i10, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
                    nVar.e(nVar.f26043b + 2);
                }
            }
            nVar.e(iJ2);
            arrayList = arrayList;
        }
        return new x(arrayList);
    }

    public final boolean a(int i10) {
        return (i10 & this.f25356a) != 0;
    }
}
