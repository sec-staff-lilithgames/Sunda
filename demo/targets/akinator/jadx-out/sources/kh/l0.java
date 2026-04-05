package kh;

import com.google.api.ContextRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l0 extends GeneratedMessageLite.Builder implements m0 {
    public l0 addAllAllowedRequestExtensions(Iterable<String> iterable) {
        copyOnWrite();
        ((ContextRule) this.instance).addAllAllowedRequestExtensions(iterable);
        return this;
    }

    public l0 addAllAllowedResponseExtensions(Iterable<String> iterable) {
        copyOnWrite();
        ((ContextRule) this.instance).addAllAllowedResponseExtensions(iterable);
        return this;
    }

    public l0 addAllProvided(Iterable<String> iterable) {
        copyOnWrite();
        ((ContextRule) this.instance).addAllProvided(iterable);
        return this;
    }

    public l0 addAllRequested(Iterable<String> iterable) {
        copyOnWrite();
        ((ContextRule) this.instance).addAllRequested(iterable);
        return this;
    }

    public l0 addAllowedRequestExtensions(String str) {
        copyOnWrite();
        ((ContextRule) this.instance).addAllowedRequestExtensions(str);
        return this;
    }

    public l0 addAllowedRequestExtensionsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ContextRule) this.instance).addAllowedRequestExtensionsBytes(byteString);
        return this;
    }

    public l0 addAllowedResponseExtensions(String str) {
        copyOnWrite();
        ((ContextRule) this.instance).addAllowedResponseExtensions(str);
        return this;
    }

    public l0 addAllowedResponseExtensionsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ContextRule) this.instance).addAllowedResponseExtensionsBytes(byteString);
        return this;
    }

    public l0 addProvided(String str) {
        copyOnWrite();
        ((ContextRule) this.instance).addProvided(str);
        return this;
    }

    public l0 addProvidedBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ContextRule) this.instance).addProvidedBytes(byteString);
        return this;
    }

    public l0 addRequested(String str) {
        copyOnWrite();
        ((ContextRule) this.instance).addRequested(str);
        return this;
    }

    public l0 addRequestedBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ContextRule) this.instance).addRequestedBytes(byteString);
        return this;
    }

    public l0 clearAllowedRequestExtensions() {
        copyOnWrite();
        ((ContextRule) this.instance).clearAllowedRequestExtensions();
        return this;
    }

    public l0 clearAllowedResponseExtensions() {
        copyOnWrite();
        ((ContextRule) this.instance).clearAllowedResponseExtensions();
        return this;
    }

    public l0 clearProvided() {
        copyOnWrite();
        ((ContextRule) this.instance).clearProvided();
        return this;
    }

    public l0 clearRequested() {
        copyOnWrite();
        ((ContextRule) this.instance).clearRequested();
        return this;
    }

    public l0 clearSelector() {
        copyOnWrite();
        ((ContextRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.m0
    public String getAllowedRequestExtensions(int i10) {
        return ((ContextRule) this.instance).getAllowedRequestExtensions(i10);
    }

    @Override // kh.m0
    public ByteString getAllowedRequestExtensionsBytes(int i10) {
        return ((ContextRule) this.instance).getAllowedRequestExtensionsBytes(i10);
    }

    @Override // kh.m0
    public int getAllowedRequestExtensionsCount() {
        return ((ContextRule) this.instance).getAllowedRequestExtensionsCount();
    }

    @Override // kh.m0
    public List<String> getAllowedRequestExtensionsList() {
        return Collections.unmodifiableList(((ContextRule) this.instance).getAllowedRequestExtensionsList());
    }

    @Override // kh.m0
    public String getAllowedResponseExtensions(int i10) {
        return ((ContextRule) this.instance).getAllowedResponseExtensions(i10);
    }

    @Override // kh.m0
    public ByteString getAllowedResponseExtensionsBytes(int i10) {
        return ((ContextRule) this.instance).getAllowedResponseExtensionsBytes(i10);
    }

    @Override // kh.m0
    public int getAllowedResponseExtensionsCount() {
        return ((ContextRule) this.instance).getAllowedResponseExtensionsCount();
    }

    @Override // kh.m0
    public List<String> getAllowedResponseExtensionsList() {
        return Collections.unmodifiableList(((ContextRule) this.instance).getAllowedResponseExtensionsList());
    }

    @Override // kh.m0
    public String getProvided(int i10) {
        return ((ContextRule) this.instance).getProvided(i10);
    }

    @Override // kh.m0
    public ByteString getProvidedBytes(int i10) {
        return ((ContextRule) this.instance).getProvidedBytes(i10);
    }

    @Override // kh.m0
    public int getProvidedCount() {
        return ((ContextRule) this.instance).getProvidedCount();
    }

    @Override // kh.m0
    public List<String> getProvidedList() {
        return Collections.unmodifiableList(((ContextRule) this.instance).getProvidedList());
    }

    @Override // kh.m0
    public String getRequested(int i10) {
        return ((ContextRule) this.instance).getRequested(i10);
    }

    @Override // kh.m0
    public ByteString getRequestedBytes(int i10) {
        return ((ContextRule) this.instance).getRequestedBytes(i10);
    }

    @Override // kh.m0
    public int getRequestedCount() {
        return ((ContextRule) this.instance).getRequestedCount();
    }

    @Override // kh.m0
    public List<String> getRequestedList() {
        return Collections.unmodifiableList(((ContextRule) this.instance).getRequestedList());
    }

    @Override // kh.m0
    public String getSelector() {
        return ((ContextRule) this.instance).getSelector();
    }

    @Override // kh.m0
    public ByteString getSelectorBytes() {
        return ((ContextRule) this.instance).getSelectorBytes();
    }

    public l0 setAllowedRequestExtensions(int i10, String str) {
        copyOnWrite();
        ((ContextRule) this.instance).setAllowedRequestExtensions(i10, str);
        return this;
    }

    public l0 setAllowedResponseExtensions(int i10, String str) {
        copyOnWrite();
        ((ContextRule) this.instance).setAllowedResponseExtensions(i10, str);
        return this;
    }

    public l0 setProvided(int i10, String str) {
        copyOnWrite();
        ((ContextRule) this.instance).setProvided(i10, str);
        return this;
    }

    public l0 setRequested(int i10, String str) {
        copyOnWrite();
        ((ContextRule) this.instance).setRequested(i10, str);
        return this;
    }

    public l0 setSelector(String str) {
        copyOnWrite();
        ((ContextRule) this.instance).setSelector(str);
        return this;
    }

    public l0 setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ContextRule) this.instance).setSelectorBytes(byteString);
        return this;
    }
}
