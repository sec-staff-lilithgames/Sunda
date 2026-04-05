package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s7 extends GeneratedMessageLite.Builder implements u7 {
    public s7 clearEventId() {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).clearEventId();
        return this;
    }

    public s7 clearLevelplay() {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).clearLevelplay();
        return this;
    }

    public s7 clearMax() {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).clearMax();
        return this;
    }

    public s7 clearPlatform() {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).clearPlatform();
        return this;
    }

    public s7 clearSessionId() {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).clearSessionId();
        return this;
    }

    @Override // com.moloco.sdk.u7
    public String getEventId() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getEventId();
    }

    @Override // com.moloco.sdk.u7
    public ByteString getEventIdBytes() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getEventIdBytes();
    }

    @Override // com.moloco.sdk.u7
    public IlrdRequest$LevelPlayImpression getLevelplay() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getLevelplay();
    }

    @Override // com.moloco.sdk.u7
    public IlrdRequest$MaxImpression getMax() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getMax();
    }

    @Override // com.moloco.sdk.u7
    public t7 getPlatformCase() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getPlatformCase();
    }

    @Override // com.moloco.sdk.u7
    public String getSessionId() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getSessionId();
    }

    @Override // com.moloco.sdk.u7
    public ByteString getSessionIdBytes() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).getSessionIdBytes();
    }

    @Override // com.moloco.sdk.u7
    public boolean hasLevelplay() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).hasLevelplay();
    }

    @Override // com.moloco.sdk.u7
    public boolean hasMax() {
        return ((IlrdRequest$ImpressionLevelRevenue) this.instance).hasMax();
    }

    public s7 mergeLevelplay(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).mergeLevelplay(ilrdRequest$LevelPlayImpression);
        return this;
    }

    public s7 mergeMax(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).mergeMax(ilrdRequest$MaxImpression);
        return this;
    }

    public s7 setEventId(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setEventId(str);
        return this;
    }

    public s7 setEventIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setEventIdBytes(byteString);
        return this;
    }

    public s7 setLevelplay(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setLevelplay(ilrdRequest$LevelPlayImpression);
        return this;
    }

    public s7 setMax(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setMax(ilrdRequest$MaxImpression);
        return this;
    }

    public s7 setSessionId(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setSessionId(str);
        return this;
    }

    public s7 setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setSessionIdBytes(byteString);
        return this;
    }

    public s7 setLevelplay(x7 x7Var) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setLevelplay((IlrdRequest$LevelPlayImpression) x7Var.build());
        return this;
    }

    public s7 setMax(z7 z7Var) {
        copyOnWrite();
        ((IlrdRequest$ImpressionLevelRevenue) this.instance).setMax((IlrdRequest$MaxImpression) z7Var.build());
        return this;
    }
}
