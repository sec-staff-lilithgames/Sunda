package u5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f87932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87933c;

    /* renamed from: e, reason: collision with root package name */
    public final String f87934e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87935f;

    public k(int i10, int i11, String from, String to2) {
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(to2, "to");
        this.f87932b = i10;
        this.f87933c = i11;
        this.f87934e = from;
        this.f87935f = to2;
    }

    public final String getFrom() {
        return this.f87934e;
    }

    public final int getId() {
        return this.f87932b;
    }

    public final int getSequence() {
        return this.f87933c;
    }

    public final String getTo() {
        return this.f87935f;
    }

    @Override // java.lang.Comparable
    public int compareTo(k other) {
        e0.checkNotNullParameter(other, "other");
        int i10 = this.f87932b - other.f87932b;
        return i10 == 0 ? this.f87933c - other.f87933c : i10;
    }
}
