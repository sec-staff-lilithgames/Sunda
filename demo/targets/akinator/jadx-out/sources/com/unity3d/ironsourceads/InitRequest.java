package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InitRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f50585a;

    /* renamed from: b, reason: collision with root package name */
    private final List<IronSourceAds.AdFormat> f50586b;

    /* renamed from: c, reason: collision with root package name */
    private final LogLevel f50587c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f50588a;

        /* renamed from: b, reason: collision with root package name */
        private List<? extends IronSourceAds.AdFormat> f50589b;

        /* renamed from: c, reason: collision with root package name */
        private LogLevel f50590c;

        public Builder(String appKey) {
            e0.checkNotNullParameter(appKey, "appKey");
            this.f50588a = appKey;
        }

        public final InitRequest build() {
            String str = this.f50588a;
            List<? extends IronSourceAds.AdFormat> listEmptyList = this.f50589b;
            if (listEmptyList == null) {
                listEmptyList = p0.emptyList();
            }
            LogLevel logLevel = this.f50590c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, listEmptyList, logLevel, null);
        }

        public final String getAppKey() {
            return this.f50588a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            e0.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f50589b = legacyAdFormats;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            e0.checkNotNullParameter(logLevel, "logLevel");
            this.f50590c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, u uVar) {
        this(str, list, logLevel);
    }

    public final String getAppKey() {
        return this.f50585a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f50586b;
    }

    public final LogLevel getLogLevel() {
        return this.f50587c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f50585a = str;
        this.f50586b = list;
        this.f50587c = logLevel;
    }
}
