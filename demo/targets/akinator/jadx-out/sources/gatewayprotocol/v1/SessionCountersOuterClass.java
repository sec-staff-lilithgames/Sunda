package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SessionCountersOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SessionCounters extends GeneratedMessageLite<SessionCounters, Builder> implements SessionCountersOrBuilder {
        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        private static final SessionCounters DEFAULT_INSTANCE;
        public static final int FOCUS_CHANGE_COUNT_FIELD_NUMBER = 8;
        public static final int GLOBAL_ADS_FOCUS_CHANGE_COUNT_FIELD_NUMBER = 7;
        public static final int GLOBAL_ADS_FOCUS_TIME_FIELD_NUMBER = 6;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile Parser<SessionCounters> PARSER;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int focusChangeCount_;
        private int globalAdsFocusChangeCount_;
        private int globalAdsFocusTime_;
        private int loadRequestsAdm_;
        private int loadRequests_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<SessionCounters, Builder> implements SessionCountersOrBuilder {
            public /* synthetic */ Builder(wl.e0 e0Var) {
                this();
            }

            public Builder clearBannerImpressions() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerImpressions();
                return this;
            }

            public Builder clearBannerLoadRequests() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerLoadRequests();
                return this;
            }

            public Builder clearBannerRequestsAdm() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearBannerRequestsAdm();
                return this;
            }

            public Builder clearFocusChangeCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusChangeCount() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearGlobalAdsFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusTime() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearGlobalAdsFocusTime();
                return this;
            }

            public Builder clearLoadRequests() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLoadRequests();
                return this;
            }

            public Builder clearLoadRequestsAdm() {
                copyOnWrite();
                ((SessionCounters) this.instance).clearLoadRequestsAdm();
                return this;
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerImpressions() {
                return ((SessionCounters) this.instance).getBannerImpressions();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerLoadRequests() {
                return ((SessionCounters) this.instance).getBannerLoadRequests();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getBannerRequestsAdm() {
                return ((SessionCounters) this.instance).getBannerRequestsAdm();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getFocusChangeCount() {
                return ((SessionCounters) this.instance).getFocusChangeCount();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getGlobalAdsFocusChangeCount() {
                return ((SessionCounters) this.instance).getGlobalAdsFocusChangeCount();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getGlobalAdsFocusTime() {
                return ((SessionCounters) this.instance).getGlobalAdsFocusTime();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequests() {
                return ((SessionCounters) this.instance).getLoadRequests();
            }

            @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
            public int getLoadRequestsAdm() {
                return ((SessionCounters) this.instance).getLoadRequestsAdm();
            }

            public Builder setBannerImpressions(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerImpressions(i10);
                return this;
            }

            public Builder setBannerLoadRequests(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerLoadRequests(i10);
                return this;
            }

            public Builder setBannerRequestsAdm(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setBannerRequestsAdm(i10);
                return this;
            }

            public Builder setFocusChangeCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setFocusChangeCount(i10);
                return this;
            }

            public Builder setGlobalAdsFocusChangeCount(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setGlobalAdsFocusChangeCount(i10);
                return this;
            }

            public Builder setGlobalAdsFocusTime(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setGlobalAdsFocusTime(i10);
                return this;
            }

            public Builder setLoadRequests(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLoadRequests(i10);
                return this;
            }

            public Builder setLoadRequestsAdm(int i10) {
                copyOnWrite();
                ((SessionCounters) this.instance).setLoadRequestsAdm(i10);
                return this;
            }

            private Builder() {
                super(SessionCounters.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionCounters sessionCounters = new SessionCounters();
            DEFAULT_INSTANCE = sessionCounters;
            GeneratedMessageLite.registerDefaultInstance(SessionCounters.class, sessionCounters);
        }

        private SessionCounters() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFocusChangeCount() {
            this.focusChangeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGlobalAdsFocusChangeCount() {
            this.globalAdsFocusChangeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGlobalAdsFocusTime() {
            this.globalAdsFocusTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        public static SessionCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionCounters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerImpressions(int i10) {
            this.bannerImpressions_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerLoadRequests(int i10) {
            this.bannerLoadRequests_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerRequestsAdm(int i10) {
            this.bannerRequestsAdm_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFocusChangeCount(int i10) {
            this.focusChangeCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGlobalAdsFocusChangeCount(int i10) {
            this.globalAdsFocusChangeCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGlobalAdsFocusTime(int i10) {
            this.globalAdsFocusTime_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadRequests(int i10) {
            this.loadRequests_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadRequestsAdm(int i10) {
            this.loadRequestsAdm_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.e0 e0Var = null;
            switch (wl.e0.f90705a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionCounters();
                case 2:
                    return new Builder(e0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_", "globalAdsFocusTime_", "globalAdsFocusChangeCount_", "focusChangeCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionCounters> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SessionCounters.class) {
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

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getFocusChangeCount() {
            return this.focusChangeCount_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getGlobalAdsFocusChangeCount() {
            return this.globalAdsFocusChangeCount_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getGlobalAdsFocusTime() {
            return this.globalAdsFocusTime_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequests() {
            return this.loadRequests_;
        }

        @Override // gatewayprotocol.v1.SessionCountersOuterClass.SessionCountersOrBuilder
        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        public static Builder newBuilder(SessionCounters sessionCounters) {
            return DEFAULT_INSTANCE.createBuilder(sessionCounters);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionCounters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionCounters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SessionCountersOrBuilder extends MessageLiteOrBuilder {
        int getBannerImpressions();

        int getBannerLoadRequests();

        int getBannerRequestsAdm();

        int getFocusChangeCount();

        int getGlobalAdsFocusChangeCount();

        int getGlobalAdsFocusTime();

        int getLoadRequests();

        int getLoadRequestsAdm();
    }

    private SessionCountersOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
