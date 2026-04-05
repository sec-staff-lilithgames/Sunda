package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes9.dex */
public final class SessionAdParams extends up.o implements up.k {
    private Integer sessionDuration;

    public void clear() {
        this.sessionDuration = null;
    }

    public void fillUserExtension(Struct.Builder builder) {
        if (this.sessionDuration != null) {
            builder.putFields("sessionduration", Value.newBuilder().setNumberValue(this.sessionDuration.intValue()).build());
        }
    }

    public Integer getSessionDuration() {
        return this.sessionDuration;
    }

    @Override // up.o
    public void merge(SessionAdParams sessionAdParams) {
        this.sessionDuration = (Integer) nm.j.oneOf(this.sessionDuration, sessionAdParams.sessionDuration);
    }

    @Override // up.k
    @Deprecated
    public SessionAdParams setClickRate(Float f10) {
        nm.a.w("The method setClickRate is no longer supported and has no effect.");
        return this;
    }

    @Override // up.k
    @Deprecated
    public SessionAdParams setCompletionRate(Float f10) {
        nm.a.w("The method setCompletionRate is no longer supported and has no effect.");
        return this;
    }

    @Override // up.k
    @Deprecated
    public SessionAdParams setImpressionCount(Integer num) {
        nm.a.w("The method setImpressionCount is no longer supported and has no effect.");
        return this;
    }

    @Override // up.k
    @Deprecated
    public SessionAdParams setIsUserClickedOnLastAd(Boolean bool) {
        nm.a.w("The method setIsUserClickedOnLastAd is no longer supported and has no effect.");
        return this;
    }

    @Override // up.k
    public SessionAdParams setSessionDuration(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.sessionDuration = num;
            return this;
        }
        nm.a.e("session duration shouldn't be negative");
        return this;
    }
}
