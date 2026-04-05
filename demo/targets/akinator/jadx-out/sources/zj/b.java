package zj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum b implements xi.d {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: b, reason: collision with root package name */
    public final int f98017b;

    b(int i10) {
        this.f98017b = i10;
    }

    @Override // xi.d
    public int getNumber() {
        return this.f98017b;
    }
}
