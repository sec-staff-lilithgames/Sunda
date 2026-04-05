package com.unity3d.ads.core.data.model;

import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    public WebViewConfiguration(int i10, String entryPoint, List<String> additionalFiles, String type) {
        e0.checkNotNullParameter(entryPoint, "entryPoint");
        e0.checkNotNullParameter(additionalFiles, "additionalFiles");
        e0.checkNotNullParameter(type, "type");
        this.version = i10;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i11 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i10, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final String component4() {
        return this.type;
    }

    public final WebViewConfiguration copy(int i10, String entryPoint, List<String> additionalFiles, String type) {
        e0.checkNotNullParameter(entryPoint, "entryPoint");
        e0.checkNotNullParameter(additionalFiles, "additionalFiles");
        e0.checkNotNullParameter(type, "type");
        return new WebViewConfiguration(i10, entryPoint, additionalFiles, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && e0.areEqual(this.entryPoint, webViewConfiguration.entryPoint) && e0.areEqual(this.additionalFiles, webViewConfiguration.additionalFiles) && e0.areEqual(this.type, webViewConfiguration.type);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.type.hashCode() + o2.c(p0.o2.e(Integer.hashCode(this.version) * 31, 31, this.entryPoint), 31, this.additionalFiles);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewConfiguration(version=");
        sb2.append(this.version);
        sb2.append(", entryPoint=");
        sb2.append(this.entryPoint);
        sb2.append(", additionalFiles=");
        sb2.append(this.additionalFiles);
        sb2.append(", type=");
        return p0.o2.q(sb2, this.type, ')');
    }
}
