package p0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface z2 extends s0.l, p0, m0 {
    @Override // s0.l
    y2 builder();

    @Override // s0.l
    /* synthetic */ s0.k builder();

    @Override // s0.l, java.util.Map
    /* synthetic */ s0.l clear();

    @Override // p0.p0
    /* synthetic */ Object get(l0 l0Var);

    @Override // p0.m0
    default <T> T getCurrentValue(l0 l0Var) {
        return (T) q0.read(this, l0Var);
    }

    @Override // s0.l, s0.e
    /* synthetic */ s0.f getEntries();

    @Override // s0.l, s0.e
    /* synthetic */ s0.f getKeys();

    @Override // s0.l, s0.e
    /* synthetic */ s0.b getValues();

    @Override // s0.l, java.util.Map
    /* synthetic */ s0.l put(Object obj, Object obj2);

    @Override // s0.l, java.util.Map
    /* synthetic */ s0.l putAll(Map map);

    z2 putValue(l0 l0Var, b6 b6Var);

    @Override // s0.l, java.util.Map
    /* synthetic */ s0.l remove(Object obj);

    @Override // s0.l, java.util.Map
    /* synthetic */ s0.l remove(Object obj, Object obj2);
}
