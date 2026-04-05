package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$ExperimentVariant;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q extends GeneratedMessageLite.Builder implements r {
    public q clearContent() {
        copyOnWrite();
        ((CommonTypesProto$ExperimentVariant) this.instance).clearContent();
        return this;
    }

    public q clearIndex() {
        copyOnWrite();
        ((CommonTypesProto$ExperimentVariant) this.instance).clearIndex();
        return this;
    }

    @Override // bj.r
    public MessagesProto$Content getContent() {
        return ((CommonTypesProto$ExperimentVariant) this.instance).getContent();
    }

    @Override // bj.r
    public int getIndex() {
        return ((CommonTypesProto$ExperimentVariant) this.instance).getIndex();
    }

    @Override // bj.r
    public boolean hasContent() {
        return ((CommonTypesProto$ExperimentVariant) this.instance).hasContent();
    }

    public q mergeContent(MessagesProto$Content messagesProto$Content) {
        copyOnWrite();
        ((CommonTypesProto$ExperimentVariant) this.instance).mergeContent(messagesProto$Content);
        return this;
    }

    public q setContent(MessagesProto$Content messagesProto$Content) {
        copyOnWrite();
        ((CommonTypesProto$ExperimentVariant) this.instance).setContent(messagesProto$Content);
        return this;
    }

    public q setIndex(int i10) {
        copyOnWrite();
        ((CommonTypesProto$ExperimentVariant) this.instance).setIndex(i10);
        return this;
    }

    public q setContent(o1 o1Var) {
        copyOnWrite();
        ((CommonTypesProto$ExperimentVariant) this.instance).setContent((MessagesProto$Content) o1Var.build());
        return this;
    }
}
