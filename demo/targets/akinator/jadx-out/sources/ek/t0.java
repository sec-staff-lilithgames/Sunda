package ek;

import j1.o2;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes7.dex */
public final class t0 {
    public static final a Companion = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f54634d = {null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, j0.f54560a)};

    /* renamed from: a, reason: collision with root package name */
    public final x0 f54635a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f54636b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f54637c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final KSerializer<t0> serializer() {
            return s0.f54628a;
        }
    }

    public /* synthetic */ t0(int i10, x0 x0Var, y1 y1Var, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, s0.f54628a.getDescriptor());
        }
        this.f54635a = x0Var;
        if ((i10 & 2) == 0) {
            this.f54636b = null;
        } else {
            this.f54636b = y1Var;
        }
        if ((i10 & 4) == 0) {
            this.f54637c = null;
        } else {
            this.f54637c = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t0 copy$default(t0 t0Var, x0 x0Var, y1 y1Var, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x0Var = t0Var.f54635a;
        }
        if ((i10 & 2) != 0) {
            y1Var = t0Var.f54636b;
        }
        if ((i10 & 4) != 0) {
            map = t0Var.f54637c;
        }
        return t0Var.copy(x0Var, y1Var, map);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(t0 t0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        w0 w0Var = w0.f54662a;
        x0 x0Var = t0Var.f54635a;
        Map map = t0Var.f54637c;
        y1 y1Var = t0Var.f54636b;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, w0Var, x0Var);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || y1Var != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, x1.f54674a, y1Var);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && map == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, f54634d[2], map);
    }

    public final x0 component1() {
        return this.f54635a;
    }

    public final y1 component2() {
        return this.f54636b;
    }

    public final Map<String, k0> component3() {
        return this.f54637c;
    }

    public final t0 copy(x0 sessionDetails, y1 y1Var, Map<String, k0> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDetails, "sessionDetails");
        return new t0(sessionDetails, y1Var, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f54635a, t0Var.f54635a) && kotlin.jvm.internal.e0.areEqual(this.f54636b, t0Var.f54636b) && kotlin.jvm.internal.e0.areEqual(this.f54637c, t0Var.f54637c);
    }

    public final y1 getBackgroundTime() {
        return this.f54636b;
    }

    public final Map<String, k0> getProcessDataMap() {
        return this.f54637c;
    }

    public final x0 getSessionDetails() {
        return this.f54635a;
    }

    public int hashCode() {
        int iHashCode = this.f54635a.hashCode() * 31;
        y1 y1Var = this.f54636b;
        int iHashCode2 = (iHashCode + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        Map map = this.f54637c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionData(sessionDetails=");
        sb2.append(this.f54635a);
        sb2.append(", backgroundTime=");
        sb2.append(this.f54636b);
        sb2.append(", processDataMap=");
        return o2.q(sb2, this.f54637c, ')');
    }

    public t0(x0 sessionDetails, y1 y1Var, Map<String, k0> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDetails, "sessionDetails");
        this.f54635a = sessionDetails;
        this.f54636b = y1Var;
        this.f54637c = map;
    }

    public /* synthetic */ t0(x0 x0Var, y1 y1Var, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this(x0Var, (i10 & 2) != 0 ? null : y1Var, (i10 & 4) != 0 ? null : map);
    }
}
