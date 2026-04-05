package ac;

import ac.AcError;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
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
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class Xchange {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ac.Xchange$1, reason: invalid class name */
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
    public static final class ExternalIds extends GeneratedMessageLite<ExternalIds, Builder> implements ExternalIdsOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 2;
        private static final ExternalIds DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 3;
        public static final int GIVEN_AT_FIELD_NUMBER = 4;
        private static volatile Parser<ExternalIds> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private Timestamp givenAt_;
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();
        private String uuid_ = "";
        private String appKey_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ExternalIds, Builder> implements ExternalIdsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((ExternalIds) this.instance).clearAppKey();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((ExternalIds) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            public Builder clearGivenAt() {
                copyOnWrite();
                ((ExternalIds) this.instance).clearGivenAt();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((ExternalIds) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((ExternalIds) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public String getAppKey() {
                return ((ExternalIds) this.instance).getAppKey();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public ByteString getAppKeyBytes() {
                return ((ExternalIds) this.instance).getAppKeyBytes();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public int getExternalIdsCount() {
                return ((ExternalIds) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((ExternalIds) this.instance).getExternalIdsMap());
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((ExternalIds) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((ExternalIds) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public Timestamp getGivenAt() {
                return ((ExternalIds) this.instance).getGivenAt();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public String getUuid() {
                return ((ExternalIds) this.instance).getUuid();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public ByteString getUuidBytes() {
                return ((ExternalIds) this.instance).getUuidBytes();
            }

            @Override // ac.Xchange.ExternalIdsOrBuilder
            public boolean hasGivenAt() {
                return ((ExternalIds) this.instance).hasGivenAt();
            }

            public Builder mergeGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((ExternalIds) this.instance).mergeGivenAt(timestamp);
                return this;
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((ExternalIds) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((ExternalIds) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((ExternalIds) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((ExternalIds) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalIds) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((ExternalIds) this.instance).setGivenAt(timestamp);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((ExternalIds) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ExternalIds) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(ExternalIds.DEFAULT_INSTANCE);
            }

            public Builder setGivenAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((ExternalIds) this.instance).setGivenAt(builder.build());
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
            ExternalIds externalIds = new ExternalIds();
            DEFAULT_INSTANCE = externalIds;
            GeneratedMessageLite.registerDefaultInstance(ExternalIds.class, externalIds);
        }

        private ExternalIds() {
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

        public static ExternalIds getDefaultInstance() {
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

        public static ExternalIds parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExternalIds) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalIds parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExternalIds> parser() {
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

        @Override // ac.Xchange.ExternalIdsOrBuilder
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
                    return new ExternalIds();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004\t", new Object[]{"uuid_", "appKey_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry, "givenAt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExternalIds> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExternalIds.class) {
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

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public Timestamp getGivenAt() {
            Timestamp timestamp = this.givenAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Xchange.ExternalIdsOrBuilder
        public boolean hasGivenAt() {
            return this.givenAt_ != null;
        }

        public static Builder newBuilder(ExternalIds externalIds) {
            return DEFAULT_INSTANCE.createBuilder(externalIds);
        }

        public static ExternalIds parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalIds) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExternalIds parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExternalIds parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExternalIds parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExternalIds parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExternalIds parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExternalIds parseFrom(InputStream inputStream) throws IOException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExternalIds parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExternalIds parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExternalIds parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExternalIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ExternalIdsOrBuilder extends MessageLiteOrBuilder {
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
    public static final class Geoloc extends GeneratedMessageLite<Geoloc, Builder> implements GeolocOrBuilder {
        private static final Geoloc DEFAULT_INSTANCE;
        public static final int GEOLOC_FIELD_NUMBER = 1;
        private static volatile Parser<Geoloc> PARSER;
        private MapFieldLite<String, String> geoloc_ = MapFieldLite.emptyMapField();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Geoloc, Builder> implements GeolocOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearGeoloc() {
                copyOnWrite();
                ((Geoloc) this.instance).getMutableGeolocMap().clear();
                return this;
            }

            @Override // ac.Xchange.GeolocOrBuilder
            public boolean containsGeoloc(String str) {
                str.getClass();
                return ((Geoloc) this.instance).getGeolocMap().containsKey(str);
            }

            @Override // ac.Xchange.GeolocOrBuilder
            @Deprecated
            public Map<String, String> getGeoloc() {
                return getGeolocMap();
            }

            @Override // ac.Xchange.GeolocOrBuilder
            public int getGeolocCount() {
                return ((Geoloc) this.instance).getGeolocMap().size();
            }

            @Override // ac.Xchange.GeolocOrBuilder
            public Map<String, String> getGeolocMap() {
                return Collections.unmodifiableMap(((Geoloc) this.instance).getGeolocMap());
            }

            @Override // ac.Xchange.GeolocOrBuilder
            public String getGeolocOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> geolocMap = ((Geoloc) this.instance).getGeolocMap();
                return geolocMap.containsKey(str) ? geolocMap.get(str) : str2;
            }

            @Override // ac.Xchange.GeolocOrBuilder
            public String getGeolocOrThrow(String str) {
                str.getClass();
                Map<String, String> geolocMap = ((Geoloc) this.instance).getGeolocMap();
                if (geolocMap.containsKey(str)) {
                    return geolocMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllGeoloc(Map<String, String> map) {
                copyOnWrite();
                ((Geoloc) this.instance).getMutableGeolocMap().putAll(map);
                return this;
            }

            public Builder putGeoloc(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Geoloc) this.instance).getMutableGeolocMap().put(str, str2);
                return this;
            }

            public Builder removeGeoloc(String str) {
                str.getClass();
                copyOnWrite();
                ((Geoloc) this.instance).getMutableGeolocMap().remove(str);
                return this;
            }

            private Builder() {
                super(Geoloc.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class GeolocDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private GeolocDefaultEntryHolder() {
            }
        }

        static {
            Geoloc geoloc = new Geoloc();
            DEFAULT_INSTANCE = geoloc;
            GeneratedMessageLite.registerDefaultInstance(Geoloc.class, geoloc);
        }

        private Geoloc() {
        }

        public static Geoloc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableGeolocMap() {
            return internalGetMutableGeoloc();
        }

        private MapFieldLite<String, String> internalGetGeoloc() {
            return this.geoloc_;
        }

        private MapFieldLite<String, String> internalGetMutableGeoloc() {
            if (!this.geoloc_.isMutable()) {
                this.geoloc_ = this.geoloc_.mutableCopy();
            }
            return this.geoloc_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Geoloc parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geoloc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geoloc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Geoloc> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // ac.Xchange.GeolocOrBuilder
        public boolean containsGeoloc(String str) {
            str.getClass();
            return internalGetGeoloc().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Geoloc();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"geoloc_", GeolocDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Geoloc> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Geoloc.class) {
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

        @Override // ac.Xchange.GeolocOrBuilder
        @Deprecated
        public Map<String, String> getGeoloc() {
            return getGeolocMap();
        }

        @Override // ac.Xchange.GeolocOrBuilder
        public int getGeolocCount() {
            return internalGetGeoloc().size();
        }

        @Override // ac.Xchange.GeolocOrBuilder
        public Map<String, String> getGeolocMap() {
            return Collections.unmodifiableMap(internalGetGeoloc());
        }

        @Override // ac.Xchange.GeolocOrBuilder
        public String getGeolocOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetGeoloc = internalGetGeoloc();
            return mapFieldLiteInternalGetGeoloc.containsKey(str) ? mapFieldLiteInternalGetGeoloc.get(str) : str2;
        }

        @Override // ac.Xchange.GeolocOrBuilder
        public String getGeolocOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetGeoloc = internalGetGeoloc();
            if (mapFieldLiteInternalGetGeoloc.containsKey(str)) {
                return mapFieldLiteInternalGetGeoloc.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(Geoloc geoloc) {
            return DEFAULT_INSTANCE.createBuilder(geoloc);
        }

        public static Geoloc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geoloc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geoloc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Geoloc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Geoloc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Geoloc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Geoloc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Geoloc parseFrom(InputStream inputStream) throws IOException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geoloc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geoloc parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Geoloc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geoloc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface GeolocOrBuilder extends MessageLiteOrBuilder {
        boolean containsGeoloc(String str);

        @Deprecated
        Map<String, String> getGeoloc();

        int getGeolocCount();

        Map<String, String> getGeolocMap();

        String getGeolocOrDefault(String str, String str2);

        String getGeolocOrThrow(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Metadata extends GeneratedMessageLite<Metadata, Builder> implements MetadataOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        public static final int CREATED_AT_FIELD_NUMBER = 4;
        private static final Metadata DEFAULT_INSTANCE;
        public static final int EMITTER_FIELD_NUMBER = 2;
        public static final int ERROR_FIELD_NUMBER = 5;
        private static volatile Parser<Metadata> PARSER = null;
        public static final int TOPIC_FIELD_NUMBER = 3;
        private Timestamp createdAt_;
        private String action_ = "";
        private String emitter_ = "";
        private String topic_ = "";
        private String error_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Metadata, Builder> implements MetadataOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((Metadata) this.instance).clearAction();
                return this;
            }

            public Builder clearCreatedAt() {
                copyOnWrite();
                ((Metadata) this.instance).clearCreatedAt();
                return this;
            }

            public Builder clearEmitter() {
                copyOnWrite();
                ((Metadata) this.instance).clearEmitter();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((Metadata) this.instance).clearError();
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((Metadata) this.instance).clearTopic();
                return this;
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public String getAction() {
                return ((Metadata) this.instance).getAction();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public ByteString getActionBytes() {
                return ((Metadata) this.instance).getActionBytes();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public Timestamp getCreatedAt() {
                return ((Metadata) this.instance).getCreatedAt();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public String getEmitter() {
                return ((Metadata) this.instance).getEmitter();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public ByteString getEmitterBytes() {
                return ((Metadata) this.instance).getEmitterBytes();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public String getError() {
                return ((Metadata) this.instance).getError();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public ByteString getErrorBytes() {
                return ((Metadata) this.instance).getErrorBytes();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public String getTopic() {
                return ((Metadata) this.instance).getTopic();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public ByteString getTopicBytes() {
                return ((Metadata) this.instance).getTopicBytes();
            }

            @Override // ac.Xchange.MetadataOrBuilder
            public boolean hasCreatedAt() {
                return ((Metadata) this.instance).hasCreatedAt();
            }

            public Builder mergeCreatedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Metadata) this.instance).mergeCreatedAt(timestamp);
                return this;
            }

            public Builder setAction(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setAction(str);
                return this;
            }

            public Builder setActionBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Metadata) this.instance).setActionBytes(byteString);
                return this;
            }

            public Builder setCreatedAt(Timestamp timestamp) {
                copyOnWrite();
                ((Metadata) this.instance).setCreatedAt(timestamp);
                return this;
            }

            public Builder setEmitter(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setEmitter(str);
                return this;
            }

            public Builder setEmitterBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Metadata) this.instance).setEmitterBytes(byteString);
                return this;
            }

            public Builder setError(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setError(str);
                return this;
            }

            public Builder setErrorBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Metadata) this.instance).setErrorBytes(byteString);
                return this;
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setTopic(str);
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Metadata) this.instance).setTopicBytes(byteString);
                return this;
            }

            private Builder() {
                super(Metadata.DEFAULT_INSTANCE);
            }

            public Builder setCreatedAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((Metadata) this.instance).setCreatedAt(builder.build());
                return this;
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            GeneratedMessageLite.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.action_ = getDefaultInstance().getAction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreatedAt() {
            this.createdAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEmitter() {
            this.emitter_ = getDefaultInstance().getEmitter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = getDefaultInstance().getError();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopic() {
            this.topic_ = getDefaultInstance().getTopic();
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCreatedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.createdAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.createdAt_ = timestamp;
            } else {
                this.createdAt_ = Timestamp.newBuilder(this.createdAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Metadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(String str) {
            str.getClass();
            this.action_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.action_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreatedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.createdAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmitter(String str) {
            str.getClass();
            this.emitter_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEmitterBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.emitter_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(String str) {
            str.getClass();
            this.error_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.error_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopic(String str) {
            str.getClass();
            this.topic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.topic_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"action_", "emitter_", "topic_", "createdAt_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Metadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Metadata.class) {
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

        @Override // ac.Xchange.MetadataOrBuilder
        public String getAction() {
            return this.action_;
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public ByteString getActionBytes() {
            return ByteString.copyFromUtf8(this.action_);
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public Timestamp getCreatedAt() {
            Timestamp timestamp = this.createdAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public String getEmitter() {
            return this.emitter_;
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public ByteString getEmitterBytes() {
            return ByteString.copyFromUtf8(this.emitter_);
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public String getError() {
            return this.error_;
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public ByteString getErrorBytes() {
            return ByteString.copyFromUtf8(this.error_);
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public String getTopic() {
            return this.topic_;
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public ByteString getTopicBytes() {
            return ByteString.copyFromUtf8(this.topic_);
        }

        @Override // ac.Xchange.MetadataOrBuilder
        public boolean hasCreatedAt() {
            return this.createdAt_ != null;
        }

        public static Builder newBuilder(Metadata metadata) {
            return DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Metadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Metadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Metadata parseFrom(InputStream inputStream) throws IOException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MetadataOrBuilder extends MessageLiteOrBuilder {
        String getAction();

        ByteString getActionBytes();

        Timestamp getCreatedAt();

        String getEmitter();

        ByteString getEmitterBytes();

        String getError();

        ByteString getErrorBytes();

        String getTopic();

        ByteString getTopicBytes();

        boolean hasCreatedAt();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ShipReply extends GeneratedMessageLite<ShipReply, Builder> implements ShipReplyOrBuilder {
        private static final ShipReply DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<ShipReply> PARSER;
        private AcError.ErrorResponse error_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ShipReply, Builder> implements ShipReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((ShipReply) this.instance).clearError();
                return this;
            }

            @Override // ac.Xchange.ShipReplyOrBuilder
            public AcError.ErrorResponse getError() {
                return ((ShipReply) this.instance).getError();
            }

            @Override // ac.Xchange.ShipReplyOrBuilder
            public boolean hasError() {
                return ((ShipReply) this.instance).hasError();
            }

            public Builder mergeError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((ShipReply) this.instance).mergeError(errorResponse);
                return this;
            }

            public Builder setError(AcError.ErrorResponse errorResponse) {
                copyOnWrite();
                ((ShipReply) this.instance).setError(errorResponse);
                return this;
            }

            private Builder() {
                super(ShipReply.DEFAULT_INSTANCE);
            }

            public Builder setError(AcError.ErrorResponse.Builder builder) {
                copyOnWrite();
                ((ShipReply) this.instance).setError(builder.build());
                return this;
            }
        }

        static {
            ShipReply shipReply = new ShipReply();
            DEFAULT_INSTANCE = shipReply;
            GeneratedMessageLite.registerDefaultInstance(ShipReply.class, shipReply);
        }

        private ShipReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
        }

        public static ShipReply getDefaultInstance() {
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

        public static ShipReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ShipReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShipReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ShipReply> parser() {
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
                    return new ShipReply();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ShipReply> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ShipReply.class) {
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

        @Override // ac.Xchange.ShipReplyOrBuilder
        public AcError.ErrorResponse getError() {
            AcError.ErrorResponse errorResponse = this.error_;
            return errorResponse == null ? AcError.ErrorResponse.getDefaultInstance() : errorResponse;
        }

        @Override // ac.Xchange.ShipReplyOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        public static Builder newBuilder(ShipReply shipReply) {
            return DEFAULT_INSTANCE.createBuilder(shipReply);
        }

        public static ShipReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ShipReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShipReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ShipReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ShipReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ShipReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShipReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ShipReply parseFrom(InputStream inputStream) throws IOException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShipReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShipReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ShipReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ShipReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ShipReplyOrBuilder extends MessageLiteOrBuilder {
        AcError.ErrorResponse getError();

        boolean hasError();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ShipRequest extends GeneratedMessageLite<ShipRequest, Builder> implements ShipRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 2;
        public static final int COLLECTED_AT_FIELD_NUMBER = 5;
        public static final int DATA_FIELD_NUMBER = 3;
        private static final ShipRequest DEFAULT_INSTANCE;
        public static final int GEOLOC_FIELD_NUMBER = 4;
        private static volatile Parser<ShipRequest> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private Timestamp collectedAt_;
        private MapFieldLite<String, String> data_ = MapFieldLite.emptyMapField();
        private String uuid_ = "";
        private String appKey_ = "";
        private Internal.ProtobufList<Geoloc> geoloc_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ShipRequest, Builder> implements ShipRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllGeoloc(Iterable<? extends Geoloc> iterable) {
                copyOnWrite();
                ((ShipRequest) this.instance).addAllGeoloc(iterable);
                return this;
            }

            public Builder addGeoloc(Geoloc geoloc) {
                copyOnWrite();
                ((ShipRequest) this.instance).addGeoloc(geoloc);
                return this;
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((ShipRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearCollectedAt() {
                copyOnWrite();
                ((ShipRequest) this.instance).clearCollectedAt();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((ShipRequest) this.instance).getMutableDataMap().clear();
                return this;
            }

            public Builder clearGeoloc() {
                copyOnWrite();
                ((ShipRequest) this.instance).clearGeoloc();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((ShipRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public boolean containsData(String str) {
                str.getClass();
                return ((ShipRequest) this.instance).getDataMap().containsKey(str);
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public String getAppKey() {
                return ((ShipRequest) this.instance).getAppKey();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((ShipRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public Timestamp getCollectedAt() {
                return ((ShipRequest) this.instance).getCollectedAt();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            @Deprecated
            public Map<String, String> getData() {
                return getDataMap();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public int getDataCount() {
                return ((ShipRequest) this.instance).getDataMap().size();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public Map<String, String> getDataMap() {
                return Collections.unmodifiableMap(((ShipRequest) this.instance).getDataMap());
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public String getDataOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> dataMap = ((ShipRequest) this.instance).getDataMap();
                return dataMap.containsKey(str) ? dataMap.get(str) : str2;
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public String getDataOrThrow(String str) {
                str.getClass();
                Map<String, String> dataMap = ((ShipRequest) this.instance).getDataMap();
                if (dataMap.containsKey(str)) {
                    return dataMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public Geoloc getGeoloc(int i10) {
                return ((ShipRequest) this.instance).getGeoloc(i10);
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public int getGeolocCount() {
                return ((ShipRequest) this.instance).getGeolocCount();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public List<Geoloc> getGeolocList() {
                return Collections.unmodifiableList(((ShipRequest) this.instance).getGeolocList());
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public String getUuid() {
                return ((ShipRequest) this.instance).getUuid();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((ShipRequest) this.instance).getUuidBytes();
            }

            @Override // ac.Xchange.ShipRequestOrBuilder
            public boolean hasCollectedAt() {
                return ((ShipRequest) this.instance).hasCollectedAt();
            }

            public Builder mergeCollectedAt(Timestamp timestamp) {
                copyOnWrite();
                ((ShipRequest) this.instance).mergeCollectedAt(timestamp);
                return this;
            }

            public Builder putAllData(Map<String, String> map) {
                copyOnWrite();
                ((ShipRequest) this.instance).getMutableDataMap().putAll(map);
                return this;
            }

            public Builder putData(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((ShipRequest) this.instance).getMutableDataMap().put(str, str2);
                return this;
            }

            public Builder removeData(String str) {
                str.getClass();
                copyOnWrite();
                ((ShipRequest) this.instance).getMutableDataMap().remove(str);
                return this;
            }

            public Builder removeGeoloc(int i10) {
                copyOnWrite();
                ((ShipRequest) this.instance).removeGeoloc(i10);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((ShipRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ShipRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setCollectedAt(Timestamp timestamp) {
                copyOnWrite();
                ((ShipRequest) this.instance).setCollectedAt(timestamp);
                return this;
            }

            public Builder setGeoloc(int i10, Geoloc geoloc) {
                copyOnWrite();
                ((ShipRequest) this.instance).setGeoloc(i10, geoloc);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((ShipRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ShipRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(ShipRequest.DEFAULT_INSTANCE);
            }

            public Builder addGeoloc(int i10, Geoloc geoloc) {
                copyOnWrite();
                ((ShipRequest) this.instance).addGeoloc(i10, geoloc);
                return this;
            }

            public Builder setCollectedAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((ShipRequest) this.instance).setCollectedAt(builder.build());
                return this;
            }

            public Builder setGeoloc(int i10, Geoloc.Builder builder) {
                copyOnWrite();
                ((ShipRequest) this.instance).setGeoloc(i10, builder.build());
                return this;
            }

            public Builder addGeoloc(Geoloc.Builder builder) {
                copyOnWrite();
                ((ShipRequest) this.instance).addGeoloc(builder.build());
                return this;
            }

            public Builder addGeoloc(int i10, Geoloc.Builder builder) {
                copyOnWrite();
                ((ShipRequest) this.instance).addGeoloc(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DataDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private DataDefaultEntryHolder() {
            }
        }

        static {
            ShipRequest shipRequest = new ShipRequest();
            DEFAULT_INSTANCE = shipRequest;
            GeneratedMessageLite.registerDefaultInstance(ShipRequest.class, shipRequest);
        }

        private ShipRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGeoloc(Iterable<? extends Geoloc> iterable) {
            ensureGeolocIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.geoloc_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeoloc(Geoloc geoloc) {
            geoloc.getClass();
            ensureGeolocIsMutable();
            this.geoloc_.add(geoloc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectedAt() {
            this.collectedAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeoloc() {
            this.geoloc_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        private void ensureGeolocIsMutable() {
            Internal.ProtobufList<Geoloc> protobufList = this.geoloc_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.geoloc_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ShipRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableDataMap() {
            return internalGetMutableData();
        }

        private MapFieldLite<String, String> internalGetData() {
            return this.data_;
        }

        private MapFieldLite<String, String> internalGetMutableData() {
            if (!this.data_.isMutable()) {
                this.data_ = this.data_.mutableCopy();
            }
            return this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCollectedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.collectedAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.collectedAt_ = timestamp;
            } else {
                this.collectedAt_ = Timestamp.newBuilder(this.collectedAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ShipRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ShipRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShipRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ShipRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeGeoloc(int i10) {
            ensureGeolocIsMutable();
            this.geoloc_.remove(i10);
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
        public void setCollectedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.collectedAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeoloc(int i10, Geoloc geoloc) {
            geoloc.getClass();
            ensureGeolocIsMutable();
            this.geoloc_.set(i10, geoloc);
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

        @Override // ac.Xchange.ShipRequestOrBuilder
        public boolean containsData(String str) {
            str.getClass();
            return internalGetData().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ShipRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004\u001b\u0005\t", new Object[]{"uuid_", "appKey_", "data_", DataDefaultEntryHolder.defaultEntry, "geoloc_", Geoloc.class, "collectedAt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ShipRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ShipRequest.class) {
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

        @Override // ac.Xchange.ShipRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public Timestamp getCollectedAt() {
            Timestamp timestamp = this.collectedAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        @Deprecated
        public Map<String, String> getData() {
            return getDataMap();
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public int getDataCount() {
            return internalGetData().size();
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public Map<String, String> getDataMap() {
            return Collections.unmodifiableMap(internalGetData());
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public String getDataOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetData = internalGetData();
            return mapFieldLiteInternalGetData.containsKey(str) ? mapFieldLiteInternalGetData.get(str) : str2;
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public String getDataOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetData = internalGetData();
            if (mapFieldLiteInternalGetData.containsKey(str)) {
                return mapFieldLiteInternalGetData.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public Geoloc getGeoloc(int i10) {
            return this.geoloc_.get(i10);
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public int getGeolocCount() {
            return this.geoloc_.size();
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public List<Geoloc> getGeolocList() {
            return this.geoloc_;
        }

        public GeolocOrBuilder getGeolocOrBuilder(int i10) {
            return this.geoloc_.get(i10);
        }

        public List<? extends GeolocOrBuilder> getGeolocOrBuilderList() {
            return this.geoloc_;
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Xchange.ShipRequestOrBuilder
        public boolean hasCollectedAt() {
            return this.collectedAt_ != null;
        }

        public static Builder newBuilder(ShipRequest shipRequest) {
            return DEFAULT_INSTANCE.createBuilder(shipRequest);
        }

        public static ShipRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ShipRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShipRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ShipRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeoloc(int i10, Geoloc geoloc) {
            geoloc.getClass();
            ensureGeolocIsMutable();
            this.geoloc_.add(i10, geoloc);
        }

        public static ShipRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ShipRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShipRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ShipRequest parseFrom(InputStream inputStream) throws IOException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShipRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShipRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ShipRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ShipRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ShipRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsData(String str);

        String getAppKey();

        ByteString getAppKeyBytes();

        Timestamp getCollectedAt();

        @Deprecated
        Map<String, String> getData();

        int getDataCount();

        Map<String, String> getDataMap();

        String getDataOrDefault(String str, String str2);

        String getDataOrThrow(String str);

        Geoloc getGeoloc(int i10);

        int getGeolocCount();

        List<Geoloc> getGeolocList();

        String getUuid();

        ByteString getUuidBytes();

        boolean hasCollectedAt();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class XchangeFeederRequest extends GeneratedMessageLite<XchangeFeederRequest, Builder> implements XchangeFeederRequestOrBuilder {
        public static final int APP_KEY_FIELD_NUMBER = 2;
        public static final int COLLECTED_AT_FIELD_NUMBER = 4;
        public static final int CONSENT_STRING_FIELD_NUMBER = 5;
        public static final int DATA_FIELD_NUMBER = 3;
        private static final XchangeFeederRequest DEFAULT_INSTANCE;
        private static volatile Parser<XchangeFeederRequest> PARSER = null;
        public static final int TO_SO_ID_FIELD_NUMBER = 6;
        public static final int UUID_FIELD_NUMBER = 1;
        private Timestamp collectedAt_;
        private MapFieldLite<String, String> data_ = MapFieldLite.emptyMapField();
        private String uuid_ = "";
        private String appKey_ = "";
        private String consentString_ = "";
        private String toSoId_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<XchangeFeederRequest, Builder> implements XchangeFeederRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppKey() {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).clearAppKey();
                return this;
            }

            public Builder clearCollectedAt() {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).clearCollectedAt();
                return this;
            }

            public Builder clearConsentString() {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).clearConsentString();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).getMutableDataMap().clear();
                return this;
            }

            public Builder clearToSoId() {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).clearToSoId();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).clearUuid();
                return this;
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public boolean containsData(String str) {
                str.getClass();
                return ((XchangeFeederRequest) this.instance).getDataMap().containsKey(str);
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public String getAppKey() {
                return ((XchangeFeederRequest) this.instance).getAppKey();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public ByteString getAppKeyBytes() {
                return ((XchangeFeederRequest) this.instance).getAppKeyBytes();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public Timestamp getCollectedAt() {
                return ((XchangeFeederRequest) this.instance).getCollectedAt();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public String getConsentString() {
                return ((XchangeFeederRequest) this.instance).getConsentString();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public ByteString getConsentStringBytes() {
                return ((XchangeFeederRequest) this.instance).getConsentStringBytes();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            @Deprecated
            public Map<String, String> getData() {
                return getDataMap();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public int getDataCount() {
                return ((XchangeFeederRequest) this.instance).getDataMap().size();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public Map<String, String> getDataMap() {
                return Collections.unmodifiableMap(((XchangeFeederRequest) this.instance).getDataMap());
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public String getDataOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> dataMap = ((XchangeFeederRequest) this.instance).getDataMap();
                return dataMap.containsKey(str) ? dataMap.get(str) : str2;
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public String getDataOrThrow(String str) {
                str.getClass();
                Map<String, String> dataMap = ((XchangeFeederRequest) this.instance).getDataMap();
                if (dataMap.containsKey(str)) {
                    return dataMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public String getToSoId() {
                return ((XchangeFeederRequest) this.instance).getToSoId();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public ByteString getToSoIdBytes() {
                return ((XchangeFeederRequest) this.instance).getToSoIdBytes();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public String getUuid() {
                return ((XchangeFeederRequest) this.instance).getUuid();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public ByteString getUuidBytes() {
                return ((XchangeFeederRequest) this.instance).getUuidBytes();
            }

            @Override // ac.Xchange.XchangeFeederRequestOrBuilder
            public boolean hasCollectedAt() {
                return ((XchangeFeederRequest) this.instance).hasCollectedAt();
            }

            public Builder mergeCollectedAt(Timestamp timestamp) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).mergeCollectedAt(timestamp);
                return this;
            }

            public Builder putAllData(Map<String, String> map) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).getMutableDataMap().putAll(map);
                return this;
            }

            public Builder putData(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).getMutableDataMap().put(str, str2);
                return this;
            }

            public Builder removeData(String str) {
                str.getClass();
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).getMutableDataMap().remove(str);
                return this;
            }

            public Builder setAppKey(String str) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setAppKey(str);
                return this;
            }

            public Builder setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setAppKeyBytes(byteString);
                return this;
            }

            public Builder setCollectedAt(Timestamp timestamp) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setCollectedAt(timestamp);
                return this;
            }

            public Builder setConsentString(String str) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setConsentString(str);
                return this;
            }

            public Builder setConsentStringBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setConsentStringBytes(byteString);
                return this;
            }

            public Builder setToSoId(String str) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setToSoId(str);
                return this;
            }

            public Builder setToSoIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setToSoIdBytes(byteString);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setUuidBytes(byteString);
                return this;
            }

            private Builder() {
                super(XchangeFeederRequest.DEFAULT_INSTANCE);
            }

            public Builder setCollectedAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((XchangeFeederRequest) this.instance).setCollectedAt(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DataDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private DataDefaultEntryHolder() {
            }
        }

        static {
            XchangeFeederRequest xchangeFeederRequest = new XchangeFeederRequest();
            DEFAULT_INSTANCE = xchangeFeederRequest;
            GeneratedMessageLite.registerDefaultInstance(XchangeFeederRequest.class, xchangeFeederRequest);
        }

        private XchangeFeederRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppKey() {
            this.appKey_ = getDefaultInstance().getAppKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectedAt() {
            this.collectedAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentString() {
            this.consentString_ = getDefaultInstance().getConsentString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToSoId() {
            this.toSoId_ = getDefaultInstance().getToSoId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static XchangeFeederRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableDataMap() {
            return internalGetMutableData();
        }

        private MapFieldLite<String, String> internalGetData() {
            return this.data_;
        }

        private MapFieldLite<String, String> internalGetMutableData() {
            if (!this.data_.isMutable()) {
                this.data_ = this.data_.mutableCopy();
            }
            return this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCollectedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.collectedAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.collectedAt_ = timestamp;
            } else {
                this.collectedAt_ = Timestamp.newBuilder(this.collectedAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static XchangeFeederRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XchangeFeederRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<XchangeFeederRequest> parser() {
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
        public void setCollectedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.collectedAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentString(String str) {
            str.getClass();
            this.consentString_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentStringBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.consentString_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToSoId(String str) {
            str.getClass();
            this.toSoId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToSoIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.toSoId_ = byteString.toStringUtf8();
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

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public boolean containsData(String str) {
            str.getClass();
            return internalGetData().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new XchangeFeederRequest();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004\t\u0005Ȉ\u0006Ȉ", new Object[]{"uuid_", "appKey_", "data_", DataDefaultEntryHolder.defaultEntry, "collectedAt_", "consentString_", "toSoId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<XchangeFeederRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (XchangeFeederRequest.class) {
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

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public String getAppKey() {
            return this.appKey_;
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public ByteString getAppKeyBytes() {
            return ByteString.copyFromUtf8(this.appKey_);
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public Timestamp getCollectedAt() {
            Timestamp timestamp = this.collectedAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public String getConsentString() {
            return this.consentString_;
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public ByteString getConsentStringBytes() {
            return ByteString.copyFromUtf8(this.consentString_);
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        @Deprecated
        public Map<String, String> getData() {
            return getDataMap();
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public int getDataCount() {
            return internalGetData().size();
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public Map<String, String> getDataMap() {
            return Collections.unmodifiableMap(internalGetData());
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public String getDataOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetData = internalGetData();
            return mapFieldLiteInternalGetData.containsKey(str) ? mapFieldLiteInternalGetData.get(str) : str2;
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public String getDataOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetData = internalGetData();
            if (mapFieldLiteInternalGetData.containsKey(str)) {
                return mapFieldLiteInternalGetData.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public String getToSoId() {
            return this.toSoId_;
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public ByteString getToSoIdBytes() {
            return ByteString.copyFromUtf8(this.toSoId_);
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Xchange.XchangeFeederRequestOrBuilder
        public boolean hasCollectedAt() {
            return this.collectedAt_ != null;
        }

        public static Builder newBuilder(XchangeFeederRequest xchangeFeederRequest) {
            return DEFAULT_INSTANCE.createBuilder(xchangeFeederRequest);
        }

        public static XchangeFeederRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XchangeFeederRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static XchangeFeederRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static XchangeFeederRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static XchangeFeederRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static XchangeFeederRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static XchangeFeederRequest parseFrom(InputStream inputStream) throws IOException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XchangeFeederRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XchangeFeederRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static XchangeFeederRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (XchangeFeederRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface XchangeFeederRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsData(String str);

        String getAppKey();

        ByteString getAppKeyBytes();

        Timestamp getCollectedAt();

        String getConsentString();

        ByteString getConsentStringBytes();

        @Deprecated
        Map<String, String> getData();

        int getDataCount();

        Map<String, String> getDataMap();

        String getDataOrDefault(String str, String str2);

        String getDataOrThrow(String str);

        String getToSoId();

        ByteString getToSoIdBytes();

        String getUuid();

        ByteString getUuidBytes();

        boolean hasCollectedAt();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class XchangeMsgV2 extends GeneratedMessageLite<XchangeMsgV2, Builder> implements XchangeMsgV2OrBuilder {
        private static final XchangeMsgV2 DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 4;
        public static final int METADATA_FIELD_NUMBER = 1;
        private static volatile Parser<XchangeMsgV2> PARSER = null;
        public static final int SHIPREQUEST_FIELD_NUMBER = 2;
        public static final int XCHANGEFEEDERREQUEST_FIELD_NUMBER = 3;
        private int contentCase_ = 0;
        private Object content_;
        private Metadata metadata_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<XchangeMsgV2, Builder> implements XchangeMsgV2OrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).clearContent();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).clearExternalIds();
                return this;
            }

            public Builder clearMetadata() {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).clearMetadata();
                return this;
            }

            public Builder clearShipRequest() {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).clearShipRequest();
                return this;
            }

            public Builder clearXchangeFeederRequest() {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).clearXchangeFeederRequest();
                return this;
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public ContentCase getContentCase() {
                return ((XchangeMsgV2) this.instance).getContentCase();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public ExternalIds getExternalIds() {
                return ((XchangeMsgV2) this.instance).getExternalIds();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public Metadata getMetadata() {
                return ((XchangeMsgV2) this.instance).getMetadata();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public ShipRequest getShipRequest() {
                return ((XchangeMsgV2) this.instance).getShipRequest();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public XchangeFeederRequest getXchangeFeederRequest() {
                return ((XchangeMsgV2) this.instance).getXchangeFeederRequest();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public boolean hasExternalIds() {
                return ((XchangeMsgV2) this.instance).hasExternalIds();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public boolean hasMetadata() {
                return ((XchangeMsgV2) this.instance).hasMetadata();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public boolean hasShipRequest() {
                return ((XchangeMsgV2) this.instance).hasShipRequest();
            }

            @Override // ac.Xchange.XchangeMsgV2OrBuilder
            public boolean hasXchangeFeederRequest() {
                return ((XchangeMsgV2) this.instance).hasXchangeFeederRequest();
            }

            public Builder mergeExternalIds(ExternalIds externalIds) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).mergeExternalIds(externalIds);
                return this;
            }

            public Builder mergeMetadata(Metadata metadata) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).mergeMetadata(metadata);
                return this;
            }

            public Builder mergeShipRequest(ShipRequest shipRequest) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).mergeShipRequest(shipRequest);
                return this;
            }

            public Builder mergeXchangeFeederRequest(XchangeFeederRequest xchangeFeederRequest) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).mergeXchangeFeederRequest(xchangeFeederRequest);
                return this;
            }

            public Builder setExternalIds(ExternalIds externalIds) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setExternalIds(externalIds);
                return this;
            }

            public Builder setMetadata(Metadata metadata) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setMetadata(metadata);
                return this;
            }

            public Builder setShipRequest(ShipRequest shipRequest) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setShipRequest(shipRequest);
                return this;
            }

            public Builder setXchangeFeederRequest(XchangeFeederRequest xchangeFeederRequest) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setXchangeFeederRequest(xchangeFeederRequest);
                return this;
            }

            private Builder() {
                super(XchangeMsgV2.DEFAULT_INSTANCE);
            }

            public Builder setExternalIds(ExternalIds.Builder builder) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setExternalIds(builder.build());
                return this;
            }

            public Builder setMetadata(Metadata.Builder builder) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setMetadata(builder.build());
                return this;
            }

            public Builder setShipRequest(ShipRequest.Builder builder) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setShipRequest(builder.build());
                return this;
            }

            public Builder setXchangeFeederRequest(XchangeFeederRequest.Builder builder) {
                copyOnWrite();
                ((XchangeMsgV2) this.instance).setXchangeFeederRequest(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes.dex */
        public enum ContentCase {
            SHIPREQUEST(2),
            XCHANGEFEEDERREQUEST(3),
            EXTERNAL_IDS(4),
            CONTENT_NOT_SET(0);

            private final int value;

            ContentCase(int i10) {
                this.value = i10;
            }

            public static ContentCase forNumber(int i10) {
                if (i10 == 0) {
                    return CONTENT_NOT_SET;
                }
                if (i10 == 2) {
                    return SHIPREQUEST;
                }
                if (i10 == 3) {
                    return XCHANGEFEEDERREQUEST;
                }
                if (i10 != 4) {
                    return null;
                }
                return EXTERNAL_IDS;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ContentCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            XchangeMsgV2 xchangeMsgV2 = new XchangeMsgV2();
            DEFAULT_INSTANCE = xchangeMsgV2;
            GeneratedMessageLite.registerDefaultInstance(XchangeMsgV2.class, xchangeMsgV2);
        }

        private XchangeMsgV2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.contentCase_ = 0;
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExternalIds() {
            if (this.contentCase_ == 4) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadata() {
            this.metadata_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShipRequest() {
            if (this.contentCase_ == 2) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXchangeFeederRequest() {
            if (this.contentCase_ == 3) {
                this.contentCase_ = 0;
                this.content_ = null;
            }
        }

        public static XchangeMsgV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExternalIds(ExternalIds externalIds) {
            externalIds.getClass();
            if (this.contentCase_ != 4 || this.content_ == ExternalIds.getDefaultInstance()) {
                this.content_ = externalIds;
            } else {
                this.content_ = ExternalIds.newBuilder((ExternalIds) this.content_).mergeFrom((ExternalIds.Builder) externalIds).buildPartial();
            }
            this.contentCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMetadata(Metadata metadata) {
            metadata.getClass();
            Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.Builder) metadata).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShipRequest(ShipRequest shipRequest) {
            shipRequest.getClass();
            if (this.contentCase_ != 2 || this.content_ == ShipRequest.getDefaultInstance()) {
                this.content_ = shipRequest;
            } else {
                this.content_ = ShipRequest.newBuilder((ShipRequest) this.content_).mergeFrom((ShipRequest.Builder) shipRequest).buildPartial();
            }
            this.contentCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeXchangeFeederRequest(XchangeFeederRequest xchangeFeederRequest) {
            xchangeFeederRequest.getClass();
            if (this.contentCase_ != 3 || this.content_ == XchangeFeederRequest.getDefaultInstance()) {
                this.content_ = xchangeFeederRequest;
            } else {
                this.content_ = XchangeFeederRequest.newBuilder((XchangeFeederRequest) this.content_).mergeFrom((XchangeFeederRequest.Builder) xchangeFeederRequest).buildPartial();
            }
            this.contentCase_ = 3;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static XchangeMsgV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (XchangeMsgV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XchangeMsgV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<XchangeMsgV2> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExternalIds(ExternalIds externalIds) {
            externalIds.getClass();
            this.content_ = externalIds;
            this.contentCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadata(Metadata metadata) {
            metadata.getClass();
            this.metadata_ = metadata;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShipRequest(ShipRequest shipRequest) {
            shipRequest.getClass();
            this.content_ = shipRequest;
            this.contentCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXchangeFeederRequest(XchangeFeederRequest xchangeFeederRequest) {
            xchangeFeederRequest.getClass();
            this.content_ = xchangeFeederRequest;
            this.contentCase_ = 3;
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public ContentCase getContentCase() {
            return ContentCase.forNumber(this.contentCase_);
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public ExternalIds getExternalIds() {
            return this.contentCase_ == 4 ? (ExternalIds) this.content_ : ExternalIds.getDefaultInstance();
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public Metadata getMetadata() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.getDefaultInstance() : metadata;
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public ShipRequest getShipRequest() {
            return this.contentCase_ == 2 ? (ShipRequest) this.content_ : ShipRequest.getDefaultInstance();
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public XchangeFeederRequest getXchangeFeederRequest() {
            return this.contentCase_ == 3 ? (XchangeFeederRequest) this.content_ : XchangeFeederRequest.getDefaultInstance();
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public boolean hasExternalIds() {
            return this.contentCase_ == 4;
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public boolean hasMetadata() {
            return this.metadata_ != null;
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public boolean hasShipRequest() {
            return this.contentCase_ == 2;
        }

        @Override // ac.Xchange.XchangeMsgV2OrBuilder
        public boolean hasXchangeFeederRequest() {
            return this.contentCase_ == 3;
        }

        public static Builder newBuilder(XchangeMsgV2 xchangeMsgV2) {
            return DEFAULT_INSTANCE.createBuilder(xchangeMsgV2);
        }

        public static XchangeMsgV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (XchangeMsgV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XchangeMsgV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new XchangeMsgV2();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{duhsDlGWdBkekB.ZFsoqLYtLHcA, "contentCase_", "metadata_", ShipRequest.class, XchangeFeederRequest.class, ExternalIds.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<XchangeMsgV2> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (XchangeMsgV2.class) {
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

        public static XchangeMsgV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static XchangeMsgV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static XchangeMsgV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static XchangeMsgV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static XchangeMsgV2 parseFrom(InputStream inputStream) throws IOException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XchangeMsgV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XchangeMsgV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static XchangeMsgV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (XchangeMsgV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface XchangeMsgV2OrBuilder extends MessageLiteOrBuilder {
        XchangeMsgV2.ContentCase getContentCase();

        ExternalIds getExternalIds();

        Metadata getMetadata();

        ShipRequest getShipRequest();

        XchangeFeederRequest getXchangeFeederRequest();

        boolean hasExternalIds();

        boolean hasMetadata();

        boolean hasShipRequest();

        boolean hasXchangeFeederRequest();
    }

    private Xchange() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
