package hg;

import android.util.Property;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final g f58774a = new g(i.class, "circularReveal");

    @Override // android.util.Property
    public i get(j jVar) {
        return jVar.getRevealInfo();
    }

    @Override // android.util.Property
    public void set(j jVar, i iVar) {
        jVar.setRevealInfo(iVar);
    }
}
