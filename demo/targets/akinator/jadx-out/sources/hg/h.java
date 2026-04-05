package hg;

import android.util.Property;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final h f58775a = new h(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public Integer get(j jVar) {
        return Integer.valueOf(jVar.getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public void set(j jVar, Integer num) {
        jVar.setCircularRevealScrimColor(num.intValue());
    }
}
