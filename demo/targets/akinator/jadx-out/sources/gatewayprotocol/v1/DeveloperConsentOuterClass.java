package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DeveloperConsentOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DeveloperConsent extends GeneratedMessageLite<DeveloperConsent, Builder> implements DeveloperConsentOrBuilder {
        private static final DeveloperConsent DEFAULT_INSTANCE;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile Parser<DeveloperConsent> PARSER;
        private Internal.ProtobufList<DeveloperConsentOption> options_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<DeveloperConsent, Builder> implements DeveloperConsentOrBuilder {
            public /* synthetic */ Builder(wl.l lVar) {
                this();
            }

            public Builder addAllOptions(Iterable<? extends DeveloperConsentOption> iterable) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).addAllOptions(iterable);
                return this;
            }

            public Builder addOptions(DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).addOptions(developerConsentOption);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((DeveloperConsent) this.instance).clearOptions();
                return this;
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public DeveloperConsentOption getOptions(int i10) {
                return ((DeveloperConsent) this.instance).getOptions(i10);
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public int getOptionsCount() {
                return ((DeveloperConsent) this.instance).getOptionsCount();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
            public List<DeveloperConsentOption> getOptionsList() {
                return Collections.unmodifiableList(((DeveloperConsent) this.instance).getOptionsList());
            }

            public Builder removeOptions(int i10) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).removeOptions(i10);
                return this;
            }

            public Builder setOptions(int i10, DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).setOptions(i10, developerConsentOption);
                return this;
            }

            private Builder() {
                super(DeveloperConsent.DEFAULT_INSTANCE);
            }

            public Builder addOptions(int i10, DeveloperConsentOption developerConsentOption) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).addOptions(i10, developerConsentOption);
                return this;
            }

            public Builder setOptions(int i10, DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).setOptions(i10, builder.build());
                return this;
            }

            public Builder addOptions(DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).addOptions(builder.build());
                return this;
            }

            public Builder addOptions(int i10, DeveloperConsentOption.Builder builder) {
                copyOnWrite();
                ((DeveloperConsent) this.instance).addOptions(i10, builder.build());
                return this;
            }
        }

        static {
            DeveloperConsent developerConsent = new DeveloperConsent();
            DEFAULT_INSTANCE = developerConsent;
            GeneratedMessageLite.registerDefaultInstance(DeveloperConsent.class, developerConsent);
        }

        private DeveloperConsent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOptions(Iterable<? extends DeveloperConsentOption> iterable) {
            ensureOptionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOptions(DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.add(developerConsentOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureOptionsIsMutable() {
            Internal.ProtobufList<DeveloperConsentOption> protobufList = this.options_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static DeveloperConsent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeveloperConsent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeveloperConsent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOptions(int i10) {
            ensureOptionsIsMutable();
            this.options_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(int i10, DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.set(i10, developerConsentOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.l lVar = null;
            switch (wl.l.f90718a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeveloperConsent();
                case 2:
                    return new Builder(lVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"options_", DeveloperConsentOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DeveloperConsent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DeveloperConsent.class) {
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

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public DeveloperConsentOption getOptions(int i10) {
            return this.options_.get(i10);
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public int getOptionsCount() {
            return this.options_.size();
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOrBuilder
        public List<DeveloperConsentOption> getOptionsList() {
            return this.options_;
        }

        public DeveloperConsentOptionOrBuilder getOptionsOrBuilder(int i10) {
            return this.options_.get(i10);
        }

        public List<? extends DeveloperConsentOptionOrBuilder> getOptionsOrBuilderList() {
            return this.options_;
        }

        public static Builder newBuilder(DeveloperConsent developerConsent) {
            return DEFAULT_INSTANCE.createBuilder(developerConsent);
        }

        public static DeveloperConsent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOptions(int i10, DeveloperConsentOption developerConsentOption) {
            developerConsentOption.getClass();
            ensureOptionsIsMutable();
            this.options_.add(i10, developerConsentOption);
        }

        public static DeveloperConsent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeveloperConsent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeveloperConsent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DeveloperConsentChoice implements Internal.EnumLite {
        DEVELOPER_CONSENT_CHOICE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_CHOICE_TRUE(1),
        DEVELOPER_CONSENT_CHOICE_FALSE(2),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_CHOICE_FALSE_VALUE = 2;
        public static final int DEVELOPER_CONSENT_CHOICE_TRUE_VALUE = 1;
        public static final int DEVELOPER_CONSENT_CHOICE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<DeveloperConsentChoice> internalValueMap = new k();
        private final int value;

        DeveloperConsentChoice(int i10) {
            this.value = i10;
        }

        public static DeveloperConsentChoice forNumber(int i10) {
            if (i10 == 0) {
                return DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return DEVELOPER_CONSENT_CHOICE_TRUE;
            }
            if (i10 != 2) {
                return null;
            }
            return DEVELOPER_CONSENT_CHOICE_FALSE;
        }

        public static Internal.EnumLiteMap<DeveloperConsentChoice> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return l.f57496a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DeveloperConsentChoice valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DeveloperConsentOption extends GeneratedMessageLite<DeveloperConsentOption, Builder> implements DeveloperConsentOptionOrBuilder {
        public static final int CUSTOM_TYPE_FIELD_NUMBER = 2;
        private static final DeveloperConsentOption DEFAULT_INSTANCE;
        private static volatile Parser<DeveloperConsentOption> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private String customType_ = "";
        private int type_;
        private int value_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<DeveloperConsentOption, Builder> implements DeveloperConsentOptionOrBuilder {
            public /* synthetic */ Builder(wl.l lVar) {
                this();
            }

            public Builder clearCustomType() {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).clearCustomType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).clearValue();
                return this;
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public String getCustomType() {
                return ((DeveloperConsentOption) this.instance).getCustomType();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public ByteString getCustomTypeBytes() {
                return ((DeveloperConsentOption) this.instance).getCustomTypeBytes();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public DeveloperConsentType getType() {
                return ((DeveloperConsentOption) this.instance).getType();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public int getTypeValue() {
                return ((DeveloperConsentOption) this.instance).getTypeValue();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public DeveloperConsentChoice getValue() {
                return ((DeveloperConsentOption) this.instance).getValue();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public int getValueValue() {
                return ((DeveloperConsentOption) this.instance).getValueValue();
            }

            @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
            public boolean hasCustomType() {
                return ((DeveloperConsentOption) this.instance).hasCustomType();
            }

            public Builder setCustomType(String str) {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).setCustomType(str);
                return this;
            }

            public Builder setCustomTypeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).setCustomTypeBytes(byteString);
                return this;
            }

            public Builder setType(DeveloperConsentType developerConsentType) {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).setType(developerConsentType);
                return this;
            }

            public Builder setTypeValue(int i10) {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).setTypeValue(i10);
                return this;
            }

            public Builder setValue(DeveloperConsentChoice developerConsentChoice) {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).setValue(developerConsentChoice);
                return this;
            }

            public Builder setValueValue(int i10) {
                copyOnWrite();
                ((DeveloperConsentOption) this.instance).setValueValue(i10);
                return this;
            }

            private Builder() {
                super(DeveloperConsentOption.DEFAULT_INSTANCE);
            }
        }

        static {
            DeveloperConsentOption developerConsentOption = new DeveloperConsentOption();
            DEFAULT_INSTANCE = developerConsentOption;
            GeneratedMessageLite.registerDefaultInstance(DeveloperConsentOption.class, developerConsentOption);
        }

        private DeveloperConsentOption() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomType() {
            this.bitField0_ &= -2;
            this.customType_ = getDefaultInstance().getCustomType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0;
        }

        public static DeveloperConsentOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeveloperConsentOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsentOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeveloperConsentOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DeveloperConsentType developerConsentType) {
            this.type_ = developerConsentType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.type_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(DeveloperConsentChoice developerConsentChoice) {
            this.value_ = developerConsentChoice.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueValue(int i10) {
            this.value_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.l lVar = null;
            switch (wl.l.f90718a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeveloperConsentOption();
                case 2:
                    return new Builder(lVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\f", new Object[]{"bitField0_", "type_", "customType_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DeveloperConsentOption> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DeveloperConsentOption.class) {
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

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public String getCustomType() {
            return this.customType_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public ByteString getCustomTypeBytes() {
            return ByteString.copyFromUtf8(this.customType_);
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public DeveloperConsentType getType() {
            DeveloperConsentType developerConsentTypeForNumber = DeveloperConsentType.forNumber(this.type_);
            return developerConsentTypeForNumber == null ? DeveloperConsentType.UNRECOGNIZED : developerConsentTypeForNumber;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public DeveloperConsentChoice getValue() {
            DeveloperConsentChoice developerConsentChoiceForNumber = DeveloperConsentChoice.forNumber(this.value_);
            return developerConsentChoiceForNumber == null ? DeveloperConsentChoice.UNRECOGNIZED : developerConsentChoiceForNumber;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public int getValueValue() {
            return this.value_;
        }

        @Override // gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOptionOrBuilder
        public boolean hasCustomType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DeveloperConsentOption developerConsentOption) {
            return DEFAULT_INSTANCE.createBuilder(developerConsentOption);
        }

        public static DeveloperConsentOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeveloperConsentOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeveloperConsentOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(InputStream inputStream) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeveloperConsentOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeveloperConsentOption parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeveloperConsentOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeveloperConsentOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DeveloperConsentOptionOrBuilder extends MessageLiteOrBuilder {
        String getCustomType();

        ByteString getCustomTypeBytes();

        DeveloperConsentType getType();

        int getTypeValue();

        DeveloperConsentChoice getValue();

        int getValueValue();

        boolean hasCustomType();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DeveloperConsentOrBuilder extends MessageLiteOrBuilder {
        DeveloperConsentOption getOptions(int i10);

        int getOptionsCount();

        List<DeveloperConsentOption> getOptionsList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DeveloperConsentType implements Internal.EnumLite {
        DEVELOPER_CONSENT_TYPE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_TYPE_CUSTOM(1),
        DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL(2),
        DEVELOPER_CONSENT_TYPE_PIPL_CONSENT(3),
        DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT(4),
        DEVELOPER_CONSENT_TYPE_GDPR_CONSENT(5),
        DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT(6),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DEVELOPER_CONSENT_TYPE_GDPR_CONSENT_VALUE = 5;
        public static final int DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL_VALUE = 2;
        public static final int DEVELOPER_CONSENT_TYPE_PIPL_CONSENT_VALUE = 3;
        public static final int DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT_VALUE = 4;
        public static final int DEVELOPER_CONSENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT_VALUE = 6;
        private static final Internal.EnumLiteMap<DeveloperConsentType> internalValueMap = new m();
        private final int value;

        DeveloperConsentType(int i10) {
            this.value = i10;
        }

        public static DeveloperConsentType forNumber(int i10) {
            switch (i10) {
                case 0:
                    return DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
                case 1:
                    return DEVELOPER_CONSENT_TYPE_CUSTOM;
                case 2:
                    return DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                case 3:
                    return DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                case 4:
                    return DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                case 5:
                    return DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                case 6:
                    return DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<DeveloperConsentType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return n.f57498a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DeveloperConsentType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private DeveloperConsentOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
