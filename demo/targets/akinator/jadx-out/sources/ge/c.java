package ge;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f57572a;

    /* renamed from: b, reason: collision with root package name */
    public int f57573b;

    /* renamed from: c, reason: collision with root package name */
    public int f57574c;

    public void populateFrom(v0 v0Var) {
        this.f57572a = v0Var.readLittleEndianInt();
        this.f57573b = v0Var.readLittleEndianInt();
        this.f57574c = 0;
    }

    public void populateWithListHeaderFrom(v0 v0Var) throws h2 {
        populateFrom(v0Var);
        if (this.f57572a == 1414744396) {
            this.f57574c = v0Var.readLittleEndianInt();
        } else {
            throw h2.createForMalformedContainer("LIST expected, found: " + this.f57572a, null);
        }
    }
}
