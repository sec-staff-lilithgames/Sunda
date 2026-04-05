package ge;

import com.google.android.exoplayer2.util.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f57598a;

    public i(String str) {
        this.f57598a = str;
    }

    public static i parseFrom(v0 v0Var) {
        return new i(v0Var.readString(v0Var.bytesLeft()));
    }

    @Override // ge.a
    public int getType() {
        return 1852994675;
    }
}
