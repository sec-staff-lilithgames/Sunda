package nh;

import java.util.Comparator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class bh {

    /* renamed from: b, reason: collision with root package name */
    public static final wg f76138b;

    /* renamed from: c, reason: collision with root package name */
    public static final xg f76139c;

    /* renamed from: e, reason: collision with root package name */
    public static final yg f76140e;

    /* renamed from: f, reason: collision with root package name */
    public static final zg f76141f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bh[] f76142g;

    static {
        wg wgVar = new wg();
        f76138b = wgVar;
        xg xgVar = new xg();
        f76139c = xgVar;
        yg ygVar = new yg();
        f76140e = ygVar;
        zg zgVar = new zg();
        f76141f = zgVar;
        f76142g = new bh[]{wgVar, xgVar, ygVar, zgVar, new bh() { // from class: nh.ah
            @Override // nh.bh
            public <E> int resultIndex(Comparator<? super E> comparator, E e10, List<? extends E> list, int i10) {
                return bh.f76140e.resultIndex(comparator, e10, list, i10) - 1;
            }
        }};
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) f76142g.clone();
    }

    public abstract int resultIndex(Comparator comparator, Object obj, List list, int i10);
}
