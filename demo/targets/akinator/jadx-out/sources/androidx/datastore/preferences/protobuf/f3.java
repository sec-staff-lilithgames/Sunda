package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f3 implements o2 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f5878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5879b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5880c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5881d;

    public f3(f1 f1Var, String str, Object[] objArr) {
        this.f5878a = f1Var;
        this.f5879b = str;
        this.f5880c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5881d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f5881d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public r2 getDefaultInstance() {
        return this.f5878a;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public c3 getSyntax() {
        int i10 = this.f5881d;
        return (i10 & 1) != 0 ? c3.f5833b : (i10 & 4) == 4 ? c3.f5835e : c3.f5834c;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public boolean isMessageSetWireFormat() {
        return (this.f5881d & 2) == 2;
    }
}
