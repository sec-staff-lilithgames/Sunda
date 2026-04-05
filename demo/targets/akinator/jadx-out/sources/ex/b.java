package ex;

import com.google.protobuf.GeneratedMessageLite;
import pubsubBOCollector.MessageOuterClass$Message;
import pubsubBOCollector.MessageOuterClass$UpdateAppKeyList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends GeneratedMessageLite.Builder implements g {
    public b clearPayload() {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).clearPayload();
        return this;
    }

    public b clearType() {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).clearType();
        return this;
    }

    public b clearUpdateAppKeyList() {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).clearUpdateAppKeyList();
        return this;
    }

    @Override // ex.g
    public f getPayloadCase() {
        return ((MessageOuterClass$Message) this.instance).getPayloadCase();
    }

    @Override // ex.g
    public e getType() {
        return ((MessageOuterClass$Message) this.instance).getType();
    }

    @Override // ex.g
    public int getTypeValue() {
        return ((MessageOuterClass$Message) this.instance).getTypeValue();
    }

    @Override // ex.g
    public MessageOuterClass$UpdateAppKeyList getUpdateAppKeyList() {
        return ((MessageOuterClass$Message) this.instance).getUpdateAppKeyList();
    }

    @Override // ex.g
    public boolean hasUpdateAppKeyList() {
        return ((MessageOuterClass$Message) this.instance).hasUpdateAppKeyList();
    }

    public b mergeUpdateAppKeyList(MessageOuterClass$UpdateAppKeyList messageOuterClass$UpdateAppKeyList) {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).mergeUpdateAppKeyList(messageOuterClass$UpdateAppKeyList);
        return this;
    }

    public b setType(e eVar) {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).setType(eVar);
        return this;
    }

    public b setTypeValue(int i10) {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).setTypeValue(i10);
        return this;
    }

    public b setUpdateAppKeyList(MessageOuterClass$UpdateAppKeyList messageOuterClass$UpdateAppKeyList) {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).setUpdateAppKeyList(messageOuterClass$UpdateAppKeyList);
        return this;
    }

    public b setUpdateAppKeyList(h hVar) {
        copyOnWrite();
        ((MessageOuterClass$Message) this.instance).setUpdateAppKeyList((MessageOuterClass$UpdateAppKeyList) hVar.build());
        return this;
    }
}
