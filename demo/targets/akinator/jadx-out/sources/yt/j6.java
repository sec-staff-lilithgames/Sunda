package yt;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j6 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f95735b;

    public j6(st.o oVar) {
        this.f95735b = oVar;
    }

    @Override // st.o
    public tw.b apply(List<tw.b> list) {
        return mt.l.zipIterable(list, this.f95735b, false, mt.l.bufferSize());
    }
}
