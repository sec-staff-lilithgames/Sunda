package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayInitRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f50666a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50667b;

    /* renamed from: c, reason: collision with root package name */
    private final List<LevelPlay.AdFormat> f50668c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f50669a;

        /* renamed from: b, reason: collision with root package name */
        private String f50670b;

        public Builder(String appKey) {
            e0.checkNotNullParameter(appKey, "appKey");
            this.f50669a = appKey;
        }

        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.f50669a, this.f50670b, null, 4, null);
        }

        public final String getAppKey() {
            return this.f50669a;
        }

        public final Builder withUserId(String userId) {
            e0.checkNotNullParameter(userId, "userId");
            this.f50670b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f50666a = str;
        this.f50667b = str2;
        this.f50668c = list;
    }

    public final String getAppKey() {
        return this.f50666a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f50668c;
    }

    public final String getUserId() {
        return this.f50667b;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? p0.emptyList() : list);
    }
}
