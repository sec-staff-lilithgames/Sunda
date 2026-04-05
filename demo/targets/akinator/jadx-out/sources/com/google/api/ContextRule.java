package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kh.k0;
import kh.l0;
import kh.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ContextRule extends GeneratedMessageLite<ContextRule, l0> implements m0 {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile Parser<ContextRule> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private Internal.ProtobufList<String> requested_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> provided_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, contextRule);
    }

    private ContextRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.allowedRequestExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.allowedResponseExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.provided_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.requested_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvided(String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvidedBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureProvidedIsMutable();
        this.provided_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequested(String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequestedBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureRequestedIsMutable();
        this.requested_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.allowedRequestExtensions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.allowedRequestExtensions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.allowedResponseExtensions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.allowedResponseExtensions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureProvidedIsMutable() {
        Internal.ProtobufList<String> protobufList = this.provided_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.provided_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRequestedIsMutable() {
        Internal.ProtobufList<String> protobufList = this.requested_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.requested_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ContextRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i10, String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i10, String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvided(int i10, String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequested(int i10, String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selector_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k0.f71016a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContextRule();
            case 2:
                return new l0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContextRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ContextRule.class) {
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

    @Override // kh.m0
    public String getAllowedRequestExtensions(int i10) {
        return this.allowedRequestExtensions_.get(i10);
    }

    @Override // kh.m0
    public ByteString getAllowedRequestExtensionsBytes(int i10) {
        return ByteString.copyFromUtf8(this.allowedRequestExtensions_.get(i10));
    }

    @Override // kh.m0
    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    @Override // kh.m0
    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    @Override // kh.m0
    public String getAllowedResponseExtensions(int i10) {
        return this.allowedResponseExtensions_.get(i10);
    }

    @Override // kh.m0
    public ByteString getAllowedResponseExtensionsBytes(int i10) {
        return ByteString.copyFromUtf8(this.allowedResponseExtensions_.get(i10));
    }

    @Override // kh.m0
    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    @Override // kh.m0
    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    @Override // kh.m0
    public String getProvided(int i10) {
        return this.provided_.get(i10);
    }

    @Override // kh.m0
    public ByteString getProvidedBytes(int i10) {
        return ByteString.copyFromUtf8(this.provided_.get(i10));
    }

    @Override // kh.m0
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override // kh.m0
    public List<String> getProvidedList() {
        return this.provided_;
    }

    @Override // kh.m0
    public String getRequested(int i10) {
        return this.requested_.get(i10);
    }

    @Override // kh.m0
    public ByteString getRequestedBytes(int i10) {
        return ByteString.copyFromUtf8(this.requested_.get(i10));
    }

    @Override // kh.m0
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override // kh.m0
    public List<String> getRequestedList() {
        return this.requested_;
    }

    @Override // kh.m0
    public String getSelector() {
        return this.selector_;
    }

    @Override // kh.m0
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public static l0 newBuilder(ContextRule contextRule) {
        return DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
