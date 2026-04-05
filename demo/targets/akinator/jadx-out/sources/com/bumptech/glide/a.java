package com.bumptech.glide;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends v {
    public static <TranscodeType> a with(int i10) {
        return (a) new a().transition(i10);
    }

    public static <TranscodeType> a withNoTransition() {
        return (a) new a().dontTransition();
    }

    @Override // com.bumptech.glide.v
    public boolean equals(Object obj) {
        return (obj instanceof a) && super.equals(obj);
    }

    @Override // com.bumptech.glide.v
    public int hashCode() {
        return super.hashCode();
    }

    public static <TranscodeType> a with(h9.i iVar) {
        return (a) new a().transition(iVar);
    }

    public static <TranscodeType> a with(h9.d dVar) {
        return (a) new a().transition(dVar);
    }
}
