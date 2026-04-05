package lc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final q f73138a;

    static {
        int mask = 0;
        for (u uVar : u.values()) {
            if (uVar.enabledByDefault()) {
                mask |= uVar.getMask();
            }
        }
        int mask2 = 0;
        for (w wVar : w.values()) {
            if (wVar.enabledByDefault()) {
                mask2 |= wVar.getMask();
            }
        }
        f73138a = new q(mask, 0, mask2, 0);
    }

    public static q getDefault() {
        return f73138a;
    }
}
