package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3262i3 extends AbstractC3506w3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3262i3(int i10, String placementName, boolean z10, C3343md c3343md) {
        super(i10, placementName, z10, c3343md);
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC3506w3
    public String toString() {
        return j1.o2.g(b(), super.toString(), ", placementId: ");
    }
}
