package com.ironsource;

import com.ironsource.InterfaceC3396pb;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Oa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC3396pb<LevelPlayAdInfo> interfaceC3396pb) {
        if (interfaceC3396pb instanceof InterfaceC3396pb.b) {
            return "success";
        }
        if (interfaceC3396pb instanceof InterfaceC3396pb.a) {
            return "failure";
        }
        throw new tu.t();
    }
}
