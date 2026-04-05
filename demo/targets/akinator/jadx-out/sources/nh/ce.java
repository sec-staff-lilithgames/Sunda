package nh;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ce implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final ce f76157b = new ce();

    @Override // java.util.Comparator
    public int compare(td tdVar, td tdVar2) {
        return tdVar2.getCount() - tdVar.getCount();
    }
}
