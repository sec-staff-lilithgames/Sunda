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
public final class k0 {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f54578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54579b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final KSerializer<k0> serializer() {
            return j0.f54560a;
        }
    }

    public /* synthetic */ k0(int i10, int i11, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, j0.f54560a.getDescriptor());
        }
        this.f54578a = i11;
        this.f54579b = str;
    }

    public static /* synthetic */ k0 copy$default(k0 k0Var, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = k0Var.f54578a;
        }
        if ((i11 & 2) != 0) {
            str = k0Var.f54579b;
        }
        return k0Var.copy(i10, str);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(k0 k0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, k0Var.f54578a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, k0Var.f54579b);
    }

    public final int component1() {
        return this.f54578a;
    }

    public final String component2() {
        return this.f54579b;
    }

    public final k0 copy(int i10, String uuid) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uuid, "uuid");
        return new k0(i10, uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f54578a == k0Var.f54578a && kotlin.jvm.internal.e0.areEqual(this.f54579b, k0Var.f54579b);
    }

    public final int getPid() {
        return this.f54578a;
    }

    public final String getUuid() {
        return this.f54579b;
    }

    public int hashCode() {
        return this.f54579b.hashCode() + (Integer.hashCode(this.f54578a) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f54578a);
        sb2.append(", uuid=");
        return o2.q(sb2, this.f54579b, ')');
    }

    public k0(int i10, String uuid) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uuid, "uuid");
        this.f54578a = i10;
        this.f54579b = uuid;
    }
}
