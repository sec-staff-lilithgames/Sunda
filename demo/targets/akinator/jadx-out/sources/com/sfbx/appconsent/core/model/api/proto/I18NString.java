package com.sfbx.appconsent.core.model.api.proto;

import j1.o2;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class I18NString {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> values;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<I18NString> serializer() {
            return I18NString$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I18NString() {
        this((Map) null, 1, (u) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ I18NString copy$default(I18NString i18NString, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = i18NString.values;
        }
        return i18NString.copy(map);
    }

    public static final void write$Self(I18NString self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && e0.areEqual(self.values, p1.emptyMap())) {
            return;
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.values);
    }

    public final Map<String, String> component1() {
        return this.values;
    }

    public final I18NString copy(Map<String, String> values) {
        e0.checkNotNullParameter(values, "values");
        return new I18NString(values);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I18NString) && e0.areEqual(this.values, ((I18NString) obj).values);
    }

    public final Map<String, String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("I18NString(values="), this.values, ')');
    }

    @f
    public /* synthetic */ I18NString(int i10, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.values = p1.emptyMap();
        } else {
            this.values = map;
        }
    }

    public I18NString(Map<String, String> values) {
        e0.checkNotNullParameter(values, "values");
        this.values = values;
    }

    public /* synthetic */ I18NString(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? p1.emptyMap() : map);
    }
}
