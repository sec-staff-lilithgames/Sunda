package com.sfbx.appconsentv3.ui.domain.model;

import com.sfbx.appconsent.core.model.RemoteTheme;
import com.sfbx.appconsentv3.ui.model.HelloReplyCore;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadDataWrapper {
    private final HelloReplyCore helloReply;
    private final RemoteTheme remoteTheme;

    public LoadDataWrapper(HelloReplyCore helloReply, RemoteTheme remoteTheme) {
        e0.checkNotNullParameter(helloReply, "helloReply");
        e0.checkNotNullParameter(remoteTheme, "remoteTheme");
        this.helloReply = helloReply;
        this.remoteTheme = remoteTheme;
    }

    public static /* synthetic */ LoadDataWrapper copy$default(LoadDataWrapper loadDataWrapper, HelloReplyCore helloReplyCore, RemoteTheme remoteTheme, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            helloReplyCore = loadDataWrapper.helloReply;
        }
        if ((i10 & 2) != 0) {
            remoteTheme = loadDataWrapper.remoteTheme;
        }
        return loadDataWrapper.copy(helloReplyCore, remoteTheme);
    }

    public final HelloReplyCore component1() {
        return this.helloReply;
    }

    public final RemoteTheme component2() {
        return this.remoteTheme;
    }

    public final LoadDataWrapper copy(HelloReplyCore helloReply, RemoteTheme remoteTheme) {
        e0.checkNotNullParameter(helloReply, "helloReply");
        e0.checkNotNullParameter(remoteTheme, "remoteTheme");
        return new LoadDataWrapper(helloReply, remoteTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadDataWrapper)) {
            return false;
        }
        LoadDataWrapper loadDataWrapper = (LoadDataWrapper) obj;
        return e0.areEqual(this.helloReply, loadDataWrapper.helloReply) && e0.areEqual(this.remoteTheme, loadDataWrapper.remoteTheme);
    }

    public final HelloReplyCore getHelloReply() {
        return this.helloReply;
    }

    public final RemoteTheme getRemoteTheme() {
        return this.remoteTheme;
    }

    public int hashCode() {
        return this.remoteTheme.hashCode() + (this.helloReply.hashCode() * 31);
    }

    public String toString() {
        return "LoadDataWrapper(helloReply=" + this.helloReply + ", remoteTheme=" + this.remoteTheme + ')';
    }
}
