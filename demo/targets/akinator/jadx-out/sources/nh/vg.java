package nh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class vg {

    /* renamed from: b, reason: collision with root package name */
    public static final sg f76722b;

    /* renamed from: c, reason: collision with root package name */
    public static final tg f76723c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ vg[] f76724e;

    static {
        sg sgVar = new sg();
        f76722b = sgVar;
        tg tgVar = new tg();
        f76723c = tgVar;
        f76724e = new vg[]{sgVar, tgVar, new vg() { // from class: nh.ug
            @Override // nh.vg
            public int resultIndex(int i10) {
                return ~i10;
            }
        }};
    }

    public static vg valueOf(String str) {
        return (vg) Enum.valueOf(vg.class, str);
    }

    public static vg[] values() {
        return (vg[]) f76724e.clone();
    }

    public abstract int resultIndex(int i10);
}
