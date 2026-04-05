package com.moloco.sdk;

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
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UserIntent$UserAdInteractionExt extends GeneratedMessageLite<UserIntent$UserAdInteractionExt, la> implements lb {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 3;
    public static final int APP_BACKGROUNDING_INTERACTION_FIELD_NUMBER = 103;
    public static final int APP_FIELD_NUMBER = 5;
    public static final int APP_FOREGROUNDING_INTERACTION_FIELD_NUMBER = 102;
    public static final int CLICK_INTERACTION_FIELD_NUMBER = 101;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 2;
    private static final UserIntent$UserAdInteractionExt DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int IMP_INTERACTION_FIELD_NUMBER = 100;
    public static final int MREF_FIELD_NUMBER = 1;
    public static final int NETWORK_FIELD_NUMBER = 6;
    private static volatile Parser<UserIntent$UserAdInteractionExt> PARSER = null;
    public static final int SDK_FIELD_NUMBER = 7;
    private App app_;
    private long clientTimestamp_;
    private Device device_;
    private Object infoExt_;
    private Network network_;
    private MolocoSDK sdk_;
    private int infoExtCase_ = 0;
    private String mref_ = "";
    private String advertisingId_ = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class App extends GeneratedMessageLite<App, ga> implements ka {
        private static final App DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<App> PARSER = null;
        public static final int VER_FIELD_NUMBER = 2;
        private String id_ = "";
        private String ver_ = "";

        static {
            App app = new App();
            DEFAULT_INSTANCE = app;
            GeneratedMessageLite.registerDefaultInstance(App.class, app);
        }

        private App() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVer() {
            this.ver_ = getDefaultInstance().getVer();
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static ga newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<App> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVer(String str) {
            str.getClass();
            this.ver_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ver_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new App();
                case 2:
                    return new ga(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "ver_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<App> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (App.class) {
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

        @Override // com.moloco.sdk.ka
        public String getId() {
            return this.id_;
        }

        @Override // com.moloco.sdk.ka
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.moloco.sdk.ka
        public String getVer() {
            return this.ver_;
        }

        @Override // com.moloco.sdk.ka
        public ByteString getVerBytes() {
            return ByteString.copyFromUtf8(this.ver_);
        }

        public static ga newBuilder(App app) {
            return DEFAULT_INSTANCE.createBuilder(app);
        }

        public static App parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static App parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static App parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static App parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AppBackgroundingInteraction extends GeneratedMessageLite<AppBackgroundingInteraction, ha> implements MessageLiteOrBuilder {
        private static final AppBackgroundingInteraction DEFAULT_INSTANCE;
        private static volatile Parser<AppBackgroundingInteraction> PARSER;

        static {
            AppBackgroundingInteraction appBackgroundingInteraction = new AppBackgroundingInteraction();
            DEFAULT_INSTANCE = appBackgroundingInteraction;
            GeneratedMessageLite.registerDefaultInstance(AppBackgroundingInteraction.class, appBackgroundingInteraction);
        }

        private AppBackgroundingInteraction() {
        }

        public static AppBackgroundingInteraction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static ha newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppBackgroundingInteraction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppBackgroundingInteraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AppBackgroundingInteraction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppBackgroundingInteraction();
                case 2:
                    return new ha(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AppBackgroundingInteraction> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AppBackgroundingInteraction.class) {
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

        public static ha newBuilder(AppBackgroundingInteraction appBackgroundingInteraction) {
            return DEFAULT_INSTANCE.createBuilder(appBackgroundingInteraction);
        }

        public static AppBackgroundingInteraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppBackgroundingInteraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AppBackgroundingInteraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppBackgroundingInteraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AppBackgroundingInteraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppBackgroundingInteraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AppBackgroundingInteraction parseFrom(InputStream inputStream) throws IOException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppBackgroundingInteraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppBackgroundingInteraction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AppBackgroundingInteraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppBackgroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AppForegroundingInteraction extends GeneratedMessageLite<AppForegroundingInteraction, ia> implements ja {
        public static final int BG_TS_MS_FIELD_NUMBER = 1;
        private static final AppForegroundingInteraction DEFAULT_INSTANCE;
        private static volatile Parser<AppForegroundingInteraction> PARSER;
        private long bgTsMs_;

        static {
            AppForegroundingInteraction appForegroundingInteraction = new AppForegroundingInteraction();
            DEFAULT_INSTANCE = appForegroundingInteraction;
            GeneratedMessageLite.registerDefaultInstance(AppForegroundingInteraction.class, appForegroundingInteraction);
        }

        private AppForegroundingInteraction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBgTsMs() {
            this.bgTsMs_ = 0L;
        }

        public static AppForegroundingInteraction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static ia newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppForegroundingInteraction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppForegroundingInteraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AppForegroundingInteraction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBgTsMs(long j10) {
            this.bgTsMs_ = j10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AppForegroundingInteraction();
                case 2:
                    return new ia(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"bgTsMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AppForegroundingInteraction> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AppForegroundingInteraction.class) {
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

        @Override // com.moloco.sdk.ja
        public long getBgTsMs() {
            return this.bgTsMs_;
        }

        public static ia newBuilder(AppForegroundingInteraction appForegroundingInteraction) {
            return DEFAULT_INSTANCE.createBuilder(appForegroundingInteraction);
        }

        public static AppForegroundingInteraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppForegroundingInteraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AppForegroundingInteraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AppForegroundingInteraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AppForegroundingInteraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppForegroundingInteraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AppForegroundingInteraction parseFrom(InputStream inputStream) throws IOException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppForegroundingInteraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppForegroundingInteraction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AppForegroundingInteraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppForegroundingInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Button extends GeneratedMessageLite<Button, ma> implements qa {
        private static final Button DEFAULT_INSTANCE;
        private static volatile Parser<Button> PARSER = null;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private Position pos_;
        private Size size_;
        private int type_;

        static {
            Button button = new Button();
            DEFAULT_INSTANCE = button;
            GeneratedMessageLite.registerDefaultInstance(Button.class, button);
        }

        private Button() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPos() {
            this.pos_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static Button getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePos(Position position) {
            position.getClass();
            Position position2 = this.pos_;
            if (position2 == null || position2 == Position.getDefaultInstance()) {
                this.pos_ = position;
            } else {
                this.pos_ = (Position) ((hb) Position.newBuilder(this.pos_).mergeFrom((hb) position)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSize(Size size) {
            size.getClass();
            Size size2 = this.size_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.size_ = size;
            } else {
                this.size_ = (Size) ((jb) Size.newBuilder(this.size_).mergeFrom((jb) size)).buildPartial();
            }
        }

        public static ma newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Button parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Button> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPos(Position position) {
            position.getClass();
            this.pos_ = position;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(Size size) {
            size.getClass();
            this.size_ = size;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(pa paVar) {
            this.type_ = paVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.type_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Button();
                case 2:
                    return new ma(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"type_", "pos_", "size_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Button> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Button.class) {
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

        @Override // com.moloco.sdk.qa
        public Position getPos() {
            Position position = this.pos_;
            return position == null ? Position.getDefaultInstance() : position;
        }

        @Override // com.moloco.sdk.qa
        public Size getSize() {
            Size size = this.size_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        @Override // com.moloco.sdk.qa
        public pa getType() {
            pa paVarForNumber = pa.forNumber(this.type_);
            return paVarForNumber == null ? pa.UNRECOGNIZED : paVarForNumber;
        }

        @Override // com.moloco.sdk.qa
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.moloco.sdk.qa
        public boolean hasPos() {
            return this.pos_ != null;
        }

        @Override // com.moloco.sdk.qa
        public boolean hasSize() {
            return this.size_ != null;
        }

        public static ma newBuilder(Button button) {
            return DEFAULT_INSTANCE.createBuilder(button);
        }

        public static Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Button parseFrom(InputStream inputStream) throws IOException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Button parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClickInteraction extends GeneratedMessageLite<ClickInteraction, ra> implements sa {
        public static final int BUTTONS_FIELD_NUMBER = 5;
        public static final int CLICK_POS_FIELD_NUMBER = 1;
        private static final ClickInteraction DEFAULT_INSTANCE;
        private static volatile Parser<ClickInteraction> PARSER = null;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 2;
        public static final int VIEW_POS_FIELD_NUMBER = 3;
        public static final int VIEW_SIZE_FIELD_NUMBER = 4;
        private Internal.ProtobufList<Button> buttons_ = GeneratedMessageLite.emptyProtobufList();
        private Position clickPos_;
        private Size screenSize_;
        private Position viewPos_;
        private Size viewSize_;

        static {
            ClickInteraction clickInteraction = new ClickInteraction();
            DEFAULT_INSTANCE = clickInteraction;
            GeneratedMessageLite.registerDefaultInstance(ClickInteraction.class, clickInteraction);
        }

        private ClickInteraction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllButtons(Iterable<? extends Button> iterable) {
            ensureButtonsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.buttons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addButtons(Button button) {
            button.getClass();
            ensureButtonsIsMutable();
            this.buttons_.add(button);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtons() {
            this.buttons_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickPos() {
            this.clickPos_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenSize() {
            this.screenSize_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearViewPos() {
            this.viewPos_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearViewSize() {
            this.viewSize_ = null;
        }

        private void ensureButtonsIsMutable() {
            Internal.ProtobufList<Button> protobufList = this.buttons_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.buttons_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ClickInteraction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClickPos(Position position) {
            position.getClass();
            Position position2 = this.clickPos_;
            if (position2 == null || position2 == Position.getDefaultInstance()) {
                this.clickPos_ = position;
            } else {
                this.clickPos_ = (Position) ((hb) Position.newBuilder(this.clickPos_).mergeFrom((hb) position)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeScreenSize(Size size) {
            size.getClass();
            Size size2 = this.screenSize_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.screenSize_ = size;
            } else {
                this.screenSize_ = (Size) ((jb) Size.newBuilder(this.screenSize_).mergeFrom((jb) size)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeViewPos(Position position) {
            position.getClass();
            Position position2 = this.viewPos_;
            if (position2 == null || position2 == Position.getDefaultInstance()) {
                this.viewPos_ = position;
            } else {
                this.viewPos_ = (Position) ((hb) Position.newBuilder(this.viewPos_).mergeFrom((hb) position)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeViewSize(Size size) {
            size.getClass();
            Size size2 = this.viewSize_;
            if (size2 == null || size2 == Size.getDefaultInstance()) {
                this.viewSize_ = size;
            } else {
                this.viewSize_ = (Size) ((jb) Size.newBuilder(this.viewSize_).mergeFrom((jb) size)).buildPartial();
            }
        }

        public static ra newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClickInteraction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClickInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClickInteraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClickInteraction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeButtons(int i10) {
            ensureButtonsIsMutable();
            this.buttons_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtons(int i10, Button button) {
            button.getClass();
            ensureButtonsIsMutable();
            this.buttons_.set(i10, button);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickPos(Position position) {
            position.getClass();
            this.clickPos_ = position;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenSize(Size size) {
            size.getClass();
            this.screenSize_ = size;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setViewPos(Position position) {
            position.getClass();
            this.viewPos_ = position;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setViewSize(Size size) {
            size.getClass();
            this.viewSize_ = size;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClickInteraction();
                case 2:
                    return new ra(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new Object[]{"clickPos_", "screenSize_", "viewPos_", "viewSize_", "buttons_", Button.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClickInteraction> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClickInteraction.class) {
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

        @Override // com.moloco.sdk.sa
        public Button getButtons(int i10) {
            return this.buttons_.get(i10);
        }

        @Override // com.moloco.sdk.sa
        public int getButtonsCount() {
            return this.buttons_.size();
        }

        @Override // com.moloco.sdk.sa
        public List<Button> getButtonsList() {
            return this.buttons_;
        }

        public qa getButtonsOrBuilder(int i10) {
            return this.buttons_.get(i10);
        }

        public List<? extends qa> getButtonsOrBuilderList() {
            return this.buttons_;
        }

        @Override // com.moloco.sdk.sa
        public Position getClickPos() {
            Position position = this.clickPos_;
            return position == null ? Position.getDefaultInstance() : position;
        }

        @Override // com.moloco.sdk.sa
        public Size getScreenSize() {
            Size size = this.screenSize_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        @Override // com.moloco.sdk.sa
        public Position getViewPos() {
            Position position = this.viewPos_;
            return position == null ? Position.getDefaultInstance() : position;
        }

        @Override // com.moloco.sdk.sa
        public Size getViewSize() {
            Size size = this.viewSize_;
            return size == null ? Size.getDefaultInstance() : size;
        }

        @Override // com.moloco.sdk.sa
        public boolean hasClickPos() {
            return this.clickPos_ != null;
        }

        @Override // com.moloco.sdk.sa
        public boolean hasScreenSize() {
            return this.screenSize_ != null;
        }

        @Override // com.moloco.sdk.sa
        public boolean hasViewPos() {
            return this.viewPos_ != null;
        }

        @Override // com.moloco.sdk.sa
        public boolean hasViewSize() {
            return this.viewSize_ != null;
        }

        public static ra newBuilder(ClickInteraction clickInteraction) {
            return DEFAULT_INSTANCE.createBuilder(clickInteraction);
        }

        public static ClickInteraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClickInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClickInteraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClickInteraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addButtons(int i10, Button button) {
            button.getClass();
            ensureButtonsIsMutable();
            this.buttons_.add(i10, button);
        }

        public static ClickInteraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClickInteraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClickInteraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClickInteraction parseFrom(InputStream inputStream) throws IOException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClickInteraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClickInteraction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClickInteraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClickInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Device extends GeneratedMessageLite<Device, ta> implements xa {
        private static final Device DEFAULT_INSTANCE;
        public static final int MODEL_FIELD_NUMBER = 3;
        public static final int OS_FIELD_NUMBER = 1;
        public static final int OS_VER_FIELD_NUMBER = 2;
        private static volatile Parser<Device> PARSER = null;
        public static final int SCREEN_SCALE_FIELD_NUMBER = 4;
        private int os_;
        private float screenScale_;
        private String osVer_ = "";
        private String model_ = "";

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVer() {
            this.osVer_ = getDefaultInstance().getOsVer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenScale() {
            this.screenScale_ = 0.0f;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static ta newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Device> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.model_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(wa waVar) {
            this.os_ = waVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsValue(int i10) {
            this.os_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVer(String str) {
            str.getClass();
            this.osVer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVer_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenScale(float f10) {
            this.screenScale_ = f10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new ta(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0001", new Object[]{"os_", "osVer_", "model_", "screenScale_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Device> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Device.class) {
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

        @Override // com.moloco.sdk.xa
        public String getModel() {
            return this.model_;
        }

        @Override // com.moloco.sdk.xa
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        @Override // com.moloco.sdk.xa
        public wa getOs() {
            wa waVarForNumber = wa.forNumber(this.os_);
            return waVarForNumber == null ? wa.UNRECOGNIZED : waVarForNumber;
        }

        @Override // com.moloco.sdk.xa
        public int getOsValue() {
            return this.os_;
        }

        @Override // com.moloco.sdk.xa
        public String getOsVer() {
            return this.osVer_;
        }

        @Override // com.moloco.sdk.xa
        public ByteString getOsVerBytes() {
            return ByteString.copyFromUtf8(this.osVer_);
        }

        @Override // com.moloco.sdk.xa
        public float getScreenScale() {
            return this.screenScale_;
        }

        public static ta newBuilder(Device device) {
            return DEFAULT_INSTANCE.createBuilder(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ImpressionInteraction extends GeneratedMessageLite<ImpressionInteraction, ya> implements MessageLiteOrBuilder {
        private static final ImpressionInteraction DEFAULT_INSTANCE;
        private static volatile Parser<ImpressionInteraction> PARSER;

        static {
            ImpressionInteraction impressionInteraction = new ImpressionInteraction();
            DEFAULT_INSTANCE = impressionInteraction;
            GeneratedMessageLite.registerDefaultInstance(ImpressionInteraction.class, impressionInteraction);
        }

        private ImpressionInteraction() {
        }

        public static ImpressionInteraction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static ya newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ImpressionInteraction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpressionInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImpressionInteraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ImpressionInteraction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ImpressionInteraction();
                case 2:
                    return new ya(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ImpressionInteraction> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ImpressionInteraction.class) {
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

        public static ya newBuilder(ImpressionInteraction impressionInteraction) {
            return DEFAULT_INSTANCE.createBuilder(impressionInteraction);
        }

        public static ImpressionInteraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpressionInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImpressionInteraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ImpressionInteraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ImpressionInteraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ImpressionInteraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ImpressionInteraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ImpressionInteraction parseFrom(InputStream inputStream) throws IOException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ImpressionInteraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ImpressionInteraction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ImpressionInteraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpressionInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MolocoSDK extends GeneratedMessageLite<MolocoSDK, ab> implements bb {
        public static final int ADAPTER_VER_FIELD_NUMBER = 2;
        public static final int CORE_VER_FIELD_NUMBER = 1;
        private static final MolocoSDK DEFAULT_INSTANCE;
        private static volatile Parser<MolocoSDK> PARSER;
        private String coreVer_ = "";
        private String adapterVer_ = "";

        static {
            MolocoSDK molocoSDK = new MolocoSDK();
            DEFAULT_INSTANCE = molocoSDK;
            GeneratedMessageLite.registerDefaultInstance(MolocoSDK.class, molocoSDK);
        }

        private MolocoSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdapterVer() {
            this.adapterVer_ = getDefaultInstance().getAdapterVer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoreVer() {
            this.coreVer_ = getDefaultInstance().getCoreVer();
        }

        public static MolocoSDK getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static ab newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MolocoSDK parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MolocoSDK) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MolocoSDK parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MolocoSDK> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdapterVer(String str) {
            str.getClass();
            this.adapterVer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdapterVerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.adapterVer_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoreVer(String str) {
            str.getClass();
            this.coreVer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoreVerBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.coreVer_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MolocoSDK();
                case 2:
                    return new ab(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coreVer_", "adapterVer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MolocoSDK> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MolocoSDK.class) {
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

        @Override // com.moloco.sdk.bb
        public String getAdapterVer() {
            return this.adapterVer_;
        }

        @Override // com.moloco.sdk.bb
        public ByteString getAdapterVerBytes() {
            return ByteString.copyFromUtf8(this.adapterVer_);
        }

        @Override // com.moloco.sdk.bb
        public String getCoreVer() {
            return this.coreVer_;
        }

        @Override // com.moloco.sdk.bb
        public ByteString getCoreVerBytes() {
            return ByteString.copyFromUtf8(this.coreVer_);
        }

        public static ab newBuilder(MolocoSDK molocoSDK) {
            return DEFAULT_INSTANCE.createBuilder(molocoSDK);
        }

        public static MolocoSDK parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MolocoSDK) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MolocoSDK parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MolocoSDK parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MolocoSDK parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MolocoSDK parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MolocoSDK parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MolocoSDK parseFrom(InputStream inputStream) throws IOException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MolocoSDK parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MolocoSDK parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MolocoSDK parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MolocoSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Network extends GeneratedMessageLite<Network, cb> implements gb {
        public static final int CARRIER_FIELD_NUMBER = 2;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
        private static final Network DEFAULT_INSTANCE;
        private static volatile Parser<Network> PARSER;
        private String carrier_ = "";
        private int connectionType_;

        static {
            Network network = new Network();
            DEFAULT_INSTANCE = network;
            GeneratedMessageLite.registerDefaultInstance(Network.class, network);
        }

        private Network() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarrier() {
            this.carrier_ = getDefaultInstance().getCarrier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = 0;
        }

        public static Network getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static cb newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Network parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Network) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Network parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Network> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrier(String str) {
            str.getClass();
            this.carrier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrierBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.carrier_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(fb fbVar) {
            this.connectionType_ = fbVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeValue(int i10) {
            this.connectionType_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Network();
                case 2:
                    return new cb(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"connectionType_", "carrier_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Network> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Network.class) {
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

        @Override // com.moloco.sdk.gb
        public String getCarrier() {
            return this.carrier_;
        }

        @Override // com.moloco.sdk.gb
        public ByteString getCarrierBytes() {
            return ByteString.copyFromUtf8(this.carrier_);
        }

        @Override // com.moloco.sdk.gb
        public fb getConnectionType() {
            fb fbVarForNumber = fb.forNumber(this.connectionType_);
            return fbVarForNumber == null ? fb.UNRECOGNIZED : fbVarForNumber;
        }

        @Override // com.moloco.sdk.gb
        public int getConnectionTypeValue() {
            return this.connectionType_;
        }

        public static cb newBuilder(Network network) {
            return DEFAULT_INSTANCE.createBuilder(network);
        }

        public static Network parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Network) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Network parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Network parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Network parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Network parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Network parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Network parseFrom(InputStream inputStream) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Network parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Network parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Network parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Position extends GeneratedMessageLite<Position, hb> implements ib {
        private static final Position DEFAULT_INSTANCE;
        private static volatile Parser<Position> PARSER = null;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private float x_;
        private float y_;

        static {
            Position position = new Position();
            DEFAULT_INSTANCE = position;
            GeneratedMessageLite.registerDefaultInstance(Position.class, position);
        }

        private Position() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX() {
            this.x_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY() {
            this.y_ = 0.0f;
        }

        public static Position getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static hb newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Position parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Position parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Position> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX(float f10) {
            this.x_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY(float f10) {
            this.y_ = f10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Position();
                case 2:
                    return new hb(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"x_", "y_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Position> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Position.class) {
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

        @Override // com.moloco.sdk.ib
        public float getX() {
            return this.x_;
        }

        @Override // com.moloco.sdk.ib
        public float getY() {
            return this.y_;
        }

        public static hb newBuilder(Position position) {
            return DEFAULT_INSTANCE.createBuilder(position);
        }

        public static Position parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Position) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Position parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Position parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Position parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Position parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Position parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Position parseFrom(InputStream inputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Position parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Position parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Position parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Size extends GeneratedMessageLite<Size, jb> implements kb {
        private static final Size DEFAULT_INSTANCE;
        public static final int H_FIELD_NUMBER = 2;
        private static volatile Parser<Size> PARSER = null;
        public static final int W_FIELD_NUMBER = 1;
        private float h_;
        private float w_;

        static {
            Size size = new Size();
            DEFAULT_INSTANCE = size;
            GeneratedMessageLite.registerDefaultInstance(Size.class, size);
        }

        private Size() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearH() {
            this.h_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearW() {
            this.w_ = 0.0f;
        }

        public static Size getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static jb newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Size parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Size) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Size parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Size> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH(float f10) {
            this.h_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setW(float f10) {
            this.w_ = f10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (fa.f45772a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Size();
                case 2:
                    return new jb(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"w_", "h_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Size> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Size.class) {
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

        @Override // com.moloco.sdk.kb
        public float getH() {
            return this.h_;
        }

        @Override // com.moloco.sdk.kb
        public float getW() {
            return this.w_;
        }

        public static jb newBuilder(Size size) {
            return DEFAULT_INSTANCE.createBuilder(size);
        }

        public static Size parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Size) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Size parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Size parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Size parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Size parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Size parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Size parseFrom(InputStream inputStream) throws IOException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Size parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Size parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Size parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Size) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        UserIntent$UserAdInteractionExt userIntent$UserAdInteractionExt = new UserIntent$UserAdInteractionExt();
        DEFAULT_INSTANCE = userIntent$UserAdInteractionExt;
        GeneratedMessageLite.registerDefaultInstance(UserIntent$UserAdInteractionExt.class, userIntent$UserAdInteractionExt);
    }

    private UserIntent$UserAdInteractionExt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertisingId() {
        this.advertisingId_ = getDefaultInstance().getAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApp() {
        this.app_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppBackgroundingInteraction() {
        if (this.infoExtCase_ == 103) {
            this.infoExtCase_ = 0;
            this.infoExt_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppForegroundingInteraction() {
        if (this.infoExtCase_ == 102) {
            this.infoExtCase_ = 0;
            this.infoExt_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickInteraction() {
        if (this.infoExtCase_ == 101) {
            this.infoExtCase_ = 0;
            this.infoExt_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimestamp() {
        this.clientTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpInteraction() {
        if (this.infoExtCase_ == 100) {
            this.infoExtCase_ = 0;
            this.infoExt_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoExt() {
        this.infoExtCase_ = 0;
        this.infoExt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMref() {
        this.mref_ = getDefaultInstance().getMref();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetwork() {
        this.network_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdk() {
        this.sdk_ = null;
    }

    public static UserIntent$UserAdInteractionExt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApp(App app) {
        app.getClass();
        App app2 = this.app_;
        if (app2 == null || app2 == App.getDefaultInstance()) {
            this.app_ = app;
        } else {
            this.app_ = (App) ((ga) App.newBuilder(this.app_).mergeFrom((ga) app)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppBackgroundingInteraction(AppBackgroundingInteraction appBackgroundingInteraction) {
        appBackgroundingInteraction.getClass();
        if (this.infoExtCase_ != 103 || this.infoExt_ == AppBackgroundingInteraction.getDefaultInstance()) {
            this.infoExt_ = appBackgroundingInteraction;
        } else {
            this.infoExt_ = ((ha) AppBackgroundingInteraction.newBuilder((AppBackgroundingInteraction) this.infoExt_).mergeFrom((ha) appBackgroundingInteraction)).buildPartial();
        }
        this.infoExtCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppForegroundingInteraction(AppForegroundingInteraction appForegroundingInteraction) {
        appForegroundingInteraction.getClass();
        if (this.infoExtCase_ != 102 || this.infoExt_ == AppForegroundingInteraction.getDefaultInstance()) {
            this.infoExt_ = appForegroundingInteraction;
        } else {
            this.infoExt_ = ((ia) AppForegroundingInteraction.newBuilder((AppForegroundingInteraction) this.infoExt_).mergeFrom((ia) appForegroundingInteraction)).buildPartial();
        }
        this.infoExtCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClickInteraction(ClickInteraction clickInteraction) {
        clickInteraction.getClass();
        if (this.infoExtCase_ != 101 || this.infoExt_ == ClickInteraction.getDefaultInstance()) {
            this.infoExt_ = clickInteraction;
        } else {
            this.infoExt_ = ((ra) ClickInteraction.newBuilder((ClickInteraction) this.infoExt_).mergeFrom((ra) clickInteraction)).buildPartial();
        }
        this.infoExtCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDevice(Device device) {
        device.getClass();
        Device device2 = this.device_;
        if (device2 == null || device2 == Device.getDefaultInstance()) {
            this.device_ = device;
        } else {
            this.device_ = (Device) ((ta) Device.newBuilder(this.device_).mergeFrom((ta) device)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImpInteraction(ImpressionInteraction impressionInteraction) {
        impressionInteraction.getClass();
        if (this.infoExtCase_ != 100 || this.infoExt_ == ImpressionInteraction.getDefaultInstance()) {
            this.infoExt_ = impressionInteraction;
        } else {
            this.infoExt_ = ((ya) ImpressionInteraction.newBuilder((ImpressionInteraction) this.infoExt_).mergeFrom((ya) impressionInteraction)).buildPartial();
        }
        this.infoExtCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetwork(Network network) {
        network.getClass();
        Network network2 = this.network_;
        if (network2 == null || network2 == Network.getDefaultInstance()) {
            this.network_ = network;
        } else {
            this.network_ = (Network) ((cb) Network.newBuilder(this.network_).mergeFrom((cb) network)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdk(MolocoSDK molocoSDK) {
        molocoSDK.getClass();
        MolocoSDK molocoSDK2 = this.sdk_;
        if (molocoSDK2 == null || molocoSDK2 == MolocoSDK.getDefaultInstance()) {
            this.sdk_ = molocoSDK;
        } else {
            this.sdk_ = (MolocoSDK) ((ab) MolocoSDK.newBuilder(this.sdk_).mergeFrom((ab) molocoSDK)).buildPartial();
        }
    }

    public static la newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserIntent$UserAdInteractionExt parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserIntent$UserAdInteractionExt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisingId(String str) {
        str.getClass();
        this.advertisingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisingIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.advertisingId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApp(App app) {
        app.getClass();
        this.app_ = app;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBackgroundingInteraction(AppBackgroundingInteraction appBackgroundingInteraction) {
        appBackgroundingInteraction.getClass();
        this.infoExt_ = appBackgroundingInteraction;
        this.infoExtCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppForegroundingInteraction(AppForegroundingInteraction appForegroundingInteraction) {
        appForegroundingInteraction.getClass();
        this.infoExt_ = appForegroundingInteraction;
        this.infoExtCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickInteraction(ClickInteraction clickInteraction) {
        clickInteraction.getClass();
        this.infoExt_ = clickInteraction;
        this.infoExtCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimestamp(long j10) {
        this.clientTimestamp_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(Device device) {
        device.getClass();
        this.device_ = device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpInteraction(ImpressionInteraction impressionInteraction) {
        impressionInteraction.getClass();
        this.infoExt_ = impressionInteraction;
        this.infoExtCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMref(String str) {
        str.getClass();
        this.mref_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMrefBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mref_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(Network network) {
        network.getClass();
        this.network_ = network;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdk(MolocoSDK molocoSDK) {
        molocoSDK.getClass();
        this.sdk_ = molocoSDK;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (fa.f45772a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserIntent$UserAdInteractionExt();
            case 2:
                return new la(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001g\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\td<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"infoExt_", "infoExtCase_", "mref_", "clientTimestamp_", "advertisingId_", "device_", "app_", "network_", "sdk_", ImpressionInteraction.class, ClickInteraction.class, AppForegroundingInteraction.class, AppBackgroundingInteraction.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserIntent$UserAdInteractionExt> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UserIntent$UserAdInteractionExt.class) {
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

    @Override // com.moloco.sdk.lb
    public String getAdvertisingId() {
        return this.advertisingId_;
    }

    @Override // com.moloco.sdk.lb
    public ByteString getAdvertisingIdBytes() {
        return ByteString.copyFromUtf8(this.advertisingId_);
    }

    @Override // com.moloco.sdk.lb
    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // com.moloco.sdk.lb
    public AppBackgroundingInteraction getAppBackgroundingInteraction() {
        return this.infoExtCase_ == 103 ? (AppBackgroundingInteraction) this.infoExt_ : AppBackgroundingInteraction.getDefaultInstance();
    }

    @Override // com.moloco.sdk.lb
    public AppForegroundingInteraction getAppForegroundingInteraction() {
        return this.infoExtCase_ == 102 ? (AppForegroundingInteraction) this.infoExt_ : AppForegroundingInteraction.getDefaultInstance();
    }

    @Override // com.moloco.sdk.lb
    public ClickInteraction getClickInteraction() {
        return this.infoExtCase_ == 101 ? (ClickInteraction) this.infoExt_ : ClickInteraction.getDefaultInstance();
    }

    @Override // com.moloco.sdk.lb
    public long getClientTimestamp() {
        return this.clientTimestamp_;
    }

    @Override // com.moloco.sdk.lb
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // com.moloco.sdk.lb
    public ImpressionInteraction getImpInteraction() {
        return this.infoExtCase_ == 100 ? (ImpressionInteraction) this.infoExt_ : ImpressionInteraction.getDefaultInstance();
    }

    @Override // com.moloco.sdk.lb
    public za getInfoExtCase() {
        return za.forNumber(this.infoExtCase_);
    }

    @Override // com.moloco.sdk.lb
    public String getMref() {
        return this.mref_;
    }

    @Override // com.moloco.sdk.lb
    public ByteString getMrefBytes() {
        return ByteString.copyFromUtf8(this.mref_);
    }

    @Override // com.moloco.sdk.lb
    public Network getNetwork() {
        Network network = this.network_;
        return network == null ? Network.getDefaultInstance() : network;
    }

    @Override // com.moloco.sdk.lb
    public MolocoSDK getSdk() {
        MolocoSDK molocoSDK = this.sdk_;
        return molocoSDK == null ? MolocoSDK.getDefaultInstance() : molocoSDK;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasApp() {
        return this.app_ != null;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasAppBackgroundingInteraction() {
        return this.infoExtCase_ == 103;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasAppForegroundingInteraction() {
        return this.infoExtCase_ == 102;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasClickInteraction() {
        return this.infoExtCase_ == 101;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasDevice() {
        return this.device_ != null;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasImpInteraction() {
        return this.infoExtCase_ == 100;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasNetwork() {
        return this.network_ != null;
    }

    @Override // com.moloco.sdk.lb
    public boolean hasSdk() {
        return this.sdk_ != null;
    }

    public static la newBuilder(UserIntent$UserAdInteractionExt userIntent$UserAdInteractionExt) {
        return DEFAULT_INSTANCE.createBuilder(userIntent$UserAdInteractionExt);
    }

    public static UserIntent$UserAdInteractionExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(InputStream inputStream) throws IOException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserIntent$UserAdInteractionExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserIntent$UserAdInteractionExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
