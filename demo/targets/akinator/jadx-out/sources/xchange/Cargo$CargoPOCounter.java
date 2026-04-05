package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.a;
import ix.c;
import ix.d;
import ix.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Cargo$CargoPOCounter extends GeneratedMessageLite<Cargo$CargoPOCounter, d> implements e {
    private static final Cargo$CargoPOCounter DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    private static volatile Parser<Cargo$CargoPOCounter> PARSER = null;
    public static final int PURCHARSE_ORDER_FIELD_NUMBER = 1;
    private String purcharseOrder_ = "";
    private Internal.ProtobufList<Cargo$CargoFieldCounter> fields_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Cargo$CargoPOCounter cargo$CargoPOCounter = new Cargo$CargoPOCounter();
        DEFAULT_INSTANCE = cargo$CargoPOCounter;
        GeneratedMessageLite.registerDefaultInstance(Cargo$CargoPOCounter.class, cargo$CargoPOCounter);
    }

    private Cargo$CargoPOCounter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Cargo$CargoFieldCounter> iterable) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        cargo$CargoFieldCounter.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(cargo$CargoFieldCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPurcharseOrder() {
        this.purcharseOrder_ = getDefaultInstance().getPurcharseOrder();
    }

    private void ensureFieldsIsMutable() {
        Internal.ProtobufList<Cargo$CargoFieldCounter> protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Cargo$CargoPOCounter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cargo$CargoPOCounter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$CargoPOCounter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Cargo$CargoPOCounter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i10) {
        ensureFieldsIsMutable();
        this.fields_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i10, Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        cargo$CargoFieldCounter.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i10, cargo$CargoFieldCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurcharseOrder(String str) {
        str.getClass();
        this.purcharseOrder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurcharseOrderBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.purcharseOrder_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f68431a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cargo$CargoPOCounter();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"purcharseOrder_", "fields_", Cargo$CargoFieldCounter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cargo$CargoPOCounter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cargo$CargoPOCounter.class) {
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

    @Override // ix.e
    public Cargo$CargoFieldCounter getFields(int i10) {
        return this.fields_.get(i10);
    }

    @Override // ix.e
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // ix.e
    public List<Cargo$CargoFieldCounter> getFieldsList() {
        return this.fields_;
    }

    public c getFieldsOrBuilder(int i10) {
        return this.fields_.get(i10);
    }

    public List<? extends c> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // ix.e
    public String getPurcharseOrder() {
        return this.purcharseOrder_;
    }

    @Override // ix.e
    public ByteString getPurcharseOrderBytes() {
        return ByteString.copyFromUtf8(this.purcharseOrder_);
    }

    public static d newBuilder(Cargo$CargoPOCounter cargo$CargoPOCounter) {
        return DEFAULT_INSTANCE.createBuilder(cargo$CargoPOCounter);
    }

    public static Cargo$CargoPOCounter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$CargoPOCounter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Cargo$CargoPOCounter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i10, Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        cargo$CargoFieldCounter.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i10, cargo$CargoFieldCounter);
    }

    public static Cargo$CargoPOCounter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cargo$CargoPOCounter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cargo$CargoPOCounter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cargo$CargoPOCounter parseFrom(InputStream inputStream) throws IOException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$CargoPOCounter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$CargoPOCounter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cargo$CargoPOCounter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$CargoPOCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
