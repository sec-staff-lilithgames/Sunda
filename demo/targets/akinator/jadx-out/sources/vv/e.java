package vv;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    public long f89662b;

    /* renamed from: c, reason: collision with root package name */
    public long f89663c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public e(long j10, long j11) {
        this.f89662b = j10;
        this.f89663c = j11;
    }

    public final long getLeastSignificantBits() {
        return this.f89663c;
    }

    public final long getMostSignificantBits() {
        return this.f89662b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        e0.checkNotNullParameter(input, "input");
        this.f89662b = input.readLong();
        this.f89663c = input.readLong();
    }

    public final void setLeastSignificantBits(long j10) {
        this.f89663c = j10;
    }

    public final void setMostSignificantBits(long j10) {
        this.f89662b = j10;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        e0.checkNotNullParameter(output, "output");
        output.writeLong(this.f89662b);
        output.writeLong(this.f89663c);
    }

    public e() {
        this(0L, 0L);
    }
}
