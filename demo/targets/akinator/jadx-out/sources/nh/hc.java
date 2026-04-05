package nh;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class hc extends uc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76330b;

    public /* synthetic */ hc(Object obj, int i10) {
        this.f76329a = i10;
        this.f76330b = obj;
    }

    @Override // nh.uc
    public final Map a() {
        switch (this.f76329a) {
            case 0:
                return new TreeMap((Comparator) this.f76330b);
            default:
                return new EnumMap((Class) this.f76330b);
        }
    }
}
