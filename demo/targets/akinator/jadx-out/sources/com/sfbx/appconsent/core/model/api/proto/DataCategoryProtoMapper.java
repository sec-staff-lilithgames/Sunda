package com.sfbx.appconsent.core.model.api.proto;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class DataCategoryProtoMapper {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id, reason: collision with root package name */
    private final int f50522id;
    private final I18NString name;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<DataCategoryProtoMapper> serializer() {
            return DataCategoryProtoMapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ DataCategoryProtoMapper(int i10, int i11, I18NString i18NString, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, DataCategoryProtoMapper$$serializer.INSTANCE.getDescriptor());
        }
        this.f50522id = i11;
        this.name = i18NString;
    }

    public static /* synthetic */ DataCategoryProtoMapper copy$default(DataCategoryProtoMapper dataCategoryProtoMapper, int i10, I18NString i18NString, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = dataCategoryProtoMapper.f50522id;
        }
        if ((i11 & 2) != 0) {
            i18NString = dataCategoryProtoMapper.name;
        }
        return dataCategoryProtoMapper.copy(i10, i18NString);
    }

    public static final void write$Self(DataCategoryProtoMapper self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f50522id);
        output.encodeSerializableElement(serialDesc, 1, I18NString$$serializer.INSTANCE, self.name);
    }

    public final int component1() {
        return this.f50522id;
    }

    public final I18NString component2() {
        return this.name;
    }

    public final DataCategoryProtoMapper copy(int i10, I18NString name) {
        e0.checkNotNullParameter(name, "name");
        return new DataCategoryProtoMapper(i10, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCategoryProtoMapper)) {
            return false;
        }
        DataCategoryProtoMapper dataCategoryProtoMapper = (DataCategoryProtoMapper) obj;
        return this.f50522id == dataCategoryProtoMapper.f50522id && e0.areEqual(this.name, dataCategoryProtoMapper.name);
    }

    public final int getId() {
        return this.f50522id;
    }

    public final I18NString getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.f50522id) * 31);
    }

    public String toString() {
        return "DataCategoryProtoMapper(id=" + this.f50522id + ", name=" + this.name + ')';
    }

    public DataCategoryProtoMapper(int i10, I18NString name) {
        e0.checkNotNullParameter(name, "name");
        this.f50522id = i10;
        this.name = name;
    }
}
