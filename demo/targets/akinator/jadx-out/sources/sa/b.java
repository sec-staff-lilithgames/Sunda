package sa;

import e3.g;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f85578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85580c;

    public b(int i10, int i11, int i12) {
        this.f85578a = i10;
        this.f85579b = i11;
        this.f85580c = i12;
    }

    public static /* synthetic */ b copy$default(b bVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = bVar.f85578a;
        }
        if ((i13 & 2) != 0) {
            i11 = bVar.f85579b;
        }
        if ((i13 & 4) != 0) {
            i12 = bVar.f85580c;
        }
        return bVar.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.f85578a;
    }

    public final int component2() {
        return this.f85579b;
    }

    public final int component3() {
        return this.f85580c;
    }

    public final b copy(int i10, int i11, int i12) {
        return new b(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f85578a == bVar.f85578a && this.f85579b == bVar.f85579b && this.f85580c == bVar.f85580c;
    }

    public final int getNbPlayers() {
        return this.f85580c;
    }

    public final int getPosition() {
        return this.f85579b;
    }

    public final int getScore() {
        return this.f85578a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f85580c) + g.d(this.f85579b, Integer.hashCode(this.f85578a) * 31, 31);
    }

    public final boolean isPlayerInClassement() {
        return (this.f85578a == -1 || this.f85579b == -1) ? false : true;
    }

    public String toString() {
        return a.b.f(this.f85580c, ")", i.f(this.f85578a, this.f85579b, "PlayerScore(score=", ", position=", ", nbPlayers="));
    }
}
