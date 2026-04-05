package ek;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes7.dex */
public final class y1 {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f54679a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54680b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54681c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final KSerializer<y1> serializer() {
            return x1.f54674a;
        }
    }

    public /* synthetic */ y1(int i10, long j10, long j11, long j12, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, x1.f54674a.getDescriptor());
        }
        this.f54679a = j10;
        this.f54680b = (i10 & 2) == 0 ? 1000 * j10 : j11;
        if ((i10 & 4) == 0) {
            this.f54681c = j10 / 1000;
        } else {
            this.f54681c = j12;
        }
    }

    public static /* synthetic */ y1 copy$default(y1 y1Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = y1Var.f54679a;
        }
        return y1Var.copy(j10);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(y1 y1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        long j10 = y1Var.f54679a;
        long j11 = y1Var.f54681c;
        long j12 = y1Var.f54679a;
        long j13 = y1Var.f54680b;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, j10);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || j13 != 1000 * j12) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, j13);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && j11 == j12 / 1000) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, j11);
    }

    public final long component1() {
        return this.f54679a;
    }

    public final y1 copy(long j10) {
        return new y1(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && this.f54679a == ((y1) obj).f54679a;
    }

    public final long getMs() {
        return this.f54679a;
    }

    public final long getSeconds() {
        return this.f54681c;
    }

    public final long getUs() {
        return this.f54680b;
    }

    public int hashCode() {
        return Long.hashCode(this.f54679a);
    }

    /* renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m3836minus5sfh64U(y1 time) {
        kotlin.jvm.internal.e0.checkNotNullParameter(time, "time");
        tv.e eVar = tv.f.f87433c;
        return tv.h.toDuration(this.f54679a - time.f54679a, tv.i.f87441f);
    }

    public String toString() {
        return e3.g.n(new StringBuilder("Time(ms="), this.f54679a, ')');
    }

    public y1(long j10) {
        this.f54679a = j10;
        long j11 = 1000;
        this.f54680b = j10 * j11;
        this.f54681c = j10 / j11;
    }
}
