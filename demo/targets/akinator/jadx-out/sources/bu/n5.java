package bu;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f10695b;

    public n5(st.o oVar) {
        this.f10695b = oVar;
    }

    @Override // st.o
    public mt.g0 apply(List<mt.g0> list) {
        return mt.b0.zipIterable(list, this.f10695b, false, mt.b0.bufferSize());
    }
}
