package com.google.rpc.context;

import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.context.AttributeContext;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends GeneratedMessageLite.Builder implements m {
    public c clearApi() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearApi();
        return this;
    }

    public c clearDestination() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearDestination();
        return this;
    }

    public c clearOrigin() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearOrigin();
        return this;
    }

    public c clearRequest() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearRequest();
        return this;
    }

    public c clearResource() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearResource();
        return this;
    }

    public c clearResponse() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearResponse();
        return this;
    }

    public c clearSource() {
        copyOnWrite();
        ((AttributeContext) this.instance).clearSource();
        return this;
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Api getApi() {
        return ((AttributeContext) this.instance).getApi();
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Peer getDestination() {
        return ((AttributeContext) this.instance).getDestination();
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Peer getOrigin() {
        return ((AttributeContext) this.instance).getOrigin();
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Request getRequest() {
        return ((AttributeContext) this.instance).getRequest();
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Resource getResource() {
        return ((AttributeContext) this.instance).getResource();
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Response getResponse() {
        return ((AttributeContext) this.instance).getResponse();
    }

    @Override // com.google.rpc.context.m
    public AttributeContext.Peer getSource() {
        return ((AttributeContext) this.instance).getSource();
    }

    @Override // com.google.rpc.context.m
    public boolean hasApi() {
        return ((AttributeContext) this.instance).hasApi();
    }

    @Override // com.google.rpc.context.m
    public boolean hasDestination() {
        return ((AttributeContext) this.instance).hasDestination();
    }

    @Override // com.google.rpc.context.m
    public boolean hasOrigin() {
        return ((AttributeContext) this.instance).hasOrigin();
    }

    @Override // com.google.rpc.context.m
    public boolean hasRequest() {
        return ((AttributeContext) this.instance).hasRequest();
    }

    @Override // com.google.rpc.context.m
    public boolean hasResource() {
        return ((AttributeContext) this.instance).hasResource();
    }

    @Override // com.google.rpc.context.m
    public boolean hasResponse() {
        return ((AttributeContext) this.instance).hasResponse();
    }

    @Override // com.google.rpc.context.m
    public boolean hasSource() {
        return ((AttributeContext) this.instance).hasSource();
    }

    public c mergeApi(AttributeContext.Api api) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeApi(api);
        return this;
    }

    public c mergeDestination(AttributeContext.Peer peer) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeDestination(peer);
        return this;
    }

    public c mergeOrigin(AttributeContext.Peer peer) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeOrigin(peer);
        return this;
    }

    public c mergeRequest(AttributeContext.Request request) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeRequest(request);
        return this;
    }

    public c mergeResource(AttributeContext.Resource resource) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeResource(resource);
        return this;
    }

    public c mergeResponse(AttributeContext.Response response) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeResponse(response);
        return this;
    }

    public c mergeSource(AttributeContext.Peer peer) {
        copyOnWrite();
        ((AttributeContext) this.instance).mergeSource(peer);
        return this;
    }

    public c setApi(AttributeContext.Api api) {
        copyOnWrite();
        ((AttributeContext) this.instance).setApi(api);
        return this;
    }

    public c setDestination(AttributeContext.Peer peer) {
        copyOnWrite();
        ((AttributeContext) this.instance).setDestination(peer);
        return this;
    }

    public c setOrigin(AttributeContext.Peer peer) {
        copyOnWrite();
        ((AttributeContext) this.instance).setOrigin(peer);
        return this;
    }

    public c setRequest(AttributeContext.Request request) {
        copyOnWrite();
        ((AttributeContext) this.instance).setRequest(request);
        return this;
    }

    public c setResource(AttributeContext.Resource resource) {
        copyOnWrite();
        ((AttributeContext) this.instance).setResource(resource);
        return this;
    }

    public c setResponse(AttributeContext.Response response) {
        copyOnWrite();
        ((AttributeContext) this.instance).setResponse(response);
        return this;
    }

    public c setSource(AttributeContext.Peer peer) {
        copyOnWrite();
        ((AttributeContext) this.instance).setSource(peer);
        return this;
    }

    public c setApi(a aVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setApi((AttributeContext.Api) aVar.build());
        return this;
    }

    public c setDestination(d dVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setDestination((AttributeContext.Peer) dVar.build());
        return this;
    }

    public c setOrigin(d dVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setOrigin((AttributeContext.Peer) dVar.build());
        return this;
    }

    public c setRequest(f fVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setRequest((AttributeContext.Request) fVar.build());
        return this;
    }

    public c setResource(i iVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setResource((AttributeContext.Resource) iVar.build());
        return this;
    }

    public c setResponse(k kVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setResponse((AttributeContext.Response) kVar.build());
        return this;
    }

    public c setSource(d dVar) {
        copyOnWrite();
        ((AttributeContext) this.instance).setSource((AttributeContext.Peer) dVar.build());
        return this;
    }
}
