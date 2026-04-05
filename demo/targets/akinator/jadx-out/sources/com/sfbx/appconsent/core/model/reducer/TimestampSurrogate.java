package com.sfbx.appconsent.core.model.reducer;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@SerialName("timestamp")
@Serializable
/* loaded from: classes8.dex */
public final class TimestampSurrogate {
    public static final Companion Companion = new Companion(null);
    private final int nanos;
    private final long seconds;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<TimestampSurrogate> serializer() {
            return TimestampSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ TimestampSurrogate(int i10, @SerialName("nanos") int i11, @SerialName("seconds") long j10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, TimestampSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.nanos = i11;
        this.seconds = j10;
    }

    public static /* synthetic */ TimestampSurrogate copy$default(TimestampSurrogate timestampSurrogate, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = timestampSurrogate.nanos;
        }
        if ((i11 & 2) != 0) {
            j10 = timestampSurrogate.seconds;
        }
        return timestampSurrogate.copy(i10, j10);
    }

    public static final void write$Self(TimestampSurrogate self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.nanos);
        output.encodeLongElement(serialDesc, 1, self.seconds);
    }

    public final int component1() {
        return this.nanos;
    }

    public final long component2() {
        return this.seconds;
    }

    public final TimestampSurrogate copy(int i10, long j10) {
        return new TimestampSurrogate(i10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimestampSurrogate)) {
            return false;
        }
        TimestampSurrogate timestampSurrogate = (TimestampSurrogate) obj;
        return this.nanos == timestampSurrogate.nanos && this.seconds == timestampSurrogate.seconds;
    }

    public final int getNanos() {
        return this.nanos;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return Long.hashCode(this.seconds) + (Integer.hashCode(this.nanos) * 31);
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder(String.valueOf(this.nanos / 1000000));
            while (sb2.length() < 3) {
                sb2.insert(0, "0");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.seconds);
            sb3.append((Object) sb2);
            return sb3.toString();
        } catch (Throwable unused) {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    public TimestampSurrogate(int i10, long j10) {
        this.nanos = i10;
        this.seconds = j10;
    }

    @SerialName("nanos")
    public static /* synthetic */ void getNanos$annotations() {
    }

    @SerialName("seconds")
    public static /* synthetic */ void getSeconds$annotations() {
    }
}
