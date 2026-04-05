package com.unity3d.ads.datastore;

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
/* loaded from: classes8.dex */
public final class WebviewConfigurationStore {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.datastore.WebviewConfigurationStore$1, reason: invalid class name */
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
    public static final class WebViewConfigurationStore extends GeneratedMessageLite<WebViewConfigurationStore, Builder> implements WebViewConfigurationStoreOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfigurationStore DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser<WebViewConfigurationStore> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        private String entryPoint_ = "";
        private Internal.ProtobufList<String> additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        private String type_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<WebViewConfigurationStore, Builder> implements WebViewConfigurationStoreOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAdditionalFiles(String str) {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).addAdditionalFiles(str);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).addAdditionalFilesBytes(byteString);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable<String> iterable) {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).addAllAdditionalFiles(iterable);
                return this;
            }

            public Builder clearAdditionalFiles() {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).clearAdditionalFiles();
                return this;
            }

            public Builder clearEntryPoint() {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).clearEntryPoint();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).clearType();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).clearVersion();
                return this;
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public String getAdditionalFiles(int i10) {
                return ((WebViewConfigurationStore) this.instance).getAdditionalFiles(i10);
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public ByteString getAdditionalFilesBytes(int i10) {
                return ((WebViewConfigurationStore) this.instance).getAdditionalFilesBytes(i10);
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public int getAdditionalFilesCount() {
                return ((WebViewConfigurationStore) this.instance).getAdditionalFilesCount();
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public List<String> getAdditionalFilesList() {
                return Collections.unmodifiableList(((WebViewConfigurationStore) this.instance).getAdditionalFilesList());
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public String getEntryPoint() {
                return ((WebViewConfigurationStore) this.instance).getEntryPoint();
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public ByteString getEntryPointBytes() {
                return ((WebViewConfigurationStore) this.instance).getEntryPointBytes();
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public String getType() {
                return ((WebViewConfigurationStore) this.instance).getType();
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public ByteString getTypeBytes() {
                return ((WebViewConfigurationStore) this.instance).getTypeBytes();
            }

            @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
            public int getVersion() {
                return ((WebViewConfigurationStore) this.instance).getVersion();
            }

            public Builder setAdditionalFiles(int i10, String str) {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).setAdditionalFiles(i10, str);
                return this;
            }

            public Builder setEntryPoint(String str) {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).setEntryPoint(str);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).setEntryPointBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setVersion(int i10) {
                copyOnWrite();
                ((WebViewConfigurationStore) this.instance).setVersion(i10);
                return this;
            }

            private Builder() {
                super(WebViewConfigurationStore.DEFAULT_INSTANCE);
            }
        }

        static {
            WebViewConfigurationStore webViewConfigurationStore = new WebViewConfigurationStore();
            DEFAULT_INSTANCE = webViewConfigurationStore;
            GeneratedMessageLite.registerDefaultInstance(WebViewConfigurationStore.class, webViewConfigurationStore);
        }

        private WebViewConfigurationStore() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalFiles(String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalFilesBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdditionalFiles(Iterable<String> iterable) {
            ensureAdditionalFilesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.additionalFiles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalFiles() {
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntryPoint() {
            this.entryPoint_ = getDefaultInstance().getEntryPoint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        private void ensureAdditionalFilesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.additionalFiles_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static WebViewConfigurationStore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebViewConfigurationStore parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfigurationStore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebViewConfigurationStore> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalFiles(int i10, String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPoint(String str) {
            str.getClass();
            this.entryPoint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPointBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.entryPoint_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i10) {
            this.version_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebViewConfigurationStore();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebViewConfigurationStore> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WebViewConfigurationStore.class) {
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

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public String getAdditionalFiles(int i10) {
            return this.additionalFiles_.get(i10);
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public ByteString getAdditionalFilesBytes(int i10) {
            return ByteString.copyFromUtf8(this.additionalFiles_.get(i10));
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public List<String> getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public String getEntryPoint() {
            return this.entryPoint_;
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public ByteString getEntryPointBytes() {
            return ByteString.copyFromUtf8(this.entryPoint_);
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStoreOrBuilder
        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder(WebViewConfigurationStore webViewConfigurationStore) {
            return DEFAULT_INSTANCE.createBuilder(webViewConfigurationStore);
        }

        public static WebViewConfigurationStore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebViewConfigurationStore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebViewConfigurationStore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(InputStream inputStream) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfigurationStore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebViewConfigurationStore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface WebViewConfigurationStoreOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalFiles(int i10);

        ByteString getAdditionalFilesBytes(int i10);

        int getAdditionalFilesCount();

        List<String> getAdditionalFilesList();

        String getEntryPoint();

        ByteString getEntryPointBytes();

        String getType();

        ByteString getTypeBytes();

        int getVersion();
    }

    private WebviewConfigurationStore() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
