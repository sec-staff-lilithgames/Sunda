package com.inmobi.media;

import com.inmobi.media.C2707bf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2707bf implements InterfaceC2845k1 {
    public static final void b(boolean z10) {
        if (z10) {
            C2724cf.a(C2724cf.f32713a);
        } else {
            C2724cf.a();
        }
    }

    public final void a(final boolean z10) {
        C2925od.a(z10);
        C2925od.a(new Runnable() { // from class: zk.h0
            @Override // java.lang.Runnable
            public final void run() {
                C2707bf.b(z10);
            }
        });
    }
}
