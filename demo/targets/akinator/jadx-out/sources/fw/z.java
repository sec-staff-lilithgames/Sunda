package fw;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final z[] f56291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56293c;

    public z() {
        this.f56291a = new z[NotificationCompat.FLAG_LOCAL_ONLY];
        this.f56292b = 0;
        this.f56293c = 0;
    }

    public final z[] getChildren() {
        return this.f56291a;
    }

    public final int getSymbol() {
        return this.f56292b;
    }

    public final int getTerminalBitCount() {
        return this.f56293c;
    }

    public z(int i10, int i11) {
        this.f56291a = null;
        this.f56292b = i10;
        int i12 = i11 & 7;
        this.f56293c = i12 == 0 ? 8 : i12;
    }
}
