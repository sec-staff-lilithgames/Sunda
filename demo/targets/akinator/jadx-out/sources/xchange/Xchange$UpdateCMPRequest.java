package xchange;

import ac.Server;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.v;
import ix.y;
import ix.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Xchange$UpdateCMPRequest extends GeneratedMessageLite<Xchange$UpdateCMPRequest, y> implements z {
    public static final int CMP_FIELD_NUMBER = 1;
    private static final Xchange$UpdateCMPRequest DEFAULT_INSTANCE;
    private static volatile Parser<Xchange$UpdateCMPRequest> PARSER;
    private Server.CMP cmp_;

    static {
        Xchange$UpdateCMPRequest xchange$UpdateCMPRequest = new Xchange$UpdateCMPRequest();
        DEFAULT_INSTANCE = xchange$UpdateCMPRequest;
        GeneratedMessageLite.registerDefaultInstance(Xchange$UpdateCMPRequest.class, xchange$UpdateCMPRequest);
    }

    private Xchange$UpdateCMPRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmp() {
        this.cmp_ = null;
    }

    public static Xchange$UpdateCMPRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCmp(Server.CMP cmp) {
        cmp.getClass();
        Server.CMP cmp2 = this.cmp_;
        if (cmp2 == null || cmp2 == Server.CMP.getDefaultInstance()) {
            this.cmp_ = cmp;
        } else {
            this.cmp_ = Server.CMP.newBuilder(this.cmp_).mergeFrom((Server.CMP.Builder) cmp).buildPartial();
        }
    }

    public static y newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Xchange$UpdateCMPRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$UpdateCMPRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Xchange$UpdateCMPRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmp(Server.CMP cmp) {
        cmp.getClass();
        this.cmp_ = cmp;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f68440a[methodToInvoke.ordinal()]) {
            case 1:
                return new Xchange$UpdateCMPRequest();
            case 2:
                return new y(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"cmp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Xchange$UpdateCMPRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Xchange$UpdateCMPRequest.class) {
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

    @Override // ix.z
    public Server.CMP getCmp() {
        Server.CMP cmp = this.cmp_;
        return cmp == null ? Server.CMP.getDefaultInstance() : cmp;
    }

    @Override // ix.z
    public boolean hasCmp() {
        return this.cmp_ != null;
    }

    public static y newBuilder(Xchange$UpdateCMPRequest xchange$UpdateCMPRequest) {
        return DEFAULT_INSTANCE.createBuilder(xchange$UpdateCMPRequest);
    }

    public static Xchange$UpdateCMPRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Xchange$UpdateCMPRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Xchange$UpdateCMPRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPRequest parseFrom(InputStream inputStream) throws IOException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$UpdateCMPRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Xchange$UpdateCMPRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$UpdateCMPRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
