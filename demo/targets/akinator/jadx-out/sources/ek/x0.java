package ek;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes7.dex */
public final class x0 {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f54670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54672c;

    /* renamed from: d, reason: collision with root package name */
    public final long f54673d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final KSerializer<x0> serializer() {
            return w0.f54662a;
        }
    }

    public /* synthetic */ x0(int i10, String str, String str2, int i11, long j10, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, w0.f54662a.getDescriptor());
        }
        this.f54670a = str;
        this.f54671b = str2;
        this.f54672c = i11;
        this.f54673d = j10;
    }

    public static /* synthetic */ x0 copy$default(x0 x0Var, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = x0Var.f54670a;
        }
        if ((i11 & 2) != 0) {
            str2 = x0Var.f54671b;
        }
        if ((i11 & 4) != 0) {
            i10 = x0Var.f54672c;
        }
        if ((i11 & 8) != 0) {
            j10 = x0Var.f54673d;
        }
        int i12 = i10;
        return x0Var.copy(str, str2, i12, j10);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(x0 x0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, x0Var.f54670a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, x0Var.f54671b);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, x0Var.f54672c);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, x0Var.f54673d);
    }

    public final String component1() {
        return this.f54670a;
    }

    public final String component2() {
        return this.f54671b;
    }

    public final int component3() {
        return this.f54672c;
    }

    public final long component4() {
        return this.f54673d;
    }

    public final x0 copy(String sessionId, String firstSessionId, int i10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(firstSessionId, "firstSessionId");
        return new x0(sessionId, firstSessionId, i10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f54670a, x0Var.f54670a) && kotlin.jvm.internal.e0.areEqual(this.f54671b, x0Var.f54671b) && this.f54672c == x0Var.f54672c && this.f54673d == x0Var.f54673d;
    }

    public final String getFirstSessionId() {
        return this.f54671b;
    }

    public final String getSessionId() {
        return this.f54670a;
    }

    public final int getSessionIndex() {
        return this.f54672c;
    }

    public final long getSessionStartTimestampUs() {
        return this.f54673d;
    }

    public int hashCode() {
        return Long.hashCode(this.f54673d) + e3.g.d(this.f54672c, o2.e(this.f54670a.hashCode() * 31, 31, this.f54671b), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionDetails(sessionId=");
        sb2.append(this.f54670a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f54671b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f54672c);
        sb2.append(", sessionStartTimestampUs=");
        return e3.g.n(sb2, this.f54673d, ')');
    }

    public x0(String sessionId, String firstSessionId, int i10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f54670a = sessionId;
        this.f54671b = firstSessionId;
        this.f54672c = i10;
        this.f54673d = j10;
    }
}
