package nh;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ha extends vi {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha(int i10, Iterator it) {
        super(it);
        this.f76327c = i10;
    }

    @Override // nh.vi
    public final Object a(Object obj) {
        switch (this.f76327c) {
            case 0:
                return ((Map.Entry) obj).getKey();
            case 1:
                return ((Map.Entry) obj).getValue();
            default:
                return new gd((Map.Entry) obj);
        }
    }
}
