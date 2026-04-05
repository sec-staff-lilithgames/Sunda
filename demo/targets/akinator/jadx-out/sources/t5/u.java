package t5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends y5.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86376b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i10, int i11) {
        super(i11);
        this.f86376b = i10;
    }

    @Override // y5.d
    public void onCreate(y5.c db2) {
        e0.checkNotNullParameter(db2, "db");
    }

    @Override // y5.d
    public void onOpen(y5.c db2) {
        e0.checkNotNullParameter(db2, "db");
        int i10 = this.f86376b;
        if (i10 < 1) {
            db2.setVersion(i10);
        }
    }

    @Override // y5.d
    public void onUpgrade(y5.c db2, int i10, int i11) {
        e0.checkNotNullParameter(db2, "db");
    }
}
