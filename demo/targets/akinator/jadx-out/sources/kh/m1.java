package kh;

import com.google.api.CustomHttpPattern;
import com.google.api.HttpRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m1 extends GeneratedMessageLite.Builder implements o1 {
    public m1 addAdditionalBindings(HttpRule httpRule) {
        copyOnWrite();
        ((HttpRule) this.instance).addAdditionalBindings(httpRule);
        return this;
    }

    public m1 addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        copyOnWrite();
        ((HttpRule) this.instance).addAllAdditionalBindings(iterable);
        return this;
    }

    public m1 clearAdditionalBindings() {
        copyOnWrite();
        ((HttpRule) this.instance).clearAdditionalBindings();
        return this;
    }

    public m1 clearBody() {
        copyOnWrite();
        ((HttpRule) this.instance).clearBody();
        return this;
    }

    public m1 clearCustom() {
        copyOnWrite();
        ((HttpRule) this.instance).clearCustom();
        return this;
    }

    public m1 clearDelete() {
        copyOnWrite();
        ((HttpRule) this.instance).clearDelete();
        return this;
    }

    public m1 clearGet() {
        copyOnWrite();
        ((HttpRule) this.instance).clearGet();
        return this;
    }

    public m1 clearPatch() {
        copyOnWrite();
        ((HttpRule) this.instance).clearPatch();
        return this;
    }

    public m1 clearPattern() {
        copyOnWrite();
        ((HttpRule) this.instance).clearPattern();
        return this;
    }

    public m1 clearPost() {
        copyOnWrite();
        ((HttpRule) this.instance).clearPost();
        return this;
    }

    public m1 clearPut() {
        copyOnWrite();
        ((HttpRule) this.instance).clearPut();
        return this;
    }

    public m1 clearResponseBody() {
        copyOnWrite();
        ((HttpRule) this.instance).clearResponseBody();
        return this;
    }

    public m1 clearSelector() {
        copyOnWrite();
        ((HttpRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.o1
    public HttpRule getAdditionalBindings(int i10) {
        return ((HttpRule) this.instance).getAdditionalBindings(i10);
    }

    @Override // kh.o1
    public int getAdditionalBindingsCount() {
        return ((HttpRule) this.instance).getAdditionalBindingsCount();
    }

    @Override // kh.o1
    public List<HttpRule> getAdditionalBindingsList() {
        return Collections.unmodifiableList(((HttpRule) this.instance).getAdditionalBindingsList());
    }

    @Override // kh.o1
    public String getBody() {
        return ((HttpRule) this.instance).getBody();
    }

    @Override // kh.o1
    public ByteString getBodyBytes() {
        return ((HttpRule) this.instance).getBodyBytes();
    }

    @Override // kh.o1
    public CustomHttpPattern getCustom() {
        return ((HttpRule) this.instance).getCustom();
    }

    @Override // kh.o1
    public String getDelete() {
        return ((HttpRule) this.instance).getDelete();
    }

    @Override // kh.o1
    public ByteString getDeleteBytes() {
        return ((HttpRule) this.instance).getDeleteBytes();
    }

    @Override // kh.o1
    public String getGet() {
        return ((HttpRule) this.instance).getGet();
    }

    @Override // kh.o1
    public ByteString getGetBytes() {
        return ((HttpRule) this.instance).getGetBytes();
    }

    @Override // kh.o1
    public String getPatch() {
        return ((HttpRule) this.instance).getPatch();
    }

    @Override // kh.o1
    public ByteString getPatchBytes() {
        return ((HttpRule) this.instance).getPatchBytes();
    }

    @Override // kh.o1
    public n1 getPatternCase() {
        return ((HttpRule) this.instance).getPatternCase();
    }

    @Override // kh.o1
    public String getPost() {
        return ((HttpRule) this.instance).getPost();
    }

    @Override // kh.o1
    public ByteString getPostBytes() {
        return ((HttpRule) this.instance).getPostBytes();
    }

    @Override // kh.o1
    public String getPut() {
        return ((HttpRule) this.instance).getPut();
    }

    @Override // kh.o1
    public ByteString getPutBytes() {
        return ((HttpRule) this.instance).getPutBytes();
    }

    @Override // kh.o1
    public String getResponseBody() {
        return ((HttpRule) this.instance).getResponseBody();
    }

    @Override // kh.o1
    public ByteString getResponseBodyBytes() {
        return ((HttpRule) this.instance).getResponseBodyBytes();
    }

    @Override // kh.o1
    public String getSelector() {
        return ((HttpRule) this.instance).getSelector();
    }

    @Override // kh.o1
    public ByteString getSelectorBytes() {
        return ((HttpRule) this.instance).getSelectorBytes();
    }

    @Override // kh.o1
    public boolean hasCustom() {
        return ((HttpRule) this.instance).hasCustom();
    }

    @Override // kh.o1
    public boolean hasDelete() {
        return ((HttpRule) this.instance).hasDelete();
    }

    @Override // kh.o1
    public boolean hasGet() {
        return ((HttpRule) this.instance).hasGet();
    }

    @Override // kh.o1
    public boolean hasPatch() {
        return ((HttpRule) this.instance).hasPatch();
    }

    @Override // kh.o1
    public boolean hasPost() {
        return ((HttpRule) this.instance).hasPost();
    }

    @Override // kh.o1
    public boolean hasPut() {
        return ((HttpRule) this.instance).hasPut();
    }

    public m1 mergeCustom(CustomHttpPattern customHttpPattern) {
        copyOnWrite();
        ((HttpRule) this.instance).mergeCustom(customHttpPattern);
        return this;
    }

    public m1 removeAdditionalBindings(int i10) {
        copyOnWrite();
        ((HttpRule) this.instance).removeAdditionalBindings(i10);
        return this;
    }

    public m1 setAdditionalBindings(int i10, HttpRule httpRule) {
        copyOnWrite();
        ((HttpRule) this.instance).setAdditionalBindings(i10, httpRule);
        return this;
    }

    public m1 setBody(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setBody(str);
        return this;
    }

    public m1 setBodyBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setBodyBytes(byteString);
        return this;
    }

    public m1 setCustom(CustomHttpPattern customHttpPattern) {
        copyOnWrite();
        ((HttpRule) this.instance).setCustom(customHttpPattern);
        return this;
    }

    public m1 setDelete(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setDelete(str);
        return this;
    }

    public m1 setDeleteBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setDeleteBytes(byteString);
        return this;
    }

    public m1 setGet(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setGet(str);
        return this;
    }

    public m1 setGetBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setGetBytes(byteString);
        return this;
    }

    public m1 setPatch(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setPatch(str);
        return this;
    }

    public m1 setPatchBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setPatchBytes(byteString);
        return this;
    }

    public m1 setPost(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setPost(str);
        return this;
    }

    public m1 setPostBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setPostBytes(byteString);
        return this;
    }

    public m1 setPut(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setPut(str);
        return this;
    }

    public m1 setPutBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setPutBytes(byteString);
        return this;
    }

    public m1 setResponseBody(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setResponseBody(str);
        return this;
    }

    public m1 setResponseBodyBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setResponseBodyBytes(byteString);
        return this;
    }

    public m1 setSelector(String str) {
        copyOnWrite();
        ((HttpRule) this.instance).setSelector(str);
        return this;
    }

    public m1 setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRule) this.instance).setSelectorBytes(byteString);
        return this;
    }

    public m1 addAdditionalBindings(int i10, HttpRule httpRule) {
        copyOnWrite();
        ((HttpRule) this.instance).addAdditionalBindings(i10, httpRule);
        return this;
    }

    public m1 setAdditionalBindings(int i10, m1 m1Var) {
        copyOnWrite();
        ((HttpRule) this.instance).setAdditionalBindings(i10, (HttpRule) m1Var.build());
        return this;
    }

    public m1 setCustom(r0 r0Var) {
        copyOnWrite();
        ((HttpRule) this.instance).setCustom((CustomHttpPattern) r0Var.build());
        return this;
    }

    public m1 addAdditionalBindings(m1 m1Var) {
        copyOnWrite();
        ((HttpRule) this.instance).addAdditionalBindings((HttpRule) m1Var.build());
        return this;
    }

    public m1 addAdditionalBindings(int i10, m1 m1Var) {
        copyOnWrite();
        ((HttpRule) this.instance).addAdditionalBindings(i10, (HttpRule) m1Var.build());
        return this;
    }
}
