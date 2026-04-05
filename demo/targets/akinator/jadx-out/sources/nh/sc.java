package nh;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class sc extends wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f76640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f76641b;

    public sc(uc ucVar, Comparator comparator) {
        this.f76640a = comparator;
        this.f76641b = ucVar;
    }

    @Override // nh.wc, nh.vc, nh.yc
    public <K, V> gh build() {
        return sd.newSortedSetMultimap(this.f76641b.a(), new xc(this.f76640a));
    }
}
