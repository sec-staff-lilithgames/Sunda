package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Struct;
import com.google.rpc.context.AttributeContext;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements vk.c {
    public b addAccessLevels(String str) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).addAccessLevels(str);
        return this;
    }

    public b addAccessLevelsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).addAccessLevelsBytes(byteString);
        return this;
    }

    public b addAllAccessLevels(Iterable<String> iterable) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).addAllAccessLevels(iterable);
        return this;
    }

    public b addAllAudiences(Iterable<String> iterable) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).addAllAudiences(iterable);
        return this;
    }

    public b addAudiences(String str) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).addAudiences(str);
        return this;
    }

    public b addAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).addAudiencesBytes(byteString);
        return this;
    }

    public b clearAccessLevels() {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).clearAccessLevels();
        return this;
    }

    public b clearAudiences() {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).clearAudiences();
        return this;
    }

    public b clearClaims() {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).clearClaims();
        return this;
    }

    public b clearPresenter() {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).clearPresenter();
        return this;
    }

    public b clearPrincipal() {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).clearPrincipal();
        return this;
    }

    @Override // vk.c
    public String getAccessLevels(int i10) {
        return ((AttributeContext.Auth) this.instance).getAccessLevels(i10);
    }

    @Override // vk.c
    public ByteString getAccessLevelsBytes(int i10) {
        return ((AttributeContext.Auth) this.instance).getAccessLevelsBytes(i10);
    }

    @Override // vk.c
    public int getAccessLevelsCount() {
        return ((AttributeContext.Auth) this.instance).getAccessLevelsCount();
    }

    @Override // vk.c
    public List<String> getAccessLevelsList() {
        return Collections.unmodifiableList(((AttributeContext.Auth) this.instance).getAccessLevelsList());
    }

    @Override // vk.c
    public String getAudiences(int i10) {
        return ((AttributeContext.Auth) this.instance).getAudiences(i10);
    }

    @Override // vk.c
    public ByteString getAudiencesBytes(int i10) {
        return ((AttributeContext.Auth) this.instance).getAudiencesBytes(i10);
    }

    @Override // vk.c
    public int getAudiencesCount() {
        return ((AttributeContext.Auth) this.instance).getAudiencesCount();
    }

    @Override // vk.c
    public List<String> getAudiencesList() {
        return Collections.unmodifiableList(((AttributeContext.Auth) this.instance).getAudiencesList());
    }

    @Override // vk.c
    public Struct getClaims() {
        return ((AttributeContext.Auth) this.instance).getClaims();
    }

    @Override // vk.c
    public String getPresenter() {
        return ((AttributeContext.Auth) this.instance).getPresenter();
    }

    @Override // vk.c
    public ByteString getPresenterBytes() {
        return ((AttributeContext.Auth) this.instance).getPresenterBytes();
    }

    @Override // vk.c
    public String getPrincipal() {
        return ((AttributeContext.Auth) this.instance).getPrincipal();
    }

    @Override // vk.c
    public ByteString getPrincipalBytes() {
        return ((AttributeContext.Auth) this.instance).getPrincipalBytes();
    }

    @Override // vk.c
    public boolean hasClaims() {
        return ((AttributeContext.Auth) this.instance).hasClaims();
    }

    public b mergeClaims(Struct struct) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).mergeClaims(struct);
        return this;
    }

    public b setAccessLevels(int i10, String str) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setAccessLevels(i10, str);
        return this;
    }

    public b setAudiences(int i10, String str) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setAudiences(i10, str);
        return this;
    }

    public b setClaims(Struct struct) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setClaims(struct);
        return this;
    }

    public b setPresenter(String str) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setPresenter(str);
        return this;
    }

    public b setPresenterBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setPresenterBytes(byteString);
        return this;
    }

    public b setPrincipal(String str) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setPrincipal(str);
        return this;
    }

    public b setPrincipalBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setPrincipalBytes(byteString);
        return this;
    }

    public b setClaims(Struct.Builder builder) {
        copyOnWrite();
        ((AttributeContext.Auth) this.instance).setClaims(builder.build());
        return this;
    }
}
