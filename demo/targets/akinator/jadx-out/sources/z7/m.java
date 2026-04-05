package z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public enum m {
    STAR(1),
    /* JADX INFO: Fake field, exist only in values array */
    POLYGON(2);


    /* renamed from: b, reason: collision with root package name */
    public final int f97627b;

    m(int i10) {
        this.f97627b = i10;
    }

    public static m forValue(int i10) {
        for (m mVar : values()) {
            if (mVar.f97627b == i10) {
                return mVar;
            }
        }
        return null;
    }
}
