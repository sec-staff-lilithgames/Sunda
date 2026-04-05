package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import wk.n;
import wk.o;
import wk.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Fraction extends GeneratedMessageLite<Fraction, o> implements p {
    private static final Fraction DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile Parser<Fraction> PARSER;
    private long denominator_;
    private long numerator_;

    static {
        Fraction fraction = new Fraction();
        DEFAULT_INSTANCE = fraction;
        GeneratedMessageLite.registerDefaultInstance(Fraction.class, fraction);
    }

    private Fraction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDenominator() {
        this.denominator_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumerator() {
        this.numerator_ = 0L;
    }

    public static Fraction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Fraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Fraction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDenominator(long j10) {
        this.denominator_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumerator(long j10) {
        this.numerator_ = j10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (n.f90691a[methodToInvoke.ordinal()]) {
            case 1:
                return new Fraction();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Fraction> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Fraction.class) {
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

    @Override // wk.p
    public long getDenominator() {
        return this.denominator_;
    }

    @Override // wk.p
    public long getNumerator() {
        return this.numerator_;
    }

    public static o newBuilder(Fraction fraction) {
        return DEFAULT_INSTANCE.createBuilder(fraction);
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Fraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Fraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Fraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Fraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Fraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Fraction parseFrom(InputStream inputStream) throws IOException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Fraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Fraction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Fraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Fraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
