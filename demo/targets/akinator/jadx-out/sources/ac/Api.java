package ac;

import ac.AcError;
import ac.Models;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import metric.Metric$Event;
import wv.b;
import wv.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class Api {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ac.Api$1, reason: invalid class name */
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
    public static final class ExternalToUuidReply extends GeneratedMessageLite<ExternalToUuidReply, Builder> implements ExternalToUuidReplyOrBuilder {
        private static final ExternalToUuidReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<ExternalToUuidReply> PARSER = null;
        public static final int UUIDS_FIELD_NUMBER = 2;
        private AcError.ErrorResponse error_;
        private Internal.ProtobufList<String> uuids_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ExternalToUuidReply, Builder> implements ExternalToUuidReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllUuids(Iterable<String> iterable) {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).addAllUuids(iterable);
                return this;
            }

            public Builder addUuids(String str) {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).addUuids(str);
                return this;
            }

            public Builder addUuidsBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).addUuidsBytes(byteString);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).clearError();
                return this;
            }

            public Builder clearUuids() {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).clearUuids();
                return this;
            }

            @Override // ac.Api.ExternalToUuidReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((ExternalToUuidReply) this.instance).getError();
            }

            @Override // ac.Api.ExternalToUuidReplyOrBuilder
            public String getUuids(int i10) {
                return ((ExternalToUuidReply) this.instance).getUuids(i10);
            }

            @Override // ac.Api.ExternalToUuidReplyOrBuilder
            public ByteString getUuidsBytes(int i10) {
                return ((ExternalToUuidReply) this.instance).getUuidsBytes(i10);
            }

            @Override // ac.Api.ExternalToUuidReplyOrBuilder
            public int getUuidsCount() {
                return ((ExternalToUuidReply) this.instance).getUuidsCount();
            }

            @Override // ac.Api.ExternalToUuidReplyOrBuilder
            public List<String> getUuidsList() {
                return Collections.unmodifiableList(((ExternalToUuidReply) this.instance).getUuidsList());
            }

            @Override // ac.Api.ExternalToUuidReplyOrBuilder
            public boolean hasError() {
                return ((ExternalToUuidReply) this.instance).hasError();
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).setError(errorResponse);
                return this;
            }

            public Builder setUuids(int i10, String str) {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).setUuids(i10, str);
                return this;
            }

            private Builder() {
                super(ExternalToUuidReply.DEFAULT_INSTANCE);
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((ExternalToUuidReply) this.instance).setError(builder.build());
                return this;
            }
        }

        static {
            ExternalToUuidReply externalToUuidReply = new ExternalToUuidReply();
            DEFAULT_INSTANCE = externalToUuidReply;
            GeneratedMessageLite.registerDefaultInstance(ExternalToUuidReply.class, externalToUuidReply);
        }

        private ExternalToUuidReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUuids(Iterable<String> iterable) {
            ensureUuidsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.uuids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUuids(String str) {
            str.getClass();
            ensureUuidsIsMutable();
            this.uuids_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUuidsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureUuidsIsMutable();
            this.uuids_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuids() {
            this.uuids_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUuidsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.uuids_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.uuids_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ExternalToUuidReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExternalToUuidReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalToUuidReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExternalToUuidReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuids(int i10, String str) {
            str.getClass();
            ensureUuidsIsMutable();
            this.uuids_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExternalToUuidReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002Ț", new Object[]{"error_", "uuids_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExternalToUuidReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExternalToUuidReply.class) {
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

        @Override // ac.Api.ExternalToUuidReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.ExternalToUuidReplyOrBuilder
        public String getUuids(int i10) {
            return this.uuids_.get(i10);
        }

        @Override // ac.Api.ExternalToUuidReplyOrBuilder
        public ByteString getUuidsBytes(int i10) {
            return ByteString.copyFromUtf8(this.uuids_.get(i10));
        }

        @Override // ac.Api.ExternalToUuidReplyOrBuilder
        public int getUuidsCount() {
            return this.uuids_.size();
        }

        @Override // ac.Api.ExternalToUuidReplyOrBuilder
        public List<String> getUuidsList() {
            return this.uuids_;
        }

        @Override // ac.Api.ExternalToUuidReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(ExternalToUuidReply externalToUuidReply) {
            return DEFAULT_INSTANCE.createBuilder(externalToUuidReply);
        }

        public static ExternalToUuidReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExternalToUuidReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExternalToUuidReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExternalToUuidReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExternalToUuidReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExternalToUuidReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExternalToUuidReply parseFrom(InputStream inputStream) throws IOException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalToUuidReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExternalToUuidReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExternalToUuidReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalToUuidReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ExternalToUuidReplyOrBuilder extends MessageLiteOrBuilder {
        AcError.ErrorResponse getError();

        String getUuids(int i10);

        ByteString getUuidsBytes(int i10);

        int getUuidsCount();

        List<String> getUuidsList();

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ExternalToUuidRequest extends GeneratedMessageLite<ExternalToUuidRequest, Builder> implements ExternalToUuidRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 1;
        private static final ExternalToUuidRequest DEFAULT_INSTANCE;
        public static final int EXTERNAL_ID_FIELD_NUMBER = 2;
        public static final int EXTERNAL_ID_KEY_FIELD_NUMBER = 3;
        public static final int LANGUAGE_FIELD_NUMBER = 4;
        private static volatile Parser<ExternalToUuidRequest> PARSER;
        private String appKey_ = "";
        private String externalId_ = "";
        private String externalIdKey_ = "";
        private String language_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ExternalToUuidRequest, Builder> implements ExternalToUuidRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearExternalId() {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).clearExternalId();
                return this;
            }

            public Builder clearExternalIdKey() {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).clearExternalIdKey();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).clearLanguage();
                return this;
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public String getAppKey() {
                return ((ExternalToUuidRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((ExternalToUuidRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public String getExternalId() {
                return ((ExternalToUuidRequest) this.instance).getExternalId();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public ByteString getExternalIdBytes() {
                return ((ExternalToUuidRequest) this.instance).getExternalIdBytes();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public String getExternalIdKey() {
                return ((ExternalToUuidRequest) this.instance).getExternalIdKey();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public ByteString getExternalIdKeyBytes() {
                return ((ExternalToUuidRequest) this.instance).getExternalIdKeyBytes();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public String getLanguage() {
                return ((ExternalToUuidRequest) this.instance).getLanguage();
            }

            @Override // ac.Api.ExternalToUuidRequestOrBuilder
            public ByteString getLanguageBytes() {
                return ((ExternalToUuidRequest) this.instance).getLanguageBytes();
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setExternalId(String str) {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setExternalId(str);
                return this;
            }

            public Builder setExternalIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setExternalIdBytes(byteString);
                return this;
            }

            public Builder setExternalIdKey(String str) {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setExternalIdKey(str);
                return this;
            }

            public Builder setExternalIdKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setExternalIdKeyBytes(byteString);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalToUuidRequest) this.instance).setLanguageBytes(byteString);
                return this;
            }

            private Builder() {
                super(ExternalToUuidRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ExternalToUuidRequest externalToUuidRequest = new ExternalToUuidRequest();
            DEFAULT_INSTANCE = externalToUuidRequest;
            GeneratedMessageLite.registerDefaultInstance(ExternalToUuidRequest.class, externalToUuidRequest);
        }

        private ExternalToUuidRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalId() {
            this.externalId_ = getDefaultInstance().getExternalId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalIdKey() {
            this.externalIdKey_ = getDefaultInstance().getExternalIdKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        public static ExternalToUuidRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExternalToUuidRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalToUuidRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExternalToUuidRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalId(String str) {
            str.getClass();
            this.externalId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.externalId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalIdKey(String str) {
            str.getClass();
            this.externalIdKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalIdKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.externalIdKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExternalToUuidRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appKey_", "externalId_", "externalIdKey_", "language_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExternalToUuidRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExternalToUuidRequest.class) {
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

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public String getExternalId() {
            return this.externalId_;
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public ByteString getExternalIdBytes() {
            return ByteString.copyFromUtf8(this.externalId_);
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public String getExternalIdKey() {
            return this.externalIdKey_;
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public ByteString getExternalIdKeyBytes() {
            return ByteString.copyFromUtf8(this.externalIdKey_);
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // ac.Api.ExternalToUuidRequestOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        public static Builder newBuilder(ExternalToUuidRequest externalToUuidRequest) {
            return DEFAULT_INSTANCE.createBuilder(externalToUuidRequest);
        }

        public static ExternalToUuidRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExternalToUuidRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExternalToUuidRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExternalToUuidRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExternalToUuidRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExternalToUuidRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExternalToUuidRequest parseFrom(InputStream inputStream) throws IOException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalToUuidRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExternalToUuidRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExternalToUuidRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalToUuidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ExternalToUuidRequestOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getExternalId();

        ByteString getExternalIdBytes();

        String getExternalIdKey();

        ByteString getExternalIdKeyBytes();

        String getLanguage();

        ByteString getLanguageBytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class HelloReply extends GeneratedMessageLite<HelloReply, Builder> implements HelloReplyOrBuilder {
        public static final int CMP_HASH_FIELD_NUMBER = 7;
        public static final int CMP_HASH_VERSION_FIELD_NUMBER = 6;
        public static final int CONFIGURATION_FIELD_NUMBER = 3;
        public static final int CONSENT_FIELD_NUMBER = 4;
        public static final int CONSENT_FLOATING_EXTRA_PURPOSE_FIELD_NUMBER = 8;
        public static final int COUNTRY_FIELD_NUMBER = 11;
        private static final HelloReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int FLOATING_EXTRA_ID_FIELD_NUMBER = 9;
        public static final int FLOATING_VERSION_FIELD_NUMBER = 10;
        private static volatile Parser<HelloReply> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        public static final int VENDORLIST_FIELD_NUMBER = 5;
        private int cmpHashVersion_;
        private Models.Configuration configuration_;
        private Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose_;
        private Models.Consent consent_;
        private Models.Country country_;
        private AcError.ErrorResponse error_;
        private int floatingVersion_;
        private Models.Vendorlist vendorlist_;
        private String uuid_ = "";
        private String cmpHash_ = "";
        private String floatingExtraId_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<HelloReply, Builder> implements HelloReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCmpHash() {
                copyOnWrite();
                ((HelloReply) this.instance).clearCmpHash();
                return this;
            }

            public Builder clearCmpHashVersion() {
                copyOnWrite();
                ((HelloReply) this.instance).clearCmpHashVersion();
                return this;
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((HelloReply) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearConsent() {
                copyOnWrite();
                ((HelloReply) this.instance).clearConsent();
                return this;
            }

            public Builder clearConsentFloatingExtraPurpose() {
                copyOnWrite();
                ((HelloReply) this.instance).clearConsentFloatingExtraPurpose();
                return this;
            }

            public Builder clearCountry() {
                copyOnWrite();
                ((HelloReply) this.instance).clearCountry();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((HelloReply) this.instance).clearError();
                return this;
            }

            public Builder clearFloatingExtraId() {
                copyOnWrite();
                ((HelloReply) this.instance).clearFloatingExtraId();
                return this;
            }

            public Builder clearFloatingVersion() {
                copyOnWrite();
                ((HelloReply) this.instance).clearFloatingVersion();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((HelloReply) this.instance).clearUuid();
                return this;
            }

            public Builder clearVendorlist() {
                copyOnWrite();
                ((HelloReply) this.instance).clearVendorlist();
                return this;
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public String getCmpHash() {
                return ((HelloReply) this.instance).getCmpHash();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public ByteString getCmpHashBytes() {
                return ((HelloReply) this.instance).getCmpHashBytes();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public int getCmpHashVersion() {
                return ((HelloReply) this.instance).getCmpHashVersion();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public Models.Configuration getConfiguration() {
                return ((HelloReply) this.instance).getConfiguration();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public Models.Consent getConsent() {
                return ((HelloReply) this.instance).getConsent();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public Models.ConsentFloatingExtraPurpose getConsentFloatingExtraPurpose() {
                return ((HelloReply) this.instance).getConsentFloatingExtraPurpose();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public Models.Country getCountry() {
                return ((HelloReply) this.instance).getCountry();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((HelloReply) this.instance).getError();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public String getFloatingExtraId() {
                return ((HelloReply) this.instance).getFloatingExtraId();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public ByteString getFloatingExtraIdBytes() {
                return ((HelloReply) this.instance).getFloatingExtraIdBytes();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public int getFloatingVersion() {
                return ((HelloReply) this.instance).getFloatingVersion();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public String getUuid() {
                return ((HelloReply) this.instance).getUuid();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public ByteString getUuidBytes() {
                return ((HelloReply) this.instance).getUuidBytes();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public Models.Vendorlist getVendorlist() {
                return ((HelloReply) this.instance).getVendorlist();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public boolean hasConfiguration() {
                return ((HelloReply) this.instance).hasConfiguration();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public boolean hasConsent() {
                return ((HelloReply) this.instance).hasConsent();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public boolean hasConsentFloatingExtraPurpose() {
                return ((HelloReply) this.instance).hasConsentFloatingExtraPurpose();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public boolean hasCountry() {
                return ((HelloReply) this.instance).hasCountry();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public boolean hasError() {
                return ((HelloReply) this.instance).hasError();
            }

            @Override // ac.Api.HelloReplyOrBuilder
            public boolean hasVendorlist() {
                return ((HelloReply) this.instance).hasVendorlist();
            }

            public Builder mergeConfiguration(Models.Configuration configuration) {
                copyOnWrite();
                ((HelloReply) this.instance).mergeConfiguration(configuration);
                return this;
            }

            public Builder mergeConsent(Models.Consent consent) {
                copyOnWrite();
                ((HelloReply) this.instance).mergeConsent(consent);
                return this;
            }

            public Builder mergeConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
                copyOnWrite();
                ((HelloReply) this.instance).mergeConsentFloatingExtraPurpose(consentFloatingExtraPurpose);
                return this;
            }

            public Builder mergeCountry(Models.Country country) {
                copyOnWrite();
                ((HelloReply) this.instance).mergeCountry(country);
                return this;
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((HelloReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder mergeVendorlist(Models.Vendorlist vendorlist) {
                copyOnWrite();
                ((HelloReply) this.instance).mergeVendorlist(vendorlist);
                return this;
            }

            public Builder setCmpHash(String str) {
                copyOnWrite();
                ((HelloReply) this.instance).setCmpHash(str);
                return this;
            }

            public Builder setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloReply) this.instance).setCmpHashBytes(byteString);
                return this;
            }

            public Builder setCmpHashVersion(int i10) {
                copyOnWrite();
                ((HelloReply) this.instance).setCmpHashVersion(i10);
                return this;
            }

            public Builder setConfiguration(Models.Configuration configuration) {
                copyOnWrite();
                ((HelloReply) this.instance).setConfiguration(configuration);
                return this;
            }

            public Builder setConsent(Models.Consent consent) {
                copyOnWrite();
                ((HelloReply) this.instance).setConsent(consent);
                return this;
            }

            public Builder setConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
                copyOnWrite();
                ((HelloReply) this.instance).setConsentFloatingExtraPurpose(consentFloatingExtraPurpose);
                return this;
            }

            public Builder setCountry(Models.Country country) {
                copyOnWrite();
                ((HelloReply) this.instance).setCountry(country);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((HelloReply) this.instance).setError(errorResponse);
                return this;
            }

            public Builder setFloatingExtraId(String str) {
                copyOnWrite();
                ((HelloReply) this.instance).setFloatingExtraId(str);
                return this;
            }

            public Builder setFloatingExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloReply) this.instance).setFloatingExtraIdBytes(byteString);
                return this;
            }

            public Builder setFloatingVersion(int i10) {
                copyOnWrite();
                ((HelloReply) this.instance).setFloatingVersion(i10);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((HelloReply) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloReply) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setVendorlist(Models.Vendorlist vendorlist) {
                copyOnWrite();
                ((HelloReply) this.instance).setVendorlist(vendorlist);
                return this;
            }

            private Builder() {
                super(HelloReply.DEFAULT_INSTANCE);
            }

            public Builder setConfiguration(Models.Configuration.Builder builder) {
                copyOnWrite();
                ((HelloReply) this.instance).setConfiguration(builder.build());
                return this;
            }

            public Builder setConsent(Models.Consent.Builder builder) {
                copyOnWrite();
                ((HelloReply) this.instance).setConsent(builder.build());
                return this;
            }

            public Builder setConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose.Builder builder) {
                copyOnWrite();
                ((HelloReply) this.instance).setConsentFloatingExtraPurpose(builder.build());
                return this;
            }

            public Builder setCountry(Models.Country.Builder builder) {
                copyOnWrite();
                ((HelloReply) this.instance).setCountry(builder.build());
                return this;
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((HelloReply) this.instance).setError(builder.build());
                return this;
            }

            public Builder setVendorlist(Models.Vendorlist.Builder builder) {
                copyOnWrite();
                ((HelloReply) this.instance).setVendorlist(builder.build());
                return this;
            }
        }

        static {
            HelloReply helloReply = new HelloReply();
            DEFAULT_INSTANCE = helloReply;
            GeneratedMessageLite.registerDefaultInstance(HelloReply.class, helloReply);
        }

        private HelloReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpHash() {
            this.cmpHash_ = getDefaultInstance().getCmpHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpHashVersion() {
            this.cmpHashVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfiguration() {
            this.configuration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsent() {
            this.consent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentFloatingExtraPurpose() {
            this.consentFloatingExtraPurpose_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountry() {
            this.country_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatingExtraId() {
            this.floatingExtraId_ = getDefaultInstance().getFloatingExtraId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatingVersion() {
            this.floatingVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorlist() {
            this.vendorlist_ = null;
        }

        public static HelloReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConfiguration(Models.Configuration configuration) {
            configuration.getClass();
            Models.Configuration configuration2 = this.configuration_;
            if (configuration2 == null || configuration2 == Models.Configuration.getDefaultInstance()) {
                this.configuration_ = configuration;
            } else {
                this.configuration_ = Models.Configuration.newBuilder(this.configuration_).mergeFrom((Models.Configuration.Builder) configuration).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsent(Models.Consent consent) {
            consent.getClass();
            Models.Consent consent2 = this.consent_;
            if (consent2 == null || consent2 == Models.Consent.getDefaultInstance()) {
                this.consent_ = consent;
            } else {
                this.consent_ = Models.Consent.newBuilder(this.consent_).mergeFrom((Models.Consent.Builder) consent).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            consentFloatingExtraPurpose.getClass();
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose2 = this.consentFloatingExtraPurpose_;
            if (consentFloatingExtraPurpose2 == null || consentFloatingExtraPurpose2 == Models.ConsentFloatingExtraPurpose.getDefaultInstance()) {
                this.consentFloatingExtraPurpose_ = consentFloatingExtraPurpose;
            } else {
                this.consentFloatingExtraPurpose_ = Models.ConsentFloatingExtraPurpose.newBuilder(this.consentFloatingExtraPurpose_).mergeFrom((Models.ConsentFloatingExtraPurpose.Builder) consentFloatingExtraPurpose).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCountry(Models.Country country) {
            country.getClass();
            Models.Country country2 = this.country_;
            if (country2 == null || country2 == Models.Country.getDefaultInstance()) {
                this.country_ = country;
            } else {
                this.country_ = Models.Country.newBuilder(this.country_).mergeFrom((Models.Country.Builder) country).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVendorlist(Models.Vendorlist vendorlist) {
            vendorlist.getClass();
            Models.Vendorlist vendorlist2 = this.vendorlist_;
            if (vendorlist2 == null || vendorlist2 == Models.Vendorlist.getDefaultInstance()) {
                this.vendorlist_ = vendorlist;
            } else {
                this.vendorlist_ = Models.Vendorlist.newBuilder(this.vendorlist_).mergeFrom((Models.Vendorlist.Builder) vendorlist).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HelloReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HelloReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HelloReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHash(String str) {
            str.getClass();
            this.cmpHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cmpHash_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHashVersion(int i10) {
            this.cmpHashVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfiguration(Models.Configuration configuration) {
            configuration.getClass();
            this.configuration_ = configuration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsent(Models.Consent consent) {
            consent.getClass();
            this.consent_ = consent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            consentFloatingExtraPurpose.getClass();
            this.consentFloatingExtraPurpose_ = consentFloatingExtraPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountry(Models.Country country) {
            country.getClass();
            this.country_ = country;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatingExtraId(String str) {
            str.getClass();
            this.floatingExtraId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatingExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.floatingExtraId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatingVersion(int i10) {
            this.floatingVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorlist(Models.Vendorlist vendorlist) {
            vendorlist.getClass();
            this.vendorlist_ = vendorlist;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HelloReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\t\u0005\t\u0006\u000b\u0007Ȉ\b\t\tȈ\n\u000b\u000b\t", new Object[]{"error_", "uuid_", "configuration_", "consent_", "vendorlist_", "cmpHashVersion_", "cmpHash_", "consentFloatingExtraPurpose_", "floatingExtraId_", "floatingVersion_", "country_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HelloReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HelloReply.class) {
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

        @Override // ac.Api.HelloReplyOrBuilder
        public String getCmpHash() {
            return this.cmpHash_;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public ByteString getCmpHashBytes() {
            return ByteString.copyFromUtf8(this.cmpHash_);
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public int getCmpHashVersion() {
            return this.cmpHashVersion_;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public Models.Configuration getConfiguration() {
            Models.Configuration configuration = this.configuration_;
            return configuration == null ? Models.Configuration.getDefaultInstance() : configuration;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public Models.Consent getConsent() {
            Models.Consent consent = this.consent_;
            return consent == null ? Models.Consent.getDefaultInstance() : consent;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public Models.ConsentFloatingExtraPurpose getConsentFloatingExtraPurpose() {
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose = this.consentFloatingExtraPurpose_;
            return consentFloatingExtraPurpose == null ? Models.ConsentFloatingExtraPurpose.getDefaultInstance() : consentFloatingExtraPurpose;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public Models.Country getCountry() {
            Models.Country country = this.country_;
            return country == null ? Models.Country.getDefaultInstance() : country;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public String getFloatingExtraId() {
            return this.floatingExtraId_;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public ByteString getFloatingExtraIdBytes() {
            return ByteString.copyFromUtf8(this.floatingExtraId_);
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public int getFloatingVersion() {
            return this.floatingVersion_;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public Models.Vendorlist getVendorlist() {
            Models.Vendorlist vendorlist = this.vendorlist_;
            return vendorlist == null ? Models.Vendorlist.getDefaultInstance() : vendorlist;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public boolean hasConsent() {
            return this.consent_ != null;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public boolean hasConsentFloatingExtraPurpose() {
            return this.consentFloatingExtraPurpose_ != null;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public boolean hasCountry() {
            return this.country_ != null;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // ac.Api.HelloReplyOrBuilder
        public boolean hasVendorlist() {
            return this.vendorlist_ != null;
        }

        public static Builder newBuilder(HelloReply helloReply) {
            return DEFAULT_INSTANCE.createBuilder(helloReply);
        }

        public static HelloReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HelloReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HelloReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HelloReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HelloReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HelloReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HelloReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HelloReply parseFrom(InputStream inputStream) throws IOException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HelloReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HelloReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HelloReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface HelloReplyOrBuilder extends MessageLiteOrBuilder {
        String getCmpHash();

        ByteString getCmpHashBytes();

        int getCmpHashVersion();

        Models.Configuration getConfiguration();

        Models.Consent getConsent();

        Models.ConsentFloatingExtraPurpose getConsentFloatingExtraPurpose();

        Models.Country getCountry();

        AcError.ErrorResponse getError();

        String getFloatingExtraId();

        ByteString getFloatingExtraIdBytes();

        int getFloatingVersion();

        String getUuid();

        ByteString getUuidBytes();

        Models.Vendorlist getVendorlist();

        boolean hasConfiguration();

        boolean hasConsent();

        boolean hasConsentFloatingExtraPurpose();

        boolean hasCountry();

        boolean hasError();

        boolean hasVendorlist();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class HelloRequest extends GeneratedMessageLite<HelloRequest, Builder> implements HelloRequestOrBuilder {
        public static final int AGENT_FIELD_NUMBER = 90;
        public static final int APP_KEY_FIELD_NUMBER = 1;
        public static final int CMP_HASH_FIELD_NUMBER = 8;
        public static final int CMP_HASH_VERSION_FIELD_NUMBER = 9;
        private static final HelloRequest DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 4;
        public static final int LANGUAGE_FIELD_NUMBER = 3;
        public static final int NOCONFIGURATION_FIELD_NUMBER = 5;
        public static final int NOCONSENT_FIELD_NUMBER = 7;
        public static final int NOVENDORLIST_FIELD_NUMBER = 6;
        private static volatile Parser<HelloRequest> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 91;
        public static final int UUID_FIELD_NUMBER = 2;
        private int cmpHashVersion_;
        private boolean noConfiguration_;
        private boolean noConsent_;
        private boolean noVendorList_;
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();
        private String appKey_ = "";
        private String uuid_ = "";
        private String language_ = "";
        private String cmpHash_ = "";
        private String agent_ = "";
        private String source_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<HelloRequest, Builder> implements HelloRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAgent() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearAgent();
                return this;
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearCmpHash() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearCmpHash();
                return this;
            }

            public Builder clearCmpHashVersion() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearCmpHashVersion();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((HelloRequest) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearLanguage();
                return this;
            }

            public Builder clearNoConfiguration() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearNoConfiguration();
                return this;
            }

            public Builder clearNoConsent() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearNoConsent();
                return this;
            }

            public Builder clearNoVendorList() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearNoVendorList();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearSource();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((HelloRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((HelloRequest) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getAgent() {
                return ((HelloRequest) this.instance).getAgent();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public ByteString getAgentBytes() {
                return ((HelloRequest) this.instance).getAgentBytes();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getAppKey() {
                return ((HelloRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((HelloRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getCmpHash() {
                return ((HelloRequest) this.instance).getCmpHash();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public ByteString getCmpHashBytes() {
                return ((HelloRequest) this.instance).getCmpHashBytes();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public int getCmpHashVersion() {
                return ((HelloRequest) this.instance).getCmpHashVersion();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public int getExternalIdsCount() {
                return ((HelloRequest) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((HelloRequest) this.instance).getExternalIdsMap());
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((HelloRequest) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((HelloRequest) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getLanguage() {
                return ((HelloRequest) this.instance).getLanguage();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public ByteString getLanguageBytes() {
                return ((HelloRequest) this.instance).getLanguageBytes();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public boolean getNoConfiguration() {
                return ((HelloRequest) this.instance).getNoConfiguration();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public boolean getNoConsent() {
                return ((HelloRequest) this.instance).getNoConsent();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public boolean getNoVendorList() {
                return ((HelloRequest) this.instance).getNoVendorList();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getSource() {
                return ((HelloRequest) this.instance).getSource();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public ByteString getSourceBytes() {
                return ((HelloRequest) this.instance).getSourceBytes();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public String getUuid() {
                return ((HelloRequest) this.instance).getUuid();
            }

            @Override // ac.Api.HelloRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((HelloRequest) this.instance).getUuidBytes();
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((HelloRequest) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((HelloRequest) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((HelloRequest) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder setAgent(String str) {
                copyOnWrite();
                ((HelloRequest) this.instance).setAgent(str);
                return this;
            }

            public Builder setAgentBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloRequest) this.instance).setAgentBytes(byteString);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((HelloRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setCmpHash(String str) {
                copyOnWrite();
                ((HelloRequest) this.instance).setCmpHash(str);
                return this;
            }

            public Builder setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloRequest) this.instance).setCmpHashBytes(byteString);
                return this;
            }

            public Builder setCmpHashVersion(int i10) {
                copyOnWrite();
                ((HelloRequest) this.instance).setCmpHashVersion(i10);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((HelloRequest) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloRequest) this.instance).setLanguageBytes(byteString);
                return this;
            }

            public Builder setNoConfiguration(boolean z10) {
                copyOnWrite();
                ((HelloRequest) this.instance).setNoConfiguration(z10);
                return this;
            }

            public Builder setNoConsent(boolean z10) {
                copyOnWrite();
                ((HelloRequest) this.instance).setNoConsent(z10);
                return this;
            }

            public Builder setNoVendorList(boolean z10) {
                copyOnWrite();
                ((HelloRequest) this.instance).setNoVendorList(z10);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((HelloRequest) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloRequest) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((HelloRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HelloRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(HelloRequest.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExternalIdsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ExternalIdsDefaultEntryHolder() {
            }
        }

        static {
            HelloRequest helloRequest = new HelloRequest();
            DEFAULT_INSTANCE = helloRequest;
            GeneratedMessageLite.registerDefaultInstance(HelloRequest.class, helloRequest);
        }

        private HelloRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAgent() {
            this.agent_ = getDefaultInstance().getAgent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpHash() {
            this.cmpHash_ = getDefaultInstance().getCmpHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpHashVersion() {
            this.cmpHashVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoConfiguration() {
            this.noConfiguration_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoConsent() {
            this.noConsent_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoVendorList() {
            this.noVendorList_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static HelloRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExternalIdsMap() {
            return internalGetMutableExternalIds();
        }

        private MapFieldLite<String, String> internalGetExternalIds() {
            return this.externalIds_;
        }

        private MapFieldLite<String, String> internalGetMutableExternalIds() {
            if (!this.externalIds_.isMutable()) {
                this.externalIds_ = this.externalIds_.mutableCopy();
            }
            return this.externalIds_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HelloRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HelloRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HelloRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgent(String str) {
            str.getClass();
            this.agent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgentBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.agent_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHash(String str) {
            str.getClass();
            this.cmpHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cmpHash_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHashVersion(int i10) {
            this.cmpHashVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoConfiguration(boolean z10) {
            this.noConfiguration_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoConsent(boolean z10) {
            this.noConsent_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoVendorList(boolean z10) {
            this.noVendorList_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public boolean containsExternalIds(String str) {
            str.getClass();
            return internalGetExternalIds().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HelloRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001[\u000b\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042\u0005\u0007\u0006\u0007\u0007\u0007\bȈ\t\u000bZȈ[Ȉ", new Object[]{"appKey_", "uuid_", "language_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry, "noConfiguration_", "noVendorList_", "noConsent_", "cmpHash_", "cmpHashVersion_", "agent_", "source_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HelloRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HelloRequest.class) {
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

        @Override // ac.Api.HelloRequestOrBuilder
        public String getAgent() {
            return this.agent_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public ByteString getAgentBytes() {
            return ByteString.copyFromUtf8(this.agent_);
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getCmpHash() {
            return this.cmpHash_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public ByteString getCmpHashBytes() {
            return ByteString.copyFromUtf8(this.cmpHash_);
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public int getCmpHashVersion() {
            return this.cmpHashVersion_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public boolean getNoConfiguration() {
            return this.noConfiguration_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public boolean getNoConsent() {
            return this.noConsent_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public boolean getNoVendorList() {
            return this.noVendorList_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.HelloRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(HelloRequest helloRequest) {
            return DEFAULT_INSTANCE.createBuilder(helloRequest);
        }

        public static HelloRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HelloRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HelloRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HelloRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HelloRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HelloRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HelloRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HelloRequest parseFrom(InputStream inputStream) throws IOException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HelloRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HelloRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HelloRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HelloRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface HelloRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExternalIds(String str);

        String getAgent();

        ByteString getAgentBytes();

        String getAppKey();

        ByteString getAppKeyBytes();

        String getCmpHash();

        ByteString getCmpHashBytes();

        int getCmpHashVersion();

        @Deprecated
        Map<String, String> getExternalIds();

        int getExternalIdsCount();

        Map<String, String> getExternalIdsMap();

        String getExternalIdsOrDefault(String str, String str2);

        String getExternalIdsOrThrow(String str);

        String getLanguage();

        ByteString getLanguageBytes();

        boolean getNoConfiguration();

        boolean getNoConsent();

        boolean getNoVendorList();

        String getSource();

        ByteString getSourceBytes();

        String getUuid();

        ByteString getUuidBytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class HistoryReply extends GeneratedMessageLite<HistoryReply, Builder> implements HistoryReplyOrBuilder {
        public static final int CONSENTS_FIELD_NUMBER = 3;
        private static final HistoryReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<HistoryReply> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        private AcError.ErrorResponse error_;
        private String uuid_ = "";
        private Internal.ProtobufList<Models.Consent> consents_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<HistoryReply, Builder> implements HistoryReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllConsents(Iterable<? extends Models.Consent> iterable) {
                copyOnWrite();
                ((HistoryReply) this.instance).addAllConsents(iterable);
                return this;
            }

            public Builder addConsents(Models.Consent consent) {
                copyOnWrite();
                ((HistoryReply) this.instance).addConsents(consent);
                return this;
            }

            public Builder clearConsents() {
                copyOnWrite();
                ((HistoryReply) this.instance).clearConsents();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((HistoryReply) this.instance).clearError();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((HistoryReply) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public Models.Consent getConsents(int i10) {
                return ((HistoryReply) this.instance).getConsents(i10);
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public int getConsentsCount() {
                return ((HistoryReply) this.instance).getConsentsCount();
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public List<Models.Consent> getConsentsList() {
                return Collections.unmodifiableList(((HistoryReply) this.instance).getConsentsList());
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((HistoryReply) this.instance).getError();
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public String getUuid() {
                return ((HistoryReply) this.instance).getUuid();
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public ByteString getUuidBytes() {
                return ((HistoryReply) this.instance).getUuidBytes();
            }

            @Override // ac.Api.HistoryReplyOrBuilder
            public boolean hasError() {
                return ((HistoryReply) this.instance).hasError();
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((HistoryReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder removeConsents(int i10) {
                copyOnWrite();
                ((HistoryReply) this.instance).removeConsents(i10);
                return this;
            }

            public Builder setConsents(int i10, Models.Consent consent) {
                copyOnWrite();
                ((HistoryReply) this.instance).setConsents(i10, consent);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((HistoryReply) this.instance).setError(errorResponse);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((HistoryReply) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HistoryReply) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(HistoryReply.DEFAULT_INSTANCE);
            }

            public Builder addConsents(int i10, Models.Consent consent) {
                copyOnWrite();
                ((HistoryReply) this.instance).addConsents(i10, consent);
                return this;
            }

            public Builder setConsents(int i10, Models.Consent.Builder builder) {
                copyOnWrite();
                ((HistoryReply) this.instance).setConsents(i10, builder.build());
                return this;
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((HistoryReply) this.instance).setError(builder.build());
                return this;
            }

            public Builder addConsents(Models.Consent.Builder builder) {
                copyOnWrite();
                ((HistoryReply) this.instance).addConsents(builder.build());
                return this;
            }

            public Builder addConsents(int i10, Models.Consent.Builder builder) {
                copyOnWrite();
                ((HistoryReply) this.instance).addConsents(i10, builder.build());
                return this;
            }
        }

        static {
            HistoryReply historyReply = new HistoryReply();
            DEFAULT_INSTANCE = historyReply;
            GeneratedMessageLite.registerDefaultInstance(HistoryReply.class, historyReply);
        }

        private HistoryReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConsents(Iterable<? extends Models.Consent> iterable) {
            ensureConsentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.consents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConsents(Models.Consent consent) {
            consent.getClass();
            ensureConsentsIsMutable();
            this.consents_.add(consent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsents() {
            this.consents_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        private void ensureConsentsIsMutable() {
            Internal.ProtobufList<Models.Consent> protobufList = this.consents_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.consents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static HistoryReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HistoryReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HistoryReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HistoryReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeConsents(int i10) {
            ensureConsentsIsMutable();
            this.consents_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsents(int i10, Models.Consent consent) {
            consent.getClass();
            ensureConsentsIsMutable();
            this.consents_.set(i10, consent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HistoryReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002Ȉ\u0003\u001b", new Object[]{"error_", "uuid_", "consents_", Models.Consent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HistoryReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HistoryReply.class) {
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

        @Override // ac.Api.HistoryReplyOrBuilder
        public Models.Consent getConsents(int i10) {
            return this.consents_.get(i10);
        }

        @Override // ac.Api.HistoryReplyOrBuilder
        public int getConsentsCount() {
            return this.consents_.size();
        }

        @Override // ac.Api.HistoryReplyOrBuilder
        public List<Models.Consent> getConsentsList() {
            return this.consents_;
        }

        public Models.ConsentOrBuilder getConsentsOrBuilder(int i10) {
            return this.consents_.get(i10);
        }

        public List<? extends Models.ConsentOrBuilder> getConsentsOrBuilderList() {
            return this.consents_;
        }

        @Override // ac.Api.HistoryReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.HistoryReplyOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.HistoryReplyOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Api.HistoryReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(HistoryReply historyReply) {
            return DEFAULT_INSTANCE.createBuilder(historyReply);
        }

        public static HistoryReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HistoryReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HistoryReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConsents(int i10, Models.Consent consent) {
            consent.getClass();
            ensureConsentsIsMutable();
            this.consents_.add(i10, consent);
        }

        public static HistoryReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HistoryReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HistoryReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HistoryReply parseFrom(InputStream inputStream) throws IOException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HistoryReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HistoryReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface HistoryReplyOrBuilder extends MessageLiteOrBuilder {
        Models.Consent getConsents(int i10);

        int getConsentsCount();

        List<Models.Consent> getConsentsList();

        AcError.ErrorResponse getError();

        String getUuid();

        ByteString getUuidBytes();

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class HistoryRequest extends GeneratedMessageLite<HistoryRequest, Builder> implements HistoryRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 1;
        private static final HistoryRequest DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 6;
        public static final int LANGUAGE_FIELD_NUMBER = 5;
        private static volatile Parser<HistoryRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        public static final int UUID_HASH_FIELD_NUMBER = 4;
        public static final int WITH_TRANSACTION_ID_FIELD_NUMBER = 3;
        private boolean withTransactionId_;
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();
        private String appKey_ = "";
        private String uuid_ = "";
        private String uuidHash_ = "";
        private String language_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<HistoryRequest, Builder> implements HistoryRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((HistoryRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((HistoryRequest) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((HistoryRequest) this.instance).clearLanguage();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((HistoryRequest) this.instance).clearUuid();
                return this;
            }

            public Builder clearUuidHash() {
                copyOnWrite();
                ((HistoryRequest) this.instance).clearUuidHash();
                return this;
            }

            public Builder clearWithTransactionId() {
                copyOnWrite();
                ((HistoryRequest) this.instance).clearWithTransactionId();
                return this;
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((HistoryRequest) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public String getAppKey() {
                return ((HistoryRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((HistoryRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public int getExternalIdsCount() {
                return ((HistoryRequest) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((HistoryRequest) this.instance).getExternalIdsMap());
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((HistoryRequest) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((HistoryRequest) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public String getLanguage() {
                return ((HistoryRequest) this.instance).getLanguage();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public ByteString getLanguageBytes() {
                return ((HistoryRequest) this.instance).getLanguageBytes();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public String getUuid() {
                return ((HistoryRequest) this.instance).getUuid();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((HistoryRequest) this.instance).getUuidBytes();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public String getUuidHash() {
                return ((HistoryRequest) this.instance).getUuidHash();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public ByteString getUuidHashBytes() {
                return ((HistoryRequest) this.instance).getUuidHashBytes();
            }

            @Override // ac.Api.HistoryRequestOrBuilder
            public boolean getWithTransactionId() {
                return ((HistoryRequest) this.instance).getWithTransactionId();
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((HistoryRequest) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((HistoryRequest) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((HistoryRequest) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((HistoryRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HistoryRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((HistoryRequest) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HistoryRequest) this.instance).setLanguageBytes(byteString);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((HistoryRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HistoryRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setUuidHash(String str) {
                copyOnWrite();
                ((HistoryRequest) this.instance).setUuidHash(str);
                return this;
            }

            public Builder setUuidHashBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((HistoryRequest) this.instance).setUuidHashBytes(byteString);
                return this;
            }

            public Builder setWithTransactionId(boolean z10) {
                copyOnWrite();
                ((HistoryRequest) this.instance).setWithTransactionId(z10);
                return this;
            }

            private Builder() {
                super(HistoryRequest.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExternalIdsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ExternalIdsDefaultEntryHolder() {
            }
        }

        static {
            HistoryRequest historyRequest = new HistoryRequest();
            DEFAULT_INSTANCE = historyRequest;
            GeneratedMessageLite.registerDefaultInstance(HistoryRequest.class, historyRequest);
        }

        private HistoryRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuidHash() {
            this.uuidHash_ = getDefaultInstance().getUuidHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWithTransactionId() {
            this.withTransactionId_ = false;
        }

        public static HistoryRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExternalIdsMap() {
            return internalGetMutableExternalIds();
        }

        private MapFieldLite<String, String> internalGetExternalIds() {
            return this.externalIds_;
        }

        private MapFieldLite<String, String> internalGetMutableExternalIds() {
            if (!this.externalIds_.isMutable()) {
                this.externalIds_ = this.externalIds_.mutableCopy();
            }
            return this.externalIds_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HistoryRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HistoryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HistoryRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidHash(String str) {
            str.getClass();
            this.uuidHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidHashBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuidHash_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWithTransactionId(boolean z10) {
            this.withTransactionId_ = z10;
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public boolean containsExternalIds(String str) {
            str.getClass();
            return internalGetExternalIds().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HistoryRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005Ȉ\u00062", new Object[]{"appKey_", "uuid_", "withTransactionId_", "uuidHash_", "language_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HistoryRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HistoryRequest.class) {
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

        @Override // ac.Api.HistoryRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public String getUuidHash() {
            return this.uuidHash_;
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public ByteString getUuidHashBytes() {
            return ByteString.copyFromUtf8(this.uuidHash_);
        }

        @Override // ac.Api.HistoryRequestOrBuilder
        public boolean getWithTransactionId() {
            return this.withTransactionId_;
        }

        public static Builder newBuilder(HistoryRequest historyRequest) {
            return DEFAULT_INSTANCE.createBuilder(historyRequest);
        }

        public static HistoryRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HistoryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HistoryRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HistoryRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HistoryRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HistoryRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HistoryRequest parseFrom(InputStream inputStream) throws IOException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HistoryRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface HistoryRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExternalIds(String str);

        String getAppKey();

        ByteString getAppKeyBytes();

        @Deprecated
        Map<String, String> getExternalIds();

        int getExternalIdsCount();

        Map<String, String> getExternalIdsMap();

        String getExternalIdsOrDefault(String str, String str2);

        String getExternalIdsOrThrow(String str);

        String getLanguage();

        ByteString getLanguageBytes();

        String getUuid();

        ByteString getUuidBytes();

        String getUuidHash();

        ByteString getUuidHashBytes();

        boolean getWithTransactionId();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveExternalReply extends GeneratedMessageLite<SaveExternalReply, Builder> implements SaveExternalReplyOrBuilder {
        private static final SaveExternalReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<SaveExternalReply> PARSER;
        private AcError.ErrorResponse error_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SaveExternalReply, Builder> implements SaveExternalReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((SaveExternalReply) this.instance).clearError();
                return this;
            }

            @Override // ac.Api.SaveExternalReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((SaveExternalReply) this.instance).getError();
            }

            @Override // ac.Api.SaveExternalReplyOrBuilder
            public boolean hasError() {
                return ((SaveExternalReply) this.instance).hasError();
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((SaveExternalReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((SaveExternalReply) this.instance).setError(errorResponse);
                return this;
            }

            private Builder() {
                super(SaveExternalReply.DEFAULT_INSTANCE);
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((SaveExternalReply) this.instance).setError(builder.build());
                return this;
            }
        }

        static {
            SaveExternalReply saveExternalReply = new SaveExternalReply();
            DEFAULT_INSTANCE = saveExternalReply;
            GeneratedMessageLite.registerDefaultInstance(SaveExternalReply.class, saveExternalReply);
        }

        private SaveExternalReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        public static SaveExternalReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SaveExternalReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaveExternalReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveExternalReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SaveExternalReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaveExternalReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SaveExternalReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SaveExternalReply.class) {
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

        @Override // ac.Api.SaveExternalReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.SaveExternalReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(SaveExternalReply saveExternalReply) {
            return DEFAULT_INSTANCE.createBuilder(saveExternalReply);
        }

        public static SaveExternalReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveExternalReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveExternalReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SaveExternalReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SaveExternalReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaveExternalReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaveExternalReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaveExternalReply parseFrom(InputStream inputStream) throws IOException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveExternalReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveExternalReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaveExternalReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SaveExternalReplyOrBuilder extends MessageLiteOrBuilder {
        AcError.ErrorResponse getError();

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveExternalRequest extends GeneratedMessageLite<SaveExternalRequest, Builder> implements SaveExternalRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 2;
        private static final SaveExternalRequest DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 3;
        public static final int GIVEN_AT_FIELD_NUMBER = 4;
        private static volatile Parser<SaveExternalRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private Timestamp givenAt_;
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();
        private String uuid_ = "";
        private String appKey_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SaveExternalRequest, Builder> implements SaveExternalRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            public Builder clearGivenAt() {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).clearGivenAt();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((SaveExternalRequest) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public String getAppKey() {
                return ((SaveExternalRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((SaveExternalRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public int getExternalIdsCount() {
                return ((SaveExternalRequest) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((SaveExternalRequest) this.instance).getExternalIdsMap());
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((SaveExternalRequest) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((SaveExternalRequest) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public Timestamp getGivenAt() {
                return ((SaveExternalRequest) this.instance).getGivenAt();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public String getUuid() {
                return ((SaveExternalRequest) this.instance).getUuid();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((SaveExternalRequest) this.instance).getUuidBytes();
            }

            @Override // ac.Api.SaveExternalRequestOrBuilder
            public boolean hasGivenAt() {
                return ((SaveExternalRequest) this.instance).hasGivenAt();
            }

            public Builder mergeGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).mergeGivenAt(timestamp);
                return this;
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((SaveExternalRequest) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((SaveExternalRequest) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).setGivenAt(timestamp);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(SaveExternalRequest.DEFAULT_INSTANCE);
            }

            public Builder setGivenAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((SaveExternalRequest) this.instance).setGivenAt(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExternalIdsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ExternalIdsDefaultEntryHolder() {
            }
        }

        static {
            SaveExternalRequest saveExternalRequest = new SaveExternalRequest();
            DEFAULT_INSTANCE = saveExternalRequest;
            GeneratedMessageLite.registerDefaultInstance(SaveExternalRequest.class, saveExternalRequest);
        }

        private SaveExternalRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGivenAt() {
            this.givenAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static SaveExternalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExternalIdsMap() {
            return internalGetMutableExternalIds();
        }

        private MapFieldLite<String, String> internalGetExternalIds() {
            return this.externalIds_;
        }

        private MapFieldLite<String, String> internalGetMutableExternalIds() {
            if (!this.externalIds_.isMutable()) {
                this.externalIds_ = this.externalIds_.mutableCopy();
            }
            return this.externalIds_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGivenAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.givenAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.givenAt_ = timestamp;
            } else {
                this.givenAt_ = Timestamp.newBuilder(this.givenAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SaveExternalRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaveExternalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveExternalRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SaveExternalRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGivenAt(Timestamp timestamp) {
            timestamp.getClass();
            this.givenAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public boolean containsExternalIds(String str) {
            str.getClass();
            return internalGetExternalIds().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaveExternalRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004\t", new Object[]{"uuid_", "appKey_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry, "givenAt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SaveExternalRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SaveExternalRequest.class) {
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

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public Timestamp getGivenAt() {
            Timestamp timestamp = this.givenAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Api.SaveExternalRequestOrBuilder
        public boolean hasGivenAt() {
            return this.givenAt_ != null;
        }

        public static Builder newBuilder(SaveExternalRequest saveExternalRequest) {
            return DEFAULT_INSTANCE.createBuilder(saveExternalRequest);
        }

        public static SaveExternalRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveExternalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveExternalRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SaveExternalRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SaveExternalRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaveExternalRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaveExternalRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaveExternalRequest parseFrom(InputStream inputStream) throws IOException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveExternalRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveExternalRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaveExternalRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SaveExternalRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExternalIds(String str);

        String getAppKey();

        ByteString getAppKeyBytes();

        @Deprecated
        Map<String, String> getExternalIds();

        int getExternalIdsCount();

        Map<String, String> getExternalIdsMap();

        String getExternalIdsOrDefault(String str, String str2);

        String getExternalIdsOrThrow(String str);

        Timestamp getGivenAt();

        String getUuid();

        ByteString getUuidBytes();

        boolean hasGivenAt();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveFloatingExtraPurposeReply extends GeneratedMessageLite<SaveFloatingExtraPurposeReply, Builder> implements SaveFloatingExtraPurposeReplyOrBuilder {
        private static final SaveFloatingExtraPurposeReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<SaveFloatingExtraPurposeReply> PARSER;
        private AcError.ErrorResponse error_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SaveFloatingExtraPurposeReply, Builder> implements SaveFloatingExtraPurposeReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((SaveFloatingExtraPurposeReply) this.instance).clearError();
                return this;
            }

            @Override // ac.Api.SaveFloatingExtraPurposeReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((SaveFloatingExtraPurposeReply) this.instance).getError();
            }

            @Override // ac.Api.SaveFloatingExtraPurposeReplyOrBuilder
            public boolean hasError() {
                return ((SaveFloatingExtraPurposeReply) this.instance).hasError();
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeReply) this.instance).setError(errorResponse);
                return this;
            }

            private Builder() {
                super(SaveFloatingExtraPurposeReply.DEFAULT_INSTANCE);
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeReply) this.instance).setError(builder.build());
                return this;
            }
        }

        static {
            SaveFloatingExtraPurposeReply saveFloatingExtraPurposeReply = new SaveFloatingExtraPurposeReply();
            DEFAULT_INSTANCE = saveFloatingExtraPurposeReply;
            GeneratedMessageLite.registerDefaultInstance(SaveFloatingExtraPurposeReply.class, saveFloatingExtraPurposeReply);
        }

        private SaveFloatingExtraPurposeReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        public static SaveFloatingExtraPurposeReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SaveFloatingExtraPurposeReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SaveFloatingExtraPurposeReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaveFloatingExtraPurposeReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SaveFloatingExtraPurposeReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SaveFloatingExtraPurposeReply.class) {
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

        @Override // ac.Api.SaveFloatingExtraPurposeReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.SaveFloatingExtraPurposeReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(SaveFloatingExtraPurposeReply saveFloatingExtraPurposeReply) {
            return DEFAULT_INSTANCE.createBuilder(saveFloatingExtraPurposeReply);
        }

        public static SaveFloatingExtraPurposeReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(InputStream inputStream) throws IOException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaveFloatingExtraPurposeReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveFloatingExtraPurposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SaveFloatingExtraPurposeReplyOrBuilder extends MessageLiteOrBuilder {
        AcError.ErrorResponse getError();

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class SaveFloatingExtraPurposeRequest extends GeneratedMessageLite<SaveFloatingExtraPurposeRequest, Builder> implements SaveFloatingExtraPurposeRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 2;
        public static final int CONSENT_FLOATING_EXTRA_PURPOSE_FIELD_NUMBER = 3;
        private static final SaveFloatingExtraPurposeRequest DEFAULT_INSTANCE;
        private static volatile Parser<SaveFloatingExtraPurposeRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private String appKey_;
        private Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose_;
        private String uuid_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<SaveFloatingExtraPurposeRequest, Builder> implements SaveFloatingExtraPurposeRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearConsentFloatingExtraPurpose() {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).clearConsentFloatingExtraPurpose();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
            public String getAppKey() {
                return ((SaveFloatingExtraPurposeRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((SaveFloatingExtraPurposeRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
            public Models.ConsentFloatingExtraPurpose getConsentFloatingExtraPurpose() {
                return ((SaveFloatingExtraPurposeRequest) this.instance).getConsentFloatingExtraPurpose();
            }

            @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
            public String getUuid() {
                return ((SaveFloatingExtraPurposeRequest) this.instance).getUuid();
            }

            @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((SaveFloatingExtraPurposeRequest) this.instance).getUuidBytes();
            }

            @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
            public boolean hasConsentFloatingExtraPurpose() {
                return ((SaveFloatingExtraPurposeRequest) this.instance).hasConsentFloatingExtraPurpose();
            }

            public Builder mergeConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).mergeConsentFloatingExtraPurpose(consentFloatingExtraPurpose);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).setConsentFloatingExtraPurpose(consentFloatingExtraPurpose);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(SaveFloatingExtraPurposeRequest.DEFAULT_INSTANCE);
            }

            public Builder setConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose.Builder builder) {
                copyOnWrite();
                ((SaveFloatingExtraPurposeRequest) this.instance).setConsentFloatingExtraPurpose(builder.build());
                return this;
            }
        }

        static {
            SaveFloatingExtraPurposeRequest saveFloatingExtraPurposeRequest = new SaveFloatingExtraPurposeRequest();
            DEFAULT_INSTANCE = saveFloatingExtraPurposeRequest;
            GeneratedMessageLite.registerDefaultInstance(SaveFloatingExtraPurposeRequest.class, saveFloatingExtraPurposeRequest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentFloatingExtraPurpose() {
            this.consentFloatingExtraPurpose_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static SaveFloatingExtraPurposeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            consentFloatingExtraPurpose.getClass();
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose2 = this.consentFloatingExtraPurpose_;
            if (consentFloatingExtraPurpose2 == null || consentFloatingExtraPurpose2 == Models.ConsentFloatingExtraPurpose.getDefaultInstance()) {
                this.consentFloatingExtraPurpose_ = consentFloatingExtraPurpose;
            } else {
                this.consentFloatingExtraPurpose_ = Models.ConsentFloatingExtraPurpose.newBuilder(this.consentFloatingExtraPurpose_).mergeFrom((Models.ConsentFloatingExtraPurpose.Builder) consentFloatingExtraPurpose).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SaveFloatingExtraPurposeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SaveFloatingExtraPurposeRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            consentFloatingExtraPurpose.getClass();
            this.consentFloatingExtraPurpose_ = consentFloatingExtraPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaveFloatingExtraPurposeRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"uuid_", "appKey_", "consentFloatingExtraPurpose_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SaveFloatingExtraPurposeRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SaveFloatingExtraPurposeRequest.class) {
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

        @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
        public Models.ConsentFloatingExtraPurpose getConsentFloatingExtraPurpose() {
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose = this.consentFloatingExtraPurpose_;
            return consentFloatingExtraPurpose == null ? Models.ConsentFloatingExtraPurpose.getDefaultInstance() : consentFloatingExtraPurpose;
        }

        @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Api.SaveFloatingExtraPurposeRequestOrBuilder
        public boolean hasConsentFloatingExtraPurpose() {
            return this.consentFloatingExtraPurpose_ != null;
        }

        public static Builder newBuilder(SaveFloatingExtraPurposeRequest saveFloatingExtraPurposeRequest) {
            return DEFAULT_INSTANCE.createBuilder(saveFloatingExtraPurposeRequest);
        }

        public static SaveFloatingExtraPurposeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private SaveFloatingExtraPurposeRequest() {
            String str = RnJusJ.Nxn;
            this.uuid_ = str;
            this.appKey_ = str;
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(InputStream inputStream) throws IOException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaveFloatingExtraPurposeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveFloatingExtraPurposeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SaveFloatingExtraPurposeRequestOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        Models.ConsentFloatingExtraPurpose getConsentFloatingExtraPurpose();

        String getUuid();

        ByteString getUuidBytes();

        boolean hasConsentFloatingExtraPurpose();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveReply extends GeneratedMessageLite<SaveReply, Builder> implements SaveReplyOrBuilder {
        public static final int CONSENT_EXPIRATION_FIELD_NUMBER = 2;
        private static final SaveReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<SaveReply> PARSER;
        private Duration consentExpiration_;
        private AcError.ErrorResponse error_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SaveReply, Builder> implements SaveReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearConsentExpiration() {
                copyOnWrite();
                ((SaveReply) this.instance).clearConsentExpiration();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((SaveReply) this.instance).clearError();
                return this;
            }

            @Override // ac.Api.SaveReplyOrBuilder
            public Duration getConsentExpiration() {
                return ((SaveReply) this.instance).getConsentExpiration();
            }

            @Override // ac.Api.SaveReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((SaveReply) this.instance).getError();
            }

            @Override // ac.Api.SaveReplyOrBuilder
            public boolean hasConsentExpiration() {
                return ((SaveReply) this.instance).hasConsentExpiration();
            }

            @Override // ac.Api.SaveReplyOrBuilder
            public boolean hasError() {
                return ((SaveReply) this.instance).hasError();
            }

            public Builder mergeConsentExpiration(Duration duration) {
                copyOnWrite();
                ((SaveReply) this.instance).mergeConsentExpiration(duration);
                return this;
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((SaveReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder setConsentExpiration(Duration duration) {
                copyOnWrite();
                ((SaveReply) this.instance).setConsentExpiration(duration);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((SaveReply) this.instance).setError(errorResponse);
                return this;
            }

            private Builder() {
                super(SaveReply.DEFAULT_INSTANCE);
            }

            public Builder setConsentExpiration(Duration.Builder builder) {
                copyOnWrite();
                ((SaveReply) this.instance).setConsentExpiration(builder.build());
                return this;
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((SaveReply) this.instance).setError(builder.build());
                return this;
            }
        }

        static {
            SaveReply saveReply = new SaveReply();
            DEFAULT_INSTANCE = saveReply;
            GeneratedMessageLite.registerDefaultInstance(SaveReply.class, saveReply);
        }

        private SaveReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentExpiration() {
            this.consentExpiration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        public static SaveReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsentExpiration(Duration duration) {
            duration.getClass();
            Duration duration2 = this.consentExpiration_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.consentExpiration_ = duration;
            } else {
                this.consentExpiration_ = Duration.newBuilder(this.consentExpiration_).mergeFrom((Duration.Builder) duration).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SaveReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaveReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SaveReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentExpiration(Duration duration) {
            duration.getClass();
            this.consentExpiration_ = duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaveReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"error_", "consentExpiration_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SaveReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SaveReply.class) {
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

        @Override // ac.Api.SaveReplyOrBuilder
        public Duration getConsentExpiration() {
            Duration duration = this.consentExpiration_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // ac.Api.SaveReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.SaveReplyOrBuilder
        public boolean hasConsentExpiration() {
            return this.consentExpiration_ != null;
        }

        @Override // ac.Api.SaveReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(SaveReply saveReply) {
            return DEFAULT_INSTANCE.createBuilder(saveReply);
        }

        public static SaveReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SaveReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SaveReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaveReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaveReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaveReply parseFrom(InputStream inputStream) throws IOException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaveReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SaveReplyOrBuilder extends MessageLiteOrBuilder {
        Duration getConsentExpiration();

        AcError.ErrorResponse getError();

        boolean hasConsentExpiration();

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveRequest extends GeneratedMessageLite<SaveRequest, Builder> implements SaveRequestOrBuilder {
        public static final int AGENT_FIELD_NUMBER = 90;
        public static final int APP_KEY_FIELD_NUMBER = 1;
        public static final int CONSENT_FIELD_NUMBER = 3;
        private static final SaveRequest DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 4;
        private static volatile Parser<SaveRequest> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 91;
        public static final int UUID_FIELD_NUMBER = 2;
        private Models.Consent consent_;
        private String appKey_ = "";
        private String uuid_ = "";
        private Internal.ProtobufList<Metric$Event> events_ = GeneratedMessageLite.emptyProtobufList();
        private String agent_ = "";
        private String source_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SaveRequest, Builder> implements SaveRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllEvents(Iterable<? extends Metric$Event> iterable) {
                copyOnWrite();
                ((SaveRequest) this.instance).addAllEvents(iterable);
                return this;
            }

            public Builder addEvents(Metric$Event metric$Event) {
                copyOnWrite();
                ((SaveRequest) this.instance).addEvents(metric$Event);
                return this;
            }

            public Builder clearAgent() {
                copyOnWrite();
                ((SaveRequest) this.instance).clearAgent();
                return this;
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((SaveRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearConsent() {
                copyOnWrite();
                ((SaveRequest) this.instance).clearConsent();
                return this;
            }

            public Builder clearEvents() {
                copyOnWrite();
                ((SaveRequest) this.instance).clearEvents();
                return this;
            }

            public Builder clearSource() {
                copyOnWrite();
                ((SaveRequest) this.instance).clearSource();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((SaveRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public String getAgent() {
                return ((SaveRequest) this.instance).getAgent();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public ByteString getAgentBytes() {
                return ((SaveRequest) this.instance).getAgentBytes();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public String getAppKey() {
                return ((SaveRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((SaveRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public Models.Consent getConsent() {
                return ((SaveRequest) this.instance).getConsent();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public Metric$Event getEvents(int i10) {
                return ((SaveRequest) this.instance).getEvents(i10);
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public int getEventsCount() {
                return ((SaveRequest) this.instance).getEventsCount();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public List<Metric$Event> getEventsList() {
                return Collections.unmodifiableList(((SaveRequest) this.instance).getEventsList());
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public String getSource() {
                return ((SaveRequest) this.instance).getSource();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public ByteString getSourceBytes() {
                return ((SaveRequest) this.instance).getSourceBytes();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public String getUuid() {
                return ((SaveRequest) this.instance).getUuid();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((SaveRequest) this.instance).getUuidBytes();
            }

            @Override // ac.Api.SaveRequestOrBuilder
            public boolean hasConsent() {
                return ((SaveRequest) this.instance).hasConsent();
            }

            public Builder mergeConsent(Models.Consent consent) {
                copyOnWrite();
                ((SaveRequest) this.instance).mergeConsent(consent);
                return this;
            }

            public Builder removeEvents(int i10) {
                copyOnWrite();
                ((SaveRequest) this.instance).removeEvents(i10);
                return this;
            }

            public Builder setAgent(String str) {
                copyOnWrite();
                ((SaveRequest) this.instance).setAgent(str);
                return this;
            }

            public Builder setAgentBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveRequest) this.instance).setAgentBytes(byteString);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((SaveRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setConsent(Models.Consent consent) {
                copyOnWrite();
                ((SaveRequest) this.instance).setConsent(consent);
                return this;
            }

            public Builder setEvents(int i10, Metric$Event metric$Event) {
                copyOnWrite();
                ((SaveRequest) this.instance).setEvents(i10, metric$Event);
                return this;
            }

            public Builder setSource(String str) {
                copyOnWrite();
                ((SaveRequest) this.instance).setSource(str);
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveRequest) this.instance).setSourceBytes(byteString);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((SaveRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((SaveRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(SaveRequest.DEFAULT_INSTANCE);
            }

            public Builder addEvents(int i10, Metric$Event metric$Event) {
                copyOnWrite();
                ((SaveRequest) this.instance).addEvents(i10, metric$Event);
                return this;
            }

            public Builder setConsent(Models.Consent.Builder builder) {
                copyOnWrite();
                ((SaveRequest) this.instance).setConsent(builder.build());
                return this;
            }

            public Builder setEvents(int i10, b bVar) {
                copyOnWrite();
                ((SaveRequest) this.instance).setEvents(i10, (Metric$Event) bVar.build());
                return this;
            }

            public Builder addEvents(b bVar) {
                copyOnWrite();
                ((SaveRequest) this.instance).addEvents((Metric$Event) bVar.build());
                return this;
            }

            public Builder addEvents(int i10, b bVar) {
                copyOnWrite();
                ((SaveRequest) this.instance).addEvents(i10, (Metric$Event) bVar.build());
                return this;
            }
        }

        static {
            SaveRequest saveRequest = new SaveRequest();
            DEFAULT_INSTANCE = saveRequest;
            GeneratedMessageLite.registerDefaultInstance(SaveRequest.class, saveRequest);
        }

        private SaveRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEvents(Iterable<? extends Metric$Event> iterable) {
            ensureEventsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(Metric$Event metric$Event) {
            metric$Event.getClass();
            ensureEventsIsMutable();
            this.events_.add(metric$Event);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAgent() {
            this.agent_ = getDefaultInstance().getAgent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsent() {
            this.consent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvents() {
            this.events_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = getDefaultInstance().getSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        private void ensureEventsIsMutable() {
            Internal.ProtobufList<Metric$Event> protobufList = this.events_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SaveRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsent(Models.Consent consent) {
            consent.getClass();
            Models.Consent consent2 = this.consent_;
            if (consent2 == null || consent2 == Models.Consent.getDefaultInstance()) {
                this.consent_ = consent;
            } else {
                this.consent_ = Models.Consent.newBuilder(this.consent_).mergeFrom((Models.Consent.Builder) consent).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SaveRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SaveRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SaveRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEvents(int i10) {
            ensureEventsIsMutable();
            this.events_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgent(String str) {
            str.getClass();
            this.agent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgentBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.agent_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsent(Models.Consent consent) {
            consent.getClass();
            this.consent_ = consent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvents(int i10, Metric$Event metric$Event) {
            metric$Event.getClass();
            ensureEventsIsMutable();
            this.events_.set(i10, metric$Event);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(String str) {
            str.getClass();
            this.source_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.source_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SaveRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001[\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\u001bZȈ[Ȉ", new Object[]{"appKey_", "uuid_", "consent_", "events_", Metric$Event.class, "agent_", "source_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SaveRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SaveRequest.class) {
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

        @Override // ac.Api.SaveRequestOrBuilder
        public String getAgent() {
            return this.agent_;
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public ByteString getAgentBytes() {
            return ByteString.copyFromUtf8(this.agent_);
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public Models.Consent getConsent() {
            Models.Consent consent = this.consent_;
            return consent == null ? Models.Consent.getDefaultInstance() : consent;
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public Metric$Event getEvents(int i10) {
            return this.events_.get(i10);
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public int getEventsCount() {
            return this.events_.size();
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public List<Metric$Event> getEventsList() {
            return this.events_;
        }

        public c getEventsOrBuilder(int i10) {
            return this.events_.get(i10);
        }

        public List<? extends c> getEventsOrBuilderList() {
            return this.events_;
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public String getSource() {
            return this.source_;
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.source_);
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Api.SaveRequestOrBuilder
        public boolean hasConsent() {
            return this.consent_ != null;
        }

        public static Builder newBuilder(SaveRequest saveRequest) {
            return DEFAULT_INSTANCE.createBuilder(saveRequest);
        }

        public static SaveRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SaveRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEvents(int i10, Metric$Event metric$Event) {
            metric$Event.getClass();
            ensureEventsIsMutable();
            this.events_.add(i10, metric$Event);
        }

        public static SaveRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SaveRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SaveRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SaveRequest parseFrom(InputStream inputStream) throws IOException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SaveRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SaveRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SaveRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SaveRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SaveRequestOrBuilder extends MessageLiteOrBuilder {
        String getAgent();

        ByteString getAgentBytes();

        String getAppKey();

        ByteString getAppKeyBytes();

        Models.Consent getConsent();

        Metric$Event getEvents(int i10);

        int getEventsCount();

        List<Metric$Event> getEventsList();

        String getSource();

        ByteString getSourceBytes();

        String getUuid();

        ByteString getUuidBytes();

        boolean hasConsent();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TranslateVendorCookieRetentionReply extends GeneratedMessageLite<TranslateVendorCookieRetentionReply, Builder> implements TranslateVendorCookieRetentionReplyOrBuilder {
        private static final TranslateVendorCookieRetentionReply DEFAULT_INSTANCE;
        private static volatile Parser<TranslateVendorCookieRetentionReply> PARSER = null;
        public static final int TRANSLATION_FIELD_NUMBER = 1;
        private String translation_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<TranslateVendorCookieRetentionReply, Builder> implements TranslateVendorCookieRetentionReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearTranslation() {
                copyOnWrite();
                ((TranslateVendorCookieRetentionReply) this.instance).clearTranslation();
                return this;
            }

            @Override // ac.Api.TranslateVendorCookieRetentionReplyOrBuilder
            public String getTranslation() {
                return ((TranslateVendorCookieRetentionReply) this.instance).getTranslation();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionReplyOrBuilder
            public ByteString getTranslationBytes() {
                return ((TranslateVendorCookieRetentionReply) this.instance).getTranslationBytes();
            }

            public Builder setTranslation(String str) {
                copyOnWrite();
                ((TranslateVendorCookieRetentionReply) this.instance).setTranslation(str);
                return this;
            }

            public Builder setTranslationBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((TranslateVendorCookieRetentionReply) this.instance).setTranslationBytes(byteString);
                return this;
            }

            private Builder() {
                super(TranslateVendorCookieRetentionReply.DEFAULT_INSTANCE);
            }
        }

        static {
            TranslateVendorCookieRetentionReply translateVendorCookieRetentionReply = new TranslateVendorCookieRetentionReply();
            DEFAULT_INSTANCE = translateVendorCookieRetentionReply;
            GeneratedMessageLite.registerDefaultInstance(TranslateVendorCookieRetentionReply.class, translateVendorCookieRetentionReply);
        }

        private TranslateVendorCookieRetentionReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTranslation() {
            this.translation_ = getDefaultInstance().getTranslation();
        }

        public static TranslateVendorCookieRetentionReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TranslateVendorCookieRetentionReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TranslateVendorCookieRetentionReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslation(String str) {
            str.getClass();
            this.translation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslationBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.translation_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TranslateVendorCookieRetentionReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"translation_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TranslateVendorCookieRetentionReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TranslateVendorCookieRetentionReply.class) {
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

        @Override // ac.Api.TranslateVendorCookieRetentionReplyOrBuilder
        public String getTranslation() {
            return this.translation_;
        }

        @Override // ac.Api.TranslateVendorCookieRetentionReplyOrBuilder
        public ByteString getTranslationBytes() {
            return ByteString.copyFromUtf8(this.translation_);
        }

        public static Builder newBuilder(TranslateVendorCookieRetentionReply translateVendorCookieRetentionReply) {
            return DEFAULT_INSTANCE.createBuilder(translateVendorCookieRetentionReply);
        }

        public static TranslateVendorCookieRetentionReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(InputStream inputStream) throws IOException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TranslateVendorCookieRetentionReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslateVendorCookieRetentionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface TranslateVendorCookieRetentionReplyOrBuilder extends MessageLiteOrBuilder {
        String getTranslation();

        ByteString getTranslationBytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TranslateVendorCookieRetentionRequest extends GeneratedMessageLite<TranslateVendorCookieRetentionRequest, Builder> implements TranslateVendorCookieRetentionRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 2;
        public static final int COOKIE_MAX_AGE_SECONDS_FIELD_NUMBER = 5;
        private static final TranslateVendorCookieRetentionRequest DEFAULT_INSTANCE;
        public static final int LANG_FIELD_NUMBER = 3;
        private static volatile Parser<TranslateVendorCookieRetentionRequest> PARSER = null;
        public static final int USES_NON_COOKIE_ACCESS_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private long cookieMaxAgeSeconds_;
        private boolean usesNonCookieAccess_;
        private String uuid_ = "";
        private String appKey_ = "";
        private String lang_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<TranslateVendorCookieRetentionRequest, Builder> implements TranslateVendorCookieRetentionRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearCookieMaxAgeSeconds() {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).clearCookieMaxAgeSeconds();
                return this;
            }

            public Builder clearLang() {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).clearLang();
                return this;
            }

            public Builder clearUsesNonCookieAccess() {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).clearUsesNonCookieAccess();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public String getAppKey() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public long getCookieMaxAgeSeconds() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getCookieMaxAgeSeconds();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public String getLang() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getLang();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public ByteString getLangBytes() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getLangBytes();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public boolean getUsesNonCookieAccess() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getUsesNonCookieAccess();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public String getUuid() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getUuid();
            }

            @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((TranslateVendorCookieRetentionRequest) this.instance).getUuidBytes();
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setCookieMaxAgeSeconds(long j10) {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setCookieMaxAgeSeconds(j10);
                return this;
            }

            public Builder setLang(String str) {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setLang(str);
                return this;
            }

            public Builder setLangBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setLangBytes(byteString);
                return this;
            }

            public Builder setUsesNonCookieAccess(boolean z10) {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setUsesNonCookieAccess(z10);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((TranslateVendorCookieRetentionRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(TranslateVendorCookieRetentionRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            TranslateVendorCookieRetentionRequest translateVendorCookieRetentionRequest = new TranslateVendorCookieRetentionRequest();
            DEFAULT_INSTANCE = translateVendorCookieRetentionRequest;
            GeneratedMessageLite.registerDefaultInstance(TranslateVendorCookieRetentionRequest.class, translateVendorCookieRetentionRequest);
        }

        private TranslateVendorCookieRetentionRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCookieMaxAgeSeconds() {
            this.cookieMaxAgeSeconds_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLang() {
            this.lang_ = getDefaultInstance().getLang();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsesNonCookieAccess() {
            this.usesNonCookieAccess_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static TranslateVendorCookieRetentionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TranslateVendorCookieRetentionRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TranslateVendorCookieRetentionRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCookieMaxAgeSeconds(long j10) {
            this.cookieMaxAgeSeconds_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLang(String str) {
            str.getClass();
            this.lang_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLangBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.lang_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsesNonCookieAccess(boolean z10) {
            this.usesNonCookieAccess_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TranslateVendorCookieRetentionRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\u0002", new Object[]{"uuid_", "appKey_", "lang_", "usesNonCookieAccess_", "cookieMaxAgeSeconds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TranslateVendorCookieRetentionRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TranslateVendorCookieRetentionRequest.class) {
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

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public long getCookieMaxAgeSeconds() {
            return this.cookieMaxAgeSeconds_;
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public String getLang() {
            return this.lang_;
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public ByteString getLangBytes() {
            return ByteString.copyFromUtf8(this.lang_);
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public boolean getUsesNonCookieAccess() {
            return this.usesNonCookieAccess_;
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.TranslateVendorCookieRetentionRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(TranslateVendorCookieRetentionRequest translateVendorCookieRetentionRequest) {
            return DEFAULT_INSTANCE.createBuilder(translateVendorCookieRetentionRequest);
        }

        public static TranslateVendorCookieRetentionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(InputStream inputStream) throws IOException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TranslateVendorCookieRetentionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TranslateVendorCookieRetentionRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface TranslateVendorCookieRetentionRequestOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        long getCookieMaxAgeSeconds();

        String getLang();

        ByteString getLangBytes();

        boolean getUsesNonCookieAccess();

        String getUuid();

        ByteString getUuidBytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UuidToExternalReply extends GeneratedMessageLite<UuidToExternalReply, Builder> implements UuidToExternalReplyOrBuilder {
        private static final UuidToExternalReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 2;
        private static volatile Parser<UuidToExternalReply> PARSER;
        private AcError.ErrorResponse error_;
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<UuidToExternalReply, Builder> implements UuidToExternalReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((UuidToExternalReply) this.instance).clearError();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((UuidToExternalReply) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((UuidToExternalReply) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((UuidToExternalReply) this.instance).getError();
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public int getExternalIdsCount() {
                return ((UuidToExternalReply) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((UuidToExternalReply) this.instance).getExternalIdsMap());
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((UuidToExternalReply) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((UuidToExternalReply) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Api.UuidToExternalReplyOrBuilder
            public boolean hasError() {
                return ((UuidToExternalReply) this.instance).hasError();
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((UuidToExternalReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((UuidToExternalReply) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((UuidToExternalReply) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((UuidToExternalReply) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((UuidToExternalReply) this.instance).setError(errorResponse);
                return this;
            }

            private Builder() {
                super(UuidToExternalReply.DEFAULT_INSTANCE);
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((UuidToExternalReply) this.instance).setError(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExternalIdsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ExternalIdsDefaultEntryHolder() {
            }
        }

        static {
            UuidToExternalReply uuidToExternalReply = new UuidToExternalReply();
            DEFAULT_INSTANCE = uuidToExternalReply;
            GeneratedMessageLite.registerDefaultInstance(UuidToExternalReply.class, uuidToExternalReply);
        }

        private UuidToExternalReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        public static UuidToExternalReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExternalIdsMap() {
            return internalGetMutableExternalIds();
        }

        private MapFieldLite<String, String> internalGetExternalIds() {
            return this.externalIds_;
        }

        private MapFieldLite<String, String> internalGetMutableExternalIds() {
            if (!this.externalIds_.isMutable()) {
                this.externalIds_ = this.externalIds_.mutableCopy();
            }
            return this.externalIds_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            AcError.ErrorResponse errorResponse2 = this.error_;
            if (errorResponse2 == null || errorResponse2 == AcError.ErrorResponse.getDefaultInstance()) {
                this.error_ = errorResponse;
            } else {
                this.error_ = AcError.ErrorResponse.newBuilder(this.error_).mergeFrom((AcError.ErrorResponse.Builder) errorResponse).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UuidToExternalReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UuidToExternalReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UuidToExternalReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UuidToExternalReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(AcError.ErrorResponse errorResponse) {
            errorResponse.getClass();
            this.error_ = errorResponse;
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public boolean containsExternalIds(String str) {
            str.getClass();
            return internalGetExternalIds().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UuidToExternalReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"error_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UuidToExternalReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (UuidToExternalReply.class) {
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

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Api.UuidToExternalReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(UuidToExternalReply uuidToExternalReply) {
            return DEFAULT_INSTANCE.createBuilder(uuidToExternalReply);
        }

        public static UuidToExternalReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UuidToExternalReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UuidToExternalReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UuidToExternalReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UuidToExternalReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UuidToExternalReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UuidToExternalReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UuidToExternalReply parseFrom(InputStream inputStream) throws IOException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UuidToExternalReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UuidToExternalReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UuidToExternalReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UuidToExternalReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UuidToExternalReplyOrBuilder extends MessageLiteOrBuilder {
        boolean containsExternalIds(String str);

        AcError.ErrorResponse getError();

        @Deprecated
        Map<String, String> getExternalIds();

        int getExternalIdsCount();

        Map<String, String> getExternalIdsMap();

        String getExternalIdsOrDefault(String str, String str2);

        String getExternalIdsOrThrow(String str);

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UuidToExternalRequest extends GeneratedMessageLite<UuidToExternalRequest, Builder> implements UuidToExternalRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 1;
        private static final UuidToExternalRequest DEFAULT_INSTANCE;
        public static final int LANGUAGE_FIELD_NUMBER = 3;
        private static volatile Parser<UuidToExternalRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        private String appKey_ = "";
        private String uuid_ = "";
        private String language_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<UuidToExternalRequest, Builder> implements UuidToExternalRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearLanguage() {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).clearLanguage();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Api.UuidToExternalRequestOrBuilder
            public String getAppKey() {
                return ((UuidToExternalRequest) this.instance).getAppKey();
            }

            @Override // ac.Api.UuidToExternalRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((UuidToExternalRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Api.UuidToExternalRequestOrBuilder
            public String getLanguage() {
                return ((UuidToExternalRequest) this.instance).getLanguage();
            }

            @Override // ac.Api.UuidToExternalRequestOrBuilder
            public ByteString getLanguageBytes() {
                return ((UuidToExternalRequest) this.instance).getLanguageBytes();
            }

            @Override // ac.Api.UuidToExternalRequestOrBuilder
            public String getUuid() {
                return ((UuidToExternalRequest) this.instance).getUuid();
            }

            @Override // ac.Api.UuidToExternalRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((UuidToExternalRequest) this.instance).getUuidBytes();
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setLanguage(String str) {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).setLanguage(str);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).setLanguageBytes(byteString);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((UuidToExternalRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(UuidToExternalRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            UuidToExternalRequest uuidToExternalRequest = new UuidToExternalRequest();
            DEFAULT_INSTANCE = uuidToExternalRequest;
            GeneratedMessageLite.registerDefaultInstance(UuidToExternalRequest.class, uuidToExternalRequest);
        }

        private UuidToExternalRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static UuidToExternalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UuidToExternalRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UuidToExternalRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UuidToExternalRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKey(String str) {
            str.getClass();
            this.appKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.language_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UuidToExternalRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"appKey_", "uuid_", "language_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UuidToExternalRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (UuidToExternalRequest.class) {
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

        @Override // ac.Api.UuidToExternalRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Api.UuidToExternalRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Api.UuidToExternalRequestOrBuilder
        public String getLanguage() {
            return this.language_;
        }

        @Override // ac.Api.UuidToExternalRequestOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // ac.Api.UuidToExternalRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Api.UuidToExternalRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        public static Builder newBuilder(UuidToExternalRequest uuidToExternalRequest) {
            return DEFAULT_INSTANCE.createBuilder(uuidToExternalRequest);
        }

        public static UuidToExternalRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UuidToExternalRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UuidToExternalRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UuidToExternalRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UuidToExternalRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UuidToExternalRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UuidToExternalRequest parseFrom(InputStream inputStream) throws IOException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UuidToExternalRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UuidToExternalRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UuidToExternalRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UuidToExternalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UuidToExternalRequestOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getLanguage();

        ByteString getLanguageBytes();

        String getUuid();

        ByteString getUuidBytes();
    }

    private Api() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
