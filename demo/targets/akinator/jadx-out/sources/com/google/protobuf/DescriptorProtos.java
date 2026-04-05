package com.google.protobuf;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DescriptorProtos {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.google.protobuf.DescriptorProtos$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DescriptorProto extends GeneratedMessageLite<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
        private static final DescriptorProto DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile Parser<DescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private MessageOptions options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<FieldDescriptorProto> field_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<DescriptorProto> nestedType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ExtensionRange> extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<OneofDescriptorProto> oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllEnumType(iterable);
                return this;
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllExtension(iterable);
                return this;
            }

            public Builder addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllExtensionRange(iterable);
                return this;
            }

            public Builder addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllField(iterable);
                return this;
            }

            public Builder addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllNestedType(iterable);
                return this;
            }

            public Builder addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllOneofDecl(iterable);
                return this;
            }

            public Builder addAllReservedName(Iterable<String> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllReservedName(iterable);
                return this;
            }

            public Builder addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllReservedRange(iterable);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(enumDescriptorProto);
                return this;
            }

            public Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(fieldDescriptorProto);
                return this;
            }

            public Builder addExtensionRange(ExtensionRange extensionRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(extensionRange);
                return this;
            }

            public Builder addField(FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(fieldDescriptorProto);
                return this;
            }

            public Builder addNestedType(DescriptorProto descriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(descriptorProto);
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(oneofDescriptorProto);
                return this;
            }

            public Builder addReservedName(String str) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedName(str);
                return this;
            }

            public Builder addReservedNameBytes(ByteString byteString) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedNameBytes(byteString);
                return this;
            }

            public Builder addReservedRange(ReservedRange reservedRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(reservedRange);
                return this;
            }

            public Builder clearEnumType() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearEnumType();
                return this;
            }

            public Builder clearExtension() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearExtension();
                return this;
            }

            public Builder clearExtensionRange() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearExtensionRange();
                return this;
            }

            public Builder clearField() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearField();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearNestedType() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearNestedType();
                return this;
            }

            public Builder clearOneofDecl() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearOneofDecl();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearReservedName() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearReservedName();
                return this;
            }

            public Builder clearReservedRange() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearReservedRange();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int i10) {
                return ((DescriptorProto) this.instance).getEnumType(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getEnumTypeCount() {
                return ((DescriptorProto) this.instance).getEnumTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getEnumTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int i10) {
                return ((DescriptorProto) this.instance).getExtension(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getExtensionCount() {
                return ((DescriptorProto) this.instance).getExtensionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getExtensionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ExtensionRange getExtensionRange(int i10) {
                return ((DescriptorProto) this.instance).getExtensionRange(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getExtensionRangeCount() {
                return ((DescriptorProto) this.instance).getExtensionRangeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<ExtensionRange> getExtensionRangeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getExtensionRangeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public FieldDescriptorProto getField(int i10) {
                return ((DescriptorProto) this.instance).getField(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getFieldCount() {
                return ((DescriptorProto) this.instance).getFieldCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getFieldList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getFieldList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public String getName() {
                return ((DescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((DescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public DescriptorProto getNestedType(int i10) {
                return ((DescriptorProto) this.instance).getNestedType(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getNestedTypeCount() {
                return ((DescriptorProto) this.instance).getNestedTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<DescriptorProto> getNestedTypeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getNestedTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public OneofDescriptorProto getOneofDecl(int i10) {
                return ((DescriptorProto) this.instance).getOneofDecl(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getOneofDeclCount() {
                return ((DescriptorProto) this.instance).getOneofDeclCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<OneofDescriptorProto> getOneofDeclList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getOneofDeclList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public MessageOptions getOptions() {
                return ((DescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public String getReservedName(int i10) {
                return ((DescriptorProto) this.instance).getReservedName(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int i10) {
                return ((DescriptorProto) this.instance).getReservedNameBytes(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getReservedNameCount() {
                return ((DescriptorProto) this.instance).getReservedNameCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getReservedNameList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ReservedRange getReservedRange(int i10) {
                return ((DescriptorProto) this.instance).getReservedRange(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getReservedRangeCount() {
                return ((DescriptorProto) this.instance).getReservedRangeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<ReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getReservedRangeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasName() {
                return ((DescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((DescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(MessageOptions messageOptions) {
                copyOnWrite();
                ((DescriptorProto) this.instance).mergeOptions(messageOptions);
                return this;
            }

            public Builder removeEnumType(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeEnumType(i10);
                return this;
            }

            public Builder removeExtension(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeExtension(i10);
                return this;
            }

            public Builder removeExtensionRange(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeExtensionRange(i10);
                return this;
            }

            public Builder removeField(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeField(i10);
                return this;
            }

            public Builder removeNestedType(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeNestedType(i10);
                return this;
            }

            public Builder removeOneofDecl(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeOneofDecl(i10);
                return this;
            }

            public Builder removeReservedRange(int i10) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeReservedRange(i10);
                return this;
            }

            public Builder setEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setEnumType(i10, enumDescriptorProto);
                return this;
            }

            public Builder setExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtension(i10, fieldDescriptorProto);
                return this;
            }

            public Builder setExtensionRange(int i10, ExtensionRange extensionRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtensionRange(i10, extensionRange);
                return this;
            }

            public Builder setField(int i10, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setField(i10, fieldDescriptorProto);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNestedType(int i10, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setNestedType(i10, descriptorProto);
                return this;
            }

            public Builder setOneofDecl(int i10, OneofDescriptorProto oneofDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOneofDecl(i10, oneofDescriptorProto);
                return this;
            }

            public Builder setOptions(MessageOptions messageOptions) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOptions(messageOptions);
                return this;
            }

            public Builder setReservedName(int i10, String str) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setReservedName(i10, str);
                return this;
            }

            public Builder setReservedRange(int i10, ReservedRange reservedRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setReservedRange(i10, reservedRange);
                return this;
            }

            private Builder() {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(i10, enumDescriptorProto);
                return this;
            }

            public Builder addExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(i10, fieldDescriptorProto);
                return this;
            }

            public Builder addExtensionRange(int i10, ExtensionRange extensionRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(i10, extensionRange);
                return this;
            }

            public Builder addField(int i10, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(i10, fieldDescriptorProto);
                return this;
            }

            public Builder addNestedType(int i10, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(i10, descriptorProto);
                return this;
            }

            public Builder addOneofDecl(int i10, OneofDescriptorProto oneofDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(i10, oneofDescriptorProto);
                return this;
            }

            public Builder addReservedRange(int i10, ReservedRange reservedRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(i10, reservedRange);
                return this;
            }

            public Builder setEnumType(int i10, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setEnumType(i10, builder.build());
                return this;
            }

            public Builder setExtension(int i10, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtension(i10, builder.build());
                return this;
            }

            public Builder setExtensionRange(int i10, ExtensionRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtensionRange(i10, builder.build());
                return this;
            }

            public Builder setField(int i10, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setField(i10, builder.build());
                return this;
            }

            public Builder setNestedType(int i10, Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setNestedType(i10, builder.build());
                return this;
            }

            public Builder setOneofDecl(int i10, OneofDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOneofDecl(i10, builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(MessageOptions.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOptions((MessageOptions) builder.build());
                return this;
            }

            public Builder setReservedRange(int i10, ReservedRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setReservedRange(i10, builder.build());
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(builder.build());
                return this;
            }

            public Builder addExtension(FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(builder.build());
                return this;
            }

            public Builder addExtensionRange(ExtensionRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(builder.build());
                return this;
            }

            public Builder addField(FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(builder.build());
                return this;
            }

            public Builder addNestedType(Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(builder.build());
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(builder.build());
                return this;
            }

            public Builder addReservedRange(ReservedRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(builder.build());
                return this;
            }

            public Builder addEnumType(int i10, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(i10, builder.build());
                return this;
            }

            public Builder addExtension(int i10, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(i10, builder.build());
                return this;
            }

            public Builder addExtensionRange(int i10, ExtensionRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(i10, builder.build());
                return this;
            }

            public Builder addField(int i10, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(i10, builder.build());
                return this;
            }

            public Builder addNestedType(int i10, Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(i10, builder.build());
                return this;
            }

            public Builder addOneofDecl(int i10, OneofDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(i10, builder.build());
                return this;
            }

            public Builder addReservedRange(int i10, ReservedRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
            private static final ExtensionRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile Parser<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private ExtensionRangeOptions options_;
            private int start_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).clearEnd();
                    return this;
                }

                public Builder clearOptions() {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).clearOptions();
                    return this;
                }

                public Builder clearStart() {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).clearStart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public int getEnd() {
                    return ((ExtensionRange) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public ExtensionRangeOptions getOptions() {
                    return ((ExtensionRange) this.instance).getOptions();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public int getStart() {
                    return ((ExtensionRange) this.instance).getStart();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasEnd() {
                    return ((ExtensionRange) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasOptions() {
                    return ((ExtensionRange) this.instance).hasOptions();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasStart() {
                    return ((ExtensionRange) this.instance).hasStart();
                }

                public Builder mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).mergeOptions(extensionRangeOptions);
                    return this;
                }

                public Builder setEnd(int i10) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setEnd(i10);
                    return this;
                }

                public Builder setOptions(ExtensionRangeOptions extensionRangeOptions) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setOptions(extensionRangeOptions);
                    return this;
                }

                public Builder setStart(int i10) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setStart(i10);
                    return this;
                }

                private Builder() {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Builder setOptions(ExtensionRangeOptions.Builder builder) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setOptions((ExtensionRangeOptions) builder.build());
                    return this;
                }
            }

            static {
                ExtensionRange extensionRange = new ExtensionRange();
                DEFAULT_INSTANCE = extensionRange;
                GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
            }

            private ExtensionRange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                ExtensionRangeOptions extensionRangeOptions2 = this.options_;
                if (extensionRangeOptions2 == null || extensionRangeOptions2 == ExtensionRangeOptions.getDefaultInstance()) {
                    this.options_ = extensionRangeOptions;
                } else {
                    this.options_ = ((ExtensionRangeOptions.Builder) ExtensionRangeOptions.newBuilder(this.options_).mergeFrom((ExtensionRangeOptions.Builder) extensionRangeOptions)).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ExtensionRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i10) {
                this.bitField0_ |= 2;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOptions(ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                this.options_ = extensionRangeOptions;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i10) {
                this.bitField0_ |= 1;
                this.start_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExtensionRange();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ExtensionRange> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ExtensionRange.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public ExtensionRangeOptions getOptions() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(ExtensionRange extensionRange) {
                return DEFAULT_INSTANCE.createBuilder(extensionRange);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ExtensionRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExtensionRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ExtensionRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            ExtensionRangeOptions getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, Builder> implements ReservedRangeOrBuilder {
            private static final ReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<ReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<ReservedRange, Builder> implements ReservedRangeOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((ReservedRange) this.instance).clearEnd();
                    return this;
                }

                public Builder clearStart() {
                    copyOnWrite();
                    ((ReservedRange) this.instance).clearStart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public int getEnd() {
                    return ((ReservedRange) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public int getStart() {
                    return ((ReservedRange) this.instance).getStart();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public boolean hasEnd() {
                    return ((ReservedRange) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public boolean hasStart() {
                    return ((ReservedRange) this.instance).hasStart();
                }

                public Builder setEnd(int i10) {
                    copyOnWrite();
                    ((ReservedRange) this.instance).setEnd(i10);
                    return this;
                }

                public Builder setStart(int i10) {
                    copyOnWrite();
                    ((ReservedRange) this.instance).setStart(i10);
                    return this;
                }

                private Builder() {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }
            }

            static {
                ReservedRange reservedRange = new ReservedRange();
                DEFAULT_INSTANCE = reservedRange;
                GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
            }

            private ReservedRange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i10) {
                this.bitField0_ |= 2;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i10) {
                this.bitField0_ |= 1;
                this.start_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ReservedRange();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ReservedRange> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ReservedRange.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(ReservedRange reservedRange) {
                return DEFAULT_INSTANCE.createBuilder(reservedRange);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ReservedRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            DescriptorProto descriptorProto = new DescriptorProto();
            DEFAULT_INSTANCE = descriptorProto;
            GeneratedMessageLite.registerDefaultInstance(DescriptorProto.class, descriptorProto);
        }

        private DescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            ensureExtensionRangeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.extensionRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureFieldIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.field_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
            ensureNestedTypeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.nestedType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
            ensureOneofDeclIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.oneofDecl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(extensionRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.add(fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(oneofDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(ByteString byteString) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(reservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtensionRange() {
            this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNestedType() {
            this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofDecl() {
            this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureEnumTypeIsMutable() {
            Internal.ProtobufList<EnumDescriptorProto> protobufList = this.enumType_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.enumType_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureExtensionIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> protobufList = this.extension_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.extension_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureExtensionRangeIsMutable() {
            Internal.ProtobufList<ExtensionRange> protobufList = this.extensionRange_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.extensionRange_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureFieldIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> protobufList = this.field_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.field_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureNestedTypeIsMutable() {
            Internal.ProtobufList<DescriptorProto> protobufList = this.nestedType_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.nestedType_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureOneofDeclIsMutable() {
            Internal.ProtobufList<OneofDescriptorProto> protobufList = this.oneofDecl_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.oneofDecl_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureReservedNameIsMutable() {
            Internal.ProtobufList<String> protobufList = this.reservedName_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.reservedName_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureReservedRangeIsMutable() {
            Internal.ProtobufList<ReservedRange> protobufList = this.reservedRange_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.reservedRange_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(MessageOptions messageOptions) {
            messageOptions.getClass();
            MessageOptions messageOptions2 = this.options_;
            if (messageOptions2 == null || messageOptions2 == MessageOptions.getDefaultInstance()) {
                this.options_ = messageOptions;
            } else {
                this.options_ = ((MessageOptions.Builder) MessageOptions.newBuilder(this.options_).mergeFrom((MessageOptions.Builder) messageOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int i10) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int i10) {
            ensureExtensionIsMutable();
            this.extension_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtensionRange(int i10) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeField(int i10) {
            ensureFieldIsMutable();
            this.field_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNestedType(int i10) {
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOneofDecl(int i10) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int i10) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i10, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i10, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtensionRange(int i10, ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i10, extensionRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(int i10, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.set(i10, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNestedType(int i10, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i10, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofDecl(int i10, OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i10, oneofDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(MessageOptions messageOptions) {
            messageOptions.getClass();
            this.options_ = messageOptions;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int i10, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int i10, ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i10, reservedRange);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int i10) {
            return this.enumType_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i10) {
            return this.enumType_.get(i10);
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int i10) {
            return this.extension_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i10) {
            return this.extension_.get(i10);
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ExtensionRange getExtensionRange(int i10) {
            return this.extensionRange_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i10) {
            return this.extensionRange_.get(i10);
        }

        public List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public FieldDescriptorProto getField(int i10) {
            return this.field_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i10) {
            return this.field_.get(i10);
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
            return this.field_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public DescriptorProto getNestedType(int i10) {
            return this.nestedType_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i10) {
            return this.nestedType_.get(i10);
        }

        public List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public OneofDescriptorProto getOneofDecl(int i10) {
            return this.oneofDecl_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i10) {
            return this.oneofDecl_.get(i10);
        }

        public List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public MessageOptions getOptions() {
            MessageOptions messageOptions = this.options_;
            return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public String getReservedName(int i10) {
            return this.reservedName_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i10) {
            return ByteString.copyFromUtf8(this.reservedName_.get(i10));
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ReservedRange getReservedRange(int i10) {
            return this.reservedRange_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i10) {
            return this.reservedRange_.get(i10);
        }

        public List<? extends ReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DescriptorProto descriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(descriptorProto);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i10, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i10, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(int i10, ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(i10, extensionRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(int i10, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.add(i10, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(int i10, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(i10, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(int i10, OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(i10, oneofDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int i10, ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i10, reservedRange);
        }

        public static DescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        EnumDescriptorProto getEnumType(int i10);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i10);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto.ExtensionRange getExtensionRange(int i10);

        int getExtensionRangeCount();

        List<DescriptorProto.ExtensionRange> getExtensionRangeList();

        FieldDescriptorProto getField(int i10);

        int getFieldCount();

        List<FieldDescriptorProto> getFieldList();

        String getName();

        ByteString getNameBytes();

        DescriptorProto getNestedType(int i10);

        int getNestedTypeCount();

        List<DescriptorProto> getNestedTypeList();

        OneofDescriptorProto getOneofDecl(int i10);

        int getOneofDeclCount();

        List<OneofDescriptorProto> getOneofDeclList();

        MessageOptions getOptions();

        String getReservedName(int i10);

        ByteString getReservedNameBytes(int i10);

        int getReservedNameCount();

        List<String> getReservedNameList();

        DescriptorProto.ReservedRange getReservedRange(int i10);

        int getReservedRangeCount();

        List<DescriptorProto.ReservedRange> getReservedRangeList();

        boolean hasName();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EnumDescriptorProto extends GeneratedMessageLite<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
        private static final EnumDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumDescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private EnumOptions options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<EnumValueDescriptorProto> value_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnumReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllReservedName(Iterable<String> iterable) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addAllReservedName(iterable);
                return this;
            }

            public Builder addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addAllReservedRange(iterable);
                return this;
            }

            public Builder addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addAllValue(iterable);
                return this;
            }

            public Builder addReservedName(String str) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedName(str);
                return this;
            }

            public Builder addReservedNameBytes(ByteString byteString) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedNameBytes(byteString);
                return this;
            }

            public Builder addReservedRange(EnumReservedRange enumReservedRange) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(enumReservedRange);
                return this;
            }

            public Builder addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(enumValueDescriptorProto);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearReservedName() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearReservedName();
                return this;
            }

            public Builder clearReservedRange() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearReservedRange();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearValue();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public String getName() {
                return ((EnumDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((EnumDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumOptions getOptions() {
                return ((EnumDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public String getReservedName(int i10) {
                return ((EnumDescriptorProto) this.instance).getReservedName(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int i10) {
                return ((EnumDescriptorProto) this.instance).getReservedNameBytes(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getReservedNameCount() {
                return ((EnumDescriptorProto) this.instance).getReservedNameCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.instance).getReservedNameList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumReservedRange getReservedRange(int i10) {
                return ((EnumDescriptorProto) this.instance).getReservedRange(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getReservedRangeCount() {
                return ((EnumDescriptorProto) this.instance).getReservedRangeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<EnumReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.instance).getReservedRangeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumValueDescriptorProto getValue(int i10) {
                return ((EnumDescriptorProto) this.instance).getValue(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getValueCount() {
                return ((EnumDescriptorProto) this.instance).getValueCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<EnumValueDescriptorProto> getValueList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.instance).getValueList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((EnumDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((EnumDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(EnumOptions enumOptions) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).mergeOptions(enumOptions);
                return this;
            }

            public Builder removeReservedRange(int i10) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).removeReservedRange(i10);
                return this;
            }

            public Builder removeValue(int i10) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).removeValue(i10);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOptions(EnumOptions enumOptions) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setOptions(enumOptions);
                return this;
            }

            public Builder setReservedName(int i10, String str) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setReservedName(i10, str);
                return this;
            }

            public Builder setReservedRange(int i10, EnumReservedRange enumReservedRange) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setReservedRange(i10, enumReservedRange);
                return this;
            }

            public Builder setValue(int i10, EnumValueDescriptorProto enumValueDescriptorProto) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setValue(i10, enumValueDescriptorProto);
                return this;
            }

            private Builder() {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addReservedRange(int i10, EnumReservedRange enumReservedRange) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(i10, enumReservedRange);
                return this;
            }

            public Builder addValue(int i10, EnumValueDescriptorProto enumValueDescriptorProto) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(i10, enumValueDescriptorProto);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(EnumOptions.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setOptions((EnumOptions) builder.build());
                return this;
            }

            public Builder setReservedRange(int i10, EnumReservedRange.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setReservedRange(i10, builder.build());
                return this;
            }

            public Builder setValue(int i10, EnumValueDescriptorProto.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setValue(i10, builder.build());
                return this;
            }

            public Builder addReservedRange(EnumReservedRange.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(builder.build());
                return this;
            }

            public Builder addValue(EnumValueDescriptorProto.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(builder.build());
                return this;
            }

            public Builder addReservedRange(int i10, EnumReservedRange.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(i10, builder.build());
                return this;
            }

            public Builder addValue(int i10, EnumValueDescriptorProto.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
            private static final EnumReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<EnumReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).clearEnd();
                    return this;
                }

                public Builder clearStart() {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).clearStart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public int getEnd() {
                    return ((EnumReservedRange) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public int getStart() {
                    return ((EnumReservedRange) this.instance).getStart();
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public boolean hasEnd() {
                    return ((EnumReservedRange) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public boolean hasStart() {
                    return ((EnumReservedRange) this.instance).hasStart();
                }

                public Builder setEnd(int i10) {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).setEnd(i10);
                    return this;
                }

                public Builder setStart(int i10) {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).setStart(i10);
                    return this;
                }

                private Builder() {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }
            }

            static {
                EnumReservedRange enumReservedRange = new EnumReservedRange();
                DEFAULT_INSTANCE = enumReservedRange;
                GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
            }

            private EnumReservedRange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EnumReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i10) {
                this.bitField0_ |= 2;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i10) {
                this.bitField0_ |= 1;
                this.start_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EnumReservedRange();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EnumReservedRange> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EnumReservedRange.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(EnumReservedRange enumReservedRange) {
                return DEFAULT_INSTANCE.createBuilder(enumReservedRange);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EnumReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EnumReservedRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface EnumReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto();
            DEFAULT_INSTANCE = enumDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumDescriptorProto.class, enumDescriptorProto);
        }

        private EnumDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
            ensureValueIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(ByteString byteString) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(enumReservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.add(enumValueDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureReservedNameIsMutable() {
            Internal.ProtobufList<String> protobufList = this.reservedName_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.reservedName_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureReservedRangeIsMutable() {
            Internal.ProtobufList<EnumReservedRange> protobufList = this.reservedRange_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.reservedRange_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureValueIsMutable() {
            Internal.ProtobufList<EnumValueDescriptorProto> protobufList = this.value_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.value_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(EnumOptions enumOptions) {
            enumOptions.getClass();
            EnumOptions enumOptions2 = this.options_;
            if (enumOptions2 == null || enumOptions2 == EnumOptions.getDefaultInstance()) {
                this.options_ = enumOptions;
            } else {
                this.options_ = ((EnumOptions.Builder) EnumOptions.newBuilder(this.options_).mergeFrom((EnumOptions.Builder) enumOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int i10) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeValue(int i10) {
            ensureValueIsMutable();
            this.value_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(EnumOptions enumOptions) {
            enumOptions.getClass();
            this.options_ = enumOptions;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int i10, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int i10, EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i10, enumReservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i10, EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.set(i10, enumValueDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnumDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumOptions getOptions() {
            EnumOptions enumOptions = this.options_;
            return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public String getReservedName(int i10) {
            return this.reservedName_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i10) {
            return ByteString.copyFromUtf8(this.reservedName_.get(i10));
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumReservedRange getReservedRange(int i10) {
            return this.reservedRange_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i10) {
            return this.reservedRange_.get(i10);
        }

        public List<? extends EnumReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumValueDescriptorProto getValue(int i10) {
            return this.value_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getValueCount() {
            return this.value_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i10) {
            return this.value_.get(i10);
        }

        public List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
            return this.value_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(EnumDescriptorProto enumDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(enumDescriptorProto);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int i10, EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i10, enumReservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(int i10, EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.add(i10, enumValueDescriptorProto);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EnumDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        EnumOptions getOptions();

        String getReservedName(int i10);

        ByteString getReservedNameBytes(int i10);

        int getReservedNameCount();

        List<String> getReservedNameList();

        EnumDescriptorProto.EnumReservedRange getReservedRange(int i10);

        int getReservedRangeCount();

        List<EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

        EnumValueDescriptorProto getValue(int i10);

        int getValueCount();

        List<EnumValueDescriptorProto> getValueList();

        boolean hasName();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EnumOptions extends GeneratedMessageLite.ExtendableMessage<EnumOptions, Builder> implements EnumOptionsOrBuilder {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final EnumOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile Parser<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumOptions, Builder> implements EnumOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((EnumOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearAllowAlias() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearAllowAlias();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean getAllowAlias() {
                return ((EnumOptions) this.instance).getAllowAlias();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean getDeprecated() {
                return ((EnumOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((EnumOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((EnumOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasAllowAlias() {
                return ((EnumOptions) this.instance).hasAllowAlias();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((EnumOptions) this.instance).hasDeprecated();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((EnumOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setAllowAlias(boolean z10) {
                copyOnWrite();
                ((EnumOptions) this.instance).setAllowAlias(z10);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((EnumOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(EnumOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        static {
            EnumOptions enumOptions = new EnumOptions();
            DEFAULT_INSTANCE = enumOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumOptions.class, enumOptions);
        }

        private EnumOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowAlias(boolean z10) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 2;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnumOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(EnumOptions enumOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumOptions);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static EnumOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EnumOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumOptions, EnumOptions.Builder> {
        boolean getAllowAlias();

        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EnumValueDescriptorProto extends GeneratedMessageLite<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumValueDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private EnumValueOptions options_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearName() {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).clearNumber();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public String getName() {
                return ((EnumValueDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((EnumValueDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public int getNumber() {
                return ((EnumValueDescriptorProto) this.instance).getNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public EnumValueOptions getOptions() {
                return ((EnumValueDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((EnumValueDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasNumber() {
                return ((EnumValueDescriptorProto) this.instance).hasNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((EnumValueDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(EnumValueOptions enumValueOptions) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).mergeOptions(enumValueOptions);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNumber(int i10) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setNumber(i10);
                return this;
            }

            public Builder setOptions(EnumValueOptions enumValueOptions) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setOptions(enumValueOptions);
                return this;
            }

            private Builder() {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(EnumValueOptions.Builder builder) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setOptions((EnumValueOptions) builder.build());
                return this;
            }
        }

        static {
            EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto();
            DEFAULT_INSTANCE = enumValueDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumValueDescriptorProto.class, enumValueDescriptorProto);
        }

        private EnumValueDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(EnumValueOptions enumValueOptions) {
            enumValueOptions.getClass();
            EnumValueOptions enumValueOptions2 = this.options_;
            if (enumValueOptions2 == null || enumValueOptions2 == EnumValueOptions.getDefaultInstance()) {
                this.options_ = enumValueOptions;
            } else {
                this.options_ = ((EnumValueOptions.Builder) EnumValueOptions.newBuilder(this.options_).mergeFrom((EnumValueOptions.Builder) enumValueOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumValueDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i10) {
            this.bitField0_ |= 2;
            this.number_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(EnumValueOptions enumValueOptions) {
            enumValueOptions.getClass();
            this.options_ = enumValueOptions;
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumValueDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumValueDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnumValueDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public EnumValueOptions getOptions() {
            EnumValueOptions enumValueOptions = this.options_;
            return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(enumValueDescriptorProto);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EnumValueDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getNumber();

        EnumValueOptions getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
        private static final EnumValueOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile Parser<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean getDeprecated() {
                return ((EnumValueOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((EnumValueOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((EnumValueOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumValueOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((EnumValueOptions) this.instance).hasDeprecated();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        static {
            EnumValueOptions enumValueOptions = new EnumValueOptions();
            DEFAULT_INSTANCE = enumValueOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumValueOptions.class, enumValueOptions);
        }

        private EnumValueOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumValueOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 1;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumValueOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumValueOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EnumValueOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(EnumValueOptions enumValueOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumValueOptions);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static EnumValueOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EnumValueOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumValueOptions, EnumValueOptions.Builder> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
        private static final ExtensionRangeOptions DEFAULT_INSTANCE;
        private static volatile Parser<ExtensionRangeOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((ExtensionRangeOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((ExtensionRangeOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ExtensionRangeOptions) this.instance).getUninterpretedOptionList());
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        static {
            ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions();
            DEFAULT_INSTANCE = extensionRangeOptions;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRangeOptions.class, extensionRangeOptions);
        }

        private ExtensionRangeOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExtensionRangeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExtensionRangeOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExtensionRangeOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExtensionRangeOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(ExtensionRangeOptions extensionRangeOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(extensionRangeOptions);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ExtensionRangeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ExtensionRangeOptions, ExtensionRangeOptions.Builder> {
        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FieldDescriptorProto extends GeneratedMessageLite<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
        private static final FieldDescriptorProto DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile Parser<FieldDescriptorProto> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDefaultValue() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearDefaultValue();
                return this;
            }

            public Builder clearExtendee() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearExtendee();
                return this;
            }

            public Builder clearJsonName() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearJsonName();
                return this;
            }

            public Builder clearLabel() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearLabel();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearNumber();
                return this;
            }

            public Builder clearOneofIndex() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearOneofIndex();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearProto3Optional() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearProto3Optional();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearType();
                return this;
            }

            public Builder clearTypeName() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearTypeName();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getDefaultValue() {
                return ((FieldDescriptorProto) this.instance).getDefaultValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getDefaultValueBytes() {
                return ((FieldDescriptorProto) this.instance).getDefaultValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getExtendee() {
                return ((FieldDescriptorProto) this.instance).getExtendee();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getExtendeeBytes() {
                return ((FieldDescriptorProto) this.instance).getExtendeeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getJsonName() {
                return ((FieldDescriptorProto) this.instance).getJsonName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getJsonNameBytes() {
                return ((FieldDescriptorProto) this.instance).getJsonNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public Label getLabel() {
                return ((FieldDescriptorProto) this.instance).getLabel();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getName() {
                return ((FieldDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((FieldDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public int getNumber() {
                return ((FieldDescriptorProto) this.instance).getNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public int getOneofIndex() {
                return ((FieldDescriptorProto) this.instance).getOneofIndex();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public FieldOptions getOptions() {
                return ((FieldDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean getProto3Optional() {
                return ((FieldDescriptorProto) this.instance).getProto3Optional();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public Type getType() {
                return ((FieldDescriptorProto) this.instance).getType();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getTypeName() {
                return ((FieldDescriptorProto) this.instance).getTypeName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getTypeNameBytes() {
                return ((FieldDescriptorProto) this.instance).getTypeNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasDefaultValue() {
                return ((FieldDescriptorProto) this.instance).hasDefaultValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasExtendee() {
                return ((FieldDescriptorProto) this.instance).hasExtendee();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasJsonName() {
                return ((FieldDescriptorProto) this.instance).hasJsonName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasLabel() {
                return ((FieldDescriptorProto) this.instance).hasLabel();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((FieldDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasNumber() {
                return ((FieldDescriptorProto) this.instance).hasNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasOneofIndex() {
                return ((FieldDescriptorProto) this.instance).hasOneofIndex();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((FieldDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasProto3Optional() {
                return ((FieldDescriptorProto) this.instance).hasProto3Optional();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasType() {
                return ((FieldDescriptorProto) this.instance).hasType();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasTypeName() {
                return ((FieldDescriptorProto) this.instance).hasTypeName();
            }

            public Builder mergeOptions(FieldOptions fieldOptions) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).mergeOptions(fieldOptions);
                return this;
            }

            public Builder setDefaultValue(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setDefaultValue(str);
                return this;
            }

            public Builder setDefaultValueBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setDefaultValueBytes(byteString);
                return this;
            }

            public Builder setExtendee(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setExtendee(str);
                return this;
            }

            public Builder setExtendeeBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setExtendeeBytes(byteString);
                return this;
            }

            public Builder setJsonName(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setJsonName(str);
                return this;
            }

            public Builder setJsonNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setJsonNameBytes(byteString);
                return this;
            }

            public Builder setLabel(Label label) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setLabel(label);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNumber(int i10) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setNumber(i10);
                return this;
            }

            public Builder setOneofIndex(int i10) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setOneofIndex(i10);
                return this;
            }

            public Builder setOptions(FieldOptions fieldOptions) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setOptions(fieldOptions);
                return this;
            }

            public Builder setProto3Optional(boolean z10) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setProto3Optional(z10);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setType(type);
                return this;
            }

            public Builder setTypeName(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setTypeName(str);
                return this;
            }

            public Builder setTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setTypeNameBytes(byteString);
                return this;
            }

            private Builder() {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(FieldOptions.Builder builder) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setOptions((FieldOptions) builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum Label implements Internal.EnumLite {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);

            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private static final Internal.EnumLiteMap<Label> internalValueMap = new Internal.EnumLiteMap<Label>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Label findValueByNumber(int i10) {
                    return Label.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class LabelVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new LabelVerifier();

                private LabelVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return Label.forNumber(i10) != null;
                }
            }

            Label(int i10) {
                this.value = i10;
            }

            public static Label forNumber(int i10) {
                if (i10 == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i10 == 2) {
                    return LABEL_REQUIRED;
                }
                if (i10 != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static Internal.EnumLiteMap<Label> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return LabelVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Label valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum Type implements Internal.EnumLite {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int TYPE_BOOL_VALUE = 8;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final int TYPE_INT32_VALUE = 5;
            public static final int TYPE_INT64_VALUE = 3;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final int TYPE_STRING_VALUE = 9;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final int TYPE_UINT64_VALUE = 4;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i10) {
                    return Type.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class TypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return Type.forNumber(i10) != null;
                }
            }

            Type(int i10) {
                this.value = i10;
            }

            public static Type forNumber(int i10) {
                switch (i10) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto();
            DEFAULT_INSTANCE = fieldDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FieldDescriptorProto.class, fieldDescriptorProto);
        }

        private FieldDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultValue() {
            this.bitField0_ &= -65;
            this.defaultValue_ = getDefaultInstance().getDefaultValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtendee() {
            this.bitField0_ &= -33;
            this.extendee_ = getDefaultInstance().getExtendee();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJsonName() {
            this.bitField0_ &= -257;
            this.jsonName_ = getDefaultInstance().getJsonName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofIndex() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProto3Optional() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeName() {
            this.bitField0_ &= -17;
            this.typeName_ = getDefaultInstance().getTypeName();
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(FieldOptions fieldOptions) {
            fieldOptions.getClass();
            FieldOptions fieldOptions2 = this.options_;
            if (fieldOptions2 == null || fieldOptions2 == FieldOptions.getDefaultInstance()) {
                this.options_ = fieldOptions;
            } else {
                this.options_ = ((FieldOptions.Builder) FieldOptions.newBuilder(this.options_).mergeFrom((FieldOptions.Builder) fieldOptions)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FieldDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValue(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValueBytes(ByteString byteString) {
            this.defaultValue_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendee(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendeeBytes(ByteString byteString) {
            this.extendee_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonName(String str) {
            str.getClass();
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.jsonName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonNameBytes(ByteString byteString) {
            this.jsonName_ = byteString.toStringUtf8();
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabel(Label label) {
            this.label_ = label.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i10) {
            this.bitField0_ |= 2;
            this.number_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofIndex(int i10) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(FieldOptions fieldOptions) {
            fieldOptions.getClass();
            this.options_ = fieldOptions;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto3Optional(boolean z10) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            this.type_ = type.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeName(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeNameBytes(ByteString byteString) {
            this.typeName_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.internalGetVerifier(), "type_", Type.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FieldDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getDefaultValue() {
            return this.defaultValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getDefaultValueBytes() {
            return ByteString.copyFromUtf8(this.defaultValue_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getExtendee() {
            return this.extendee_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getExtendeeBytes() {
            return ByteString.copyFromUtf8(this.extendee_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getJsonName() {
            return this.jsonName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getJsonNameBytes() {
            return ByteString.copyFromUtf8(this.jsonName_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public Label getLabel() {
            Label labelForNumber = Label.forNumber(this.label_);
            return labelForNumber == null ? Label.LABEL_OPTIONAL : labelForNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public FieldOptions getOptions() {
            FieldOptions fieldOptions = this.options_;
            return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.TYPE_DOUBLE : typeForNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getTypeName() {
            return this.typeName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getTypeNameBytes() {
            return ByteString.copyFromUtf8(this.typeName_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasJsonName() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(FieldDescriptorProto fieldDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(fieldDescriptorProto);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface FieldDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDefaultValue();

        ByteString getDefaultValueBytes();

        String getExtendee();

        ByteString getExtendeeBytes();

        String getJsonName();

        ByteString getJsonNameBytes();

        FieldDescriptorProto.Label getLabel();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getOneofIndex();

        FieldOptions getOptions();

        boolean getProto3Optional();

        FieldDescriptorProto.Type getType();

        String getTypeName();

        ByteString getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasJsonName();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasProto3Optional();

        boolean hasType();

        boolean hasTypeName();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FieldOptions extends GeneratedMessageLite.ExtendableMessage<FieldOptions, Builder> implements FieldOptionsOrBuilder {
        public static final int CTYPE_FIELD_NUMBER = 1;
        private static final FieldOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile Parser<FieldOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FieldOptions, Builder> implements FieldOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((FieldOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearCtype() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearCtype();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearJstype() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearJstype();
                return this;
            }

            public Builder clearLazy() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearLazy();
                return this;
            }

            public Builder clearPacked() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearPacked();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder clearWeak() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearWeak();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public CType getCtype() {
                return ((FieldOptions) this.instance).getCtype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getDeprecated() {
                return ((FieldOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public JSType getJstype() {
                return ((FieldOptions) this.instance).getJstype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getLazy() {
                return ((FieldOptions) this.instance).getLazy();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getPacked() {
                return ((FieldOptions) this.instance).getPacked();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((FieldOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((FieldOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FieldOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getWeak() {
                return ((FieldOptions) this.instance).getWeak();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasCtype() {
                return ((FieldOptions) this.instance).hasCtype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((FieldOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasJstype() {
                return ((FieldOptions) this.instance).hasJstype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasLazy() {
                return ((FieldOptions) this.instance).hasLazy();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasPacked() {
                return ((FieldOptions) this.instance).hasPacked();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasWeak() {
                return ((FieldOptions) this.instance).hasWeak();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((FieldOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setCtype(CType cType) {
                copyOnWrite();
                ((FieldOptions) this.instance).setCtype(cType);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((FieldOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setJstype(JSType jSType) {
                copyOnWrite();
                ((FieldOptions) this.instance).setJstype(jSType);
                return this;
            }

            public Builder setLazy(boolean z10) {
                copyOnWrite();
                ((FieldOptions) this.instance).setLazy(z10);
                return this;
            }

            public Builder setPacked(boolean z10) {
                copyOnWrite();
                ((FieldOptions) this.instance).setPacked(z10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FieldOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setWeak(boolean z10) {
                copyOnWrite();
                ((FieldOptions) this.instance).setWeak(z10);
                return this;
            }

            private Builder() {
                super(FieldOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum CType implements Internal.EnumLite {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE = 0;
            private static final Internal.EnumLiteMap<CType> internalValueMap = new Internal.EnumLiteMap<CType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.CType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CType findValueByNumber(int i10) {
                    return CType.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class CTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new CTypeVerifier();

                private CTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return CType.forNumber(i10) != null;
                }
            }

            CType(int i10) {
                this.value = i10;
            }

            public static CType forNumber(int i10) {
                if (i10 == 0) {
                    return STRING;
                }
                if (i10 == 1) {
                    return CORD;
                }
                if (i10 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static Internal.EnumLiteMap<CType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return CTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CType valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum JSType implements Internal.EnumLite {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public static final int JS_NORMAL_VALUE = 0;
            public static final int JS_NUMBER_VALUE = 2;
            public static final int JS_STRING_VALUE = 1;
            private static final Internal.EnumLiteMap<JSType> internalValueMap = new Internal.EnumLiteMap<JSType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.JSType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public JSType findValueByNumber(int i10) {
                    return JSType.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class JSTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new JSTypeVerifier();

                private JSTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return JSType.forNumber(i10) != null;
                }
            }

            JSType(int i10) {
                this.value = i10;
            }

            public static JSType forNumber(int i10) {
                if (i10 == 0) {
                    return JS_NORMAL;
                }
                if (i10 == 1) {
                    return JS_STRING;
                }
                if (i10 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static Internal.EnumLiteMap<JSType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return JSTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static JSType valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            FieldOptions fieldOptions = new FieldOptions();
            DEFAULT_INSTANCE = fieldOptions;
            GeneratedMessageLite.registerDefaultInstance(FieldOptions.class, fieldOptions);
        }

        private FieldOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -17;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeak() {
            this.bitField0_ &= -33;
            this.weak_ = false;
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FieldOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtype(CType cType) {
            this.ctype_ = cType.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 16;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJstype(JSType jSType) {
            this.jstype_ = jSType.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLazy(boolean z10) {
            this.bitField0_ |= 8;
            this.lazy_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacked(boolean z10) {
            this.bitField0_ |= 2;
            this.packed_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeak(boolean z10) {
            this.bitField0_ |= 32;
            this.weak_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", CType.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", JSType.internalGetVerifier(), "weak_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FieldOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public CType getCtype() {
            CType cTypeForNumber = CType.forNumber(this.ctype_);
            return cTypeForNumber == null ? CType.STRING : cTypeForNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public JSType getJstype() {
            JSType jSTypeForNumber = JSType.forNumber(this.jstype_);
            return jSTypeForNumber == null ? JSType.JS_NORMAL : jSTypeForNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasWeak() {
            return (this.bitField0_ & 32) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(FieldOptions fieldOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fieldOptions);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static FieldOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface FieldOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FieldOptions, FieldOptions.Builder> {
        FieldOptions.CType getCtype();

        boolean getDeprecated();

        FieldOptions.JSType getJstype();

        boolean getLazy();

        boolean getPacked();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDeprecated();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasWeak();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FileDescriptorProto extends GeneratedMessageLite<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
        private static final FileDescriptorProto DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile Parser<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private FileOptions options_;
        private SourceCodeInfo sourceCodeInfo_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";
        private Internal.ProtobufList<String> dependency_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList publicDependency_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList weakDependency_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<DescriptorProto> messageType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ServiceDescriptorProto> service_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
        private String syntax_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllDependency(Iterable<String> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllDependency(iterable);
                return this;
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllEnumType(iterable);
                return this;
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllExtension(iterable);
                return this;
            }

            public Builder addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllMessageType(iterable);
                return this;
            }

            public Builder addAllPublicDependency(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllPublicDependency(iterable);
                return this;
            }

            public Builder addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllService(iterable);
                return this;
            }

            public Builder addAllWeakDependency(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllWeakDependency(iterable);
                return this;
            }

            public Builder addDependency(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addDependency(str);
                return this;
            }

            public Builder addDependencyBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addDependencyBytes(byteString);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(enumDescriptorProto);
                return this;
            }

            public Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(fieldDescriptorProto);
                return this;
            }

            public Builder addMessageType(DescriptorProto descriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(descriptorProto);
                return this;
            }

            public Builder addPublicDependency(int i10) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addPublicDependency(i10);
                return this;
            }

            public Builder addService(ServiceDescriptorProto serviceDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(serviceDescriptorProto);
                return this;
            }

            public Builder addWeakDependency(int i10) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addWeakDependency(i10);
                return this;
            }

            public Builder clearDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearDependency();
                return this;
            }

            public Builder clearEnumType() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearEnumType();
                return this;
            }

            public Builder clearExtension() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearExtension();
                return this;
            }

            public Builder clearMessageType() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearMessageType();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearPackage() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearPackage();
                return this;
            }

            public Builder clearPublicDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearPublicDependency();
                return this;
            }

            public Builder clearService() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearService();
                return this;
            }

            public Builder clearSourceCodeInfo() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearSourceCodeInfo();
                return this;
            }

            public Builder clearSyntax() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearSyntax();
                return this;
            }

            public Builder clearWeakDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearWeakDependency();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getDependency(int i10) {
                return ((FileDescriptorProto) this.instance).getDependency(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getDependencyBytes(int i10) {
                return ((FileDescriptorProto) this.instance).getDependencyBytes(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getDependencyCount() {
                return ((FileDescriptorProto) this.instance).getDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<String> getDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int i10) {
                return ((FileDescriptorProto) this.instance).getEnumType(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getEnumTypeCount() {
                return ((FileDescriptorProto) this.instance).getEnumTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getEnumTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int i10) {
                return ((FileDescriptorProto) this.instance).getExtension(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getExtensionCount() {
                return ((FileDescriptorProto) this.instance).getExtensionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getExtensionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public DescriptorProto getMessageType(int i10) {
                return ((FileDescriptorProto) this.instance).getMessageType(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getMessageTypeCount() {
                return ((FileDescriptorProto) this.instance).getMessageTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<DescriptorProto> getMessageTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getMessageTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getName() {
                return ((FileDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((FileDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public FileOptions getOptions() {
                return ((FileDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getPackage() {
                return ((FileDescriptorProto) this.instance).getPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getPackageBytes() {
                return ((FileDescriptorProto) this.instance).getPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getPublicDependency(int i10) {
                return ((FileDescriptorProto) this.instance).getPublicDependency(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getPublicDependencyCount() {
                return ((FileDescriptorProto) this.instance).getPublicDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getPublicDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ServiceDescriptorProto getService(int i10) {
                return ((FileDescriptorProto) this.instance).getService(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getServiceCount() {
                return ((FileDescriptorProto) this.instance).getServiceCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<ServiceDescriptorProto> getServiceList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getServiceList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public SourceCodeInfo getSourceCodeInfo() {
                return ((FileDescriptorProto) this.instance).getSourceCodeInfo();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getSyntax() {
                return ((FileDescriptorProto) this.instance).getSyntax();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getSyntaxBytes() {
                return ((FileDescriptorProto) this.instance).getSyntaxBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getWeakDependency(int i10) {
                return ((FileDescriptorProto) this.instance).getWeakDependency(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getWeakDependencyCount() {
                return ((FileDescriptorProto) this.instance).getWeakDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getWeakDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((FileDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((FileDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasPackage() {
                return ((FileDescriptorProto) this.instance).hasPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasSourceCodeInfo() {
                return ((FileDescriptorProto) this.instance).hasSourceCodeInfo();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasSyntax() {
                return ((FileDescriptorProto) this.instance).hasSyntax();
            }

            public Builder mergeOptions(FileOptions fileOptions) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).mergeOptions(fileOptions);
                return this;
            }

            public Builder mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).mergeSourceCodeInfo(sourceCodeInfo);
                return this;
            }

            public Builder removeEnumType(int i10) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeEnumType(i10);
                return this;
            }

            public Builder removeExtension(int i10) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeExtension(i10);
                return this;
            }

            public Builder removeMessageType(int i10) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeMessageType(i10);
                return this;
            }

            public Builder removeService(int i10) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeService(i10);
                return this;
            }

            public Builder setDependency(int i10, String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setDependency(i10, str);
                return this;
            }

            public Builder setEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setEnumType(i10, enumDescriptorProto);
                return this;
            }

            public Builder setExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setExtension(i10, fieldDescriptorProto);
                return this;
            }

            public Builder setMessageType(int i10, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setMessageType(i10, descriptorProto);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOptions(FileOptions fileOptions) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setOptions(fileOptions);
                return this;
            }

            public Builder setPackage(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setPackage(str);
                return this;
            }

            public Builder setPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setPackageBytes(byteString);
                return this;
            }

            public Builder setPublicDependency(int i10, int i11) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setPublicDependency(i10, i11);
                return this;
            }

            public Builder setService(int i10, ServiceDescriptorProto serviceDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setService(i10, serviceDescriptorProto);
                return this;
            }

            public Builder setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSourceCodeInfo(sourceCodeInfo);
                return this;
            }

            public Builder setSyntax(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSyntax(str);
                return this;
            }

            public Builder setSyntaxBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSyntaxBytes(byteString);
                return this;
            }

            public Builder setWeakDependency(int i10, int i11) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setWeakDependency(i10, i11);
                return this;
            }

            private Builder() {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(i10, enumDescriptorProto);
                return this;
            }

            public Builder addExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(i10, fieldDescriptorProto);
                return this;
            }

            public Builder addMessageType(int i10, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(i10, descriptorProto);
                return this;
            }

            public Builder addService(int i10, ServiceDescriptorProto serviceDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(i10, serviceDescriptorProto);
                return this;
            }

            public Builder setEnumType(int i10, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setEnumType(i10, builder.build());
                return this;
            }

            public Builder setExtension(int i10, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setExtension(i10, builder.build());
                return this;
            }

            public Builder setMessageType(int i10, DescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setMessageType(i10, builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(FileOptions.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setOptions((FileOptions) builder.build());
                return this;
            }

            public Builder setService(int i10, ServiceDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setService(i10, builder.build());
                return this;
            }

            public Builder setSourceCodeInfo(SourceCodeInfo.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSourceCodeInfo(builder.build());
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(builder.build());
                return this;
            }

            public Builder addExtension(FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(builder.build());
                return this;
            }

            public Builder addMessageType(DescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(builder.build());
                return this;
            }

            public Builder addService(ServiceDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(builder.build());
                return this;
            }

            public Builder addEnumType(int i10, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(i10, builder.build());
                return this;
            }

            public Builder addExtension(int i10, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(i10, builder.build());
                return this;
            }

            public Builder addMessageType(int i10, DescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(i10, builder.build());
                return this;
            }

            public Builder addService(int i10, ServiceDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(i10, builder.build());
                return this;
            }
        }

        static {
            FileDescriptorProto fileDescriptorProto = new FileDescriptorProto();
            DEFAULT_INSTANCE = fileDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorProto.class, fileDescriptorProto);
        }

        private FileDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
            ensureMessageTypeIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.messageType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.publicDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
            ensureServiceIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.service_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.weakDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependencyBytes(ByteString byteString) {
            ensureDependencyIsMutable();
            this.dependency_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublicDependency(int i10) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.add(serviceDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWeakDependency(int i10) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDependency() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageType() {
            this.messageType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackage() {
            this.bitField0_ &= -3;
            this.package_ = getDefaultInstance().getPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicDependency() {
            this.publicDependency_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = getDefaultInstance().getSyntax();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeakDependency() {
            this.weakDependency_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureDependencyIsMutable() {
            Internal.ProtobufList<String> protobufList = this.dependency_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.dependency_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureEnumTypeIsMutable() {
            Internal.ProtobufList<EnumDescriptorProto> protobufList = this.enumType_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.enumType_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureExtensionIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> protobufList = this.extension_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.extension_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureMessageTypeIsMutable() {
            Internal.ProtobufList<DescriptorProto> protobufList = this.messageType_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.messageType_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensurePublicDependencyIsMutable() {
            Internal.IntList intList = this.publicDependency_;
            if (intList.isModifiable()) {
                return;
            }
            this.publicDependency_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureServiceIsMutable() {
            Internal.ProtobufList<ServiceDescriptorProto> protobufList = this.service_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.service_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureWeakDependencyIsMutable() {
            Internal.IntList intList = this.weakDependency_;
            if (intList.isModifiable()) {
                return;
            }
            this.weakDependency_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(FileOptions fileOptions) {
            fileOptions.getClass();
            FileOptions fileOptions2 = this.options_;
            if (fileOptions2 == null || fileOptions2 == FileOptions.getDefaultInstance()) {
                this.options_ = fileOptions;
            } else {
                this.options_ = ((FileOptions.Builder) FileOptions.newBuilder(this.options_).mergeFrom((FileOptions.Builder) fileOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            SourceCodeInfo sourceCodeInfo2 = this.sourceCodeInfo_;
            if (sourceCodeInfo2 == null || sourceCodeInfo2 == SourceCodeInfo.getDefaultInstance()) {
                this.sourceCodeInfo_ = sourceCodeInfo;
            } else {
                this.sourceCodeInfo_ = SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom((SourceCodeInfo.Builder) sourceCodeInfo).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FileDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int i10) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int i10) {
            ensureExtensionIsMutable();
            this.extension_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMessageType(int i10) {
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeService(int i10) {
            ensureServiceIsMutable();
            this.service_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDependency(int i10, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i10, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i10, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageType(int i10, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.set(i10, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(FileOptions fileOptions) {
            fileOptions.getClass();
            this.options_ = fileOptions;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackage(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.package_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackageBytes(ByteString byteString) {
            this.package_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicDependency(int i10, int i11) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(int i10, ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.set(i10, serviceDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            this.sourceCodeInfo_ = sourceCodeInfo;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntax(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntaxBytes(ByteString byteString) {
            this.syntax_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeakDependency(int i10, int i11) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.setInt(i10, i11);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FileDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FileDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getDependency(int i10) {
            return this.dependency_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getDependencyBytes(int i10) {
            return ByteString.copyFromUtf8(this.dependency_.get(i10));
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getDependencyCount() {
            return this.dependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<String> getDependencyList() {
            return this.dependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int i10) {
            return this.enumType_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i10) {
            return this.enumType_.get(i10);
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int i10) {
            return this.extension_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i10) {
            return this.extension_.get(i10);
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public DescriptorProto getMessageType(int i10) {
            return this.messageType_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i10) {
            return this.messageType_.get(i10);
        }

        public List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public FileOptions getOptions() {
            FileOptions fileOptions = this.options_;
            return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getPackage() {
            return this.package_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getPackageBytes() {
            return ByteString.copyFromUtf8(this.package_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getPublicDependency(int i10) {
            return this.publicDependency_.getInt(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ServiceDescriptorProto getService(int i10) {
            return this.service_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getServiceCount() {
            return this.service_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i10) {
            return this.service_.get(i10);
        }

        public List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
            return this.service_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public SourceCodeInfo getSourceCodeInfo() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getSyntax() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getSyntaxBytes() {
            return ByteString.copyFromUtf8(this.syntax_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getWeakDependency(int i10) {
            return this.weakDependency_.getInt(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(FileDescriptorProto fileDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(fileDescriptorProto);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int i10, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i10, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int i10, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i10, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(int i10, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(i10, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(int i10, ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.add(i10, serviceDescriptorProto);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface FileDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDependency(int i10);

        ByteString getDependencyBytes(int i10);

        int getDependencyCount();

        List<String> getDependencyList();

        EnumDescriptorProto getEnumType(int i10);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i10);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto getMessageType(int i10);

        int getMessageTypeCount();

        List<DescriptorProto> getMessageTypeList();

        String getName();

        ByteString getNameBytes();

        FileOptions getOptions();

        String getPackage();

        ByteString getPackageBytes();

        int getPublicDependency(int i10);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        ServiceDescriptorProto getService(int i10);

        int getServiceCount();

        List<ServiceDescriptorProto> getServiceList();

        SourceCodeInfo getSourceCodeInfo();

        String getSyntax();

        ByteString getSyntaxBytes();

        int getWeakDependency(int i10);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FileDescriptorSet extends GeneratedMessageLite<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
        private static final FileDescriptorSet DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile Parser<FileDescriptorSet> PARSER;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<FileDescriptorProto> file_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addAllFile(iterable);
                return this;
            }

            public Builder addFile(FileDescriptorProto fileDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(fileDescriptorProto);
                return this;
            }

            public Builder clearFile() {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).clearFile();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public FileDescriptorProto getFile(int i10) {
                return ((FileDescriptorSet) this.instance).getFile(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public int getFileCount() {
                return ((FileDescriptorSet) this.instance).getFileCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public List<FileDescriptorProto> getFileList() {
                return Collections.unmodifiableList(((FileDescriptorSet) this.instance).getFileList());
            }

            public Builder removeFile(int i10) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).removeFile(i10);
                return this;
            }

            public Builder setFile(int i10, FileDescriptorProto fileDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).setFile(i10, fileDescriptorProto);
                return this;
            }

            private Builder() {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }

            public Builder addFile(int i10, FileDescriptorProto fileDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(i10, fileDescriptorProto);
                return this;
            }

            public Builder setFile(int i10, FileDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).setFile(i10, builder.build());
                return this;
            }

            public Builder addFile(FileDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(builder.build());
                return this;
            }

            public Builder addFile(int i10, FileDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(i10, builder.build());
                return this;
            }
        }

        static {
            FileDescriptorSet fileDescriptorSet = new FileDescriptorSet();
            DEFAULT_INSTANCE = fileDescriptorSet;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorSet.class, fileDescriptorSet);
        }

        private FileDescriptorSet() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
            ensureFileIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.add(fileDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFile() {
            this.file_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureFileIsMutable() {
            Internal.ProtobufList<FileDescriptorProto> protobufList = this.file_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.file_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static FileDescriptorSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FileDescriptorSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFile(int i10) {
            ensureFileIsMutable();
            this.file_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFile(int i10, FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.set(i10, fileDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileDescriptorSet();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", FileDescriptorProto.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FileDescriptorSet> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FileDescriptorSet.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public FileDescriptorProto getFile(int i10) {
            return this.file_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public int getFileCount() {
            return this.file_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public FileDescriptorProtoOrBuilder getFileOrBuilder(int i10) {
            return this.file_.get(i10);
        }

        public List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        public static Builder newBuilder(FileDescriptorSet fileDescriptorSet) {
            return DEFAULT_INSTANCE.createBuilder(fileDescriptorSet);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(int i10, FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.add(i10, fileDescriptorProto);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface FileDescriptorSetOrBuilder extends MessageLiteOrBuilder {
        FileDescriptorProto getFile(int i10);

        int getFileCount();

        List<FileDescriptorProto> getFileList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FileOptions extends GeneratedMessageLite.ExtendableMessage<FileOptions, Builder> implements FileOptionsOrBuilder {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final FileOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile Parser<FileOptions> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
        private boolean phpGenericServices_;
        private boolean pyGenericServices_;
        private byte memoizedIsInitialized = 2;
        private String javaPackage_ = "";
        private String javaOuterClassname_ = "";
        private int optimizeFor_ = 1;
        private String goPackage_ = "";
        private boolean ccEnableArenas_ = true;
        private String objcClassPrefix_ = "";
        private String csharpNamespace_ = "";
        private String swiftPrefix_ = "";
        private String phpClassPrefix_ = "";
        private String phpNamespace_ = "";
        private String phpMetadataNamespace_ = "";
        private String rubyPackage_ = "";
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FileOptions, Builder> implements FileOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((FileOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearCcEnableArenas() {
                copyOnWrite();
                ((FileOptions) this.instance).clearCcEnableArenas();
                return this;
            }

            public Builder clearCcGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearCcGenericServices();
                return this;
            }

            public Builder clearCsharpNamespace() {
                copyOnWrite();
                ((FileOptions) this.instance).clearCsharpNamespace();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((FileOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearGoPackage() {
                copyOnWrite();
                ((FileOptions) this.instance).clearGoPackage();
                return this;
            }

            @Deprecated
            public Builder clearJavaGenerateEqualsAndHash() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaGenerateEqualsAndHash();
                return this;
            }

            public Builder clearJavaGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaGenericServices();
                return this;
            }

            public Builder clearJavaMultipleFiles() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaMultipleFiles();
                return this;
            }

            public Builder clearJavaOuterClassname() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaOuterClassname();
                return this;
            }

            public Builder clearJavaPackage() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaPackage();
                return this;
            }

            public Builder clearJavaStringCheckUtf8() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaStringCheckUtf8();
                return this;
            }

            public Builder clearObjcClassPrefix() {
                copyOnWrite();
                ((FileOptions) this.instance).clearObjcClassPrefix();
                return this;
            }

            public Builder clearOptimizeFor() {
                copyOnWrite();
                ((FileOptions) this.instance).clearOptimizeFor();
                return this;
            }

            public Builder clearPhpClassPrefix() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpClassPrefix();
                return this;
            }

            public Builder clearPhpGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpGenericServices();
                return this;
            }

            public Builder clearPhpMetadataNamespace() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpMetadataNamespace();
                return this;
            }

            public Builder clearPhpNamespace() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpNamespace();
                return this;
            }

            public Builder clearPyGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPyGenericServices();
                return this;
            }

            public Builder clearRubyPackage() {
                copyOnWrite();
                ((FileOptions) this.instance).clearRubyPackage();
                return this;
            }

            public Builder clearSwiftPrefix() {
                copyOnWrite();
                ((FileOptions) this.instance).clearSwiftPrefix();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((FileOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getCcEnableArenas() {
                return ((FileOptions) this.instance).getCcEnableArenas();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getCcGenericServices() {
                return ((FileOptions) this.instance).getCcGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getCsharpNamespace() {
                return ((FileOptions) this.instance).getCsharpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getCsharpNamespaceBytes() {
                return ((FileOptions) this.instance).getCsharpNamespaceBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getDeprecated() {
                return ((FileOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getGoPackage() {
                return ((FileOptions) this.instance).getGoPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getGoPackageBytes() {
                return ((FileOptions) this.instance).getGoPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((FileOptions) this.instance).getJavaGenerateEqualsAndHash();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaGenericServices() {
                return ((FileOptions) this.instance).getJavaGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaMultipleFiles() {
                return ((FileOptions) this.instance).getJavaMultipleFiles();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getJavaOuterClassname() {
                return ((FileOptions) this.instance).getJavaOuterClassname();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getJavaOuterClassnameBytes() {
                return ((FileOptions) this.instance).getJavaOuterClassnameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getJavaPackage() {
                return ((FileOptions) this.instance).getJavaPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getJavaPackageBytes() {
                return ((FileOptions) this.instance).getJavaPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaStringCheckUtf8() {
                return ((FileOptions) this.instance).getJavaStringCheckUtf8();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getObjcClassPrefix() {
                return ((FileOptions) this.instance).getObjcClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getObjcClassPrefixBytes() {
                return ((FileOptions) this.instance).getObjcClassPrefixBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public OptimizeMode getOptimizeFor() {
                return ((FileOptions) this.instance).getOptimizeFor();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpClassPrefix() {
                return ((FileOptions) this.instance).getPhpClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpClassPrefixBytes() {
                return ((FileOptions) this.instance).getPhpClassPrefixBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getPhpGenericServices() {
                return ((FileOptions) this.instance).getPhpGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpMetadataNamespace() {
                return ((FileOptions) this.instance).getPhpMetadataNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpMetadataNamespaceBytes() {
                return ((FileOptions) this.instance).getPhpMetadataNamespaceBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpNamespace() {
                return ((FileOptions) this.instance).getPhpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpNamespaceBytes() {
                return ((FileOptions) this.instance).getPhpNamespaceBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getPyGenericServices() {
                return ((FileOptions) this.instance).getPyGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getRubyPackage() {
                return ((FileOptions) this.instance).getRubyPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getRubyPackageBytes() {
                return ((FileOptions) this.instance).getRubyPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getSwiftPrefix() {
                return ((FileOptions) this.instance).getSwiftPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getSwiftPrefixBytes() {
                return ((FileOptions) this.instance).getSwiftPrefixBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((FileOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((FileOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FileOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCcEnableArenas() {
                return ((FileOptions) this.instance).hasCcEnableArenas();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCcGenericServices() {
                return ((FileOptions) this.instance).hasCcGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCsharpNamespace() {
                return ((FileOptions) this.instance).hasCsharpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((FileOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasGoPackage() {
                return ((FileOptions) this.instance).hasGoPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((FileOptions) this.instance).hasJavaGenerateEqualsAndHash();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaGenericServices() {
                return ((FileOptions) this.instance).hasJavaGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaMultipleFiles() {
                return ((FileOptions) this.instance).hasJavaMultipleFiles();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaOuterClassname() {
                return ((FileOptions) this.instance).hasJavaOuterClassname();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaPackage() {
                return ((FileOptions) this.instance).hasJavaPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaStringCheckUtf8() {
                return ((FileOptions) this.instance).hasJavaStringCheckUtf8();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasObjcClassPrefix() {
                return ((FileOptions) this.instance).hasObjcClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasOptimizeFor() {
                return ((FileOptions) this.instance).hasOptimizeFor();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpClassPrefix() {
                return ((FileOptions) this.instance).hasPhpClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpGenericServices() {
                return ((FileOptions) this.instance).hasPhpGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpMetadataNamespace() {
                return ((FileOptions) this.instance).hasPhpMetadataNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpNamespace() {
                return ((FileOptions) this.instance).hasPhpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPyGenericServices() {
                return ((FileOptions) this.instance).hasPyGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasRubyPackage() {
                return ((FileOptions) this.instance).hasRubyPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasSwiftPrefix() {
                return ((FileOptions) this.instance).hasSwiftPrefix();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((FileOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setCcEnableArenas(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setCcEnableArenas(z10);
                return this;
            }

            public Builder setCcGenericServices(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setCcGenericServices(z10);
                return this;
            }

            public Builder setCsharpNamespace(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setCsharpNamespace(str);
                return this;
            }

            public Builder setCsharpNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setCsharpNamespaceBytes(byteString);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setGoPackage(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setGoPackage(str);
                return this;
            }

            public Builder setGoPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setGoPackageBytes(byteString);
                return this;
            }

            @Deprecated
            public Builder setJavaGenerateEqualsAndHash(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaGenerateEqualsAndHash(z10);
                return this;
            }

            public Builder setJavaGenericServices(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaGenericServices(z10);
                return this;
            }

            public Builder setJavaMultipleFiles(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaMultipleFiles(z10);
                return this;
            }

            public Builder setJavaOuterClassname(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaOuterClassname(str);
                return this;
            }

            public Builder setJavaOuterClassnameBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaOuterClassnameBytes(byteString);
                return this;
            }

            public Builder setJavaPackage(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaPackage(str);
                return this;
            }

            public Builder setJavaPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaPackageBytes(byteString);
                return this;
            }

            public Builder setJavaStringCheckUtf8(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaStringCheckUtf8(z10);
                return this;
            }

            public Builder setObjcClassPrefix(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setObjcClassPrefix(str);
                return this;
            }

            public Builder setObjcClassPrefixBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setObjcClassPrefixBytes(byteString);
                return this;
            }

            public Builder setOptimizeFor(OptimizeMode optimizeMode) {
                copyOnWrite();
                ((FileOptions) this.instance).setOptimizeFor(optimizeMode);
                return this;
            }

            public Builder setPhpClassPrefix(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpClassPrefix(str);
                return this;
            }

            public Builder setPhpClassPrefixBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpClassPrefixBytes(byteString);
                return this;
            }

            public Builder setPhpGenericServices(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpGenericServices(z10);
                return this;
            }

            public Builder setPhpMetadataNamespace(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpMetadataNamespace(str);
                return this;
            }

            public Builder setPhpMetadataNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpMetadataNamespaceBytes(byteString);
                return this;
            }

            public Builder setPhpNamespace(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpNamespace(str);
                return this;
            }

            public Builder setPhpNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpNamespaceBytes(byteString);
                return this;
            }

            public Builder setPyGenericServices(boolean z10) {
                copyOnWrite();
                ((FileOptions) this.instance).setPyGenericServices(z10);
                return this;
            }

            public Builder setRubyPackage(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setRubyPackage(str);
                return this;
            }

            public Builder setRubyPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setRubyPackageBytes(byteString);
                return this;
            }

            public Builder setSwiftPrefix(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setSwiftPrefix(str);
                return this;
            }

            public Builder setSwiftPrefixBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setSwiftPrefixBytes(byteString);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FileOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(FileOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum OptimizeMode implements Internal.EnumLite {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final int SPEED_VALUE = 1;
            private static final Internal.EnumLiteMap<OptimizeMode> internalValueMap = new Internal.EnumLiteMap<OptimizeMode>() { // from class: com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptimizeMode findValueByNumber(int i10) {
                    return OptimizeMode.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class OptimizeModeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptimizeModeVerifier();

                private OptimizeModeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return OptimizeMode.forNumber(i10) != null;
                }
            }

            OptimizeMode(int i10) {
                this.value = i10;
            }

            public static OptimizeMode forNumber(int i10) {
                if (i10 == 1) {
                    return SPEED;
                }
                if (i10 == 2) {
                    return CODE_SIZE;
                }
                if (i10 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static Internal.EnumLiteMap<OptimizeMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptimizeModeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptimizeMode valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            FileOptions fileOptions = new FileOptions();
            DEFAULT_INSTANCE = fileOptions;
            GeneratedMessageLite.registerDefaultInstance(FileOptions.class, fileOptions);
        }

        private FileOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcEnableArenas() {
            this.bitField0_ &= -4097;
            this.ccEnableArenas_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCsharpNamespace() {
            this.bitField0_ &= -16385;
            this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2049;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoPackage() {
            this.bitField0_ &= -65;
            this.goPackage_ = getDefaultInstance().getGoPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaOuterClassname() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaPackage() {
            this.bitField0_ &= -2;
            this.javaPackage_ = getDefaultInstance().getJavaPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearObjcClassPrefix() {
            this.bitField0_ &= -8193;
            this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpClassPrefix() {
            this.bitField0_ &= -65537;
            this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpGenericServices() {
            this.bitField0_ &= -1025;
            this.phpGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpMetadataNamespace() {
            this.bitField0_ &= -262145;
            this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpNamespace() {
            this.bitField0_ &= -131073;
            this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRubyPackage() {
            this.bitField0_ &= -524289;
            this.rubyPackage_ = getDefaultInstance().getRubyPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwiftPrefix() {
            this.bitField0_ &= -32769;
            this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FileOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcEnableArenas(boolean z10) {
            this.bitField0_ |= 4096;
            this.ccEnableArenas_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcGenericServices(boolean z10) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.csharpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespaceBytes(ByteString byteString) {
            this.csharpNamespace_ = byteString.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 2048;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackage(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackageBytes(ByteString byteString) {
            this.goPackage_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenerateEqualsAndHash(boolean z10) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenericServices(boolean z10) {
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.javaGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaMultipleFiles(boolean z10) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassnameBytes(ByteString byteString) {
            this.javaOuterClassname_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackageBytes(ByteString byteString) {
            this.javaPackage_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaStringCheckUtf8(boolean z10) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= Segment.SIZE;
            this.objcClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefixBytes(ByteString byteString) {
            this.objcClassPrefix_ = byteString.toStringUtf8();
            this.bitField0_ |= Segment.SIZE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptimizeFor(OptimizeMode optimizeMode) {
            this.optimizeFor_ = optimizeMode.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
            this.phpClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefixBytes(ByteString byteString) {
            this.phpClassPrefix_ = byteString.toStringUtf8();
            this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpGenericServices(boolean z10) {
            this.bitField0_ |= 1024;
            this.phpGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.phpMetadataNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespaceBytes(ByteString byteString) {
            this.phpMetadataNamespace_ = byteString.toStringUtf8();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.phpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespaceBytes(ByteString byteString) {
            this.phpNamespace_ = byteString.toStringUtf8();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPyGenericServices(boolean z10) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackage(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.rubyPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackageBytes(ByteString byteString) {
            this.rubyPackage_ = byteString.toStringUtf8();
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.swiftPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefixBytes(ByteString byteString) {
            this.swiftPrefix_ = byteString.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FileOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FileOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getCsharpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.csharpNamespace_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getGoPackage() {
            return this.goPackage_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getGoPackageBytes() {
            return ByteString.copyFromUtf8(this.goPackage_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getJavaOuterClassnameBytes() {
            return ByteString.copyFromUtf8(this.javaOuterClassname_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getJavaPackage() {
            return this.javaPackage_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getJavaPackageBytes() {
            return ByteString.copyFromUtf8(this.javaPackage_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getObjcClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.objcClassPrefix_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public OptimizeMode getOptimizeFor() {
            OptimizeMode optimizeModeForNumber = OptimizeMode.forNumber(this.optimizeFor_);
            return optimizeModeForNumber == null ? OptimizeMode.SPEED : optimizeModeForNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.phpClassPrefix_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpMetadataNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpMetadataNamespace_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpNamespace() {
            return this.phpNamespace_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpNamespace_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getRubyPackageBytes() {
            return ByteString.copyFromUtf8(this.rubyPackage_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getSwiftPrefixBytes() {
            return ByteString.copyFromUtf8(this.swiftPrefix_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & Segment.SIZE) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpGenericServices() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(FileOptions fileOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fileOptions);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FileOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static FileOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FileOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FileOptions parseFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface FileOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileOptions, FileOptions.Builder> {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        ByteString getCsharpNamespaceBytes();

        boolean getDeprecated();

        String getGoPackage();

        ByteString getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        ByteString getJavaOuterClassnameBytes();

        String getJavaPackage();

        ByteString getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        ByteString getObjcClassPrefixBytes();

        FileOptions.OptimizeMode getOptimizeFor();

        String getPhpClassPrefix();

        ByteString getPhpClassPrefixBytes();

        boolean getPhpGenericServices();

        String getPhpMetadataNamespace();

        ByteString getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        ByteString getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        ByteString getRubyPackageBytes();

        String getSwiftPrefix();

        ByteString getSwiftPrefixBytes();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasGoPackage();

        @Deprecated
        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasObjcClassPrefix();

        boolean hasOptimizeFor();

        boolean hasPhpClassPrefix();

        boolean hasPhpGenericServices();

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class GeneratedCodeInfo extends GeneratedMessageLite<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile Parser<GeneratedCodeInfo> PARSER;
        private Internal.ProtobufList<Annotation> annotation_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Annotation extends GeneratedMessageLite<Annotation, Builder> implements AnnotationOrBuilder {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final Annotation DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile Parser<Annotation> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize = -1;
            private Internal.IntList path_ = GeneratedMessageLite.emptyIntList();
            private String sourceFile_ = PcrIk.fPAdcgxqMRdBCVb;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder addAllPath(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Annotation) this.instance).addAllPath(iterable);
                    return this;
                }

                public Builder addPath(int i10) {
                    copyOnWrite();
                    ((Annotation) this.instance).addPath(i10);
                    return this;
                }

                public Builder clearBegin() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearBegin();
                    return this;
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearEnd();
                    return this;
                }

                public Builder clearPath() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearPath();
                    return this;
                }

                public Builder clearSourceFile() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearSourceFile();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getBegin() {
                    return ((Annotation) this.instance).getBegin();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getEnd() {
                    return ((Annotation) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getPath(int i10) {
                    return ((Annotation) this.instance).getPath(i10);
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getPathCount() {
                    return ((Annotation) this.instance).getPathCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Annotation) this.instance).getPathList());
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public String getSourceFile() {
                    return ((Annotation) this.instance).getSourceFile();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public ByteString getSourceFileBytes() {
                    return ((Annotation) this.instance).getSourceFileBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasBegin() {
                    return ((Annotation) this.instance).hasBegin();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasEnd() {
                    return ((Annotation) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasSourceFile() {
                    return ((Annotation) this.instance).hasSourceFile();
                }

                public Builder setBegin(int i10) {
                    copyOnWrite();
                    ((Annotation) this.instance).setBegin(i10);
                    return this;
                }

                public Builder setEnd(int i10) {
                    copyOnWrite();
                    ((Annotation) this.instance).setEnd(i10);
                    return this;
                }

                public Builder setPath(int i10, int i11) {
                    copyOnWrite();
                    ((Annotation) this.instance).setPath(i10, i11);
                    return this;
                }

                public Builder setSourceFile(String str) {
                    copyOnWrite();
                    ((Annotation) this.instance).setSourceFile(str);
                    return this;
                }

                public Builder setSourceFileBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Annotation) this.instance).setSourceFileBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(Annotation.DEFAULT_INSTANCE);
                }
            }

            static {
                Annotation annotation = new Annotation();
                DEFAULT_INSTANCE = annotation;
                GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int i10) {
                ensurePathIsMutable();
                this.path_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBegin() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = getDefaultInstance().getSourceFile();
            }

            private void ensurePathIsMutable() {
                Internal.IntList intList = this.path_;
                if (intList.isModifiable()) {
                    return;
                }
                this.path_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Annotation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Annotation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBegin(int i10) {
                this.bitField0_ |= 2;
                this.begin_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i10) {
                this.bitField0_ |= 4;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int i10, int i11) {
                ensurePathIsMutable();
                this.path_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFile(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFileBytes(ByteString byteString) {
                this.sourceFile_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Annotation();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Annotation> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Annotation.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getBegin() {
                return this.begin_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getPath(int i10) {
                return this.path_.getInt(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public String getSourceFile() {
                return this.sourceFile_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public ByteString getSourceFileBytes() {
                return ByteString.copyFromUtf8(this.sourceFile_);
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(Annotation annotation) {
                return DEFAULT_INSTANCE.createBuilder(annotation);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private Annotation() {
            }

            public static Annotation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Annotation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Annotation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Annotation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Annotation parseFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
            int getBegin();

            int getEnd();

            int getPath(int i10);

            int getPathCount();

            List<Integer> getPathList();

            String getSourceFile();

            ByteString getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSourceFile();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAllAnnotation(iterable);
                return this;
            }

            public Builder addAnnotation(Annotation annotation) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(annotation);
                return this;
            }

            public Builder clearAnnotation() {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).clearAnnotation();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public Annotation getAnnotation(int i10) {
                return ((GeneratedCodeInfo) this.instance).getAnnotation(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public int getAnnotationCount() {
                return ((GeneratedCodeInfo) this.instance).getAnnotationCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public List<Annotation> getAnnotationList() {
                return Collections.unmodifiableList(((GeneratedCodeInfo) this.instance).getAnnotationList());
            }

            public Builder removeAnnotation(int i10) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).removeAnnotation(i10);
                return this;
            }

            public Builder setAnnotation(int i10, Annotation annotation) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).setAnnotation(i10, annotation);
                return this;
            }

            private Builder() {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }

            public Builder addAnnotation(int i10, Annotation annotation) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(i10, annotation);
                return this;
            }

            public Builder setAnnotation(int i10, Annotation.Builder builder) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).setAnnotation(i10, builder.build());
                return this;
            }

            public Builder addAnnotation(Annotation.Builder builder) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(builder.build());
                return this;
            }

            public Builder addAnnotation(int i10, Annotation.Builder builder) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(i10, builder.build());
                return this;
            }
        }

        static {
            GeneratedCodeInfo generatedCodeInfo = new GeneratedCodeInfo();
            DEFAULT_INSTANCE = generatedCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(GeneratedCodeInfo.class, generatedCodeInfo);
        }

        private GeneratedCodeInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
            ensureAnnotationIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.annotation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(annotation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnnotation() {
            this.annotation_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAnnotationIsMutable() {
            Internal.ProtobufList<Annotation> protobufList = this.annotation_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.annotation_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static GeneratedCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GeneratedCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAnnotation(int i10) {
            ensureAnnotationIsMutable();
            this.annotation_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnnotation(int i10, Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.set(i10, annotation);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new GeneratedCodeInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GeneratedCodeInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GeneratedCodeInfo.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public Annotation getAnnotation(int i10) {
            return this.annotation_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public AnnotationOrBuilder getAnnotationOrBuilder(int i10) {
            return this.annotation_.get(i10);
        }

        public List<? extends AnnotationOrBuilder> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        public static Builder newBuilder(GeneratedCodeInfo generatedCodeInfo) {
            return DEFAULT_INSTANCE.createBuilder(generatedCodeInfo);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(int i10, Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(i10, annotation);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface GeneratedCodeInfoOrBuilder extends MessageLiteOrBuilder {
        GeneratedCodeInfo.Annotation getAnnotation(int i10);

        int getAnnotationCount();

        List<GeneratedCodeInfo.Annotation> getAnnotationList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MessageOptions extends GeneratedMessageLite.ExtendableMessage<MessageOptions, Builder> implements MessageOptionsOrBuilder {
        private static final MessageOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile Parser<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MessageOptions, Builder> implements MessageOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((MessageOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearMapEntry() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearMapEntry();
                return this;
            }

            public Builder clearMessageSetWireFormat() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearMessageSetWireFormat();
                return this;
            }

            public Builder clearNoStandardDescriptorAccessor() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearNoStandardDescriptorAccessor();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getDeprecated() {
                return ((MessageOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getMapEntry() {
                return ((MessageOptions) this.instance).getMapEntry();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getMessageSetWireFormat() {
                return ((MessageOptions) this.instance).getMessageSetWireFormat();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getNoStandardDescriptorAccessor() {
                return ((MessageOptions) this.instance).getNoStandardDescriptorAccessor();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((MessageOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((MessageOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MessageOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((MessageOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasMapEntry() {
                return ((MessageOptions) this.instance).hasMapEntry();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasMessageSetWireFormat() {
                return ((MessageOptions) this.instance).hasMessageSetWireFormat();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasNoStandardDescriptorAccessor() {
                return ((MessageOptions) this.instance).hasNoStandardDescriptorAccessor();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((MessageOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((MessageOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setMapEntry(boolean z10) {
                copyOnWrite();
                ((MessageOptions) this.instance).setMapEntry(z10);
                return this;
            }

            public Builder setMessageSetWireFormat(boolean z10) {
                copyOnWrite();
                ((MessageOptions) this.instance).setMessageSetWireFormat(z10);
                return this;
            }

            public Builder setNoStandardDescriptorAccessor(boolean z10) {
                copyOnWrite();
                ((MessageOptions) this.instance).setNoStandardDescriptorAccessor(z10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MessageOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(MessageOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        static {
            MessageOptions messageOptions = new MessageOptions();
            DEFAULT_INSTANCE = messageOptions;
            GeneratedMessageLite.registerDefaultInstance(MessageOptions.class, messageOptions);
        }

        private MessageOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MessageOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 4;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMapEntry(boolean z10) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageSetWireFormat(boolean z10) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoStandardDescriptorAccessor(boolean z10) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MessageOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MessageOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MessageOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(MessageOptions messageOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(messageOptions);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static MessageOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MessageOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MessageOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MessageOptions, MessageOptions.Builder> {
        boolean getDeprecated();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MethodDescriptorProto extends GeneratedMessageLite<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final MethodDescriptorProto DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<MethodDescriptorProto> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private MethodOptions options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearClientStreaming() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearClientStreaming();
                return this;
            }

            public Builder clearInputType() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearInputType();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearOutputType() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearOutputType();
                return this;
            }

            public Builder clearServerStreaming() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearServerStreaming();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean getClientStreaming() {
                return ((MethodDescriptorProto) this.instance).getClientStreaming();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getInputType() {
                return ((MethodDescriptorProto) this.instance).getInputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getInputTypeBytes() {
                return ((MethodDescriptorProto) this.instance).getInputTypeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getName() {
                return ((MethodDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((MethodDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public MethodOptions getOptions() {
                return ((MethodDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getOutputType() {
                return ((MethodDescriptorProto) this.instance).getOutputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getOutputTypeBytes() {
                return ((MethodDescriptorProto) this.instance).getOutputTypeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean getServerStreaming() {
                return ((MethodDescriptorProto) this.instance).getServerStreaming();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasClientStreaming() {
                return ((MethodDescriptorProto) this.instance).hasClientStreaming();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasInputType() {
                return ((MethodDescriptorProto) this.instance).hasInputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((MethodDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((MethodDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasOutputType() {
                return ((MethodDescriptorProto) this.instance).hasOutputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasServerStreaming() {
                return ((MethodDescriptorProto) this.instance).hasServerStreaming();
            }

            public Builder mergeOptions(MethodOptions methodOptions) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).mergeOptions(methodOptions);
                return this;
            }

            public Builder setClientStreaming(boolean z10) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setClientStreaming(z10);
                return this;
            }

            public Builder setInputType(String str) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setInputType(str);
                return this;
            }

            public Builder setInputTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setInputTypeBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOptions(MethodOptions methodOptions) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOptions(methodOptions);
                return this;
            }

            public Builder setOutputType(String str) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOutputType(str);
                return this;
            }

            public Builder setOutputTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOutputTypeBytes(byteString);
                return this;
            }

            public Builder setServerStreaming(boolean z10) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setServerStreaming(z10);
                return this;
            }

            private Builder() {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(MethodOptions.Builder builder) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOptions((MethodOptions) builder.build());
                return this;
            }
        }

        static {
            MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto();
            DEFAULT_INSTANCE = methodDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(MethodDescriptorProto.class, methodDescriptorProto);
        }

        private MethodDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputType() {
            this.bitField0_ &= -3;
            this.inputType_ = getDefaultInstance().getInputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutputType() {
            this.bitField0_ &= -5;
            this.outputType_ = getDefaultInstance().getOutputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(MethodOptions methodOptions) {
            methodOptions.getClass();
            MethodOptions methodOptions2 = this.options_;
            if (methodOptions2 == null || methodOptions2 == MethodOptions.getDefaultInstance()) {
                this.options_ = methodOptions;
            } else {
                this.options_ = ((MethodOptions.Builder) MethodOptions.newBuilder(this.options_).mergeFrom((MethodOptions.Builder) methodOptions)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MethodDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientStreaming(boolean z10) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputType(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputTypeBytes(ByteString byteString) {
            this.inputType_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(MethodOptions methodOptions) {
            methodOptions.getClass();
            this.options_ = methodOptions;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputType(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputTypeBytes(ByteString byteString) {
            this.outputType_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerStreaming(boolean z10) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MethodDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MethodDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MethodDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getInputType() {
            return this.inputType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getInputTypeBytes() {
            return ByteString.copyFromUtf8(this.inputType_);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public MethodOptions getOptions() {
            MethodOptions methodOptions = this.options_;
            return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getOutputType() {
            return this.outputType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getOutputTypeBytes() {
            return ByteString.copyFromUtf8(this.outputType_);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(MethodDescriptorProto methodDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(methodDescriptorProto);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MethodDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        boolean getClientStreaming();

        String getInputType();

        ByteString getInputTypeBytes();

        String getName();

        ByteString getNameBytes();

        MethodOptions getOptions();

        String getOutputType();

        ByteString getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MethodOptions extends GeneratedMessageLite.ExtendableMessage<MethodOptions, Builder> implements MethodOptionsOrBuilder {
        private static final MethodOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile Parser<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MethodOptions, Builder> implements MethodOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((MethodOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearIdempotencyLevel() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearIdempotencyLevel();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean getDeprecated() {
                return ((MethodOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public IdempotencyLevel getIdempotencyLevel() {
                return ((MethodOptions) this.instance).getIdempotencyLevel();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((MethodOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((MethodOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MethodOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((MethodOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasIdempotencyLevel() {
                return ((MethodOptions) this.instance).hasIdempotencyLevel();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((MethodOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((MethodOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
                copyOnWrite();
                ((MethodOptions) this.instance).setIdempotencyLevel(idempotencyLevel);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MethodOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(MethodOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum IdempotencyLevel implements Internal.EnumLite {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final int IDEMPOTENT_VALUE = 2;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            private static final Internal.EnumLiteMap<IdempotencyLevel> internalValueMap = new Internal.EnumLiteMap<IdempotencyLevel>() { // from class: com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public IdempotencyLevel findValueByNumber(int i10) {
                    return IdempotencyLevel.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class IdempotencyLevelVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new IdempotencyLevelVerifier();

                private IdempotencyLevelVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return IdempotencyLevel.forNumber(i10) != null;
                }
            }

            IdempotencyLevel(int i10) {
                this.value = i10;
            }

            public static IdempotencyLevel forNumber(int i10) {
                if (i10 == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i10 == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i10 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static Internal.EnumLiteMap<IdempotencyLevel> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return IdempotencyLevelVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            MethodOptions methodOptions = new MethodOptions();
            DEFAULT_INSTANCE = methodOptions;
            GeneratedMessageLite.registerDefaultInstance(MethodOptions.class, methodOptions);
        }

        private MethodOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MethodOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 1;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            this.idempotencyLevel_ = idempotencyLevel.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MethodOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"᠌\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.internalGetVerifier(), "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MethodOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MethodOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel idempotencyLevelForNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            return idempotencyLevelForNumber == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : idempotencyLevelForNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(MethodOptions methodOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(methodOptions);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static MethodOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MethodOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MethodOptions, MethodOptions.Builder> {
        boolean getDeprecated();

        MethodOptions.IdempotencyLevel getIdempotencyLevel();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasIdempotencyLevel();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OneofDescriptorProto extends GeneratedMessageLite<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
        private static final OneofDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile Parser<OneofDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private OneofOptions options_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearName() {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public String getName() {
                return ((OneofDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((OneofDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public OneofOptions getOptions() {
                return ((OneofDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((OneofDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((OneofDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(OneofOptions oneofOptions) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).mergeOptions(oneofOptions);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOptions(OneofOptions oneofOptions) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setOptions(oneofOptions);
                return this;
            }

            private Builder() {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(OneofOptions.Builder builder) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setOptions((OneofOptions) builder.build());
                return this;
            }
        }

        static {
            OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto();
            DEFAULT_INSTANCE = oneofDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(OneofDescriptorProto.class, oneofDescriptorProto);
        }

        private OneofDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(OneofOptions oneofOptions) {
            oneofOptions.getClass();
            OneofOptions oneofOptions2 = this.options_;
            if (oneofOptions2 == null || oneofOptions2 == OneofOptions.getDefaultInstance()) {
                this.options_ = oneofOptions;
            } else {
                this.options_ = ((OneofOptions.Builder) OneofOptions.newBuilder(this.options_).mergeFrom((OneofOptions.Builder) oneofOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OneofDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(OneofOptions oneofOptions) {
            oneofOptions.getClass();
            this.options_ = oneofOptions;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OneofDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OneofDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OneofDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public OneofOptions getOptions() {
            OneofOptions oneofOptions = this.options_;
            return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(OneofDescriptorProto oneofDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(oneofDescriptorProto);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OneofDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        OneofOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OneofOptions extends GeneratedMessageLite.ExtendableMessage<OneofOptions, Builder> implements OneofOptionsOrBuilder {
        private static final OneofOptions DEFAULT_INSTANCE;
        private static volatile Parser<OneofOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<OneofOptions, Builder> implements OneofOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((OneofOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((OneofOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((OneofOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((OneofOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((OneofOptions) this.instance).getUninterpretedOptionList());
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((OneofOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((OneofOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(OneofOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        static {
            OneofOptions oneofOptions = new OneofOptions();
            DEFAULT_INSTANCE = oneofOptions;
            GeneratedMessageLite.registerDefaultInstance(OneofOptions.class, oneofOptions);
        }

        private OneofOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OneofOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OneofOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OneofOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OneofOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(OneofOptions oneofOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(oneofOptions);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static OneofOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OneofOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<OneofOptions, OneofOptions.Builder> {
        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ServiceDescriptorProto extends GeneratedMessageLite<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
        private static final ServiceDescriptorProto DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<ServiceDescriptorProto> PARSER;
        private int bitField0_;
        private ServiceOptions options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<MethodDescriptorProto> method_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addAllMethod(iterable);
                return this;
            }

            public Builder addMethod(MethodDescriptorProto methodDescriptorProto) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(methodDescriptorProto);
                return this;
            }

            public Builder clearMethod() {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).clearMethod();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public MethodDescriptorProto getMethod(int i10) {
                return ((ServiceDescriptorProto) this.instance).getMethod(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public int getMethodCount() {
                return ((ServiceDescriptorProto) this.instance).getMethodCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public List<MethodDescriptorProto> getMethodList() {
                return Collections.unmodifiableList(((ServiceDescriptorProto) this.instance).getMethodList());
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public String getName() {
                return ((ServiceDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((ServiceDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public ServiceOptions getOptions() {
                return ((ServiceDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((ServiceDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((ServiceDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(ServiceOptions serviceOptions) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).mergeOptions(serviceOptions);
                return this;
            }

            public Builder removeMethod(int i10) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).removeMethod(i10);
                return this;
            }

            public Builder setMethod(int i10, MethodDescriptorProto methodDescriptorProto) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setMethod(i10, methodDescriptorProto);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOptions(ServiceOptions serviceOptions) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setOptions(serviceOptions);
                return this;
            }

            private Builder() {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addMethod(int i10, MethodDescriptorProto methodDescriptorProto) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(i10, methodDescriptorProto);
                return this;
            }

            public Builder setMethod(int i10, MethodDescriptorProto.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setMethod(i10, builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(ServiceOptions.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setOptions((ServiceOptions) builder.build());
                return this;
            }

            public Builder addMethod(MethodDescriptorProto.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(builder.build());
                return this;
            }

            public Builder addMethod(int i10, MethodDescriptorProto.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(i10, builder.build());
                return this;
            }
        }

        static {
            ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto();
            DEFAULT_INSTANCE = serviceDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(ServiceDescriptorProto.class, serviceDescriptorProto);
        }

        private ServiceDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
            ensureMethodIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.add(methodDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void ensureMethodIsMutable() {
            Internal.ProtobufList<MethodDescriptorProto> protobufList = this.method_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.method_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            ServiceOptions serviceOptions2 = this.options_;
            if (serviceOptions2 == null || serviceOptions2 == ServiceOptions.getDefaultInstance()) {
                this.options_ = serviceOptions;
            } else {
                this.options_ = ((ServiceOptions.Builder) ServiceOptions.newBuilder(this.options_).mergeFrom((ServiceOptions.Builder) serviceOptions)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ServiceDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMethod(int i10) {
            ensureMethodIsMutable();
            this.method_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethod(int i10, MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.set(i10, methodDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            this.options_ = serviceOptions;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServiceDescriptorProto> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ServiceDescriptorProto.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public MethodDescriptorProto getMethod(int i10) {
            return this.method_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public int getMethodCount() {
            return this.method_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i10) {
            return this.method_.get(i10);
        }

        public List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
            return this.method_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public ServiceOptions getOptions() {
            ServiceOptions serviceOptions = this.options_;
            return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
            return DEFAULT_INSTANCE.createBuilder(serviceDescriptorProto);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(int i10, MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.add(i10, methodDescriptorProto);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ServiceDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        MethodDescriptorProto getMethod(int i10);

        int getMethodCount();

        List<MethodDescriptorProto> getMethodList();

        String getName();

        ByteString getNameBytes();

        ServiceOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ServiceOptions extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
        private static final ServiceOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile Parser<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((ServiceOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((ServiceOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean getDeprecated() {
                return ((ServiceOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i10) {
                return ((ServiceOptions) this.instance).getUninterpretedOption(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((ServiceOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ServiceOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((ServiceOptions) this.instance).hasDeprecated();
            }

            public Builder removeUninterpretedOption(int i10) {
                copyOnWrite();
                ((ServiceOptions) this.instance).removeUninterpretedOption(i10);
                return this;
            }

            public Builder setDeprecated(boolean z10) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setDeprecated(z10);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            private Builder() {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(i10, uninterpretedOption);
                return this;
            }

            public Builder setUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setUninterpretedOption(i10, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i10, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(i10, builder.build());
                return this;
            }
        }

        static {
            ServiceOptions serviceOptions = new ServiceOptions();
            DEFAULT_INSTANCE = serviceOptions;
            GeneratedMessageLite.registerDefaultInstance(ServiceOptions.class, serviceOptions);
        }

        private ServiceOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ServiceOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i10) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z10) {
            this.bitField0_ |= 1;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i10, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServiceOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ServiceOptions.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder newBuilder(ServiceOptions serviceOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(serviceOptions);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i10, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i10, uninterpretedOption);
        }

        public static ServiceOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ServiceOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ServiceOptions, ServiceOptions.Builder> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i10);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SourceCodeInfo extends GeneratedMessageLite<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
        private static final SourceCodeInfo DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile Parser<SourceCodeInfo> PARSER;
        private Internal.ProtobufList<Location> location_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllLocation(Iterable<? extends Location> iterable) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addAllLocation(iterable);
                return this;
            }

            public Builder addLocation(Location location) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(location);
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).clearLocation();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public Location getLocation(int i10) {
                return ((SourceCodeInfo) this.instance).getLocation(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public int getLocationCount() {
                return ((SourceCodeInfo) this.instance).getLocationCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public List<Location> getLocationList() {
                return Collections.unmodifiableList(((SourceCodeInfo) this.instance).getLocationList());
            }

            public Builder removeLocation(int i10) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).removeLocation(i10);
                return this;
            }

            public Builder setLocation(int i10, Location location) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).setLocation(i10, location);
                return this;
            }

            private Builder() {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }

            public Builder addLocation(int i10, Location location) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(i10, location);
                return this;
            }

            public Builder setLocation(int i10, Location.Builder builder) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).setLocation(i10, builder.build());
                return this;
            }

            public Builder addLocation(Location.Builder builder) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(builder.build());
                return this;
            }

            public Builder addLocation(int i10, Location.Builder builder) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
            private static final Location DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile Parser<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;
            private Internal.IntList path_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList span_ = GeneratedMessageLite.emptyIntList();
            private String leadingComments_ = "";
            private String trailingComments_ = "";
            private Internal.ProtobufList<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder addAllLeadingDetachedComments(Iterable<String> iterable) {
                    copyOnWrite();
                    ((Location) this.instance).addAllLeadingDetachedComments(iterable);
                    return this;
                }

                public Builder addAllPath(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Location) this.instance).addAllPath(iterable);
                    return this;
                }

                public Builder addAllSpan(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Location) this.instance).addAllSpan(iterable);
                    return this;
                }

                public Builder addLeadingDetachedComments(String str) {
                    copyOnWrite();
                    ((Location) this.instance).addLeadingDetachedComments(str);
                    return this;
                }

                public Builder addLeadingDetachedCommentsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Location) this.instance).addLeadingDetachedCommentsBytes(byteString);
                    return this;
                }

                public Builder addPath(int i10) {
                    copyOnWrite();
                    ((Location) this.instance).addPath(i10);
                    return this;
                }

                public Builder addSpan(int i10) {
                    copyOnWrite();
                    ((Location) this.instance).addSpan(i10);
                    return this;
                }

                public Builder clearLeadingComments() {
                    copyOnWrite();
                    ((Location) this.instance).clearLeadingComments();
                    return this;
                }

                public Builder clearLeadingDetachedComments() {
                    copyOnWrite();
                    ((Location) this.instance).clearLeadingDetachedComments();
                    return this;
                }

                public Builder clearPath() {
                    copyOnWrite();
                    ((Location) this.instance).clearPath();
                    return this;
                }

                public Builder clearSpan() {
                    copyOnWrite();
                    ((Location) this.instance).clearSpan();
                    return this;
                }

                public Builder clearTrailingComments() {
                    copyOnWrite();
                    ((Location) this.instance).clearTrailingComments();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getLeadingComments() {
                    return ((Location) this.instance).getLeadingComments();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getLeadingCommentsBytes() {
                    return ((Location) this.instance).getLeadingCommentsBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getLeadingDetachedComments(int i10) {
                    return ((Location) this.instance).getLeadingDetachedComments(i10);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getLeadingDetachedCommentsBytes(int i10) {
                    return ((Location) this.instance).getLeadingDetachedCommentsBytes(i10);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getLeadingDetachedCommentsCount() {
                    return ((Location) this.instance).getLeadingDetachedCommentsCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<String> getLeadingDetachedCommentsList() {
                    return Collections.unmodifiableList(((Location) this.instance).getLeadingDetachedCommentsList());
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getPath(int i10) {
                    return ((Location) this.instance).getPath(i10);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getPathCount() {
                    return ((Location) this.instance).getPathCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Location) this.instance).getPathList());
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getSpan(int i10) {
                    return ((Location) this.instance).getSpan(i10);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getSpanCount() {
                    return ((Location) this.instance).getSpanCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<Integer> getSpanList() {
                    return Collections.unmodifiableList(((Location) this.instance).getSpanList());
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getTrailingComments() {
                    return ((Location) this.instance).getTrailingComments();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getTrailingCommentsBytes() {
                    return ((Location) this.instance).getTrailingCommentsBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public boolean hasLeadingComments() {
                    return ((Location) this.instance).hasLeadingComments();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public boolean hasTrailingComments() {
                    return ((Location) this.instance).hasTrailingComments();
                }

                public Builder setLeadingComments(String str) {
                    copyOnWrite();
                    ((Location) this.instance).setLeadingComments(str);
                    return this;
                }

                public Builder setLeadingCommentsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Location) this.instance).setLeadingCommentsBytes(byteString);
                    return this;
                }

                public Builder setLeadingDetachedComments(int i10, String str) {
                    copyOnWrite();
                    ((Location) this.instance).setLeadingDetachedComments(i10, str);
                    return this;
                }

                public Builder setPath(int i10, int i11) {
                    copyOnWrite();
                    ((Location) this.instance).setPath(i10, i11);
                    return this;
                }

                public Builder setSpan(int i10, int i11) {
                    copyOnWrite();
                    ((Location) this.instance).setSpan(i10, i11);
                    return this;
                }

                public Builder setTrailingComments(String str) {
                    copyOnWrite();
                    ((Location) this.instance).setTrailingComments(str);
                    return this;
                }

                public Builder setTrailingCommentsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Location) this.instance).setTrailingCommentsBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(Location.DEFAULT_INSTANCE);
                }
            }

            static {
                Location location = new Location();
                DEFAULT_INSTANCE = location;
                GeneratedMessageLite.registerDefaultInstance(Location.class, location);
            }

            private Location() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.span_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedCommentsBytes(ByteString byteString) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int i10) {
                ensurePathIsMutable();
                this.path_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSpan(int i10) {
                ensureSpanIsMutable();
                this.span_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = getDefaultInstance().getLeadingComments();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSpan() {
                this.span_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = getDefaultInstance().getTrailingComments();
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                Internal.ProtobufList<String> protobufList = this.leadingDetachedComments_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensurePathIsMutable() {
                Internal.IntList intList = this.path_;
                if (intList.isModifiable()) {
                    return;
                }
                this.path_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureSpanIsMutable() {
                Internal.IntList intList = this.span_;
                if (intList.isModifiable()) {
                    return;
                }
                this.span_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Location> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingComments(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingCommentsBytes(ByteString byteString) {
                this.leadingComments_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingDetachedComments(int i10, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i10, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int i10, int i11) {
                ensurePathIsMutable();
                this.path_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSpan(int i10, int i11) {
                ensureSpanIsMutable();
                this.span_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingComments(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingCommentsBytes(ByteString byteString) {
                this.trailingComments_ = byteString.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Location();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Location> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Location.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getLeadingComments() {
                return this.leadingComments_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingCommentsBytes() {
                return ByteString.copyFromUtf8(this.leadingComments_);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getLeadingDetachedComments(int i10) {
                return this.leadingDetachedComments_.get(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingDetachedCommentsBytes(int i10) {
                return ByteString.copyFromUtf8(this.leadingDetachedComments_.get(i10));
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getPath(int i10) {
                return this.path_.getInt(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getSpan(int i10) {
                return this.span_.getInt(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getSpanCount() {
                return this.span_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<Integer> getSpanList() {
                return this.span_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getTrailingComments() {
                return this.trailingComments_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getTrailingCommentsBytes() {
                return ByteString.copyFromUtf8(this.trailingComments_);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder(Location location) {
                return DEFAULT_INSTANCE.createBuilder(location);
            }

            public static Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Location parseFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Location parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface LocationOrBuilder extends MessageLiteOrBuilder {
            String getLeadingComments();

            ByteString getLeadingCommentsBytes();

            String getLeadingDetachedComments(int i10);

            ByteString getLeadingDetachedCommentsBytes(int i10);

            int getLeadingDetachedCommentsCount();

            List<String> getLeadingDetachedCommentsList();

            int getPath(int i10);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int i10);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            ByteString getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        static {
            SourceCodeInfo sourceCodeInfo = new SourceCodeInfo();
            DEFAULT_INSTANCE = sourceCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(SourceCodeInfo.class, sourceCodeInfo);
        }

        private SourceCodeInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocation(Iterable<? extends Location> iterable) {
            ensureLocationIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.location_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.add(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureLocationIsMutable() {
            Internal.ProtobufList<Location> protobufList = this.location_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.location_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SourceCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLocation(int i10) {
            ensureLocationIsMutable();
            this.location_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(int i10, Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.set(i10, location);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SourceCodeInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SourceCodeInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SourceCodeInfo.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public Location getLocation(int i10) {
            return this.location_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public int getLocationCount() {
            return this.location_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public List<Location> getLocationList() {
            return this.location_;
        }

        public LocationOrBuilder getLocationOrBuilder(int i10) {
            return this.location_.get(i10);
        }

        public List<? extends LocationOrBuilder> getLocationOrBuilderList() {
            return this.location_;
        }

        public static Builder newBuilder(SourceCodeInfo sourceCodeInfo) {
            return DEFAULT_INSTANCE.createBuilder(sourceCodeInfo);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(int i10, Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.add(i10, location);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SourceCodeInfoOrBuilder extends MessageLiteOrBuilder {
        SourceCodeInfo.Location getLocation(int i10);

        int getLocationCount();

        List<SourceCodeInfo.Location> getLocationList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UninterpretedOption extends GeneratedMessageLite<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final UninterpretedOption DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile Parser<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<NamePart> name_ = GeneratedMessageLite.emptyProtobufList();
        private String identifierValue_ = "";
        private ByteString stringValue_ = ByteString.EMPTY;
        private String aggregateValue_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllName(Iterable<? extends NamePart> iterable) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addAllName(iterable);
                return this;
            }

            public Builder addName(NamePart namePart) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(namePart);
                return this;
            }

            public Builder clearAggregateValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearAggregateValue();
                return this;
            }

            public Builder clearDoubleValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearDoubleValue();
                return this;
            }

            public Builder clearIdentifierValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearIdentifierValue();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearName();
                return this;
            }

            public Builder clearNegativeIntValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearNegativeIntValue();
                return this;
            }

            public Builder clearPositiveIntValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearPositiveIntValue();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearStringValue();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public String getAggregateValue() {
                return ((UninterpretedOption) this.instance).getAggregateValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getAggregateValueBytes() {
                return ((UninterpretedOption) this.instance).getAggregateValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public double getDoubleValue() {
                return ((UninterpretedOption) this.instance).getDoubleValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public String getIdentifierValue() {
                return ((UninterpretedOption) this.instance).getIdentifierValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getIdentifierValueBytes() {
                return ((UninterpretedOption) this.instance).getIdentifierValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public NamePart getName(int i10) {
                return ((UninterpretedOption) this.instance).getName(i10);
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public int getNameCount() {
                return ((UninterpretedOption) this.instance).getNameCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public List<NamePart> getNameList() {
                return Collections.unmodifiableList(((UninterpretedOption) this.instance).getNameList());
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public long getNegativeIntValue() {
                return ((UninterpretedOption) this.instance).getNegativeIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public long getPositiveIntValue() {
                return ((UninterpretedOption) this.instance).getPositiveIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getStringValue() {
                return ((UninterpretedOption) this.instance).getStringValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasAggregateValue() {
                return ((UninterpretedOption) this.instance).hasAggregateValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasDoubleValue() {
                return ((UninterpretedOption) this.instance).hasDoubleValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasIdentifierValue() {
                return ((UninterpretedOption) this.instance).hasIdentifierValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasNegativeIntValue() {
                return ((UninterpretedOption) this.instance).hasNegativeIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasPositiveIntValue() {
                return ((UninterpretedOption) this.instance).hasPositiveIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasStringValue() {
                return ((UninterpretedOption) this.instance).hasStringValue();
            }

            public Builder removeName(int i10) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).removeName(i10);
                return this;
            }

            public Builder setAggregateValue(String str) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setAggregateValue(str);
                return this;
            }

            public Builder setAggregateValueBytes(ByteString byteString) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setAggregateValueBytes(byteString);
                return this;
            }

            public Builder setDoubleValue(double d10) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setDoubleValue(d10);
                return this;
            }

            public Builder setIdentifierValue(String str) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setIdentifierValue(str);
                return this;
            }

            public Builder setIdentifierValueBytes(ByteString byteString) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setIdentifierValueBytes(byteString);
                return this;
            }

            public Builder setName(int i10, NamePart namePart) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setName(i10, namePart);
                return this;
            }

            public Builder setNegativeIntValue(long j10) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setNegativeIntValue(j10);
                return this;
            }

            public Builder setPositiveIntValue(long j10) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setPositiveIntValue(j10);
                return this;
            }

            public Builder setStringValue(ByteString byteString) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setStringValue(byteString);
                return this;
            }

            private Builder() {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }

            public Builder addName(int i10, NamePart namePart) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(i10, namePart);
                return this;
            }

            public Builder setName(int i10, NamePart.Builder builder) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setName(i10, builder.build());
                return this;
            }

            public Builder addName(NamePart.Builder builder) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(builder.build());
                return this;
            }

            public Builder addName(int i10, NamePart.Builder builder) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class NamePart extends GeneratedMessageLite<NamePart, Builder> implements NamePartOrBuilder {
            private static final NamePart DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile Parser<NamePart> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<NamePart, Builder> implements NamePartOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder clearIsExtension() {
                    copyOnWrite();
                    ((NamePart) this.instance).clearIsExtension();
                    return this;
                }

                public Builder clearNamePart() {
                    copyOnWrite();
                    ((NamePart) this.instance).clearNamePart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean getIsExtension() {
                    return ((NamePart) this.instance).getIsExtension();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public String getNamePart() {
                    return ((NamePart) this.instance).getNamePart();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public ByteString getNamePartBytes() {
                    return ((NamePart) this.instance).getNamePartBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean hasIsExtension() {
                    return ((NamePart) this.instance).hasIsExtension();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean hasNamePart() {
                    return ((NamePart) this.instance).hasNamePart();
                }

                public Builder setIsExtension(boolean z10) {
                    copyOnWrite();
                    ((NamePart) this.instance).setIsExtension(z10);
                    return this;
                }

                public Builder setNamePart(String str) {
                    copyOnWrite();
                    ((NamePart) this.instance).setNamePart(str);
                    return this;
                }

                public Builder setNamePartBytes(ByteString byteString) {
                    copyOnWrite();
                    ((NamePart) this.instance).setNamePartBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(NamePart.DEFAULT_INSTANCE);
                }
            }

            static {
                NamePart namePart = new NamePart();
                DEFAULT_INSTANCE = namePart;
                GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
            }

            private NamePart() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNamePart() {
                this.bitField0_ &= -2;
                this.namePart_ = getDefaultInstance().getNamePart();
            }

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<NamePart> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsExtension(boolean z10) {
                this.bitField0_ |= 2;
                this.isExtension_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePart(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePartBytes(ByteString byteString) {
                this.namePart_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NamePart();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<NamePart> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (NamePart.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public String getNamePart() {
                return this.namePart_;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public ByteString getNamePartBytes() {
                return ByteString.copyFromUtf8(this.namePart_);
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(NamePart namePart) {
                return DEFAULT_INSTANCE.createBuilder(namePart);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static NamePart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NamePart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static NamePart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NamePart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static NamePart parseFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface NamePartOrBuilder extends MessageLiteOrBuilder {
            boolean getIsExtension();

            String getNamePart();

            ByteString getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        static {
            UninterpretedOption uninterpretedOption = new UninterpretedOption();
            DEFAULT_INSTANCE = uninterpretedOption;
            GeneratedMessageLite.registerDefaultInstance(UninterpretedOption.class, uninterpretedOption);
        }

        private UninterpretedOption() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllName(Iterable<? extends NamePart> iterable) {
            ensureNameIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.add(namePart);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAggregateValue() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = getDefaultInstance().getAggregateValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoubleValue() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifierValue() {
            this.bitField0_ &= -2;
            this.identifierValue_ = getDefaultInstance().getIdentifierValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeIntValue() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPositiveIntValue() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            this.bitField0_ &= -17;
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        private void ensureNameIsMutable() {
            Internal.ProtobufList<NamePart> protobufList = this.name_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.name_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UninterpretedOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeName(int i10) {
            ensureNameIsMutable();
            this.name_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValue(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValueBytes(ByteString byteString) {
            this.aggregateValue_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleValue(double d10) {
            this.bitField0_ |= 8;
            this.doubleValue_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValue(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValueBytes(ByteString byteString) {
            this.identifierValue_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(int i10, NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.set(i10, namePart);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeIntValue(long j10) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositiveIntValue(long j10) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UninterpretedOption();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UninterpretedOption> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (UninterpretedOption.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getAggregateValueBytes() {
            return ByteString.copyFromUtf8(this.aggregateValue_);
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getIdentifierValueBytes() {
            return ByteString.copyFromUtf8(this.identifierValue_);
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public NamePart getName(int i10) {
            return this.name_.get(i10);
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public int getNameCount() {
            return this.name_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public List<NamePart> getNameList() {
            return this.name_;
        }

        public NamePartOrBuilder getNameOrBuilder(int i10) {
            return this.name_.get(i10);
        }

        public List<? extends NamePartOrBuilder> getNameOrBuilderList() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getStringValue() {
            return this.stringValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(UninterpretedOption uninterpretedOption) {
            return DEFAULT_INSTANCE.createBuilder(uninterpretedOption);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(int i10, NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.add(i10, namePart);
        }

        public static UninterpretedOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UninterpretedOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UninterpretedOptionOrBuilder extends MessageLiteOrBuilder {
        String getAggregateValue();

        ByteString getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        ByteString getIdentifierValueBytes();

        UninterpretedOption.NamePart getName(int i10);

        int getNameCount();

        List<UninterpretedOption.NamePart> getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        ByteString getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    private DescriptorProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
