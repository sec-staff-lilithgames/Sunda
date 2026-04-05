package com.vungle.ads.internal.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class AppNode {
    public static final Companion Companion = new Companion(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<AppNode> serializer() {
            return AppNode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ AppNode(int i10, String str, String str2, @SerialName("id") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, AppNode$$serializer.INSTANCE.getDescriptor());
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ AppNode copy$default(AppNode appNode, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appNode.bundle;
        }
        if ((i10 & 2) != 0) {
            str2 = appNode.ver;
        }
        if ((i10 & 4) != 0) {
            str3 = appNode.appId;
        }
        return appNode.copy(str, str2, str3);
    }

    public static final void write$Self(AppNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.bundle);
        output.encodeStringElement(serialDesc, 1, self.ver);
        output.encodeStringElement(serialDesc, 2, self.appId);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final AppNode copy(String bundle, String ver, String appId) {
        e0.checkNotNullParameter(bundle, "bundle");
        e0.checkNotNullParameter(ver, "ver");
        e0.checkNotNullParameter(appId, "appId");
        return new AppNode(bundle, ver, appId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppNode)) {
            return false;
        }
        AppNode appNode = (AppNode) obj;
        return e0.areEqual(this.bundle, appNode.bundle) && e0.areEqual(this.ver, appNode.ver) && e0.areEqual(this.appId, appNode.appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.appId.hashCode() + o2.e(this.bundle.hashCode() * 31, 31, this.ver);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppNode(bundle=");
        sb2.append(this.bundle);
        sb2.append(", ver=");
        sb2.append(this.ver);
        sb2.append(", appId=");
        return o2.q(sb2, this.appId, ')');
    }

    public AppNode(String bundle, String ver, String appId) {
        e0.checkNotNullParameter(bundle, "bundle");
        e0.checkNotNullParameter(ver, "ver");
        e0.checkNotNullParameter(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }

    @SerialName("id")
    public static /* synthetic */ void getAppId$annotations() {
    }
}
