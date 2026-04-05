package nh;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l8 extends wi {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76445c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractList f76446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.f76445c = i10;
        this.f76446e = abstractList;
    }

    @Override // nh.vi
    public final Object a(Object obj) {
        switch (this.f76445c) {
            case 0:
                return ((m8) this.f76446e).f76474c.apply(obj);
            default:
                return ((n8) this.f76446e).f76499c.apply(obj);
        }
    }
}
