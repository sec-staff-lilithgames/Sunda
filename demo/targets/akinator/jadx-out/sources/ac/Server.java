package ac;

import ac.Models;
import ac.Xchange;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import metric.Metric$UserMetric;
import wv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class Server {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ac.Server$1, reason: invalid class name */
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
    public static final class CMP extends GeneratedMessageLite<CMP, Builder> implements CMPOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 1;
        public static final int BUILD_ID_FIELD_NUMBER = 5;
        public static final int CHOOSEN_APP_KEY_FIELD_NUMBER = 12;
        public static final int CMP_HASH_FIELD_NUMBER = 6;
        public static final int CMP_HASH_VERSION_FIELD_NUMBER = 2;
        public static final int CONFIGURATION_FIELD_NUMBER = 3;
        private static final CMP DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 8;
        public static final int EXPERIMENT_PARENT_APP_KEY_FIELD_NUMBER = 9;
        public static final int EXPERIMENT_WEIGHT_FIELD_NUMBER = 10;
        public static final int FLOATING_EXTRA_ID_FIELD_NUMBER = 13;
        public static final int FLOATING_VERSION_FIELD_NUMBER = 14;
        public static final int IS_EXPERIMENT_POPULATION_FIELD_NUMBER = 11;
        private static volatile Parser<CMP> PARSER = null;
        public static final int SOURCE_HASH_FIELD_NUMBER = 15;
        public static final int SOURCE_ID_FIELD_NUMBER = 7;
        public static final int VENDORLIST_FIELD_NUMBER = 4;
        private int cmpHashVersion_;
        private Models.Configuration configuration_;
        private int experimentWeight_;
        private int floatingVersion_;
        private boolean isExperimentPopulation_;
        private int sourceId_;
        private Models.Vendorlist vendorlist_;
        private String appKey_ = "";
        private String buildId_ = "";
        private String cmpHash_ = "";
        private String sourceHash_ = "";
        private String experimentId_ = "";
        private String experimentParentAppKey_ = "";
        private String choosenAppKey_ = "";
        private String floatingExtraId_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<CMP, Builder> implements CMPOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((CMP) this.instance).clearAppKey();
                return this;
            }

            public Builder clearBuildId() {
                copyOnWrite();
                ((CMP) this.instance).clearBuildId();
                return this;
            }

            public Builder clearChoosenAppKey() {
                copyOnWrite();
                ((CMP) this.instance).clearChoosenAppKey();
                return this;
            }

            public Builder clearCmpHash() {
                copyOnWrite();
                ((CMP) this.instance).clearCmpHash();
                return this;
            }

            public Builder clearCmpHashVersion() {
                copyOnWrite();
                ((CMP) this.instance).clearCmpHashVersion();
                return this;
            }

            public Builder clearConfiguration() {
                copyOnWrite();
                ((CMP) this.instance).clearConfiguration();
                return this;
            }

            public Builder clearExperimentId() {
                copyOnWrite();
                ((CMP) this.instance).clearExperimentId();
                return this;
            }

            public Builder clearExperimentParentAppKey() {
                copyOnWrite();
                ((CMP) this.instance).clearExperimentParentAppKey();
                return this;
            }

            public Builder clearExperimentWeight() {
                copyOnWrite();
                ((CMP) this.instance).clearExperimentWeight();
                return this;
            }

            public Builder clearFloatingExtraId() {
                copyOnWrite();
                ((CMP) this.instance).clearFloatingExtraId();
                return this;
            }

            public Builder clearFloatingVersion() {
                copyOnWrite();
                ((CMP) this.instance).clearFloatingVersion();
                return this;
            }

            public Builder clearIsExperimentPopulation() {
                copyOnWrite();
                ((CMP) this.instance).clearIsExperimentPopulation();
                return this;
            }

            public Builder clearSourceHash() {
                copyOnWrite();
                ((CMP) this.instance).clearSourceHash();
                return this;
            }

            public Builder clearSourceId() {
                copyOnWrite();
                ((CMP) this.instance).clearSourceId();
                return this;
            }

            public Builder clearVendorlist() {
                copyOnWrite();
                ((CMP) this.instance).clearVendorlist();
                return this;
            }

            @Override // ac.Server.CMPOrBuilder
            public String getAppKey() {
                return ((CMP) this.instance).getAppKey();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getAppKeyBytes() {
                return ((CMP) this.instance).getAppKeyBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getBuildId() {
                return ((CMP) this.instance).getBuildId();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getBuildIdBytes() {
                return ((CMP) this.instance).getBuildIdBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getChoosenAppKey() {
                return ((CMP) this.instance).getChoosenAppKey();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getChoosenAppKeyBytes() {
                return ((CMP) this.instance).getChoosenAppKeyBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getCmpHash() {
                return ((CMP) this.instance).getCmpHash();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getCmpHashBytes() {
                return ((CMP) this.instance).getCmpHashBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public int getCmpHashVersion() {
                return ((CMP) this.instance).getCmpHashVersion();
            }

            @Override // ac.Server.CMPOrBuilder
            public Models.Configuration getConfiguration() {
                return ((CMP) this.instance).getConfiguration();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getExperimentId() {
                return ((CMP) this.instance).getExperimentId();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getExperimentIdBytes() {
                return ((CMP) this.instance).getExperimentIdBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getExperimentParentAppKey() {
                return ((CMP) this.instance).getExperimentParentAppKey();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getExperimentParentAppKeyBytes() {
                return ((CMP) this.instance).getExperimentParentAppKeyBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public int getExperimentWeight() {
                return ((CMP) this.instance).getExperimentWeight();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getFloatingExtraId() {
                return ((CMP) this.instance).getFloatingExtraId();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getFloatingExtraIdBytes() {
                return ((CMP) this.instance).getFloatingExtraIdBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public int getFloatingVersion() {
                return ((CMP) this.instance).getFloatingVersion();
            }

            @Override // ac.Server.CMPOrBuilder
            public boolean getIsExperimentPopulation() {
                return ((CMP) this.instance).getIsExperimentPopulation();
            }

            @Override // ac.Server.CMPOrBuilder
            public String getSourceHash() {
                return ((CMP) this.instance).getSourceHash();
            }

            @Override // ac.Server.CMPOrBuilder
            public ByteString getSourceHashBytes() {
                return ((CMP) this.instance).getSourceHashBytes();
            }

            @Override // ac.Server.CMPOrBuilder
            public int getSourceId() {
                return ((CMP) this.instance).getSourceId();
            }

            @Override // ac.Server.CMPOrBuilder
            public Models.Vendorlist getVendorlist() {
                return ((CMP) this.instance).getVendorlist();
            }

            @Override // ac.Server.CMPOrBuilder
            public boolean hasConfiguration() {
                return ((CMP) this.instance).hasConfiguration();
            }

            @Override // ac.Server.CMPOrBuilder
            public boolean hasVendorlist() {
                return ((CMP) this.instance).hasVendorlist();
            }

            public Builder mergeConfiguration(Models.Configuration configuration) {
                copyOnWrite();
                ((CMP) this.instance).mergeConfiguration(configuration);
                return this;
            }

            public Builder mergeVendorlist(Models.Vendorlist vendorlist) {
                copyOnWrite();
                ((CMP) this.instance).mergeVendorlist(vendorlist);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((CMP) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setBuildId(String str) {
                copyOnWrite();
                ((CMP) this.instance).setBuildId(str);
                return this;
            }

            public Builder setBuildIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setBuildIdBytes(byteString);
                return this;
            }

            public Builder setChoosenAppKey(String str) {
                copyOnWrite();
                ((CMP) this.instance).setChoosenAppKey(str);
                return this;
            }

            public Builder setChoosenAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setChoosenAppKeyBytes(byteString);
                return this;
            }

            public Builder setCmpHash(String str) {
                copyOnWrite();
                ((CMP) this.instance).setCmpHash(str);
                return this;
            }

            public Builder setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setCmpHashBytes(byteString);
                return this;
            }

            public Builder setCmpHashVersion(int i10) {
                copyOnWrite();
                ((CMP) this.instance).setCmpHashVersion(i10);
                return this;
            }

            public Builder setConfiguration(Models.Configuration configuration) {
                copyOnWrite();
                ((CMP) this.instance).setConfiguration(configuration);
                return this;
            }

            public Builder setExperimentId(String str) {
                copyOnWrite();
                ((CMP) this.instance).setExperimentId(str);
                return this;
            }

            public Builder setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setExperimentIdBytes(byteString);
                return this;
            }

            public Builder setExperimentParentAppKey(String str) {
                copyOnWrite();
                ((CMP) this.instance).setExperimentParentAppKey(str);
                return this;
            }

            public Builder setExperimentParentAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setExperimentParentAppKeyBytes(byteString);
                return this;
            }

            public Builder setExperimentWeight(int i10) {
                copyOnWrite();
                ((CMP) this.instance).setExperimentWeight(i10);
                return this;
            }

            public Builder setFloatingExtraId(String str) {
                copyOnWrite();
                ((CMP) this.instance).setFloatingExtraId(str);
                return this;
            }

            public Builder setFloatingExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setFloatingExtraIdBytes(byteString);
                return this;
            }

            public Builder setFloatingVersion(int i10) {
                copyOnWrite();
                ((CMP) this.instance).setFloatingVersion(i10);
                return this;
            }

            public Builder setIsExperimentPopulation(boolean z10) {
                copyOnWrite();
                ((CMP) this.instance).setIsExperimentPopulation(z10);
                return this;
            }

            public Builder setSourceHash(String str) {
                copyOnWrite();
                ((CMP) this.instance).setSourceHash(str);
                return this;
            }

            public Builder setSourceHashBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((CMP) this.instance).setSourceHashBytes(byteString);
                return this;
            }

            public Builder setSourceId(int i10) {
                copyOnWrite();
                ((CMP) this.instance).setSourceId(i10);
                return this;
            }

            public Builder setVendorlist(Models.Vendorlist vendorlist) {
                copyOnWrite();
                ((CMP) this.instance).setVendorlist(vendorlist);
                return this;
            }

            private Builder() {
                super(CMP.DEFAULT_INSTANCE);
            }

            public Builder setConfiguration(Models.Configuration.Builder builder) {
                copyOnWrite();
                ((CMP) this.instance).setConfiguration(builder.build());
                return this;
            }

            public Builder setVendorlist(Models.Vendorlist.Builder builder) {
                copyOnWrite();
                ((CMP) this.instance).setVendorlist(builder.build());
                return this;
            }
        }

        static {
            CMP cmp = new CMP();
            DEFAULT_INSTANCE = cmp;
            GeneratedMessageLite.registerDefaultInstance(CMP.class, cmp);
        }

        private CMP() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildId() {
            this.buildId_ = getDefaultInstance().getBuildId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChoosenAppKey() {
            this.choosenAppKey_ = getDefaultInstance().getChoosenAppKey();
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
        public void clearExperimentId() {
            this.experimentId_ = getDefaultInstance().getExperimentId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentParentAppKey() {
            this.experimentParentAppKey_ = getDefaultInstance().getExperimentParentAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentWeight() {
            this.experimentWeight_ = 0;
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
        public void clearIsExperimentPopulation() {
            this.isExperimentPopulation_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceHash() {
            this.sourceHash_ = getDefaultInstance().getSourceHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceId() {
            this.sourceId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorlist() {
            this.vendorlist_ = null;
        }

        public static CMP getDefaultInstance() {
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

        public static CMP parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CMP) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CMP parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CMP> parser() {
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
        public void setBuildId(String str) {
            str.getClass();
            this.buildId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChoosenAppKey(String str) {
            str.getClass();
            this.choosenAppKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChoosenAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.choosenAppKey_ = byteString.toStringUtf8();
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
        public void setExperimentId(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.experimentId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentParentAppKey(String str) {
            str.getClass();
            this.experimentParentAppKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentParentAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.experimentParentAppKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentWeight(int i10) {
            this.experimentWeight_ = i10;
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
        public void setIsExperimentPopulation(boolean z10) {
            this.isExperimentPopulation_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceHash(String str) {
            str.getClass();
            this.sourceHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceHashBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sourceHash_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceId(int i10) {
            this.sourceId_ = i10;
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
                    return new CMP();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\t\u0004\t\u0005Ȉ\u0006Ȉ\u0007\u000b\bȈ\tȈ\n\u000b\u000b\u0007\fȈ\rȈ\u000e\u000b\u000fȈ", new Object[]{"appKey_", "cmpHashVersion_", "configuration_", "vendorlist_", "buildId_", "cmpHash_", "sourceId_", "experimentId_", "experimentParentAppKey_", "experimentWeight_", "isExperimentPopulation_", "choosenAppKey_", "floatingExtraId_", "floatingVersion_", "sourceHash_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CMP> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CMP.class) {
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

        @Override // ac.Server.CMPOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Server.CMPOrBuilder
        public String getBuildId() {
            return this.buildId_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getBuildIdBytes() {
            return ByteString.copyFromUtf8(this.buildId_);
        }

        @Override // ac.Server.CMPOrBuilder
        public String getChoosenAppKey() {
            return this.choosenAppKey_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getChoosenAppKeyBytes() {
            return ByteString.copyFromUtf8(this.choosenAppKey_);
        }

        @Override // ac.Server.CMPOrBuilder
        public String getCmpHash() {
            return this.cmpHash_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getCmpHashBytes() {
            return ByteString.copyFromUtf8(this.cmpHash_);
        }

        @Override // ac.Server.CMPOrBuilder
        public int getCmpHashVersion() {
            return this.cmpHashVersion_;
        }

        @Override // ac.Server.CMPOrBuilder
        public Models.Configuration getConfiguration() {
            Models.Configuration configuration = this.configuration_;
            return configuration == null ? Models.Configuration.getDefaultInstance() : configuration;
        }

        @Override // ac.Server.CMPOrBuilder
        public String getExperimentId() {
            return this.experimentId_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getExperimentIdBytes() {
            return ByteString.copyFromUtf8(this.experimentId_);
        }

        @Override // ac.Server.CMPOrBuilder
        public String getExperimentParentAppKey() {
            return this.experimentParentAppKey_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getExperimentParentAppKeyBytes() {
            return ByteString.copyFromUtf8(this.experimentParentAppKey_);
        }

        @Override // ac.Server.CMPOrBuilder
        public int getExperimentWeight() {
            return this.experimentWeight_;
        }

        @Override // ac.Server.CMPOrBuilder
        public String getFloatingExtraId() {
            return this.floatingExtraId_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getFloatingExtraIdBytes() {
            return ByteString.copyFromUtf8(this.floatingExtraId_);
        }

        @Override // ac.Server.CMPOrBuilder
        public int getFloatingVersion() {
            return this.floatingVersion_;
        }

        @Override // ac.Server.CMPOrBuilder
        public boolean getIsExperimentPopulation() {
            return this.isExperimentPopulation_;
        }

        @Override // ac.Server.CMPOrBuilder
        public String getSourceHash() {
            return this.sourceHash_;
        }

        @Override // ac.Server.CMPOrBuilder
        public ByteString getSourceHashBytes() {
            return ByteString.copyFromUtf8(this.sourceHash_);
        }

        @Override // ac.Server.CMPOrBuilder
        public int getSourceId() {
            return this.sourceId_;
        }

        @Override // ac.Server.CMPOrBuilder
        public Models.Vendorlist getVendorlist() {
            Models.Vendorlist vendorlist = this.vendorlist_;
            return vendorlist == null ? Models.Vendorlist.getDefaultInstance() : vendorlist;
        }

        @Override // ac.Server.CMPOrBuilder
        public boolean hasConfiguration() {
            return this.configuration_ != null;
        }

        @Override // ac.Server.CMPOrBuilder
        public boolean hasVendorlist() {
            return this.vendorlist_ != null;
        }

        public static Builder newBuilder(CMP cmp) {
            return DEFAULT_INSTANCE.createBuilder(cmp);
        }

        public static CMP parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMP) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CMP parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CMP parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CMP parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CMP parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CMP parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CMP parseFrom(InputStream inputStream) throws IOException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CMP parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CMP parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CMP parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMP) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CMPList extends GeneratedMessageLite<CMPList, Builder> implements CMPListOrBuilder {
        public static final int CMPS_FIELD_NUMBER = 1;
        private static final CMPList DEFAULT_INSTANCE;
        private static volatile Parser<CMPList> PARSER;
        private Internal.ProtobufList<CMP> cmps_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<CMPList, Builder> implements CMPListOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCmps(Iterable<? extends CMP> iterable) {
                copyOnWrite();
                ((CMPList) this.instance).addAllCmps(iterable);
                return this;
            }

            public Builder addCmps(CMP cmp) {
                copyOnWrite();
                ((CMPList) this.instance).addCmps(cmp);
                return this;
            }

            public Builder clearCmps() {
                copyOnWrite();
                ((CMPList) this.instance).clearCmps();
                return this;
            }

            @Override // ac.Server.CMPListOrBuilder
            public CMP getCmps(int i10) {
                return ((CMPList) this.instance).getCmps(i10);
            }

            @Override // ac.Server.CMPListOrBuilder
            public int getCmpsCount() {
                return ((CMPList) this.instance).getCmpsCount();
            }

            @Override // ac.Server.CMPListOrBuilder
            public List<CMP> getCmpsList() {
                return Collections.unmodifiableList(((CMPList) this.instance).getCmpsList());
            }

            public Builder removeCmps(int i10) {
                copyOnWrite();
                ((CMPList) this.instance).removeCmps(i10);
                return this;
            }

            public Builder setCmps(int i10, CMP cmp) {
                copyOnWrite();
                ((CMPList) this.instance).setCmps(i10, cmp);
                return this;
            }

            private Builder() {
                super(CMPList.DEFAULT_INSTANCE);
            }

            public Builder addCmps(int i10, CMP cmp) {
                copyOnWrite();
                ((CMPList) this.instance).addCmps(i10, cmp);
                return this;
            }

            public Builder setCmps(int i10, CMP.Builder builder) {
                copyOnWrite();
                ((CMPList) this.instance).setCmps(i10, builder.build());
                return this;
            }

            public Builder addCmps(CMP.Builder builder) {
                copyOnWrite();
                ((CMPList) this.instance).addCmps(builder.build());
                return this;
            }

            public Builder addCmps(int i10, CMP.Builder builder) {
                copyOnWrite();
                ((CMPList) this.instance).addCmps(i10, builder.build());
                return this;
            }
        }

        static {
            CMPList cMPList = new CMPList();
            DEFAULT_INSTANCE = cMPList;
            GeneratedMessageLite.registerDefaultInstance(CMPList.class, cMPList);
        }

        private CMPList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCmps(Iterable<? extends CMP> iterable) {
            ensureCmpsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.cmps_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCmps(CMP cmp) {
            cmp.getClass();
            ensureCmpsIsMutable();
            this.cmps_.add(cmp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmps() {
            this.cmps_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCmpsIsMutable() {
            Internal.ProtobufList<CMP> protobufList = this.cmps_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.cmps_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static CMPList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CMPList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CMPList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CMPList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CMPList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCmps(int i10) {
            ensureCmpsIsMutable();
            this.cmps_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmps(int i10, CMP cmp) {
            cmp.getClass();
            ensureCmpsIsMutable();
            this.cmps_.set(i10, cmp);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CMPList();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"cmps_", CMP.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CMPList> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CMPList.class) {
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

        @Override // ac.Server.CMPListOrBuilder
        public CMP getCmps(int i10) {
            return this.cmps_.get(i10);
        }

        @Override // ac.Server.CMPListOrBuilder
        public int getCmpsCount() {
            return this.cmps_.size();
        }

        @Override // ac.Server.CMPListOrBuilder
        public List<CMP> getCmpsList() {
            return this.cmps_;
        }

        public CMPOrBuilder getCmpsOrBuilder(int i10) {
            return this.cmps_.get(i10);
        }

        public List<? extends CMPOrBuilder> getCmpsOrBuilderList() {
            return this.cmps_;
        }

        public static Builder newBuilder(CMPList cMPList) {
            return DEFAULT_INSTANCE.createBuilder(cMPList);
        }

        public static CMPList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMPList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CMPList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CMPList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCmps(int i10, CMP cmp) {
            cmp.getClass();
            ensureCmpsIsMutable();
            this.cmps_.add(i10, cmp);
        }

        public static CMPList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CMPList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CMPList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CMPList parseFrom(InputStream inputStream) throws IOException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CMPList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CMPList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CMPList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CMPList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface CMPListOrBuilder extends MessageLiteOrBuilder {
        CMP getCmps(int i10);

        int getCmpsCount();

        List<CMP> getCmpsList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface CMPOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getBuildId();

        ByteString getBuildIdBytes();

        String getChoosenAppKey();

        ByteString getChoosenAppKeyBytes();

        String getCmpHash();

        ByteString getCmpHashBytes();

        int getCmpHashVersion();

        Models.Configuration getConfiguration();

        String getExperimentId();

        ByteString getExperimentIdBytes();

        String getExperimentParentAppKey();

        ByteString getExperimentParentAppKeyBytes();

        int getExperimentWeight();

        String getFloatingExtraId();

        ByteString getFloatingExtraIdBytes();

        int getFloatingVersion();

        boolean getIsExperimentPopulation();

        String getSourceHash();

        ByteString getSourceHashBytes();

        int getSourceId();

        Models.Vendorlist getVendorlist();

        boolean hasConfiguration();

        boolean hasVendorlist();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ExperimentList extends GeneratedMessageLite<ExperimentList, Builder> implements ExperimentListOrBuilder {
        public static final int APP_KEYS_FIELD_NUMBER = 2;
        private static final ExperimentList DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        private static volatile Parser<ExperimentList> PARSER;
        private String experimentId_ = "";
        private Internal.ProtobufList<String> appKeys_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ExperimentList, Builder> implements ExperimentListOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAppKeys(Iterable<String> iterable) {
                copyOnWrite();
                ((ExperimentList) this.instance).addAllAppKeys(iterable);
                return this;
            }

            public Builder addAppKeys(String str) {
                copyOnWrite();
                ((ExperimentList) this.instance).addAppKeys(str);
                return this;
            }

            public Builder addAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExperimentList) this.instance).addAppKeysBytes(byteString);
                return this;
            }

            public Builder clearAppKeys() {
                copyOnWrite();
                ((ExperimentList) this.instance).clearAppKeys();
                return this;
            }

            public Builder clearExperimentId() {
                copyOnWrite();
                ((ExperimentList) this.instance).clearExperimentId();
                return this;
            }

            @Override // ac.Server.ExperimentListOrBuilder
            public String getAppKeys(int i10) {
                return ((ExperimentList) this.instance).getAppKeys(i10);
            }

            @Override // ac.Server.ExperimentListOrBuilder
            public ByteString getAppKeysBytes(int i10) {
                return ((ExperimentList) this.instance).getAppKeysBytes(i10);
            }

            @Override // ac.Server.ExperimentListOrBuilder
            public int getAppKeysCount() {
                return ((ExperimentList) this.instance).getAppKeysCount();
            }

            @Override // ac.Server.ExperimentListOrBuilder
            public List<String> getAppKeysList() {
                return Collections.unmodifiableList(((ExperimentList) this.instance).getAppKeysList());
            }

            @Override // ac.Server.ExperimentListOrBuilder
            public String getExperimentId() {
                return ((ExperimentList) this.instance).getExperimentId();
            }

            @Override // ac.Server.ExperimentListOrBuilder
            public ByteString getExperimentIdBytes() {
                return ((ExperimentList) this.instance).getExperimentIdBytes();
            }

            public Builder setAppKeys(int i10, String str) {
                copyOnWrite();
                ((ExperimentList) this.instance).setAppKeys(i10, str);
                return this;
            }

            public Builder setExperimentId(String str) {
                copyOnWrite();
                ((ExperimentList) this.instance).setExperimentId(str);
                return this;
            }

            public Builder setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExperimentList) this.instance).setExperimentIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(ExperimentList.DEFAULT_INSTANCE);
            }
        }

        static {
            ExperimentList experimentList = new ExperimentList();
            DEFAULT_INSTANCE = experimentList;
            GeneratedMessageLite.registerDefaultInstance(ExperimentList.class, experimentList);
        }

        private ExperimentList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAppKeys(Iterable<String> iterable) {
            ensureAppKeysIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.appKeys_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAppKeys(String str) {
            str.getClass();
            ensureAppKeysIsMutable();
            this.appKeys_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAppKeysIsMutable();
            this.appKeys_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKeys() {
            this.appKeys_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperimentId() {
            this.experimentId_ = getDefaultInstance().getExperimentId();
        }

        private void ensureAppKeysIsMutable() {
            Internal.ProtobufList<String> protobufList = this.appKeys_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.appKeys_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ExperimentList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExperimentList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExperimentList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExperimentList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppKeys(int i10, String str) {
            str.getClass();
            ensureAppKeysIsMutable();
            this.appKeys_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentId(String str) {
            str.getClass();
            this.experimentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.experimentId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentList();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"experimentId_", "appKeys_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentList> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentList.class) {
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

        @Override // ac.Server.ExperimentListOrBuilder
        public String getAppKeys(int i10) {
            return this.appKeys_.get(i10);
        }

        @Override // ac.Server.ExperimentListOrBuilder
        public ByteString getAppKeysBytes(int i10) {
            return ByteString.copyFromUtf8(this.appKeys_.get(i10));
        }

        @Override // ac.Server.ExperimentListOrBuilder
        public int getAppKeysCount() {
            return this.appKeys_.size();
        }

        @Override // ac.Server.ExperimentListOrBuilder
        public List<String> getAppKeysList() {
            return this.appKeys_;
        }

        @Override // ac.Server.ExperimentListOrBuilder
        public String getExperimentId() {
            return this.experimentId_;
        }

        @Override // ac.Server.ExperimentListOrBuilder
        public ByteString getExperimentIdBytes() {
            return ByteString.copyFromUtf8(this.experimentId_);
        }

        public static Builder newBuilder(ExperimentList experimentList) {
            return DEFAULT_INSTANCE.createBuilder(experimentList);
        }

        public static ExperimentList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExperimentList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExperimentList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExperimentList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExperimentList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExperimentList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExperimentList parseFrom(InputStream inputStream) throws IOException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExperimentList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExperimentList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ExperimentListOrBuilder extends MessageLiteOrBuilder {
        String getAppKeys(int i10);

        ByteString getAppKeysBytes(int i10);

        int getAppKeysCount();

        List<String> getAppKeysList();

        String getExperimentId();

        ByteString getExperimentIdBytes();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ListCMPAppKeysRequest extends GeneratedMessageLite<ListCMPAppKeysRequest, Builder> implements ListCMPAppKeysRequestOrBuilder {
        private static final ListCMPAppKeysRequest DEFAULT_INSTANCE;
        private static volatile Parser<ListCMPAppKeysRequest> PARSER;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ListCMPAppKeysRequest, Builder> implements ListCMPAppKeysRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ListCMPAppKeysRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ListCMPAppKeysRequest listCMPAppKeysRequest = new ListCMPAppKeysRequest();
            DEFAULT_INSTANCE = listCMPAppKeysRequest;
            GeneratedMessageLite.registerDefaultInstance(ListCMPAppKeysRequest.class, listCMPAppKeysRequest);
        }

        private ListCMPAppKeysRequest() {
        }

        public static ListCMPAppKeysRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListCMPAppKeysRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListCMPAppKeysRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ListCMPAppKeysRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListCMPAppKeysRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListCMPAppKeysRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListCMPAppKeysRequest.class) {
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

        public static Builder newBuilder(ListCMPAppKeysRequest listCMPAppKeysRequest) {
            return DEFAULT_INSTANCE.createBuilder(listCMPAppKeysRequest);
        }

        public static ListCMPAppKeysRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListCMPAppKeysRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListCMPAppKeysRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ListCMPAppKeysRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListCMPAppKeysRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListCMPAppKeysRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListCMPAppKeysRequest parseFrom(InputStream inputStream) throws IOException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListCMPAppKeysRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListCMPAppKeysRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListCMPAppKeysRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListCMPAppKeysRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ListCMPAppKeysRequestOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ListCMPAppKeysResponse extends GeneratedMessageLite<ListCMPAppKeysResponse, Builder> implements ListCMPAppKeysResponseOrBuilder {
        public static final int CMP_APP_KEYS_FIELD_NUMBER = 1;
        private static final ListCMPAppKeysResponse DEFAULT_INSTANCE;
        private static volatile Parser<ListCMPAppKeysResponse> PARSER;
        private Internal.ProtobufList<String> cmpAppKeys_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ListCMPAppKeysResponse, Builder> implements ListCMPAppKeysResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCmpAppKeys(Iterable<String> iterable) {
                copyOnWrite();
                ((ListCMPAppKeysResponse) this.instance).addAllCmpAppKeys(iterable);
                return this;
            }

            public Builder addCmpAppKeys(String str) {
                copyOnWrite();
                ((ListCMPAppKeysResponse) this.instance).addCmpAppKeys(str);
                return this;
            }

            public Builder addCmpAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ListCMPAppKeysResponse) this.instance).addCmpAppKeysBytes(byteString);
                return this;
            }

            public Builder clearCmpAppKeys() {
                copyOnWrite();
                ((ListCMPAppKeysResponse) this.instance).clearCmpAppKeys();
                return this;
            }

            @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
            public String getCmpAppKeys(int i10) {
                return ((ListCMPAppKeysResponse) this.instance).getCmpAppKeys(i10);
            }

            @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
            public ByteString getCmpAppKeysBytes(int i10) {
                return ((ListCMPAppKeysResponse) this.instance).getCmpAppKeysBytes(i10);
            }

            @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
            public int getCmpAppKeysCount() {
                return ((ListCMPAppKeysResponse) this.instance).getCmpAppKeysCount();
            }

            @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
            public List<String> getCmpAppKeysList() {
                return Collections.unmodifiableList(((ListCMPAppKeysResponse) this.instance).getCmpAppKeysList());
            }

            public Builder setCmpAppKeys(int i10, String str) {
                copyOnWrite();
                ((ListCMPAppKeysResponse) this.instance).setCmpAppKeys(i10, str);
                return this;
            }

            private Builder() {
                super(ListCMPAppKeysResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            ListCMPAppKeysResponse listCMPAppKeysResponse = new ListCMPAppKeysResponse();
            DEFAULT_INSTANCE = listCMPAppKeysResponse;
            GeneratedMessageLite.registerDefaultInstance(ListCMPAppKeysResponse.class, listCMPAppKeysResponse);
        }

        private ListCMPAppKeysResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCmpAppKeys(Iterable<String> iterable) {
            ensureCmpAppKeysIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.cmpAppKeys_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCmpAppKeys(String str) {
            str.getClass();
            ensureCmpAppKeysIsMutable();
            this.cmpAppKeys_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCmpAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureCmpAppKeysIsMutable();
            this.cmpAppKeys_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpAppKeys() {
            this.cmpAppKeys_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureCmpAppKeysIsMutable() {
            Internal.ProtobufList<String> protobufList = this.cmpAppKeys_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.cmpAppKeys_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ListCMPAppKeysResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListCMPAppKeysResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListCMPAppKeysResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ListCMPAppKeysResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpAppKeys(int i10, String str) {
            str.getClass();
            ensureCmpAppKeysIsMutable();
            this.cmpAppKeys_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListCMPAppKeysResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"cmpAppKeys_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListCMPAppKeysResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListCMPAppKeysResponse.class) {
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

        @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
        public String getCmpAppKeys(int i10) {
            return this.cmpAppKeys_.get(i10);
        }

        @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
        public ByteString getCmpAppKeysBytes(int i10) {
            return ByteString.copyFromUtf8(this.cmpAppKeys_.get(i10));
        }

        @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
        public int getCmpAppKeysCount() {
            return this.cmpAppKeys_.size();
        }

        @Override // ac.Server.ListCMPAppKeysResponseOrBuilder
        public List<String> getCmpAppKeysList() {
            return this.cmpAppKeys_;
        }

        public static Builder newBuilder(ListCMPAppKeysResponse listCMPAppKeysResponse) {
            return DEFAULT_INSTANCE.createBuilder(listCMPAppKeysResponse);
        }

        public static ListCMPAppKeysResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListCMPAppKeysResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListCMPAppKeysResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ListCMPAppKeysResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListCMPAppKeysResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListCMPAppKeysResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListCMPAppKeysResponse parseFrom(InputStream inputStream) throws IOException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListCMPAppKeysResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListCMPAppKeysResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListCMPAppKeysResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListCMPAppKeysResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ListCMPAppKeysResponseOrBuilder extends MessageLiteOrBuilder {
        String getCmpAppKeys(int i10);

        ByteString getCmpAppKeysBytes(int i10);

        int getCmpAppKeysCount();

        List<String> getCmpAppKeysList();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ListExtraVendorIDRequest extends GeneratedMessageLite<ListExtraVendorIDRequest, Builder> implements ListExtraVendorIDRequestOrBuilder {
        private static final ListExtraVendorIDRequest DEFAULT_INSTANCE;
        private static volatile Parser<ListExtraVendorIDRequest> PARSER;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ListExtraVendorIDRequest, Builder> implements ListExtraVendorIDRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(ListExtraVendorIDRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ListExtraVendorIDRequest listExtraVendorIDRequest = new ListExtraVendorIDRequest();
            DEFAULT_INSTANCE = listExtraVendorIDRequest;
            GeneratedMessageLite.registerDefaultInstance(ListExtraVendorIDRequest.class, listExtraVendorIDRequest);
        }

        private ListExtraVendorIDRequest() {
        }

        public static ListExtraVendorIDRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListExtraVendorIDRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListExtraVendorIDRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ListExtraVendorIDRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListExtraVendorIDRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListExtraVendorIDRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListExtraVendorIDRequest.class) {
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

        public static Builder newBuilder(ListExtraVendorIDRequest listExtraVendorIDRequest) {
            return DEFAULT_INSTANCE.createBuilder(listExtraVendorIDRequest);
        }

        public static ListExtraVendorIDRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListExtraVendorIDRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListExtraVendorIDRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ListExtraVendorIDRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListExtraVendorIDRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListExtraVendorIDRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListExtraVendorIDRequest parseFrom(InputStream inputStream) throws IOException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListExtraVendorIDRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListExtraVendorIDRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListExtraVendorIDRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListExtraVendorIDRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ListExtraVendorIDRequestOrBuilder extends MessageLiteOrBuilder {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ListExtraVendorIDResponse extends GeneratedMessageLite<ListExtraVendorIDResponse, Builder> implements ListExtraVendorIDResponseOrBuilder {
        private static final ListExtraVendorIDResponse DEFAULT_INSTANCE;
        private static volatile Parser<ListExtraVendorIDResponse> PARSER = null;
        public static final int VENDORS_FIELD_NUMBER = 1;
        private MapFieldLite<String, String> vendors_ = MapFieldLite.emptyMapField();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ListExtraVendorIDResponse, Builder> implements ListExtraVendorIDResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearVendors() {
                copyOnWrite();
                ((ListExtraVendorIDResponse) this.instance).getMutableVendorsMap().clear();
                return this;
            }

            @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
            public boolean containsVendors(String str) {
                str.getClass();
                return ((ListExtraVendorIDResponse) this.instance).getVendorsMap().containsKey(str);
            }

            @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
            @Deprecated
            public Map<String, String> getVendors() {
                return getVendorsMap();
            }

            @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
            public int getVendorsCount() {
                return ((ListExtraVendorIDResponse) this.instance).getVendorsMap().size();
            }

            @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
            public Map<String, String> getVendorsMap() {
                return Collections.unmodifiableMap(((ListExtraVendorIDResponse) this.instance).getVendorsMap());
            }

            @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
            public String getVendorsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> vendorsMap = ((ListExtraVendorIDResponse) this.instance).getVendorsMap();
                return vendorsMap.containsKey(str) ? vendorsMap.get(str) : str2;
            }

            @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
            public String getVendorsOrThrow(String str) {
                str.getClass();
                Map<String, String> vendorsMap = ((ListExtraVendorIDResponse) this.instance).getVendorsMap();
                if (vendorsMap.containsKey(str)) {
                    return vendorsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllVendors(Map<String, String> map) {
                copyOnWrite();
                ((ListExtraVendorIDResponse) this.instance).getMutableVendorsMap().putAll(map);
                return this;
            }

            public Builder putVendors(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((ListExtraVendorIDResponse) this.instance).getMutableVendorsMap().put(str, str2);
                return this;
            }

            public Builder removeVendors(String str) {
                str.getClass();
                copyOnWrite();
                ((ListExtraVendorIDResponse) this.instance).getMutableVendorsMap().remove(str);
                return this;
            }

            private Builder() {
                super(ListExtraVendorIDResponse.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class VendorsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private VendorsDefaultEntryHolder() {
            }
        }

        static {
            ListExtraVendorIDResponse listExtraVendorIDResponse = new ListExtraVendorIDResponse();
            DEFAULT_INSTANCE = listExtraVendorIDResponse;
            GeneratedMessageLite.registerDefaultInstance(ListExtraVendorIDResponse.class, listExtraVendorIDResponse);
        }

        private ListExtraVendorIDResponse() {
        }

        public static ListExtraVendorIDResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableVendorsMap() {
            return internalGetMutableVendors();
        }

        private MapFieldLite<String, String> internalGetMutableVendors() {
            if (!this.vendors_.isMutable()) {
                this.vendors_ = this.vendors_.mutableCopy();
            }
            return this.vendors_;
        }

        private MapFieldLite<String, String> internalGetVendors() {
            return this.vendors_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListExtraVendorIDResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListExtraVendorIDResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ListExtraVendorIDResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
        public boolean containsVendors(String str) {
            str.getClass();
            return internalGetVendors().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListExtraVendorIDResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"vendors_", VendorsDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListExtraVendorIDResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListExtraVendorIDResponse.class) {
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

        @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
        @Deprecated
        public Map<String, String> getVendors() {
            return getVendorsMap();
        }

        @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
        public int getVendorsCount() {
            return internalGetVendors().size();
        }

        @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
        public Map<String, String> getVendorsMap() {
            return Collections.unmodifiableMap(internalGetVendors());
        }

        @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
        public String getVendorsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetVendors = internalGetVendors();
            return mapFieldLiteInternalGetVendors.containsKey(str) ? mapFieldLiteInternalGetVendors.get(str) : str2;
        }

        @Override // ac.Server.ListExtraVendorIDResponseOrBuilder
        public String getVendorsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetVendors = internalGetVendors();
            if (mapFieldLiteInternalGetVendors.containsKey(str)) {
                return mapFieldLiteInternalGetVendors.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(ListExtraVendorIDResponse listExtraVendorIDResponse) {
            return DEFAULT_INSTANCE.createBuilder(listExtraVendorIDResponse);
        }

        public static ListExtraVendorIDResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListExtraVendorIDResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListExtraVendorIDResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ListExtraVendorIDResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListExtraVendorIDResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListExtraVendorIDResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListExtraVendorIDResponse parseFrom(InputStream inputStream) throws IOException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListExtraVendorIDResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListExtraVendorIDResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListExtraVendorIDResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListExtraVendorIDResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ListExtraVendorIDResponseOrBuilder extends MessageLiteOrBuilder {
        boolean containsVendors(String str);

        @Deprecated
        Map<String, String> getVendors();

        int getVendorsCount();

        Map<String, String> getVendorsMap();

        String getVendorsOrDefault(String str, String str2);

        String getVendorsOrThrow(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class StatsQMessage extends GeneratedMessageLite<StatsQMessage, Builder> implements StatsQMessageOrBuilder {
        public static final int CONSENT_FIELD_NUMBER = 1;
        private static final StatsQMessage DEFAULT_INSTANCE;
        public static final int FLOATING_EXTRA_PURPOSE_FIELD_NUMBER = 3;
        public static final int METRIC_FIELD_NUMBER = 2;
        private static volatile Parser<StatsQMessage> PARSER = null;
        public static final int SHIP_REQUEST_FIELD_NUMBER = 4;
        private Models.Consent consent_;
        private Models.ConsentFloatingExtraPurpose floatingExtraPurpose_;
        private Metric$UserMetric metric_;
        private Xchange.ShipRequest shipRequest_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<StatsQMessage, Builder> implements StatsQMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearConsent() {
                copyOnWrite();
                ((StatsQMessage) this.instance).clearConsent();
                return this;
            }

            public Builder clearFloatingExtraPurpose() {
                copyOnWrite();
                ((StatsQMessage) this.instance).clearFloatingExtraPurpose();
                return this;
            }

            public Builder clearMetric() {
                copyOnWrite();
                ((StatsQMessage) this.instance).clearMetric();
                return this;
            }

            public Builder clearShipRequest() {
                copyOnWrite();
                ((StatsQMessage) this.instance).clearShipRequest();
                return this;
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public Models.Consent getConsent() {
                return ((StatsQMessage) this.instance).getConsent();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public Models.ConsentFloatingExtraPurpose getFloatingExtraPurpose() {
                return ((StatsQMessage) this.instance).getFloatingExtraPurpose();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public Metric$UserMetric getMetric() {
                return ((StatsQMessage) this.instance).getMetric();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public Xchange.ShipRequest getShipRequest() {
                return ((StatsQMessage) this.instance).getShipRequest();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public boolean hasConsent() {
                return ((StatsQMessage) this.instance).hasConsent();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public boolean hasFloatingExtraPurpose() {
                return ((StatsQMessage) this.instance).hasFloatingExtraPurpose();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public boolean hasMetric() {
                return ((StatsQMessage) this.instance).hasMetric();
            }

            @Override // ac.Server.StatsQMessageOrBuilder
            public boolean hasShipRequest() {
                return ((StatsQMessage) this.instance).hasShipRequest();
            }

            public Builder mergeConsent(Models.Consent consent) {
                copyOnWrite();
                ((StatsQMessage) this.instance).mergeConsent(consent);
                return this;
            }

            public Builder mergeFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
                copyOnWrite();
                ((StatsQMessage) this.instance).mergeFloatingExtraPurpose(consentFloatingExtraPurpose);
                return this;
            }

            public Builder mergeMetric(Metric$UserMetric metric$UserMetric) {
                copyOnWrite();
                ((StatsQMessage) this.instance).mergeMetric(metric$UserMetric);
                return this;
            }

            public Builder mergeShipRequest(Xchange.ShipRequest shipRequest) {
                copyOnWrite();
                ((StatsQMessage) this.instance).mergeShipRequest(shipRequest);
                return this;
            }

            public Builder setConsent(Models.Consent consent) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setConsent(consent);
                return this;
            }

            public Builder setFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setFloatingExtraPurpose(consentFloatingExtraPurpose);
                return this;
            }

            public Builder setMetric(Metric$UserMetric metric$UserMetric) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setMetric(metric$UserMetric);
                return this;
            }

            public Builder setShipRequest(Xchange.ShipRequest shipRequest) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setShipRequest(shipRequest);
                return this;
            }

            private Builder() {
                super(StatsQMessage.DEFAULT_INSTANCE);
            }

            public Builder setConsent(Models.Consent.Builder builder) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setConsent(builder.build());
                return this;
            }

            public Builder setFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose.Builder builder) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setFloatingExtraPurpose(builder.build());
                return this;
            }

            public Builder setMetric(g gVar) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setMetric((Metric$UserMetric) gVar.build());
                return this;
            }

            public Builder setShipRequest(Xchange.ShipRequest.Builder builder) {
                copyOnWrite();
                ((StatsQMessage) this.instance).setShipRequest(builder.build());
                return this;
            }
        }

        static {
            StatsQMessage statsQMessage = new StatsQMessage();
            DEFAULT_INSTANCE = statsQMessage;
            GeneratedMessageLite.registerDefaultInstance(StatsQMessage.class, statsQMessage);
        }

        private StatsQMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsent() {
            this.consent_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatingExtraPurpose() {
            this.floatingExtraPurpose_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetric() {
            this.metric_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShipRequest() {
            this.shipRequest_ = null;
        }

        public static StatsQMessage getDefaultInstance() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            consentFloatingExtraPurpose.getClass();
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose2 = this.floatingExtraPurpose_;
            if (consentFloatingExtraPurpose2 == null || consentFloatingExtraPurpose2 == Models.ConsentFloatingExtraPurpose.getDefaultInstance()) {
                this.floatingExtraPurpose_ = consentFloatingExtraPurpose;
            } else {
                this.floatingExtraPurpose_ = Models.ConsentFloatingExtraPurpose.newBuilder(this.floatingExtraPurpose_).mergeFrom((Models.ConsentFloatingExtraPurpose.Builder) consentFloatingExtraPurpose).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMetric(Metric$UserMetric metric$UserMetric) {
            metric$UserMetric.getClass();
            Metric$UserMetric metric$UserMetric2 = this.metric_;
            if (metric$UserMetric2 == null || metric$UserMetric2 == Metric$UserMetric.getDefaultInstance()) {
                this.metric_ = metric$UserMetric;
            } else {
                this.metric_ = (Metric$UserMetric) ((g) Metric$UserMetric.newBuilder(this.metric_).mergeFrom((g) metric$UserMetric)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShipRequest(Xchange.ShipRequest shipRequest) {
            shipRequest.getClass();
            Xchange.ShipRequest shipRequest2 = this.shipRequest_;
            if (shipRequest2 == null || shipRequest2 == Xchange.ShipRequest.getDefaultInstance()) {
                this.shipRequest_ = shipRequest;
            } else {
                this.shipRequest_ = Xchange.ShipRequest.newBuilder(this.shipRequest_).mergeFrom((Xchange.ShipRequest.Builder) shipRequest).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StatsQMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StatsQMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StatsQMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StatsQMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsent(Models.Consent consent) {
            consent.getClass();
            this.consent_ = consent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatingExtraPurpose(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            consentFloatingExtraPurpose.getClass();
            this.floatingExtraPurpose_ = consentFloatingExtraPurpose;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetric(Metric$UserMetric metric$UserMetric) {
            metric$UserMetric.getClass();
            this.metric_ = metric$UserMetric;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShipRequest(Xchange.ShipRequest shipRequest) {
            shipRequest.getClass();
            this.shipRequest_ = shipRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StatsQMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"consent_", "metric_", "floatingExtraPurpose_", "shipRequest_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StatsQMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StatsQMessage.class) {
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

        @Override // ac.Server.StatsQMessageOrBuilder
        public Models.Consent getConsent() {
            Models.Consent consent = this.consent_;
            return consent == null ? Models.Consent.getDefaultInstance() : consent;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public Models.ConsentFloatingExtraPurpose getFloatingExtraPurpose() {
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose = this.floatingExtraPurpose_;
            return consentFloatingExtraPurpose == null ? Models.ConsentFloatingExtraPurpose.getDefaultInstance() : consentFloatingExtraPurpose;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public Metric$UserMetric getMetric() {
            Metric$UserMetric metric$UserMetric = this.metric_;
            return metric$UserMetric == null ? Metric$UserMetric.getDefaultInstance() : metric$UserMetric;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public Xchange.ShipRequest getShipRequest() {
            Xchange.ShipRequest shipRequest = this.shipRequest_;
            return shipRequest == null ? Xchange.ShipRequest.getDefaultInstance() : shipRequest;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public boolean hasConsent() {
            return this.consent_ != null;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public boolean hasFloatingExtraPurpose() {
            return this.floatingExtraPurpose_ != null;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public boolean hasMetric() {
            return this.metric_ != null;
        }

        @Override // ac.Server.StatsQMessageOrBuilder
        public boolean hasShipRequest() {
            return this.shipRequest_ != null;
        }

        public static Builder newBuilder(StatsQMessage statsQMessage) {
            return DEFAULT_INSTANCE.createBuilder(statsQMessage);
        }

        public static StatsQMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StatsQMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StatsQMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StatsQMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StatsQMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StatsQMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StatsQMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StatsQMessage parseFrom(InputStream inputStream) throws IOException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StatsQMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StatsQMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StatsQMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StatsQMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface StatsQMessageOrBuilder extends MessageLiteOrBuilder {
        Models.Consent getConsent();

        Models.ConsentFloatingExtraPurpose getFloatingExtraPurpose();

        Metric$UserMetric getMetric();

        Xchange.ShipRequest getShipRequest();

        boolean hasConsent();

        boolean hasFloatingExtraPurpose();

        boolean hasMetric();

        boolean hasShipRequest();
    }

    private Server() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
